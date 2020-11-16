package main.java.observer;

import main.java.observer.myexample.AbstractObservable;

public class News extends AbstractObservable<String> {

    public News(String state) {
        super(state);
    }
}
