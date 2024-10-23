package October.ex_23102024.CustomException;

public class Lab121_RunnerBankClass {
    public static void main(String[] args) throws Exception {
        Bank sbi=new Bank("INR",2500000);
        Bank icici=new Bank("INR",1500000);
        Bank HDFC=new Bank("Dollar",1500000);
       System.out.println( sbi.addAmount(icici));
        System.out.println( sbi.addAmount(HDFC));
    }
}
