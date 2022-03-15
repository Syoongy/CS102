public class ZooTest {
    public static void main(String[] args) {
        // Create 12 animals
        Animal a1  = new Animal("tiger", 'M', 1500.5);
        Animal a2  = new Animal("monkey", 'M',  2500);
        Animal a3  = new Animal("tapir", 'M',  1500);
        Animal a4  = new Animal("snake", 'R', 1000);
        Animal a5  = new Animal("hippopotamus", 'M', 3000);
        Animal a6  = new Animal("polar bear", 'M', 5100);
        Animal a7  = new Animal("elephant", 'M', 6000);
        Animal a8  = new Animal("penguin", 'M', 3030.5);
        Animal a9  = new Animal("lion", 'M', 1265.4);
        Animal a10 = new Animal("giant tortoise", 'R', 880.8);
        Animal a11 = new Animal("zebra", 'M', 700.9);
        Animal a12 = new Animal("snake", 'R', 2500.12);

// Remove this statement for LabTest1
        Zoo myZoo = new Zoo(); 
        myZoo.addAnimal(a1);
        myZoo.addAnimal(a2);
        myZoo.addAnimal(a3);
        myZoo.addAnimal(a4);
        myZoo.addAnimal(a5);
        myZoo.addAnimal(a6);
        myZoo.addAnimal(a7);
        myZoo.addAnimal(a8);
        myZoo.addAnimal(a9);
        myZoo.addAnimal(a10);
        myZoo.addAnimal(a11);
        myZoo.addAnimal(a12);

// to remove these following statements for LabTest1
        System.out.println("Average Donation : " + myZoo.calculateAverageDonation());
        System.out.println("Number of mammals : " + myZoo.calculateNumAnimalsInZoo('M'));

    }
}
