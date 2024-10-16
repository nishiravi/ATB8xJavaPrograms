package Task.Task14oct_;

public class PrintMyBook extends Book{

    PrintMyBook(String name,String author, String price){

        super(name,author,price);
        this.getDetails();
    }
    @Override
    void getDetails() {
System.out.println(super.name +","+super.author+","+super.price);
    }
}
