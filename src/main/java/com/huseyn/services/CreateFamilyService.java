
package com.huseyn.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Family;
import model.FamilyRespository;

@Path("family_insert")
public class CreateFamilyService {
    
    FamilyRespository familRepo = new FamilyRespository();
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "test it!";
    }
    
    @POST
    @Path("family")
    @Produces(MediaType.APPLICATION_JSON)
    public void createFamily(Family family){
        
        familRepo.create(family);

    }
}
