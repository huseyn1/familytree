
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;
import model.Human;
import model.RelatedHuman;
import model.Relation;
import oracle.net.ns.SessionAtts;

public class HumanDao extends OracleDao implements HumanMethods{
    
  
 
    @Override
    public void insertHuman(Human h) {
         try {
            String query = "insert into human (hid,first_name,last_name,age,gender_id,life_id,family_id) values (?,?,?,?,?,?,?)" ;
            getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, h.getId());
            ps.setString(2, h.getName());
            ps.setString(3, h.getSurname());
            ps.setInt(4, h.getAge());
            ps.setInt(5, h.getGenderStatus());
            ps.setInt(6, h.getLifeStatus());
            ps.setInt(7, h.getFamilyId());
            ps.executeUpdate();
            conn.commit();
            closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
            closeConnection();
        } 
    }
    
    @Override
     public void createRelation(Relation r) {
      
         try {
            String query = "insert into relations (id,human_id,rel_human_id,rel_type_id)  values (seq1.nextval,?,?,?) ";
            getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1,r.getHuman_id());
            ps.setInt(2,r.getRel_human_id());
            ps.setInt(3,r.getRel_type_id());
            ps.executeUpdate();
            conn.commit();
            closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
            closeConnection();
        } 
        
    }

    public List<RelatedHuman> getHumans(int familyId) {
         List<RelatedHuman> humans = new ArrayList<>();
            
            String sql="select h.hid as id,h.FIRST_NAME f_name,h.last_name as l_name,h.age as yas, h2.FIRST_NAME as h2_name,rt.REL_TYPES as r_type,Gt.Gtype g_type,lst.life_type as l_type from human h " +
                    " inner join geder_type gt on h.gender_id = Gt.Gid " +
                    " inner join life_status lst on H.Life_Id = lst.life_id" +
                    " inner join relations r on r.HUMAN_ID=h.HID " +
                    " inner join human h2 on r.REL_HUMAN_ID=h2.HID " +
                    " inner join RELATION_TYPE rt on r.REL_TYPE_ID=rt.REL_TYPE_ID where h.FAMILY_ID = ?";
        try {
           
            getConnection();
            ps = conn.prepareStatement(sql);
            ps.setInt(1, familyId);
            rs=ps.executeQuery();
            while(rs.next()){
            RelatedHuman rth = new RelatedHuman(rs.getInt("id"), 
                                                rs.getString("f_name"), 
                                                rs.getString("l_name"), 
                                                rs.getInt("yas"), 
                                                rs.getString("h2_name"), 
                                                rs.getString("r_type"), 
                                                rs.getString("g_type"), 
                                                rs.getString("l_type"));
            humans.add(rth);
            }
           
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return humans;
    }

 
    
}
