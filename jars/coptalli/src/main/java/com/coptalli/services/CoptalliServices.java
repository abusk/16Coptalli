package com.coptalli.services;

import com.coptalli.board.BoardController;
import com.coptalli.model.Board;

import javax.ws.rs.*;
import javax.ws.rs.core.SecurityContext;

/**
 * Created by abu on 30/4/17.
 */
@Path("/rest")
@Produces("application/json")
@Consumes("application/json")
public class CoptalliServices {

    @GET
    @Path("/login")
    public boolean login(){
        return true;
    }

    @POST
    @Path("/signup")
    public boolean signup(){
        return true;
    }

    @GET
    @Path("/createGame/{playerId}")
    public Board createGame(@PathParam("playerId") String playerId){
        return BoardController.createGame(playerId, "50,150","500,600");
    }

    @GET
    @Path("/move")
    public boolean move(){
        return true;
    }
}
