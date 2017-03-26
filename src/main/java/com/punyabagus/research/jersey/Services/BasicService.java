package com.punyabagus.research.jersey.Services;

import com.punyabagus.research.jersey.Logic.BasicLogic;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Bagus Prasojo on 3/18/2017.
 */
@Path("/basic")
public class BasicService {
    public BasicLogic basicLogic;

    @Inject
    public BasicService(BasicLogic basicLogic) {
        this.basicLogic = basicLogic;
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") String id) {
        return Response.ok(basicLogic.getString()).build();
    }
}
