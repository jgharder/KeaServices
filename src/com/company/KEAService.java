package com.company;

public abstract class KEAService {
    /*
    public void accessKea(){
        System.out.println("Access Granted");
    }
    */
    public void lockKea(){
        System.out.println("Kea Is Locked");
    }

    public abstract void run();

    public abstract String getName();

}


