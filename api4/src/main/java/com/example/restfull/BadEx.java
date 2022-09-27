package com.example.restfull;

import org.springframework.http.HttpStatus; 
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.sun.xml.bind.v2.schemagen.xmlschema.Annotation;


public class BadEx extends RuntimeException {
	
	private static final long serialVersionUID = 1322567888;
	String msj,detalles;
	public BadEx(String msj, String detalles) {
		super();
		this.msj = msj;
		this.detalles=detalles;
	}
	public BadEx() {
		super();
	}
	
}
