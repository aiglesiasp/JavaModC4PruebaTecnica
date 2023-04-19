/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Partida;

/**
 * @author aitor
 *
 */
public interface IPartidaDAO extends JpaRepository<Partida, Integer> {

}
