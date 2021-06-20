package com.company.observer;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        // publisher -> subject
        // subscriber -> observer
        // types of observers -> NewsReaders, FoodWrapper

        Observer observer1 = new Type1Observer(); //reading news
        Observer observer2 = new Type1Observer(); //reading news
        Observer observer3 = new Type2Observer(); //wrap news

        Subject subject = new Subject();
        subject.subscribe(observer1);
        subject.subscribe(observer2);
        subject.subscribe(observer3);

        //subject.start();

        subject.notifyObserver("Curfew will be imposed today!");


        Thread.sleep(10000); //wait for 10 sec
        System.out.println("==============================");

        subject.notifyObserver("Reversed: Curfew will not be imposed today!");

        Thread.sleep(5000); //wait for 5 sec

        subject.unsubscribe(observer2);

        Thread.sleep(5000);
        System.out.println("==============================");

        subject.notifyObserver("Fuel prices gone up");


        // you can create a folder in my pc called news
        // whenever i have new news you can create a new text file and the news ro iy and copy the text -
        // - file into news folder
        // our subject class keep watching news folder -> and whenever -
        // new news is available, it can call the notifyObserver
        // then i can delete the

        // create a GUI

    }
}
