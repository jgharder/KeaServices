package com.company;

public class FredagsbarService extends KEAService {
    String name = "Fredagsbar";
    final int no = 1;
    public void cheers(){
        System.out.println("Cheers");
    }

    @Override
    public void run() {
        cheers();
    }
}
