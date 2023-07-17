package com.deivinsonpereira.clientecrud.controllers.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.deivinsonpereira.clientecrud.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<StandardError> error(ResourceNotFoundException e, HttpServletRequest request){
		StandardError err = new StandardError();
		Integer status = HttpStatus.NOT_FOUND.value();
		err.setTimestamp(Instant.now());
		err.setStatus(status);
		err.setError("Not found");
		err.setPath(request.getRequestURI());
		return ResponseEntity.status(status).body(err);
	}
}
