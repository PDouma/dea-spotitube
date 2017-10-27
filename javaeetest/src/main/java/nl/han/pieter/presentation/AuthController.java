package nl.han.pieter.presentation;

import nl.han.pieter.presentation.dto.LoginRequest;
import nl.han.pieter.presentation.dto.LoginResponse;
import nl.han.pieter.service.TokenService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/login")
public class AuthController {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response loginAction(LoginRequest request) {
        //Call to db to verify user//
        boolean domainLayerRequest = true;

        LoginResponse response = new LoginResponse();

        if (domainLayerRequest) {
            TokenService tokenService = new TokenService();
            String token = tokenService.generateToken();

            response.setToken(token);
            response.setUser(request.getUser());
        }
        System.out.println(response.getToken() + response.getUser());
        return Response.status(Response.Status.OK).entity(response).build();
    }
}
