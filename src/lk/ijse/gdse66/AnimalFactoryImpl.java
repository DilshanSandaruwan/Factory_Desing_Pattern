package lk.ijse.gdse66;

public class AnimalFactoryImpl implements AnimalFactory{
    @Override
    public Animal createAnimal(String animalType) {
        if (animalType.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (animalType.equalsIgnoreCase("Cat")) {
            return new Cat();
        }
        return null;
    }
}
