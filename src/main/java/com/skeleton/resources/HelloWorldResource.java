package com.skeleton.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/hello")
public class HelloWorldResource {

	@GET
	public String hello() {
		return "<html><body><h1>Hello World !</h1></body><html>";
	}
}
