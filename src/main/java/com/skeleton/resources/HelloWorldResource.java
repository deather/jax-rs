package com.skeleton.resources;

import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Path("/hello")
public class HelloWorldResource {

	@GET
	public List<String> hello() {
		return Arrays.asList("pouet", "tut");
	}
}
