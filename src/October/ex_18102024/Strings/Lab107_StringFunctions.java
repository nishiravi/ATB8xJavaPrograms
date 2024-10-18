package October.ex_18102024.Strings;

public class Lab107_StringFunctions {
    public static void main(String[] args) {
// how to find length of the string
        String name="  Nishi Hello  ";
        System.out.println(name.length());
        //SubString
        System.out.println(name.substring(1,3));
        //Trim
        System.out.println(name.trim());
        // Conver to caes
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        // find character at a particular location
        System.out.println(name.charAt(2));
        // check if a string has a particular character
        System.out.println(name.concat("hi"));
        // check if string is empty
        System.out.println(name.isEmpty());
    }
}
