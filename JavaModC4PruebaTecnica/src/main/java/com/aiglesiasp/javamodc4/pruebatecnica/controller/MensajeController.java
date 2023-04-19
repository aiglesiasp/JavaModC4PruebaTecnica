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

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Mensaje;
import com.aiglesiasp.javamodc4.pruebatecnica.service.MensajeServiceImpl;

/**
 * @author aitor
 *
 *
 */
@RestController
@RequestMapping("/api")
public class MensajeController {

	@Autowired
	MensajeServiceImpl mensajeServiceImpl;
	
	@GetMapping("/mensajes")
	public List<Mensaje> listarMensajes(){
		return mensajeServiceImpl.listarMensajes();
	}
	
	@PostMapping("/mensajes")
	public Mensaje salvarMensaje(@RequestBody Mensaje mensaje) {
		return mensajeServiceImpl.guardarMensaje(mensaje);
	}
	
	@GetMapping("/mensajes/{id}")
	public Mensaje mensajeById(@PathVariable(name="id") int id) {
		Mensaje mensaje= new Mensaje();
		mensaje = mensajeServiceImpl.mensajeById(id);
		return mensaje;
	}
	
	@PutMapping("/mensajes/{id}")
	public Mensaje actualizarMensaje(@PathVariable(name="id")int id,@RequestBody Mensaje mensaje) {
		
		Mensaje mensaje_seleccionado= new Mensaje();
		Mensaje mensaje_actualizado= new Mensaje();
		mensaje_seleccionado= mensajeServiceImpl.mensajeById(id);
		
		mensaje_seleccionado.setTexto(mensaje.getTexto());
		mensaje_seleccionado.setFecha(mensaje.getFecha());
		mensaje_seleccionado.setPartida(mensaje.getPartida());
		mensaje_seleccionado.setUsuario(mensaje.getUsuario());
		
		
		mensaje_actualizado = mensajeServiceImpl.actualizarMensaje(mensaje_seleccionado);
		return mensaje_actualizado;
	}
	
	@DeleteMapping("/mensajes/{id}")
	public void eliminarMensaje(@PathVariable(name="id")int id) {
		mensajeServiceImpl.eliminarMensaje(id);
	}
}
