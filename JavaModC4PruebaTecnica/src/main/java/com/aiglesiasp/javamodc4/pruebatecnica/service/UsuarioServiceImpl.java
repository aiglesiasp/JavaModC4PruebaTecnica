/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.aiglesiasp.javamodc4.pruebatecnica.dao.IUsuarioDAO;
import com.aiglesiasp.javamodc4.pruebatecnica.dto.Usuario;

/**
 * @author aitor
 *
 */
public class UsuarioServiceImpl implements IUsuarioService{

	@Autowired
	IUsuarioDAO iUsuarioDAO;
	
	@Override
	public List<Usuario> listarUsuarios() {
		return iUsuarioDAO.findAll();
	}

	@Override
	public Usuario guardarUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public Usuario usuarioById(int id) {
		return iUsuarioDAO.findById(id).get();
	}

	@Override
	public Usuario actualizarUsuario(Usuario usuario) {
		return iUsuarioDAO.save(usuario);
	}

	@Override
	public void eliminarUsuario(int id) {
		iUsuarioDAO.deleteById(id);
		
	}

}
