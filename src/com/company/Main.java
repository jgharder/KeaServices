package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean ashtrayEnding;

        boolean switchcase = false; //legacy: used to switch to switchcase-mode.

        //Service instantiation
        AshtrayService ashtrayService = new AshtrayService();
        FredagsbarService fredagsbarService = new FredagsbarService();
        KeaKillKlubService keaKillKlubService = new KeaKillKlubService();
        LyingCakeDispenserService lyingCakeDispenserService = new LyingCakeDispenserService();
        SpritService spritService = new SpritService();

        //List of services
        ArrayList<KEAService> list = new ArrayList<>();

        list.add(ashtrayService);
        list.add(fredagsbarService);
        list.add(keaKillKlubService);
        list.add(lyingCakeDispenserService);
        list.add(spritService);

        //Main logic
        if(switchcase){
            ServiceHandler serviceHandler = new ServiceHandler(fredagsbarService, keaKillKlubService, spritService, ashtrayService, lyingCakeDispenserService);
        } else {

            ServiceHandler serviceHandler = new ServiceHandler(list);
                do {
                    //intro prompt
                    System.out.println("Welcome back to KEA Services, Commander. Please enter the service you would like to run.");

                    Scanner in = new Scanner(System.in);
                    String answer = in.nextLine();

                    //search for service
                    serviceHandler.searchList(answer);

                    //Did we hit ashtray ending?
                    ashtrayEnding = ashtrayService.ashtrayEnding;
                } while(!ashtrayEnding); //'enhanced' while-loop (IntelliJ black magic)
        }
    }
}

