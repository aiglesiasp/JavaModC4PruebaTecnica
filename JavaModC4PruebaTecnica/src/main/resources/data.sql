DROP TABLE IF EXISTS mensajes;
DROP TABLE IF EXISTS partidas;
DROP TABLE IF EXISTS usuarios;
DROP TABLE IF EXISTS juegos;

CREATE TABLE IF NOT EXISTS juegos (
						id INT AUTO_INCREMENT,
						nombre VARCHAR(250) DEFAULT NULL,
                        tipo VARCHAR(250) DEFAULT NULL,
						PRIMARY KEY(id)
						);
                        
CREATE TABLE IF NOT EXISTS usuarios (
						id INT AUTO_INCREMENT,
						nombre VARCHAR(100) DEFAULT NULL,
                        email VARCHAR(100) DEFAULT NULL,
                        pass VARCHAR(100) DEFAULT NULL,
						PRIMARY KEY(id)
						);
                        
CREATE TABLE IF NOT EXISTS partidas (
						id INT AUTO_INCREMENT,
						nombre VARCHAR(100) DEFAULT NULL,
						descripcion VARCHAR(250) DEFAULT NULL,
						juego INT,
                        usuario INT,
						PRIMARY KEY(id),
						CONSTRAINT juegos_fk FOREIGN KEY (juego) REFERENCES juegos (id)
                        ON UPDATE CASCADE ON DELETE CASCADE,
                        CONSTRAINT usuarios_fk FOREIGN KEY (usuario) REFERENCES usuarios (id)
                        ON UPDATE CASCADE ON DELETE CASCADE
						);
                        
CREATE TABLE IF NOT EXISTS mensajes (
                        id INT AUTO_INCREMENT,
                        texto VARCHAR(250) DEFAULT NULL,
                        fecha DATE DEFAULT NULL,
                        usuario INT,
                        partida INT,
                        PRIMARY KEY(id),
                        CONSTRAINT partida_fk FOREIGN KEY (partida) REFERENCES partidas (id)
                        ON UPDATE CASCADE ON DELETE CASCADE,
                        CONSTRAINT usuario_fk FOREIGN KEY (usuario) REFERENCES usuarios (id)
                        ON UPDATE CASCADE ON DELETE CASCADE
    
);
                        
                        
INSERT INTO juegos (nombre, tipo) VALUES ('League of Legends', 'TeamFight');
INSERT INTO juegos (nombre, tipo) VALUES ('Call of Duty', 'Shooter');
INSERT INTO juegos (nombre, tipo) VALUES ('Ajedrez', 'Mente');

INSERT INTO usuarios (nombre, email, pass) VALUES ('Tortis', 'aaa@aaa.com', '123456');
INSERT INTO usuarios (nombre, email, pass) VALUES ('Rambo', 'bbb@bbb.com', '654321');
INSERT INTO usuarios (nombre, email, pass) VALUES ('Heidi', 'ccc@ccc.com', '12erjgd');
INSERT INTO usuarios (nombre, email, pass) VALUES ('Doraemon', 'ddd@ddd.com', '12hfus7');
INSERT INTO usuarios (nombre, email, pass) VALUES ('Pikachu', 'eee@eee.com', '28djgyv7s');
INSERT INTO usuarios (nombre, email, pass) VALUES ('Scooby', 'fff@fff.com', '18jdyf');
INSERT INTO usuarios (nombre, email, pass) VALUES ('Interdition', 'ggg@ggg.com', 'ahsyf7s9');
INSERT INTO usuarios (nombre, email, pass) VALUES ('Quepaso?', 'hhh@hhh.com', 'ajyfyfis8');
INSERT INTO usuarios (nombre, email, pass) VALUES ('oyewey', 'iii@iii.com', 'ahdyf7e8');


INSERT INTO partidas (nombre, descripcion, juego, usuario) VALUES ('Partida 1', 'Vamos a jugar a LOL', 1, 1);
INSERT INTO partidas (nombre, descripcion, juego, usuario) VALUES ('Partida 2', 'Unos tiritos??', 2, 4);
INSERT INTO partidas (nombre, descripcion, juego, usuario) VALUES ('Partida 3', 'Pensamos un poco', 3, 7);

INSERT INTO mensajes (texto, fecha, usuario, partida) VALUES ('Como va?', '2023-02-10', 1, 1);
INSERT INTO mensajes (texto, fecha, usuario, partida) VALUES ('Todo bien gracias', '2023-02-10', 2, 1);
INSERT INTO mensajes (texto, fecha, usuario, partida) VALUES ('De lujo', '2023-02-10', 3, 1);


