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
@Table(name = "juegos")
public class Juego {
	// Atributos de entidad juego
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		@Column(name = "nombre")
		private String nombre;
		@Column(name = "tipo")
		private String tipo;
		
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
		
		// CONSTRUCTORES
		public Juego() {
			
		}
		
		public Juego(String nombre, String tipo) {
			this.nombre = nombre;
			this.tipo = tipo;
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

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		//TO STRING
		@Override
		public String toString() {
			return "Juego [id=" + id + ", nombre=" + nombre + ", tipo=" + tipo + ", partida=" + partida + "]";
		}

		
		
		

}
