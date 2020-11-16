package main.java.observer;

public class News extends AbstractObservable<String>{

    public News(String state) {
        super(state);
    }
}
