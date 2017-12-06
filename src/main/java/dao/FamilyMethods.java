
package dao;

import java.util.List;
import model.Family;

public interface FamilyMethods {
    public void insertFamily(Family f);
    public List<Family> getFamilies();
    public void deleteFamily(int id);
    public Family getFamily(int id);
    public void updateFamily(Family f);
    public Family loginFamily(int id,String family);
}
