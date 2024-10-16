package Task.Task14oct_;

 abstract class Book {


     String name;
     String author;
     String price;

     Book(String name,String author, String price){

         this.name=name;
         this.author=author;
         this.price=price;
     }
    abstract void getDetails();

}
