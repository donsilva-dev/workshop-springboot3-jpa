package com.dnstech.couser.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnstech.couser.entities.Order;
import com.dnstech.couser.services.OrderService;

/* - Aqui iremos definir os recursos basico para aplicação "User" que serão os controladores rest 
 * - Para esse classe ser um recurso web é usado a anotação @RestController
 * - Alem disso damos um nome ao recurso usando anotação @RestMapping 
 * - @RequestMapping é uma anotação de nível de classe que define o prefixo de URL para todas as rotas de um controller.
 * */

@RestController
@RequestMapping(value = "/orders/")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	/*Criando um metodo endpoint para acessar os usuarios 
	 * ResponseEntitis é o tipo expecifico de retorno do sring para retorna resposta de requisiçoes web*/
	@GetMapping
	public ResponseEntity<List<Order>> findAll(){
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id){
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
		
	}
	
}
