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

import com.ubosque.misiontic.lagenerica.api.model.Producto;
import com.ubosque.misiontic.lagenerica.api.repository.ProductoRepository;

@RestController
public class ProductoController {
	
	@Autowired
	private ProductoRepository repository;
	
	@PostMapping("/addproducto")
	public String saveProducto(@RequestBody Producto producto) {
		repository.save(producto);
		return "Producto creado correctamente con el id: " + producto.getCodigoProducto();
	}
	
	@PostMapping("/cargarListaProducto")
	public String cargarProductos(@RequestBody List<Producto> productos) {
		repository.saveAll(productos);
		return productos.size() +" Productos cargados satisfactoriamente";
	}
	
	@GetMapping("/todosLosProductos")
	public List<Producto> getProductos() {
		return repository.findAll();
	}
	
	
	@GetMapping("/consultarProducto/{id}")
	public Optional<Producto> getProducto(@PathVariable int id){
		return repository.findById(id);
		
	}
	
	@DeleteMapping("/borrar/{id}")
	public String deleteProducto(@PathVariable int id) {
		repository.deleteById(id);
		return "Producto eliminado con el codigo: " +id;
	}
	
	@PutMapping("/Updateproducto")
	public String actualizarProducto(@RequestBody Producto producto) {
		repository.save(producto);
		return "Producto actualizado correctamente con el id: " + producto.getCodigoProducto();
	}
}
