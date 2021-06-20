package com.company.observer;

import java.util.ArrayList;
import java.util.List;

//News Paper Agency
public class Subject {
    List<Observer> observers = new ArrayList<>();

    //subscribe
    public void subscribe(Observer observer) {
        //(IMPROVEMENTS) can do call the database and run SQL query to insert this observer
        observers.add(observer);
    }

    //unsubscribe
    public void unsubscribe(Observer observer) {
        //(IMPROVEMENTS) can do call the database and run SQL query to delete this observer
        observers.remove(observer);
    }

    //when a news paper is available
    public void notifyObserver(String news) {
        for (Observer observer : observers) {
            observer.notifyObserver(news);
        }
    }
}
