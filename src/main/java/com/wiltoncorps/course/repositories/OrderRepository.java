package com.wiltoncorps.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiltoncorps.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
