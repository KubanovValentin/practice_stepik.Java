package Andrey_Sumin_Object_oriented_programming.Collections.homework;

public class Man {
    private String name;
    private String post;
    private int age;
    private double height;
    public Man(String nameStr,int ageInt){
        this.name=nameStr;
        this.age=ageInt;
    }
    public Man(String postStr){
        this.post=postStr;
    }
    public Man(String nameStr,int ageInt,double heightDouble){
        this.name=nameStr;
        this.age=ageInt;
        this.height=heightDouble;
    }
public String getName(){
        return name;
    }

public int getAge(){
      return age;
    }
    public String getPost(){
        return post;
    }
public double getHeight() {
        return height;
    }
}
