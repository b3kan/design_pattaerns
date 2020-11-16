package main.java.singleton;

public class SingletonClass {

    private static SingletonClass sc;

    public static SingletonClass getInstance(){
        // Check if object already exists
        if (sc == null){
            // If it doesn't exist, synchronize object creation for thread safety
            synchronized (SingletonClass.class){
                if (sc == null){
                    sc = new SingletonClass();
                }
            }
        }
        return sc;
    }

}
