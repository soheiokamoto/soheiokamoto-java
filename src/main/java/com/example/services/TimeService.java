package com.example.services;

import com.example.models.Time;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import javax.ws.rs.PathParam;
import java.util.TimeZone;

@Path("/time")
@Produces(MediaType.APPLICATION_JSON)
public class TimeService {

    @GET
    @Path("/{timezone}")
    public Time get(@PathParam("timezone") String timezone) {
        return new Time(TimeZone.getTimeZone(timezone.toUpperCase()));
    }
}

