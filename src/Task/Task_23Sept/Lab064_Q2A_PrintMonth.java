package Task.Task_23Sept;

public class Lab064_Q2A_PrintMonth {
    public static void main(String[] args) {
        int num=12;
        switch (num){
            case 1->System.out.println("Jan");
            case 2->System.out.println("Feb");
            case 3->System.out.println("March");
            case 4->System.out.println("april");
            case 5->System.out.println("may");
            case 6->System.out.println("june");
            case 7->System.out.println("july");
            case 8->System.out.println("aug");
            case 9->System.out.println("sept");
            case 10->System.out.println("oct");
            case 11->System.out.println("nov");
            case 12->System.out.println("dec");
            default -> System.out.println(" month not found");
        }
    }
}
