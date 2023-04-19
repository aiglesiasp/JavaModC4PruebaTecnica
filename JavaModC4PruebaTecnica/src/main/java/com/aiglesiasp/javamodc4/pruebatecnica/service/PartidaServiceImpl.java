/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.javamodc4.pruebatecnica.dao.IPartidaDAO;
import com.aiglesiasp.javamodc4.pruebatecnica.dto.Partida;

/**
 * @author aitor
 *
 */
@Service
public class PartidaServiceImpl implements IPartidaService {

	@Autowired
	IPartidaDAO iPartidaDAO;

	@Override
	public List<Partida> listarPartidas() {
		return iPartidaDAO.findAll();
	}

	@Override
	public Partida guardarPartida(Partida partida) {
		return iPartidaDAO.save(partida);
	}

	@Override
	public Partida partidaById(int id) {
		return iPartidaDAO.findById(id).get();
	}

	@Override
	public Partida actualizarPartida(Partida partida) {
		return iPartidaDAO.save(partida);
	}

	@Override
	public void eliminarPartida(int id) {
		iPartidaDAO.deleteById(id);

	}

	@Override
	public List<Partida> listarPartidaNombre(String nombre) {
		return iPartidaDAO.findByNombre(nombre);
	}

}
