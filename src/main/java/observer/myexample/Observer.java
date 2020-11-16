package main.java.observer.myexample;

public interface Observer<K> {

    void update(K item);

    String getId();

}
