package org.wu.SingletonPattern;

public class SingletonPatternDemo {
    public static void main(String[] args) {

        Singleton instance = Singleton.getInstance();
        instance.showMsg();
    }
}