package com.finatel.tabserve.exception;

import java.io.IOException;

import lombok.Getter;
import lombok.ToString;

import org.springframework.http.client.ClientHttpResponse;

@ToString
public class FCMException extends RuntimeException {

	private static final long serialVersionUID = -7149248486372770292L;
	
	@Getter
	private ClientHttpResponse clientHttpResponse;
	
	public FCMException(){ }
			
	public FCMException(ClientHttpResponse response) throws IOException {
		this.clientHttpResponse = response;
	}	
}