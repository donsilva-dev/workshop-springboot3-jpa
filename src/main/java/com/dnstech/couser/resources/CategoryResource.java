package com.dnstech.couser.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnstech.couser.entities.Category;
import com.dnstech.couser.services.CategoryService;

@RestController
@RequestMapping(value = "/category")
public class CategoryResource {
	
	@Autowired
	private CategoryService service;
	
	/*Listando todas categoria*/
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	/*Listando categoria por ID*/
	public ResponseEntity<Category> findById(@PathVariable Long id){
		Category cat = service.findById(id);
		return ResponseEntity.ok().body(cat);
	}

}
