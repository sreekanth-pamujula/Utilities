package com.finatel.tabserve.exception;

import lombok.Getter;

import com.finatel.tabserve.enumeration.CodeDescription;

public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 85583224758803531L;

	@Getter
	Integer code;
	@Getter
	String description;
	boolean status = false;
	
	public BadRequestException(){}
	
	public BadRequestException(CodeDescription codeDescription){
		this.status = false;
		this.code = codeDescription.code;
		this.description = codeDescription.description;
	}
	
	public BadRequestException(CodeDescription codeDescription,String parameter){
		this.status = false;
		this.code = codeDescription.code;
		this.description = codeDescription.description+" :'"+parameter+"'";
	}
	@Override
    public String toString() {
        return "Exception [code=" + code + ", message=" + description + "]";
    }
}