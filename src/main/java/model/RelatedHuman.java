
package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class RelatedHuman {
    
    private int id;
    private String name;
    private String surname;
    private int age;
    private String relatedName;
    private String relType;
    private String genderType;
    private String life_status;

    public RelatedHuman() {
    }

    public RelatedHuman(int id, String name, String surname, int age, String relatedName, String relType, String genderType, String life_status) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.relatedName = relatedName;
        this.relType = relType;
        this.genderType = genderType;
        this.life_status = life_status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRelatedName() {
        return relatedName;
    }

    public void setRelatedName(String relatedName) {
        this.relatedName = relatedName;
    }

    public String getRelType() {
        return relType;
    }

    public void setRelType(String relType) {
        this.relType = relType;
    }

    public String getGenderType() {
        return genderType;
    }

    public void setGenderType(String genderType) {
        this.genderType = genderType;
    }

    public String getLife_status() {
        return life_status;
    }

    public void setLife_status(String life_status) {
        this.life_status = life_status;
    }

    @Override
    public String toString() {
        return "RelatedHuman{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", relatedName=" + relatedName + ", relType=" + relType + ", genderType=" + genderType + ", life_status=" + life_status + '}';
    }

    
}
