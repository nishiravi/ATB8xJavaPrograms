package October.ex_18102024.Strings;

public class Lab0108_StringBuilder_StringBuffer {
    public static void main(String[] args) {
        String name="Nishi";
        name="Sangeeth";
        System.out.println(name);
        //StringBuffer-mutable in nature and thread safe-not fast
        StringBuilder b=new StringBuilder("Nishi");
        b.append("Ravi");
        System.out.println(b);

        //StingBuilder-mutable in nature but not thread safe-makes faster-and its more used when compared to stringBuffer
        StringBuilder a=new StringBuilder("Nishi");
        a.append("Nishi");
        System.out.println(a);
    }
}
