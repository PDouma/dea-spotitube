package nl.han.pieter.service;

import javax.ws.rs.core.Response;

public class TokenService {
    public String generateToken() {
        String token = "1234-abc-444";
        return token;
    }

    public Response readToken() {
        return Response.status(200).build();
    }
}
