package Task.Task_18Oct;

public class LengthOfString_withoutStringFunction {
    public static void main(String[] args) {
        String name= "Pramod";
        int length=0;
        for ( char a:name.toCharArray()){
            length++;
        }
        System.out.println(" length of the string is "+length);
    }
}
