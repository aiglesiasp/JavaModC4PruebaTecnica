/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aiglesiasp.javamodc4.pruebatecnica.dao.IMensajeDAO;
import com.aiglesiasp.javamodc4.pruebatecnica.dto.Mensaje;
import com.aiglesiasp.javamodc4.pruebatecnica.dto.Usuario;

/**
 * @author aitor
 *
 */
@Service
public class MensajeServiceImpl implements IMensajeService {

	@Autowired
	IMensajeDAO iMensajeDAO;

	@Override
	public List<Mensaje> listarMensajes() {
		return iMensajeDAO.findAll();
	}

	@Override
	public Mensaje guardarMensaje(Mensaje mensaje) {
		return iMensajeDAO.save(mensaje);
	}

	@Override
	public Mensaje mensajeById(int id) {
		return iMensajeDAO.findById(id).get();
	}

	@Override
	public Mensaje actualizarMensaje(Mensaje mensaje) {
		return iMensajeDAO.save(mensaje);
	}

	@Override
	public void eliminarMensaje(int id) {
		iMensajeDAO.deleteById(id);

	}

	@Override
	public List<Mensaje> listarMensajeUsuario(Usuario usuario) {
		return iMensajeDAO.findByUsuario(usuario);
	}

}
