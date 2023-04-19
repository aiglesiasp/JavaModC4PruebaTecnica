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

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Juego;
import com.aiglesiasp.javamodc4.pruebatecnica.service.JuegoServiceImpl;
/**
 * @author aitor
 *
 *
 */
@RestController
@RequestMapping("/api")
public class JuegoController {

	@Autowired
	JuegoServiceImpl juegoServiceImpl;
	
	@GetMapping("/juegos")
	public List<Juego> listarJuegos(){
		return juegoServiceImpl.listarJuegos();
	}
	
	@PostMapping("/juegos")
	public Juego salvarJuego(@RequestBody Juego juego) {
		return juegoServiceImpl.guardarJuego(juego);
	}
	
	@GetMapping("/juegos/{id}")
	public Juego juegoById(@PathVariable(name="id") int id) {
		Juego juego= new Juego();
		juego = juegoServiceImpl.juegoById(id);
		return juego;
	}
	
	@PutMapping("/juegos/{id}")
	public Juego actualizarJuego(@PathVariable(name="id")int id,@RequestBody Juego juego) {
		
		Juego juego_seleccionado= new Juego();
		Juego juego_actualizado= new Juego();
		juego_seleccionado= juegoServiceImpl.juegoById(id);
		
		juego_seleccionado.setNombre(juego.getNombre());
		juego_seleccionado.setTipo(juego.getTipo());
		
		
		juego_actualizado = juegoServiceImpl.actualizarJuego(juego_seleccionado);
		return juego_actualizado;
	}
	
	@DeleteMapping("/juegos/{id}")
	public void eliminarJuego(@PathVariable(name="id")int id) {
		juegoServiceImpl.eliminarJuego(id);
	}
}
