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

import com.ubosque.misiontic.lagenerica.api.model.Proveedor;

import com.ubosque.misiontic.lagenerica.api.repository.ProveedorRepository;

@RestController
public class ProveedorController {
	
	@Autowired
	private ProveedorRepository repositorio;
	
	@PostMapping("/addProveedor")
	public String crearProveedor(@RequestBody Proveedor proveedor) {
		repositorio.save(proveedor);
		return "Proveedor creado satisfactoriamente con Nit: " + proveedor.getNitproveedor();
	}
	
	@PutMapping("/actualizarProveedor")
	public String actualizarProveedor(@RequestBody Proveedor proveedor) {
		repositorio.save(proveedor);
		return "Proveedor actualizado satisfactoriamente con Nit: " + proveedor.getNitproveedor();
	}
	
	@GetMapping("/consultarProveedor/{id}")
	public Optional<Proveedor> consultarProveedor(@PathVariable int id){
		return repositorio.findById(id);
	}

	@GetMapping("/consultarProveedores")
	public List<Proveedor> consultarProveedores(){
		return repositorio.findAll();
	}
	
	@DeleteMapping("/borrarProveedor/{id}")
	public String borrarProveedor(@PathVariable int id) {
		repositorio.deleteById(id);
		return "Proveedor borrado satisfactoriamente con el Nit: " + id;
	}
}
