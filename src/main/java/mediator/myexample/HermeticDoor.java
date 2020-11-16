package main.java.mediator.myexample;

public class HermeticDoor implements DoorColleague {

    private Door door;

    @Override
    public void setDoor(Door door) {
        this.door = door;
    }

    public void open(){
        door.open();
        System.out.println("Started opening door");
        int x = 5;
        while (x-- > 0){
            System.out.println(String.format("%s seconds remaining to open doors", x));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Doors opened");
    }

    public void close(){
        System.out.println("Started closing door");
        int x = 10;
        while (x-- > 0){
            System.out.println(String.format("%s seconds remaining to close doors", x));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        door.close();
        System.out.println("Doors closed");

    }
}
