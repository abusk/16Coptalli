package com.coptalli.services;

import com.coptalli.model.UserCredentials;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

/**
 * Created by taleb on 3/31/18.
 */

@Path("/user")
@Consumes("application/json")
@Produces("application/json")
public class CoptaliUserServices {

    @GET
    @Path("/login")
    public Response login(UserCredentials credentials){
        return Response.ok("{\"result\" : success}").build();
    }
    @GET
    @Path("/test")
    public Response test(){
        return Response.ok("{\"result\":\"hi\"}").build();
    }
}
