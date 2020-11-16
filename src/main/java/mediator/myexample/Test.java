package main.java.mediator.myexample;

public class Test {

    public static void main(String... args) {
        ElectricLock electricLock = new ElectricLock();
        HermeticDoor hermeticDoor = new HermeticDoor();

        USSRMetroDoor metroDoor = new USSRMetroDoor(electricLock);

        hermeticDoor.setDoor(metroDoor);


        hermeticDoor.open();
        hermeticDoor.close();
    }

}
