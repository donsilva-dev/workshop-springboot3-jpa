package com.dnstech.couser.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dnstech.couser.entities.Order;
import com.dnstech.couser.repositories.OrderRepository;

/* Em OrderService declarar duas operaçoes, uma para buscar por usuario por id e outra para buscar todos usuarios 
 * Para fazer isso o meu OrderService precisa ter uma idependencia com OrderRespository*/

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	/*Metodo que busca todos os usuarios no banco de dados*/
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	/*Metodo que busca usuarios no banco de dados por Id*/
	public Order findById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
	
}
