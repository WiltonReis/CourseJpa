package com.wiltoncorps.course.services.exception;

public class ResourceNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Long id) {
		super("User not found id " + id);
	}
}
