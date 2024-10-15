package October.ex_11102024.accessModifiers.Animal;

public class Lab093_Dog {
    public static void main(String[] args) {
        Lab092_AnimalFunctions a=new Lab092_AnimalFunctions();
        // Lab093_Dog class can acceess the protected variables and functions of Animalfunction class as its present in the same package
        a.walkAnimal();
    }
}
