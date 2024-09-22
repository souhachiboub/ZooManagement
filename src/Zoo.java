

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

    public void addAnimal(Animal animal, int index) {
        if (index >= 0 && index < animals.length) {
            animals[index] = animal;
        } else {
            System.out.println("Index hors limites");
        }
    }

    public void displayZoo() {
        System.out.println("Name of the Zoo: " + name + ", The City of the Zoo : " + city + ", Number  of cages : " + nbrCages);
        }

    @Override
    public String toString() {
        return "Name of the Zoo: " + name + ", The City of the Zoo : " + city + ", Number  of cages : " + nbrCages;
    }
}
