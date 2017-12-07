
package com.huseyn.services;

import dao.HumanDao;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Human;

@Path("humanservice")
public class HumanService {
    
    HumanDao humanDao = new HumanDao();
    
    @GET
    @Path("showhuman")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Human> getHumans(){
    return humanDao.getHumans();
    }
    
    @POST
    @Path("createhuman")
    @Produces(MediaType.APPLICATION_JSON)
    public Human createHuman(Human human){
    humanDao.insertHuman(human);
    return human;
    }
    
    @DELETE
    @Path("deletehuman/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Human deleteHuman(@PathParam("id") int id){
    return null;
    }
    
    @PUT
    @Path("updatehuman")
    @Produces(MediaType.APPLICATION_JSON)
    public Human updateHuman(Human human){
    
    return human;
    }
    
}
