package com.company.observer;

public class Type1Observer implements  Observer{

    //accept the email address as a constructor parameter

    private String email;

    @Override
    public void notifyObserver(String news) {
        //send and actual email to the observer
        System.out.println("Reading the news: "+news);
    }
}
