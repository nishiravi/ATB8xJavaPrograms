package Task.Task_4oct;

import java.util.Date;

public class Lab084_Person {
    String name;
    String gender;
    int age;
    Date dob;
    int IDcard_num;
    String address;
    String city;
    int pincode;
    String state;
    String country;

    Lab084_Person()
    {

        System.out.println("Person  ,default constructor called");
    }
    Lab084_Person(String name,String gender,int age, String address,String city,String state, int pincode,String country)
    {
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.address=address;
        this.city=city;
        this.state=state;
        this.pincode=pincode;
        this.country=country;
    }


    public void personalDetail()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
    public void personaladdress()
    {
        System.out.println(name);
        System.out.println(age);
        System.out.println(gender);
    }
    public void citizen()
    {
        System.out.println(state);
        System.out.println(country);
    }

    public void walk()
    {
        System.out.println(" yes i can walk");
    }

    public  boolean isHuman()
    {
        return true;
    }
}
