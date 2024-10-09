package October.ex_09102024.Inheritence.HasA_Aggregation;

public class Car {

    public static void main(String[] args) {

        new Engine().start();  // Car Has a relationship with engine
        new Tyre().tyre(); // Car Has a relationship with Tyre
    }

}
