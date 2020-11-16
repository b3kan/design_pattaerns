package main.java.observer;

public interface Observer<K> {

    void update(K item);

    String getId();

}
