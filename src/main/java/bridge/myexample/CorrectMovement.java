package main.java.bridge.myexample;

public class CorrectMovement implements AnimalMovement{

    @Override
    public void goForward() {
        System.out.println("Going forward");
    }

    @Override
    public void goBackward() {
        System.out.println("Going backward");
    }
}
