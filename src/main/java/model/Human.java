
package model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Human {
    
    private int id;
    private String name;
    private String surname;
    private int age;
    private int genderStatus;
    private int lifeStatus;
    private int familyId;

    public Human() {
    }

    public Human(int id, String name, String surname, int age, int genderStatus, int lifeStatus, int familyId)  {
        this.id = id; 
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.genderStatus = genderStatus;
        this.lifeStatus = lifeStatus;
        this.familyId = familyId;
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

    public int getGenderStatus() {
        return genderStatus;
    }

    public void setGenderStatus(int genderStatus) {
        this.genderStatus = genderStatus;
    }

    public int getLifeStatus() {
        return lifeStatus;
    }

    public void setLifeStatus(int lifeStatus) {
        this.lifeStatus = lifeStatus;
    }

    public int getFamilyId() {
        return familyId;
    }

    public void setFamilyId(int familyId) {
        this.familyId = familyId;
    }
    
    

    @Override
    public String toString() {
        return "Human{" + "id=" + id + ", name=" + name + ", surname=" + surname + ", age=" + age + ", genderStatus=" + genderStatus + ", lifeStatus=" + lifeStatus + '}';
    }
    
    
    
}
