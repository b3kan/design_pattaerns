package main.java.bridge.myexample;

public class IncorrectMovement implements AnimalMovement{

    @Override
    public void goForward() {
        System.out.println("Going backward");
    }

    @Override
    public void goBackward() {
        System.out.println("Going forward");
    }
}
