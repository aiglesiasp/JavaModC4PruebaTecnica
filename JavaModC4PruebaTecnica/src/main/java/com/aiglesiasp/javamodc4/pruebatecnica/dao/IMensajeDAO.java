/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Mensaje;

/**
 * @author aitor
 *
 */
public interface IMensajeDAO extends JpaRepository<Mensaje, Integer> {

}
