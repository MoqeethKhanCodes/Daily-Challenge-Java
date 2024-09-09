package org.moqeeth;

public class ClassSingleton {
    private static ClassSingleton INSTANCE;

    private ClassSingleton() {
    }

    public static ClassSingleton getInstance(){
        if(INSTANCE == null) {
            INSTANCE = new ClassSingleton();
        }
        return INSTANCE;
    }
}