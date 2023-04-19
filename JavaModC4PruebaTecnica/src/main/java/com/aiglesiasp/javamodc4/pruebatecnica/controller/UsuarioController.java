/**
 * 
 */
package com.aiglesiasp.javamodc4.pruebatecnica.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Usuario;
import com.aiglesiasp.javamodc4.pruebatecnica.service.UsuarioServiceImpl;

/**
 * @author aitor
 *
 *
 */
@RestController
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	UsuarioServiceImpl usuarioServiceImpl;
	
	@GetMapping("/usuarios")
	public List<Usuario> listarUsuarios(){
		return usuarioServiceImpl.listarUsuarios();
	}
	
	@PostMapping("/usuarios")
	public Usuario salvarUsuario(@RequestBody Usuario usuario) {
		return usuarioServiceImpl.guardarUsuario(usuario);
	}
	
	@GetMapping("/usuarios/{id}")
	public Usuario usuarioById(@PathVariable(name="id") int id) {
		Usuario usuario= new Usuario();
		usuario = usuarioServiceImpl.usuarioById(id);
		return usuario;
	}
	
	// BUSCAR EMPLEADO POR NOMBRE
	@GetMapping("/usuarios/nombre/{nombre}")
	public List<Usuario> listarUsuarioNombre(@PathVariable(name = "nombre") String username) {
		return usuarioServiceImpl.listarUsuarioNombre(username);
	}
	
	@PutMapping("/usuarios/{id}")
	public Usuario actualizarUsuario(@PathVariable(name="id")int id,@RequestBody Usuario usuario) {
		
		Usuario usuario_seleccionado= new Usuario();
		Usuario usuario_actualizado= new Usuario();
		usuario_seleccionado= usuarioServiceImpl.usuarioById(id);
		
		usuario_seleccionado.setNombre(usuario.getNombre());
		usuario_seleccionado.setEmail(usuario.getEmail());
		usuario_seleccionado.setPass(usuario.getPass());
		
		usuario_actualizado = usuarioServiceImpl.actualizarUsuario(usuario_seleccionado);
		return usuario_actualizado;
	}
	
	@DeleteMapping("/usuarios/{id}")
	public void eliminarusuario(@PathVariable(name="id")int id) {
		usuarioServiceImpl.eliminarUsuario(id);
	}
}
