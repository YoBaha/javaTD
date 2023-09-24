
import java.util.Scanner;


public class ZooManagment {
    public static void main(String[] args) {
      //  Animal lion = new Animal();
       // lion.name = "Simba";
      //  lion.age = 5;
        //lion.family = "x";
        //lion.isMammal = true;

      //  Zoo myZoo = new Zoo();
       // myZoo.name = "belvedere";
        //myZoo.city = "Tunis";
        //myZoo.nbrCages = 25;
        //myZoo.animals = new Animal[25];

        Animal lion = new Animal("x", "Simba", 4, true);

        Zoo myZoo = new Zoo("belvedere", "Tunis", 25);

        System.out.println(myZoo);
        System.out.println(myZoo.toString());

        System.out.println(myZoo.addAnimal(lion));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(lion));
    }