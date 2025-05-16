package com.wiltoncorps.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiltoncorps.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
