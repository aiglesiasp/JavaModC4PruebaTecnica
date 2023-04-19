/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.service;

import java.util.List;

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Partida;

/**
 * @author aitor
 *
 */
public interface IPartidaService {
	// Metodos del CRUD
			public List<Partida> listarPartidas(); // Listar All

			public Partida guardarPartida(Partida partida); // Guarda un partida CREATE

			public Partida partidaById(int codigo); // Leer datos de un partida READ

			public Partida actualizarPartida(Partida partida); // Actualiza datos del partida UPDATE

			public void eliminarPartida(int codigo);// Elimina el partida DELETE
}
