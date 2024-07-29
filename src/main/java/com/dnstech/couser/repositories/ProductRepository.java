package com.dnstech.couser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dnstech.couser.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
