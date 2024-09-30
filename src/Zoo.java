

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.animals=new Animal[25];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }


    public Boolean addAnimal(Animal animal) {

        for (Animal existingAnimal : animals) {
            if (existingAnimal != null && existingAnimal.name.equals(animal.name)) {
                System.out.println("Animal  " + animal.name + " is already exist in the Zoo.");
                return false;
            }
        }


        int index = 0;
        for (Animal existingAnimal : animals) {
            if (existingAnimal == null) {
                animals[index] = animal;
                return true;
            }
            index++;
        }

        System.out.println("The Zoo is full.");
        return false;
    }

    public void displayZoo() {
        System.out.println("Name of the Zoo: " + name + ", The City of the Zoo : " + city + ", Number  of cages : " + nbrCages);
        }
    public void displayAnimalsInfo() {
        System.out.println("Animals in Zoo are :");
        boolean vide = true;
        for (Animal animal : animals) {
            if (animal != null) {
                System.out.println(animal.name);
                vide = false;
            }
        }
        if (vide) {
            System.out.println("No animals found in the Zoo.");
        }
    }
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] != null && animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Name of the Zoo: " + name + ", The City of the Zoo : " + city + ", Number  of cages : " + nbrCages;
    }
}
