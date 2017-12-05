
package dao;

import java.sql.SQLException;
import model.Family;

public class InsertFamilyDao extends OracleDao implements FamilyInserting{

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
    
}
