package com.example.restfull;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class EsepcionCont extends ResponseEntityExceptionHandler {

	
	@ExceptionHandler(BadEx.class)
	public ResponseEntity<BadEx>Handler(BadEx ex){
		BadEx b1=new BadEx("mensaje",ex.getMessage());
		return new ResponseEntity<>(b1,HttpStatus.CREATED);
	}
}
