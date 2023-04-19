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

import com.aiglesiasp.javamodc4.pruebatecnica.dto.Partida;
import com.aiglesiasp.javamodc4.pruebatecnica.service.PartidaServiceImpl;

/**
 * @author aitor
 *
 *
 */
@RestController
@RequestMapping("/api")
public class PartidaController {

	@Autowired
	PartidaServiceImpl partidaServiceImpl;
	
	@GetMapping("/partidas")
	public List<Partida> listarPartidas(){
		return partidaServiceImpl.listarPartidas();
	}
	
	@PostMapping("/partidas")
	public Partida salvarPartida(@RequestBody Partida partida) {
		return partidaServiceImpl.guardarPartida(partida);
	}
	
	@GetMapping("/partidas/{id}")
	public Partida partidaById(@PathVariable(name="id") int id) {
		Partida partida= new Partida();
		partida = partidaServiceImpl.partidaById(id);
		return partida;
	}
	
	@PutMapping("/partidas/{id}")
	public Partida actualizarPartida(@PathVariable(name="id")int id,@RequestBody Partida partida) {
		
		Partida partida_seleccionada= new Partida();
		Partida partida_actualizada= new Partida();
		partida_seleccionada= partidaServiceImpl.partidaById(id);
		
		partida_seleccionada.setNombre(partida.getNombre());
		partida_seleccionada.setDescripcion(partida.getDescripcion());
		partida_seleccionada.setJuego(partida.getJuego());
		
		partida_actualizada = partidaServiceImpl.actualizarPartida(partida_seleccionada);
		return partida_actualizada;
	}
	
	@DeleteMapping("/partidas/{id}")
	public void eliminarPartida(@PathVariable(name="id")int id) {
		partidaServiceImpl.eliminarPartida(id);
	}
}
