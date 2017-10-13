package nl.han.pieter.presentation;

import javax.ws.rs.*; //TODO remove usage of *
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/user")
public class UserController {
    private String username = "pieter";
    private String password = "test123";

    @Path("/test")
    @GET
    public String getMessage() {
        return "Mandatory hello world";
    }

    @GET
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String getAction(@PathParam("id") String id) {
        return id;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listAction() {
        return Response.status(200).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response addAction(String user) { //TODO this should be JSON
        return Response.status(200).build();
    }

    @Path("{id}")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response editAction(@PathParam("id") int id) {
        return Response.status(200).build();
    }
}