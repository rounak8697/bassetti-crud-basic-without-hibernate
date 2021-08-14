package com.crud;

public class StdModel
{
    int id,roll;
    String name,depart;
    public StdModel(){}
    public StdModel(int id, String name, int roll,String depart)
    {
        this.id = id;
        this.roll = roll;
        this.name = name;
        this.depart = depart;
    }
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public int getRoll() {return roll;}
    public void setRoll(int roll) {this.roll = roll;}

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public String getDepart() {return depart;}
    public void setDepart(String depart) {this.depart = depart;}

    @Override
    public String toString()
    {return "StudentPojo [id=" + id + ", roll=" + roll + ", name=" + name + ", depart=" + depart + "]";}
}
