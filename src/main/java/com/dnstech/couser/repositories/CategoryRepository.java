package com.dnstech.couser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dnstech.couser.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
