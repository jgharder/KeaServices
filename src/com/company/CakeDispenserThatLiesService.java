package com.company;

import java.util.Scanner;

public class CakeDispenserThatLiesService {

    public void cakeDispenser(){
        System.out.println("Which cake would you like today piggy?");
        System.out.println("We have: chocolate cake, carrot cake, tiramisu and space cake.");

        Scanner scanner = new Scanner(System.in);
        String whichCake = scanner.nextLine();
        System.out.println("You wanted " + whichCake + ". But...  ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("The cake is a lie! ");
    }

}