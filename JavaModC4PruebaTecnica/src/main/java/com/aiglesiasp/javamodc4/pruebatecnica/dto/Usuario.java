/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author aitor
 *
 */
@Entity
@Table(name = "usuarios")
public class Usuario {
	// Atributos de entidad juego
			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private int id;
			@Column(name = "username")
			private String username;
			@Column(name = "email")
			private String email;
			@Column(name = "pass")
			private String pass;
			
			//ONE TO MANY
			@OneToMany
			@JoinColumn(name = "id")
			private List<Partida> partida;
			
			//IGNORE JSON
			@JsonIgnore
			@OneToMany(fetch = FetchType.LAZY, mappedBy = "Partida")
			public List<Partida> getPartida() {
				return partida;
			}
			//ONE TO MANY
			@OneToMany
			@JoinColumn(name = "id")
			private List<Mensaje> mensaje;
			
			
			//IGNORE JSON
			@JsonIgnore
			@OneToMany(fetch = FetchType.LAZY, mappedBy = "Mensaje")
			public List<Mensaje> getMensaje() {
				return mensaje;
			}
			
			//CONSTRUCTOR
			public Usuario() {
				
			}
			
			public Usuario(String username, String email, String pass) {
				this.username = username;
				this.email = email;
				this.pass = pass;
			}

			//GETTERS Y SETTERS
			public int getId() {
				return id;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getUsername() {
				return username;
			}

			public void setUsername(String username) {
				this.username = username;
			}

			public String getEmail() {
				return email;
			}

			public void setEmail(String email) {
				this.email = email;
			}

			public String getPass() {
				return pass;
			}

			public void setPass(String pass) {
				this.pass = pass;
			}

			//TO STRING
			@Override
			public String toString() {
				return "Usuario [id=" + id + ", username=" + username + ", email=" + email + ", pass=" + pass
						+ ", partida=" + partida + ", mensaje=" + mensaje + "]";
			}
			
			
			
			
			

}
