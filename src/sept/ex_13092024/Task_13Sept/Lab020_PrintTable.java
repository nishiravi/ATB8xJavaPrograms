package sept.ex_13092024.Task_13Sept;

public class Lab020_PrintTable {

        public static void main(String[] args) {
            // print the table of 2;
            // formatting
            //%d= integer,byte,short,long
            //%s=String
            //%c=char
            //%f=float, double
            int num=10;
            for (int i=1;i<=10;i++)
            {
                System.out.printf("%d * %d=%d",num,i,num*i);
                System.out.println();
            }
        }
    }

