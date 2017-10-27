package nl.han.pieter.domain;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class AuthController {
    public Response loginAction(String user) {
        return Response.status(200).build();
    }
}