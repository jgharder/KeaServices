package com.company;

import java.util.Scanner;

public class AshtrayService extends KEAService
{
    String name = "Askebæger";
    final int no = 5;
    public boolean ashtrayEnding = false;

    public void emptyAshtray(){
        System.out.println("Ashtray has been emptied, and is ready for use again..");
    }
    public void callOverAshtray(){
        System.out.println("Yes sir, i'm coming with the ashtray right away");
        }


    @Override
    public void run() {
        System.out.println("It's that time again, huh Commander?");
        System.out.println("Is your current ashtray full? (y/n)");

        Scanner prompt = new Scanner(System.in);
        String answer = prompt.nextLine();
        if (answer.equals("y")) {
            emptyAshtray();
        } else if (answer.equals("n")) {
            callOverAshtray();
        } else {
            System.out.println("I did not understand that. Intruder detected.\nLocking down KEA.");
            super.lockKea();
            ashtrayEnding = true;

        }
    }
}


