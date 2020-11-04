package main.java.facade;

public class ScheduleServerStarter {

    public static void main(String... args){
        // Before Facade
        ScheduleServer scheduleServer = new ScheduleServer();

        scheduleServer.startServer();
        scheduleServer.initConfiguration();
        scheduleServer.createContext();
        scheduleServer.listenObservers();

        // To stop
        scheduleServer.stopServer();
        scheduleServer.destroyContext();
        scheduleServer.releaseListeners();




        // After facade
        ScheduleServerFacade facade = new ScheduleServerFacade(new ScheduleServer());
        scheduleServer.startServer();
        scheduleServer.stopServer();
    }

}
