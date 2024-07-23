package com.dnstech.couser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dnstech.couser.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
