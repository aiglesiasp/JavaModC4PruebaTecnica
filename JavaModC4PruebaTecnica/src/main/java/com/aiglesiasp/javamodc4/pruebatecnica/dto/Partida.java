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
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author aitor
 *
 */
@Entity
@Table(name = "partidas")
public class Partida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "descripcion")
	private String descripcion;

	@ManyToOne
	@JoinColumn(name = "juego")
	private Juego juego;

	// ONE TO MANY
	@OneToMany
	@JoinColumn(name = "usuario")
	private List<Usuario> usuario;

	// IGNORE JSON
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Usuario")
	public List<Usuario> getUsuarios() {
		return usuario;
	}
	
	//CONSTRUCTORES
	public Partida() {
		
	}
	
	public Partida(String nombre, String descripcion, Juego juego) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.juego = juego;
	}

	//GETTERS Y SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Juego getJuego() {
		return juego;
	}

	public void setJuego(Juego juego) {
		this.juego = juego;
	}

	//TO STRING
	@Override
	public String toString() {
		return "Partida [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", juego=" + juego
				+ ", usuario=" + usuario + "]";
	}
	
	

}
