package com.finatel.tabserve.exception;

import com.finatel.tabserve.enumeration.CodeDescription;


public class DuplicateException extends RestException {

    private static final long serialVersionUID = -7050154061340999132L;

	public DuplicateException(CodeDescription codeDescription) {
		super(codeDescription);
	}
	public DuplicateException(String codeDescription) {
		super(codeDescription);
	}

}
