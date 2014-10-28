package com.nord.net.webservice.provider;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.springframework.stereotype.Component;

import com.nord.net.common.CustomSystemException;

/**
 * 
 * @author hdoanthanh
 *
 */
@Provider
public class CustomExceptionMapper implements ExceptionMapper<CustomSystemException> {

	public Response toResponse(CustomSystemException exception) {
		Response.Status status;
		 
        status = Response.Status.INTERNAL_SERVER_ERROR;
 
        return Response.status(status).header("exception", exception.getMessage()).build();
	}
}
