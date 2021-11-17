package com.ubosque.misiontic.lagenerica.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ubosque.misiontic.lagenerica.api.model.Cliente;
import com.ubosque.misiontic.lagenerica.api.repository.ClienteRepository;

@RestController
public class ClienteController {
	
	@Autowired
	private ClienteRepository repositorio;
	
	@PostMapping("/addCliente")
	public String saveCliente(@RequestBody Cliente cliente) {
		repositorio.save(cliente);
		return "Cliente creado correctamente con cedula " + cliente.getCedulaCliente();
	}
	
	@PutMapping("/actualizarCliente")
	public String actualizarCliente(@RequestBody Cliente cliente) {
		repositorio.save(cliente);
		return "Cliente actualizado con cedula " + cliente.getCedulaCliente();
	}
	
	@GetMapping("/consultarClientes")
	public List<Cliente> consultarClientes(){
		return repositorio.findAll();
	}
	
	@GetMapping("/cliente/{id}")
	public Optional<Cliente> clientePorCedula(@PathVariable int id) {
		return repositorio.findById(id);
	}
	
	@DeleteMapping("/borrarCliente/{id}")
	public String borrarCliente(@PathVariable int id) {
		return "Cliente borrado con cedula " + id;
	}

}
