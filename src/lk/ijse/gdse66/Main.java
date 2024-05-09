package lk.ijse.gdse66;

public class Main {
    public static void main(String[] args) {
        AnimalFactoryImpl animalFactory = new AnimalFactoryImpl();

        Animal dog = animalFactory.createAnimal("Dog");
        Animal cat = animalFactory.createAnimal("Cat");
    }
}
