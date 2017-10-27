package nl.han.pieter.domain;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/tracks")
public class TrackController {

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
