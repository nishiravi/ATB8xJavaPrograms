package October.ex_04102024.Constructor;

public class Dog {
    String bread;
    int age;
    String name;
   Dog()
   {
       System.out.println(" I am Default Constructor");
   }
   Dog(String bread){

       this.bread=bread;
       System.out.println(" Parametrized constructor");
       System.out.println(this.bread);
   }
    Dog(String bread,String name, int age){

        this.bread=bread;
        this.name=name;
        this.age=age;
        System.out.println(" Parametrized constructor");
        System.out.println(this.bread);
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(age);
        System.out.println(this.age);

    }
    void walk(){

    }
}
