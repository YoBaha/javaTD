// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;


public class ZooManagment {
    public static void main(String[] args) {

        Animal lion = new Animal();
        lion.name = "Simba";
        lion.age = 5;
        lion.family = "x";
        lion.isMammal = true;


        Zoo myZoo = new Zoo();
        myZoo.name = "belvedere";
        myZoo.city = "Tunis";
        myZoo.nbrCages = 25;
        myZoo.animals = new Animal[25];

    }