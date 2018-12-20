package com.vaibhu.REST.REST_Assg.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/messages")
public class MessageResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String show(){
		return "Hello World";
	}
}
