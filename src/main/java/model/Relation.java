
package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Relation {
    
    private int human_id;
    private int rel_human_id;
    private int rel_type_id;

    public Relation() {
    }

    public Relation(int human_id, int rel_human_id, int rel_type_id) {
        this.human_id = human_id;
        this.rel_human_id = rel_human_id;
        this.rel_type_id = rel_type_id;
    }

    public int getHuman_id() {
        return human_id;
    }

    public void setHuman_id(int human_id) {
        this.human_id = human_id;
    }

    public int getRel_human_id() {
        return rel_human_id;
    }

    public void setRel_human_id(int rel_human_id) {
        this.rel_human_id = rel_human_id;
    }

    public int getRel_type_id() {
        return rel_type_id;
    }

    public void setRel_type_id(int rel_type_id) {
        this.rel_type_id = rel_type_id;
    }

    @Override
    public String toString() {
        return "Relation{" + "human_id=" + human_id + ", rel_human_id=" + rel_human_id + ", rel_type_id=" + rel_type_id + '}';
    }
    
    
    
}
