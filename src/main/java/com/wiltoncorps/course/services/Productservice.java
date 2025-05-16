package com.wiltoncorps.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiltoncorps.course.entities.Product;
import com.wiltoncorps.course.repositories.ProductRepository;

@Service
public class Productservice {

	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		List<Product> list = repository.findAll();
		return list;
	}
	
	public Product findByid (Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}
	
}
