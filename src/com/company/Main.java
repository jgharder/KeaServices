package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean ashtrayEnding;


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

        //ServiceHandler serviceHandler = new ServiceHandler(fredagsbarService, keaKillKlubService, spritService, ashtrayService, lyingCakeDispenserService);
        ServiceHandler serviceHandler = new ServiceHandler(list);
        do {
            System.out.println("Welcome back to KEA Services, Commander. Please enter the service you would like to run.");
            Scanner in = new Scanner(System.in);

            String answer = in.nextLine();

            serviceHandler.searchList(answer);

            ashtrayEnding = ashtrayService.ashtrayEnding;
        } while(!ashtrayEnding);

    }
}

