package Task.Task_18Oct;

public class ReverseString_WithoutFunction {
    public static void main(String[] args) {
        String name="abc";
        String a="";
       for(int i=name.length()-1;i>=0;i--)
       {
          a=a+name.charAt(i); //
       }
       System.out.println("reverse of string  "+name +"  is "+a);

    }
}
