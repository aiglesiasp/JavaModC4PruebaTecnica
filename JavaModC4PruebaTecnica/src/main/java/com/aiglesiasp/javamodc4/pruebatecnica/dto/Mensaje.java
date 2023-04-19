package com.aiglesiasp.javamodc4.pruebatecnica.dto;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "mensajes")
public class Mensaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "texto")
	private String texto;
	@Column(name = "fecha")
	private Date fecha;
	
	@ManyToOne
    @JoinColumn(name="usuario")
    private Usuario usuario;
	
	@ManyToOne
    @JoinColumn(name="partida")
    private Partida partida;
	
	//CONSTRUCTORES
	public Mensaje() {
		
	}
	
	public Mensaje(String texto, Date fecha, Usuario usuario, Partida partida) {
		this.texto = texto;
		this.fecha = fecha;
		this.usuario = usuario;
		this.partida = partida;
	}

	//SETTERS Y GETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Partida getPartida() {
		return partida;
	}

	public void setPartida(Partida partida) {
		this.partida = partida;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Mensaje [id=" + id + ", texto=" + texto + ", fecha=" + fecha + ", usuario=" + usuario + ", partida="
				+ partida + "]";
	}
	
	
	
	

}
