package com.example.services;

import com.example.models.Test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.PathParam;

@Path("/codetest")
@Produces(MediaType.APPLICATION_JSON)
public class CodeTest {

    @GET
    @Path("/test")
    public Test get() {
        return new Test();
    }
    
}

