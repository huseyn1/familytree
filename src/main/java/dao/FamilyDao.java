
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Family;

public class FamilyDao extends OracleDao implements FamilyInserting{

    @Override
    public void insertFamily(Family f) {    
    
        try {
            String query = "insert into families (fid,fname) values (?,?)" ;
            getConnection();
            ps = conn.prepareStatement(query);
            ps.setInt(1, f.getId());
            ps.setString(2, f.getFamily());
            ps.executeUpdate();
            conn.commit();
            closeConnection();
        } catch (SQLException ex) {
            ex.printStackTrace();
            closeConnection();
        }
        
    }

    public List<Family> getFamilies() {
        
        List<Family> familys = new ArrayList<>();
        try {
            String sql = "select fid,fname from families";
            getConnection();
            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){
            Family f = new Family();
            f.setId(rs.getInt("fid"));
            f.setFamily(rs.getString("fname"));
            familys.add(f);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return familys;
    }
    
}
