package com.coptalli.services;

import javax.ws.rs.*;
import javax.ws.rs.core.SecurityContext;

/**
 * Created by abu on 30/4/17.
 */
@Path("/coptalli")
@Produces("application/json")
@Consumes("application/json")
public class CoptalliServices {


    @GET
    @Path("/login")
    public boolean login(SecurityContext context){
        return true;
    }
    @POST
    @Path("/signup")
    public boolean signup(){
        return true;
    }
    @POST
    @Path("/play")
    public boolean play(){
        return true;
    }
    @POST
    @Path("/move")
    public boolean move(){
        return true;
    }
}
