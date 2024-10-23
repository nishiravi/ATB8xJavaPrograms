package October.ex_23102024.TRYCATCHFINALLY;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab120_Unchecked_Checked_Example {
    public static void main(String[] args) {

        int a=0;
        try{
            int c=10/a;
            System.out.println(c);
        } catch (Exception e) {
            throw new RuntimeException(e);
            // System.out.println(e.getMessage());
        }finally {
            System.out.println(" Above is Example unchecked exception ");
        }

        try{
            FileReader fif=new FileReader(new File("C://abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(" Above is Example checked exception ");
        }
    }
}
