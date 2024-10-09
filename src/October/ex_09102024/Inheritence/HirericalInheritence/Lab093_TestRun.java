package October.ex_09102024.Inheritence.HirericalInheritence;

public class Lab093_TestRun {
    public static void main(String[] args) {
        Lab091_BMW bmw=new Lab091_BMW();
        Lab090_Car car=new Lab090_Car();
        Lab092_Mazda mazda= new Lab092_Mazda();
        bmw.carCost();
        car.carCost();
        mazda.carCost();
    }
}
