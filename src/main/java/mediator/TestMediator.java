package main.java.mediator;

public class TestMediator {
    public static void main(String[] args) {
        MachineMediator mediator = null;
        Sensor sensor = new Sensor();
        SoilRemoval soilRemoval = new SoilRemoval();
        Machine machine = new Machine();
        Heater heater = new Heater();
        Valve valve = new Valve();
        Button button = new Button();

        mediator = new CottonMediator(machine, heater, sensor, soilRemoval, valve);
        button.setMediator(mediator);
        machine.setMediator(mediator);
        heater.setMediator(mediator);
        valve.setMediator(mediator);
        button.press();

//
//        mediator = new DenimMediator(machine, heater, sensor, soilRemoval, valve);
//        button.setMediator(mediator);
//        machine.setMediator(mediator);
//        heater.setMediator(mediator);
//        valve.setMediator(mediator);
//        button.press();
    }
}