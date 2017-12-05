
package com.huseyn.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Family;
import model.FamilyRespository;

@Path("familyservice")
public class FamilyService  {
    
    FamilyRespository familRepo = new FamilyRespository();
    
    @POST
    @Path("createfamily")
    @Produces(MediaType.APPLICATION_JSON)
    public Family createFamily(Family family){
        System.out.println(family);
        //familRepo.create(family);
        return family;
    }
}