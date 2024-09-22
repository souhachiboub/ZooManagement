public class Animal {
    String familly;
    String name;
    int age;
    boolean isMammal;

    public Animal(String familly, String name, int age, boolean isMammal) {
        this.familly = familly;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    @Override
    public String toString() {
        return "Animal's family:" + familly +"Animal's name:"+name+"Animal's Age :"+age;
    }
}
