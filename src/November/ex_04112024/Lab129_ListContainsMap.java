package November.ex_04112024;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab129_ListContainsMap {
    public static void main(String[] args) {
        HashMap<String,String> student1=new HashMap();
        student1.put("name","Nishi");
        student1.put("roll","1");
        student1.put("section","A");
        HashMap<String,String> student2=new HashMap();
        student2.put("name","Shriyan");
        student2.put("roll","2");
        student2.put("section","B");
        //List contains MAp
        List studentsList=new ArrayList<>();
        studentsList.add(student1);
        studentsList.add(student2);
        System.out.println(studentsList);
    }
}
