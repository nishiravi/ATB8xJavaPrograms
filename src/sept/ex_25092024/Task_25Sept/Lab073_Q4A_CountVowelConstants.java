package sept.ex_25092024.Task_25Sept;

public class Lab073_Q4A_CountVowelConstants {
    public static void main(String[] args) {
        String name="PRAMOD";
        int v=0;
        int c=0;
        for(int i=0;i<name.length();i++)
        {
            String temp=name.toLowerCase();// converting given character in to lowercase ;
            char a=temp.charAt(i); // checking each character index vise
            if (a=='a' || a=='e'||a=='i'||a=='o'|| a=='u')
            {
                v++;
            }
            else {
                c++;
            }
        }
        System.out.println("number of vowels " +v);
        System.out.println("number of consonants " +c);
    }
}
