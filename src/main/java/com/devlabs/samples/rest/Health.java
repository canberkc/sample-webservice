package com.devlabs.samples.rest;

import static javax.ws.rs.core.MediaType.TEXT_PLAIN;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/health")
public class Health {

  @GET
  @Produces(TEXT_PLAIN)
  public Response status() {
    return Response.ok().entity("Server is up!").build();
  }

}
