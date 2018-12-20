package com.vaibhu.REST.REST_Assg2;

import javax.websocket.server.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/validate")
public class MessageResource {

	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String validate(@FormParam("username") String username , @FormParam("pwd") String password){
		if(username.equals("vaibhu") && password.equals("1234"))
		{
			return "Valid user";
		}else{
			return "Invalid User";
		}
	}
}
