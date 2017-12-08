
package dao;

import java.util.List;
import model.Human;
import model.RelatedHuman;
import model.Relation;

public interface HumanMethods {
   public void insertHuman(Human h);
   public void createRelation(Relation relation);
   public List<RelatedHuman> getHumans(int familyId);
}
