package main.java.observer;

import java.util.ArrayList;
import java.util.List;

public class AbstractObservable<K> implements Observable<K>{

    private final List<Observer<K>> observers = new ArrayList<>();
    private K item;

    public AbstractObservable(K state){
        this.item = state;
    }

    @Override
    public synchronized void registerObserver(Observer<K> observer) {
        System.out.println(String.format("Registering observer: %s ", observer.getId()));
        observers.add(observer);
        System.out.println(String.format("Registering observer: %s has done", observer.getId()));
    }

    @Override
    public synchronized void unRegisterObserver(Observer<K> observer) {
        System.out.println(String.format("Unregistering observer: %s ", observer.getId()));
        observers.remove(observer);
        System.out.println(String.format("Unregistering observer: %s has done", observer.getId()));
    }

    @Override
    public void notifyObservers() {
        for (Observer<K> observer : observers) {
            observer.update(getItem());
        }
    }

    @Override
    public K getItem() {
        return this.item;
    }

    @Override
    public synchronized void updateItem(K item) {
        this.item = item;
        notifyObservers();
    }
}
