package October.ex_28102024.CollectionFramework.List.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab126_PrintArrayLsit {
    public static void main(String[] args) {
        Student s1=new Student("Nishi",1);
        Student s2=new Student("Manu",2);
        Student s3=new Student("Shweta",3);
        Student s4=new Student("Magi",4);
        List a=new ArrayList<>();
        a.add(s1);
        a.add(s2);
        a.add(s3);
        a.add(s4);
        System.out.println(a);
    }
}
class Student{
    String name;
    int rollNum;
Student(String name, int rollnum)
{
    this.name=name;
    this.rollNum=rollnum;
}
    public void setName(String name) {
        this.name = name;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }

    public String getName() {
        return name;
    }

    public int getRollNum() {
        return rollNum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNum=" + rollNum +
                '}';
    }
}