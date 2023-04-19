/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Partida;

/**
 * @author aitor
 *
 */
public interface IPartidaDAO extends JpaRepository<Partida, Integer> {
	// Listar empleados por campo nombre
		public List<Partida> findByNombre(String nombre);
}
