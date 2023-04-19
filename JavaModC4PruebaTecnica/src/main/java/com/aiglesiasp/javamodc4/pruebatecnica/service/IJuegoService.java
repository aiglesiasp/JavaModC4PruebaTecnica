/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.service;

import java.util.List;

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Juego;

/**
 * @author aitor
 *
 */
public interface IJuegoService {
	// Metodos del CRUD
		public List<Juego> listarJuegos(); // Listar All

		public Juego guardarJuego(Juego juego); // Guarda un juego CREATE

		public Juego juegoById(int codigo); // Leer datos de un juego READ

		public Juego actualizarJuego(Juego juego); // Actualiza datos del juego UPDATE

		public void eliminarJuego(int codigo);// Elimina el juego DELETE
}
