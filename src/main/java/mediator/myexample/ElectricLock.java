package main.java.mediator.myexample;

public class ElectricLock {

    private Door door;

    public void unlock(){
        System.out.println("Unlocking doors...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doors unlocked");
    }


    public void lock(){
        System.out.println("Locking doors...");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Doors have locked");
    }
}
