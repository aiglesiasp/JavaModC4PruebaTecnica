/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.javamodc4.pruebatecnica.dao.IJuegoDAO;
import com.aiglesiasp.javamodc4.pruebatecnica.dto.Juego;

/**
 * @author aitor
 *
 */
@Service
public class JuegoServiceImpl implements IJuegoService {

	@Autowired
	IJuegoDAO iJuegoDAO;
	
	@Override
	public List<Juego> listarJuegos() {
		return iJuegoDAO.findAll();
	}

	@Override
	public Juego guardarJuego(Juego juego) {
		return iJuegoDAO.save(juego);
	}

	@Override
	public Juego juegoById(int id) {
		return iJuegoDAO.findById(id).get();
	}

	@Override
	public Juego actualizarJuego(Juego juego) {
		return iJuegoDAO.save(juego);
	}

	@Override
	public void eliminarJuego(int id) {
		iJuegoDAO.deleteById(id);
		
	}

	@Override
	public List<Juego> listarJuegoNombre(String nombre) {
		return iJuegoDAO.findByNombre(nombre);
	}

}
