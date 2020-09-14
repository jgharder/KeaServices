package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceHandler {
    ArrayList<KEAService> serviceList;

    /*
    *
    * ArrayList Edition
    *
    * */
    public ServiceHandler(ArrayList<KEAService> list){
        serviceList = list;
    }

    //search the ArrayList of services for specific name
    public void searchList(String quote){
        for(KEAService service : serviceList){
            //matches on name
            if(quote.equals(service.getName())) {
                service.run();
                return;
            }
        }

        //no valid input.
        System.out.println("I did not understand that");
        System.out.println("Please try one of the following:");

        //print out all the names of the services.
        for(int i = 0; i<serviceList.size();i++){
            System.out.println("" + serviceList.get(i).getName());
        }
        System.out.println(); //new line for next iteration of user input.
    }

    /*
     *
     * Switch-case-edition
     * (depcricated)
     *
     * */
    public ServiceHandler(FredagsbarService fredagsbarService, KeaKillKlubService keaKillKlubService, SpritService spritService, AshtrayService ashtrayService, LyingCakeDispenserService lyingCakeDispenserService){
        boolean ashtrayEnding = false;
        do {
            Scanner inputscanner = new Scanner(System.in);
            //Prompt starts here
            System.out.println("Welcome back to KEA Services, Commander. Please enter the service you would like to run.");
            String match = inputscanner.nextLine();

            switch (match) {
                case "Fredagsbar":
                    fredagsbarService.run();
                    break;
                case "Kill Klub":
                    keaKillKlubService.run();
                    break;
                case "Lying Cake Dispenser":
                    lyingCakeDispenserService.run();
                    break;
                case "Sprit Service":
                    spritService.run();
                    break;
                case "Askebæger":
                    ashtrayService.run();
                    ashtrayEnding = ashtrayService.ashtrayEnding;
                        break;
                default:
                    System.out.println("I did not quite understand that, Commander, please try one of the following:");
                    for(int i = 0; i<serviceList.size();i++){
                        System.out.println("" + serviceList.get(i).getName());
                    }
                    System.out.println(); //new line for next iteration of user input.
            }
        } while (!ashtrayEnding);

    }

}
