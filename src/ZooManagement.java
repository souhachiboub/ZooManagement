import java.util.Scanner;

public class ZooManagement {
    private int nbrcages=20;
    private  String zooName="my zoo";

    public static void main(String[] args) {
//       Premier Prosit
        Scanner zooname = new Scanner(System.in);
        ZooManagement zooManagement=new ZooManagement();
        System.out.print("Entrez le nom du zoo : ");
        zooManagement.zooName = zooname.nextLine();
        while (!zooname.hasNextInt()) {
            System.out.println("Veuillez entrer un nombre de cages ");
            zooname.next();
        }
        zooManagement.nbrcages = zooname.nextInt();
        System.out.println(zooManagement.zooName+" comporte "+zooManagement.nbrcages+" cages");
        zooname.close();


//       Deuxième  Prosit
        Animal lion=new Animal("Lions","Simba",20,true);
        Zoo myZoo=new Zoo("Singapore Zoo","Singapore",25);
        myZoo.addAnimal(lion, 0);
        myZoo.displayZoo();
        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        /*
        toString() affiche cette résultat Zoo@7cd84586 cela signifie package.class avec le hashCode
        le compilateur dans ce cas fait l'appel implicite de cette méthode
         */
        System.out.println(lion.toString());

    }

}
