package November.ex_04112024.Genrics;

public class Lab132_MaxOfThree {
    public static void main(String[] args) {
        Lab132_MaxOfThree obj=new Lab132_MaxOfThree();
        System.out.println(obj.maxValueFunction(25,46,89));

    }
    public  <T extends Comparable<T>> Comparable<T> maxValueFunction(T a, T b , T c)
    {
        T max=a;
        if(b.compareTo(max)>0) {
            max = b;
        }
        if (c.compareTo(max)>0) {
            max=c;
        }
        return max;
    }
}
