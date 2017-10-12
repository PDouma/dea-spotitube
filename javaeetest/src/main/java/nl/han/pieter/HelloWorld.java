package nl.han.pieter;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/")
public class HelloWorld {
    private String username = "pieter";
    private String password = "test123";

    @Path("hello")
    @GET
    public String getMessage() {
        return "Mandatory hello world";
    }

    @Path("login")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(String username, String password) {
        return Response.status(200).build();
    }
}