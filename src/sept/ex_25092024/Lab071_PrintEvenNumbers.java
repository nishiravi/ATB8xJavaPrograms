package sept.ex_25092024;

import javax.swing.plaf.synth.SynthTextAreaUI;

public class Lab071_PrintEvenNumbers {
    public static void main(String[] args) {
         for(int i=1;i<=50;i++){
             if(i%2==0){
                 System.out.println(i);
             }
             // another method
             for(int j=2;j<=50;j=j+2){
             System.out.println(j);
         }
    }
}
    }

