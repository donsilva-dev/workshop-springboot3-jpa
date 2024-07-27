package com.dnstech.couser.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnstech.couser.entities.Category;
import com.dnstech.couser.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	/*Metodo que busca todos os usuarios no banco de dados*/
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	/*Metodo que busca usuarios no banco de dados por Id*/
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
