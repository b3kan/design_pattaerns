package main.java.observer;

import java.util.concurrent.atomic.AtomicInteger;

public class AbstractObserver<K> implements Observer<K>{

    private static final AtomicInteger observerId = new AtomicInteger();

    private K state;
    private final String id = "Observer-" + observerId.getAndIncrement();

    @Override
    public void update(K item) {
        System.out.printf("[OBSERVER: %s] Notified to update state, new data : %s%n", getId(), item.toString());
        this.state = item;
    }

    @Override
    public String getId() {
        return id;
    }
}
