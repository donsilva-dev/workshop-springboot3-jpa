package com.dnstech.couser.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dnstech.couser.entities.User;

/* - Aqui iremos definir os recursos basico para aplicação "User" que serão os controladores rest 
 * - Para esse classe ser um recurso web é usado a anotação @RestController
 * - Alem disso damos um nome ao recurso usando anotação @RestMapping 
 * - @RequestMapping é uma anotação de nível de classe que define o prefixo de URL para todas as rotas de um controller.
 * */

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	/*Criando um metodo endpoint para acessar os usuarios 
	 * ResponseEntitis é o tipo expecifico de retorno do sring para retorna resposta de requisiçoes web*/
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Douglas", "douglas@teste.com", "11947982565", "123456789");
		return ResponseEntity.ok().body(u);
		
	}
	
}
