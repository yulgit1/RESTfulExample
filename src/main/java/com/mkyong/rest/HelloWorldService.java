package com.mkyong.rest;

import java.net.URI;
import java.net.URISyntaxException;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/id")
public class HelloWorldService {

	/*
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
	*/

	@GET
	@Path("/ycba")
	public Response yourAPIMethod() throws URISyntaxException {
		URI targetURIForRedirection = new URI("http://collection.britishart.yale.edu/id/person-institution/ycba");
		return Response.seeOther(targetURIForRedirection).build();
	}
 
}