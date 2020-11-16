package main.java.observer;

public class Test {

    public static void main(String... args){
        News newsObservable = new News("First information");

        Observer<String> rustavi2 = new Rustavi2();
        Observer<String> test1 = new GeneralObserver<>();
        Observer<String> test2 = new GeneralObserver<>();
        Observer<String> test3 = new GeneralObserver<>();
        Observer<String> test4 = new GeneralObserver<>();

        newsObservable.registerObserver(rustavi2);
        newsObservable.registerObserver(test1);
        newsObservable.registerObserver(test2);
        newsObservable.registerObserver(test3);
        newsObservable.registerObserver(test4);

        newsObservable.updateItem("Saakashvili hamovida");

        newsObservable.unRegisterObserver(rustavi2);
        newsObservable.updateItem("Bidzina havida");



    }

}
