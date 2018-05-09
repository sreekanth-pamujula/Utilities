package com.finatel.tabserve.exception;

import com.finatel.tabserve.enumeration.CodeDescription;

public class InternalServerException extends RestException {

    private static final long serialVersionUID = 8263143357588041554L;

    public InternalServerException(CodeDescription errorCode) {
        super(errorCode, errorCode.getDescription());
    }

}
