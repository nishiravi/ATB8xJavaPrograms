package November.ex_04112024.Genrics;

public class LAb132_RunClass {
    public static void main(String[] args) {

        Test<Integer> a = new Test<Integer>(123);
        System.out.println(a.getObj());
        Test<String> b = new Test<String>("HI");
        System.out.println(b.getObj());
        Test<Float> c = new Test<Float>(12.3f);
        System.out.println(c.getObj());
    }

}

// below is a genricClass
class Test<T> {
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}