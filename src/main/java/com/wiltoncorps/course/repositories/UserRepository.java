package com.wiltoncorps.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wiltoncorps.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
