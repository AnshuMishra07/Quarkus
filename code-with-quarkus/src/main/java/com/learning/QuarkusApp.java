package com.learning;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;


@Path("/callme")
public class QuarkusApp {
	
	@ConfigProperty(name = "message.name")
	String message;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String callMe() {
        return message;
    }
}