package sept.ex_30092024;

public class Lab078_Functiondemo1 {
    public static void main(String[] args) {
        functionNoReturntype();
        System.out.println("value returned from the function with no argument is " +functionwithReturnType());
        SumofTwoNumbers(10,20);
        FunctionNOReturnTypewithArgument(20,30); // function with argument and no return type ,so arguments
        // passed with be used within the function only
    }
   // no return type and no arguments
    public static void functionNoReturntype()
    {
        System.out.println(" Hi calling a void function");
    }

    // return type and no arguments
    public static int  functionwithReturnType()
    {
        System.out.println(" function with  return type and no arguments is called");
        return 1;
    }
    //  return type and with arguments
    public static  int  SumofTwoNumbers(int a, int b )
    {
        int  sum=a+b;
        System.out.println(" Function with return type and with arguments is called : sum of two number is ");
        return sum;
    }

    public static void FunctionNOReturnTypewithArgument(int a, int b)
    {
        int value1=a+b;
        System.out.println("Function  with NOReturnType withArgument  is called , and value optained is "+value1);
    }

}
