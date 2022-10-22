package org.wu.SingletonPattern.懒汉式线程安全;

public class Singleton {
    private static Singleton instance;  
    private Singleton (){}  
    public static synchronized Singleton getInstance() {  
        if (instance == null) {  
            instance = new Singleton();  
        }  
        return instance;  
    }

    public void showMsg(){
        System.out.println("Hello world");
    }
}