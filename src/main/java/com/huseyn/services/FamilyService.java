
package com.huseyn.services;

import dao.InsertFamilyDao;
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
    
     @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
    
    //FamilyRespository familRepo = new FamilyRespository();
    InsertFamilyDao familyDao = new InsertFamilyDao();
    
    @POST
    @Path("createfamily")
    @Produces(MediaType.APPLICATION_JSON)
    public Family createFamily(Family family){
        System.out.println(family);
        //familRepo.create(family);
        familyDao.insertFamily(family);
        return family;
        
    }
}
