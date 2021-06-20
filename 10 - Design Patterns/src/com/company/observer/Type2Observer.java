package com.company.observer;

public class Type2Observer implements Observer{

    @Override
    public void notifyObserver(String news) {
        //send and actual email to the observer
        System.out.println("Wrapping food using newspaper: " + news);
    }
}
