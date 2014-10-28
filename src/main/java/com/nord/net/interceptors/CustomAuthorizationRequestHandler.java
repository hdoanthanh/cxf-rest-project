package com.nord.net.interceptors;

import java.io.IOException;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.Provider;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.cxf.configuration.security.AuthorizationPolicy;
import org.apache.cxf.jaxrs.utils.JAXRSUtils;
import org.apache.cxf.message.Message;
import org.springframework.stereotype.Component;

@Provider
public class CustomAuthorizationRequestHandler implements
		ContainerRequestFilter, ContainerResponseFilter {
	
	private Log LOGGER = LogFactory.getLog(CustomAuthorizationRequestHandler.class);

	public void filter(ContainerRequestContext context) throws IOException {
		Response failedRS = Response.status(401)
				.header("WWW-Authenticate", "Basic").build();
		
		LOGGER.info("execute in CustomAuthorizationRequestHandler.filter beginning");
		
		Message message = JAXRSUtils.getCurrentMessage();
		AuthorizationPolicy policy = (AuthorizationPolicy) message
				.get(AuthorizationPolicy.class);
		if (policy == null) {
			context.abortWith(failedRS);
		} else {
			String username = policy.getUserName();
			String password = policy.getPassword();
			/**
			 * custom username password verification
			 */
			if (!("admin".equalsIgnoreCase(username) && "admin"
					.equalsIgnoreCase(password))) {
				context.abortWith(failedRS);
			}
		}
	}

	public void filter(ContainerRequestContext arg0,
			ContainerResponseContext context) throws IOException {
		// TODO Auto-generated method stub
		
	}

}
