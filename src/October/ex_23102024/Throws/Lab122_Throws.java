package October.ex_23102024.Throws;

import java.io.File;
import java.io.FileReader;

public class Lab122_Throws {
    public static void main(String[] args) throws Exception{ // throws is used with the method signature

        FileReader fis=new FileReader(new File("C;//abc.txt"));
        throw new Exception("File not found exception"); // only one throw is possible , throw is used within the method

    }
}
