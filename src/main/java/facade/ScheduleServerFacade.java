package main.java.facade;

public class ScheduleServerFacade {

    private ScheduleServer scheduleServer;

    public ScheduleServerFacade(ScheduleServer scheduleServer){
        this.scheduleServer = scheduleServer;
    }

    public void startServer(){
        scheduleServer.startServer();
        scheduleServer.initConfiguration();
        scheduleServer.createContext();
        scheduleServer.listenObservers();
    }

    public void stopServer(){
        scheduleServer.stopServer();
        scheduleServer.destroyContext();
        scheduleServer.releaseListeners();
    }
}
