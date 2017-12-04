
package com.huseyn.services;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Family;
import model.FamilyRespository;

@Path("family_insert")
public class CreateFamilyService  {
    
    FamilyRespository familRepo = new FamilyRespository();
    
    @GET
    @Path("family/{familyid}/{family}")
    @Produces(MediaType.APPLICATION_JSON)
    public void createFamily(@PathParam("familyid") int familyid, 
                             @PathParam("family") String family){
        
        Family families = new Family(familyid, family);
        
        familRepo.create(families);

    }
}
