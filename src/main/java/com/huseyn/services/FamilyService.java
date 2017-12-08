
package com.huseyn.services;

import dao.FamilyDao;
import java.util.List;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Family;

@Path("familyservice")
public class FamilyService  {
    
    FamilyDao familyDao = new FamilyDao();
    
    @GET
    @Path("showfamilies")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Family> getFamilies() {
        return familyDao.getFamilies();
    }
    
    @GET
    @Path("getfamily/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Family getFamily(@PathParam("id") int id){
    
     return familyDao.getFamily(id);
        
    }
    
    
    @POST
    @Path("createfamily")
    @Produces(MediaType.APPLICATION_JSON)
    public Family createFamily(Family family){
        System.out.println(family);
        //familRepo.create(family);
        familyDao.insertFamily(family);
        return family;
        
    }
    
    @DELETE
    @Path("deletefamily/{id}")
    @Produces (MediaType.APPLICATION_JSON)
    public Family deleteFamily(@PathParam("id") int id){
        Family family = familyDao.getFamily(id);
        if (family.getId()!=0)
        familyDao.deleteFamily(id);
        return family;
    }
    
    @PUT
    @Path("updatefamily")
    @Produces(MediaType.APPLICATION_JSON)
    public Family updateFamily(Family f){
        
        if (familyDao.getFamily(f.getId()).getId()==0){
         familyDao.insertFamily(f);
        } else {
         familyDao.updateFamily(f);
        }
        return f;
      
    }
}
