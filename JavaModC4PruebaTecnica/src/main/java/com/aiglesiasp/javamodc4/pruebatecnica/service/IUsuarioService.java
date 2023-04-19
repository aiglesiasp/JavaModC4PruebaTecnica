/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.service;

import java.util.List;

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Usuario;

/**
 * @author aitor
 *
 */
public interface IUsuarioService {
	// Metodos del CRUD
			public List<Usuario> listarUsuarios(); // Listar All

			public Usuario guardarUsuario(Usuario usuario); // Guarda un usuario CREATE

			public Usuario usuarioById(int codigo); // Leer datos de un usuario READ

			public Usuario actualizarUsuario(Usuario usuario); // Actualiza datos del usuario UPDATE

			public void eliminarUsuario(int codigo);// Elimina el usuario DELETE
}
