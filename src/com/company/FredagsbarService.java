package com.company;

public class FredagsbarService extends KEAService {
    public String name = "Fredagsbar";
    final int no = 1;
    public void cheers(){
        System.out.println("Cheers");
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
