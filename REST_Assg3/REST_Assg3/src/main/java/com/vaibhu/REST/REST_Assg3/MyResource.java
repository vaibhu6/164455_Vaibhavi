package com.vaibhu.REST.REST_Assg3;

import javax.websocket.server.PathParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.vaibhu.REST.REST_Assg3.dao.AddressDao;
import com.vaibhu.REST.REST_Assg3.pojo.Address;


@Path("address")
public class MyResource {

	AddressDao dao= new AddressDao();
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public Address address(@FormParam("zip") long pin){
		for(Address ad:dao.getAddress()){
			if(pin==ad.getZip()){
				return ad;
			}
			
		}
		return null;
	}
}


