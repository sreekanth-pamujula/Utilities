package com.finatel.tabserve.exception;

import lombok.extern.log4j.Log4j;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


import com.finatel.tabserve.dto.BaseDTO;

@ControllerAdvice
@Log4j
public class RestExceptionHandler extends ResponseEntityExceptionHandler{

	@ExceptionHandler
	@ResponseStatus(value = HttpStatus.BAD_REQUEST)
	@ResponseBody BaseDTO handleException(final BadRequestException ex){
		BaseDTO base = new BaseDTO();
		base.setCode(ex.code);
		base.setDescription(ex.description);
		return base;
	}
	
	@ExceptionHandler
	@ResponseStatus(value = HttpStatus.UNAUTHORIZED)
	@ResponseBody BaseDTO handleException(final AccessDeniedException ex){
		BaseDTO base = new BaseDTO();
		base.setCode(401);
		base.setDescription("Access Denied");
		return base;
	}
	
	@ExceptionHandler
	@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody BaseDTO handleException(final Exception ex){
		BaseDTO base = new BaseDTO();
		base.setCode(500);
		base.setDescription("Internal Server Error");
		log.info("Internal Server Error \n",ex);
		return base;
	}
	
	@ExceptionHandler(value = { DuplicateException.class })
	@ResponseBody BaseDTO handleDuplicateException(final RestException ex, final WebRequest request) {
	 BaseDTO base = new BaseDTO();
		base.setCode(ex.getCodeDescription().getCode());
		base.setStatus(ex.getStatus());
		base.setDescription(ex.getCodeDescription().getDescription());
		log.info("Duplicate Exception \n",ex);
		return base;	        
	}
}