package inheritance;

public class AnimalInheritanceExample {
    public static void main(String[] args ){

        Cat cat = new Cat(false, "milk", 4, "black");

        System.out.println("Cat is Vegetarian?" + cat.isVegeterian());
        System.out.println("Cat eats " + cat.getEats());
        System.out.println("Cat has " + cat.getNoOfLegs() + " legs.");
        System.out.println("Cat color is " + cat.getColor());
        System.out.println();


        Crow crow = new Crow(false, "peanuts", 2, true);

        System.out.println("Crow is Vegetarian?" + crow.isVegeterian());
        System.out.println("Crow eats " + crow.getEats());
        System.out.println("Crow has " + crow.getNoOfLegs() + " legs.");
        System.out.println("Crow can fly? " + crow.isCanFly());
    }
}
