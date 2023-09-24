
public class Zoo
{
    Animal [] animals
    String name, city;
    int nbrCages;


    public Zoo(String name, String city, int nbrCages) {
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Nombre cages: " + nbrCages);
    }

boolean addAnimal(Animal animal)
    boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1)
            return false;
        int searchAnimal(Animal animal) {
            int index = -1;
            for (int i = 0; i < nbrAnimals; i++) {
                if (animal.name == animals[i].name)
                    return i;
            }
            void displayAnimals() {
                System.out.println("Liste des animaux de " + name + ":");
                for (int i = 0; i < nbrAnimals; i++) {
                    System.out.println(animals[i]);
                }
            }
        }
