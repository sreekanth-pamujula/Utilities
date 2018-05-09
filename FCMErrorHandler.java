package com.finatel.tabserve.exception;

import java.io.IOException;

import org.springframework.http.HttpStatus;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.web.client.DefaultResponseErrorHandler;

public class FCMErrorHandler extends DefaultResponseErrorHandler {

	@Override
	public void handleError(ClientHttpResponse response) throws IOException {
		System.out.println("FCMErrorHandler - handleError :: StatusCode : " + response.getStatusCode() + " StatusText : " + response.getStatusText());
		
		if(response.getStatusCode().equals(HttpStatus.OK)){
			
		}else{
			throw new FCMException(response);
		}
	}

	@Override
	public boolean hasError(ClientHttpResponse response) throws IOException {
		System.out.println("FCMErrorHandler - hasError :: StatusCode : " + response.getStatusCode() + " StatusText : " + response.getStatusText());
		return false;
	}
}
