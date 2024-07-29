package com.dnstech.couser.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnstech.couser.entities.Product;
import com.dnstech.couser.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	@Autowired
	private ProductService service;
	
	/*Listando todas categoria*/
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	/*Listando categoria por ID*/
	public ResponseEntity<Product> findById(@PathVariable Long id){
		Product cat = service.findById(id);
		return ResponseEntity.ok().body(cat);
	}

}
