package main.java.observer.myexample;

public interface Observable<K> {

    void registerObserver(Observer<K> observer);

    void unRegisterObserver(Observer<K> observer);

    void notifyObservers();

    K getItem();

    void updateItem(K item);

}
