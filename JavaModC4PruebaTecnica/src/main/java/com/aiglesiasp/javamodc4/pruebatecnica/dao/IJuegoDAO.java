/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Juego;

/**
 * @author aitor
 *
 */
public interface IJuegoDAO extends JpaRepository<Juego, Integer> {
	// Listar empleados por campo nombre
		public List<Juego> findByNombre(String nombre);
}
