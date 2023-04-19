/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.service;

import java.util.List;

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Mensaje;

/**
 * @author aitor
 *
 */
public interface IMensajeService {
	// Metodos del CRUD
	public List<Mensaje> listarMensajes(); // Listar All

	public Mensaje guardarMensaje(Mensaje mensaje); // Guarda un mensaje CREATE

	public Mensaje mensajeById(int codigo); // Leer datos de un mensaje READ

	public Mensaje actualizarMensaje(Mensaje mensaje); // Actualiza datos del mensaje UPDATE

	public void eliminarMensaje(int codigo);// Elimina el mensaje DELETE
}
