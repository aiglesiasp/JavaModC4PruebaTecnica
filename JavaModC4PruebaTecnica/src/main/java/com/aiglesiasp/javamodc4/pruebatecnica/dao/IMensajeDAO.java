/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Mensaje;
import com.aiglesiasp.javamodc4.pruebatecnica.dto.Usuario;

/**
 * @author aitor
 *
 */
public interface IMensajeDAO extends JpaRepository<Mensaje, Integer> {
	// Listar empleados por campo nombre
		public List<Mensaje> findByUsuario(Usuario usuario);

}
