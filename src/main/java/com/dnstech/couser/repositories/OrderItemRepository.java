package com.dnstech.couser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dnstech.couser.entities.OrderItem;
import com.dnstech.couser.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
