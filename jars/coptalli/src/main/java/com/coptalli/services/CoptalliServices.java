package com.coptalli.services;

import com.coptalli.board.BoardController;
import com.coptalli.model.Board;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
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
    @Path("/createGame/{userId}")
    @Produces(MediaType.TEXT_PLAIN)
    public String createGame(@PathParam("userId") String userId){
        return BoardController.createGame(userId, "50,150","500,600");
    }
    @GET
    @Path("/joinGame/{gameId}/{userId}")
    @Produces(MediaType.TEXT_PLAIN)
    public String joinGame(@PathParam("gameId") String gameId, @PathParam("userId") String userId){
        return BoardController.joinGame(gameId,userId);
    }
    @GET
    @Path("/play/{gameId}/{playerId}")
    public Board play(@PathParam("gameId") String gameId, @PathParam("playerId") String playerId){
        return BoardController.play(gameId, playerId);
    }
    @GET
    @Path("/move")
    public boolean move(){
        return true;
    }
}
