package main.java.singleton;

public class SingletonTest {

    public static void main(String... args){
        new Thread(SingletonClass::getInstance).start();
        new Thread(SingletonClass::getInstance).start();
    }

}
