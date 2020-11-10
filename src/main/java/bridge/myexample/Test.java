package main.java.bridge.myexample;

public class Test {

    public static void main(String... args){
        AnimalMovement correct = new CorrectMovement();
        AnimalMovement incorrect = new IncorrectMovement();

        Animal lion = new Animal("Lion", correct);
        Animal zebra = new Animal("zebra", incorrect);

        System.out.println("Lion must go forward");
        lion.getMovementProvider().goForward();
        System.out.println("Lion must go backward");
        lion.getMovementProvider().goBackward();

        System.out.println();

        System.out.println("Zebra must go forward");
        zebra.getMovementProvider().goForward();
        System.out.println("Zebra must go backward");
        zebra.getMovementProvider().goBackward();

        System.out.println("Setting new animal movement to fix zebra");
        zebra.setMovementProvider(correct);
        System.out.println("Zebra fixed");

        System.out.println("Zebra must go forward");
        zebra.getMovementProvider().goForward();
        System.out.println("Zebra must go backward");
        zebra.getMovementProvider().goBackward();

    }

}
