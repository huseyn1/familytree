
package dao;

import java.sql.SQLException;
import java.util.List;
import model.Human;

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

    public List<Human> getHumans() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
