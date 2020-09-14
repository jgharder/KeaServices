package com.company;

public class KeaKillKlubService extends KEAService{

    public String name = "KEA Kill Klub";
    final int no = 2;

    public void clean_machine(){
        int scanning = 3;
        System.out.println("Scanning for covid cases...");
        for (int i= 0; i<scanning;i++){
            try {
                Thread.sleep(900);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Scanning....");
        }
        System.out.println("Targets acquired...");
        System.out.println("Deploying hand sanitizer and suspending students.");

    }

    @Override
    public void run() {
        clean_machine();
    }

    @Override
    public String getName() {
        return name;
    }
}
