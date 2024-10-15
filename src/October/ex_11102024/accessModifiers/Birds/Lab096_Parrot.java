package October.ex_11102024.accessModifiers.Birds;

import October.ex_11102024.accessModifiers.Animal.Lab092_AnimalFunctions;

public class Lab096_Parrot {
    public static void main(String[] args) {
       // Lab092_AnimalFunctions a=new Lab092_AnimalFunctions();
        // Lab096_Parrot class cannot acceess the protected variables and functions of Animalfunction class as its not
        // present in the same package
        //a.walkAnimal();
        Lab092_BirdFunctions b=new Lab092_BirdFunctions();
        // Lab096_Parrot class can acceess the protected variables and functions of Animalfunction class as its
        // present in the same package
        b.walkBird();
    }
}
