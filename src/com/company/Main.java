package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        AshtrayService ashtrayService = new AshtrayService();
        FredagsbarService fredagsbarService = new FredagsbarService();
        KeaKillKlubService keaKillKlubService = new KeaKillKlubService();
        LyingCakeDispenserService lyingCakeDispenserService = new LyingCakeDispenserService();
        SpritService spritService = new SpritService();

        ArrayList<KEAService> list = new ArrayList<>();

        list.add(ashtrayService);
        list.add(fredagsbarService);
        list.add(keaKillKlubService);
        list.add(lyingCakeDispenserService);
        list.add(spritService);

        while (true) {
        Scanner inputscanner = new Scanner(System.in);

        String match = inputscanner.nextLine();

            switch (match) {
                case "fredagsbar":
                    fredagsbarService.cheers();
                    break;
                case "killklub":
                    keaKillKlubService.clean_machine();
                    break;
                default:
                    System.out.println("I did not understand that, please try one of the following:");
                    System.out.println("freagsbar");
                    System.out.println("killklub");
            }
        }

    }
}

