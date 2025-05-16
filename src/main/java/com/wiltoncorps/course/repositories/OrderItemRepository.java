package com.wiltoncorps.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiltoncorps.course.entities.OrderItem;
import com.wiltoncorps.course.entities.pk.OrderItemPk;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPk>{

}
