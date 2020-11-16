package main.java.mediator.myexample;

public class USSRMetroDoor implements Door{

    private ElectricLock electricLock;

    public USSRMetroDoor(ElectricLock electricLock){
        this.electricLock = electricLock;
    }

    @Override
    public void open() {
        electricLock.unlock();
    }

    @Override
    public void close() {
        electricLock.lock();
    }
}
