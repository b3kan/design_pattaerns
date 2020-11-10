package main.java.bridge.myexample;

public class Animal extends AbstractAnimal{

    private String animalType;

    protected AnimalMovement movementProvider;

    public Animal(String type, AnimalMovement movementProvider){
        this.animalType = type;
        this.movementProvider = movementProvider;
    }

    public AnimalMovement getMovementProvider(){
        return this.movementProvider;
    }

    public String getAnimalType(){
        return this.animalType;
    }

    @Override
    public void setMovementProvider(AnimalMovement movementProvider) {
        this.movementProvider = movementProvider;
    }
}
