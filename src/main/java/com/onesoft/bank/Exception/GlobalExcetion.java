package com.onesoft.bank.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice

public class GlobalExcetion {
	@ExceptionHandler(BrandNotFoundException.class)
    public ResponseEntity<Object> BrandNotFoundException(BrandNotFoundException a){
    	return new ResponseEntity<>(a.getMessage(),HttpStatus.NOT_FOUND);
    }
	@ExceptionHandler(MissingServletRequestParameterException.class)
	public ResponseEntity<Object> MissingServletRequestParameterException(MissingServletRequestParameterException b){
		return new ResponseEntity<>("ihukuda ivalo nalla thariyalayae da unakku loosu.......",HttpStatus.NOT_FOUND);
	}
	



}
