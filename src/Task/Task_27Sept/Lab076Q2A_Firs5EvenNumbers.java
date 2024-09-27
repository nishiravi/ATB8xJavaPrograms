package Task.Task_27Sept;

public class Lab076Q2A_Firs5EvenNumbers {
    public static void main(String[] args) {

        int i=1;
        int j=1;
        do{
            if(i%2==0) {
                System.out.println(i);
                j++;
            }
            i++;
        }while(j<=5);

    }
}
