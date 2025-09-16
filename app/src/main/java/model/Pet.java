package model;

import java.sql.Array;

public class Pet {
    String name;
    String breed;
    int age;

    public String toString(){
        return (name + "(" + breed "): " + age;

    }
    public String getName(){
        return name;
    }
    public String getBreed(){
        return breed;
    }
    public int getAge(){
        return age;
    }
}

