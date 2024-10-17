package October.ex_16102024.Static;

public class ATB8X {

    private String name;
    private String phonenumber;
    static String course="ATB8x";
   ATB8X(String name, String phonenumber){
       this.name=name;
       this.phonenumber=phonenumber;
       System.out.println("IIB");
   }
   static
   {
       System.out.println(" static block");
   }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    void readDocumnet()
    {
        System.out.println(" non static method read the course document");
    }
    static void doAssignment()
    {
       System.out.println(" Static method assignment details");
    }
}
