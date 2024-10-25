package October.ex_25102024.Arrays;

public class Lab119_CreationArray2D {
    public static void main(String[] args) {
        // 1 way to create an array
        int[][] marks={{90,78},{25,58}};
        for(int i=0;i<marks.length;i++){
            for(int j=0;j<marks[i].length;j++)
            {
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
