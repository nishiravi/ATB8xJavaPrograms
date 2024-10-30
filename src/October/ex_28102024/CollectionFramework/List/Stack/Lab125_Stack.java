package October.ex_28102024.CollectionFramework.List.Stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Lab125_Stack {
    public static void main(String[] args) {
        // Stack: LAst In First Out
        Stack<String> books=new Stack<>();
        books.add("A");
        books.add("B");
        books.add("C");
        books.add("D");
        books.add("E");
        books.push("F");
        books.add("G");
        books.push("H");
        books.add("I");
        System.out.println(books);
        System.out.println( books.pop()); // -Pops out the top item in the stack
        System.out.println(books.peek()); // just gives the top item in the stack
        System.out.println(books.size());
        System.out.println(books.empty()); // checks if stack is empty
        System.out.println(books.search("F")); // checks the item from the top
        books.add(0,"Add");
        System.out.println(books);
    }
}
