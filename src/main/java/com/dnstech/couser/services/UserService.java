package com.dnstech.couser.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnstech.couser.entities.User;
import com.dnstech.couser.repositories.UserRepository;

/* Em UserService declarar duas operaçoes, uma para buscar por usuario por id e outra para buscar todos usuarios 
 * Para fazer isso o meu UserService precisa ter uma idependencia com UserRespository*/

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	/*Metodo que busca todos os usuarios no banco de dados*/
	public List<User> findAll(){
		return repository.findAll();
	}
	
	/*Metodo que busca usuarios no banco de dados por Id*/
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
	
}
