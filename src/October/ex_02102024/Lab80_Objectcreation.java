package October.ex_02102024;

public class Lab80_Objectcreation {
    public static void main(String[] args) {
        ATBStudent obj1=new ATBStudent();
        ATBStudent obj2=new ATBStudent();
        ATBStudent obj3=new ATBStudent();
        ATBStudent obj4=new ATBStudent();
        ATBStudent obj5=new ATBStudent();
        obj1.age=10;
        obj1.eat();
        obj2.age=20;
        obj2.eat();
        obj3.age=25;
        obj3.eat();
        obj4.age=28;
        obj4.eat();
        obj5.age=30;
        obj5.eat();
        System.out.println("obj1 age is"+obj1.age);
        System.out.println("obj2 age is"+obj2.age);
        System.out.println("obj3 age is"+obj3.age);
        System.out.println("obj4 age is"+obj4.age);
        System.out.println("obj5 age is"+obj5.age);



    }
}
