package com.company;

public class FredagsbarService extends KEAService {
    public String name = "Fredagsbar";
    final int no = 1;
    public void cheers(){
        System.out.println("Excellent choice, Commander. I was getting parched myself.");
        System.out.println("Cheers, Commander!");
        System.out.println();
    }

    @Override
    public void run() {
        cheers();
    }

    @Override
    public String getName() {
        return name;
    }
}
