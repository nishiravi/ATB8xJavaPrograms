package October.ex_04102024.Constructor;

public class AHuman1{
    String name;
    String eye_colour;
    long aadharcard = 2468765748456l;
    String planet="Earth";

    // default constructor : invoked each time the object is created
   public AHuman1()
    {
        System.out.println(" deafult constructor is called ");
    }
    // parametrized constructor : invoked each time the object is created with parameter passed
    public AHuman1(String name)
    {
        this.name=name;
        System.out.println(" parameterized   constructor with 1 argument is called ");
    }
    // parametrized constructor : invoked each time the object is created  with different number of arguments
   public AHuman1(String name, String eye_colour)
    {
        this.name=name;
        this.eye_colour=eye_colour;
        System.out.println(" parameterized   constructor with 2  arguments is called ");
    }

    void walk() {
        System.out.println(" NRNA");
    }

    String sleep(String eye_colour) {
        System.out.println(" RTWA");
        return eye_colour;
    }

    void IDcard_Number(long aadharcard) {
        System.out.println(aadharcard);
        System.out.println("NRWA");
    }

    String eat() {
        System.out.println(" food");
        System.out.println("RTNA");
        String user="Nishi";
        return user;

    }
}
