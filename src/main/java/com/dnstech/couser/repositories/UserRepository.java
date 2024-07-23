package com.dnstech.couser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dnstech.couser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
