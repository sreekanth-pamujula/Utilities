package com.finatel.tabserve.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

import com.finatel.tabserve.enumeration.CodeDescription;


@Data
@EqualsAndHashCode(callSuper=false)
public class RestException extends RuntimeException {

    private static final long serialVersionUID = 5621993860252119284L;

    private Boolean status = false;
    
    private CodeDescription codeDescription;

    private String message;

    public RestException() { }

    public RestException(CodeDescription codeDescription) {
    	this.codeDescription = codeDescription;
	}
    
    public RestException(String codeDescription) {
    	if(this.codeDescription == null)
    		this.codeDescription = CodeDescription.DUPLICATE;
    	this.codeDescription.setDescription(codeDescription);
	}
	public RestException(CodeDescription errorCode, String description) {
		
	}
}