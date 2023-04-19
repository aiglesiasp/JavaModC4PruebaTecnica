/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Usuario;

/**
 * @author aitor
 *
 */
public interface IUsuarioDAO extends JpaRepository<Usuario, Integer> {

}
