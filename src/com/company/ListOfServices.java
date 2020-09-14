package com.company;
import java.security.Provider;
import java.util.ArrayList;

public class ListOfServices {
    public ArrayList<KEAService> keaServices = new ArrayList<>();

    public ArrayList<KEAService> getKeaServices() {
        return keaServices;
    }

    public void setKeaServices(ArrayList<KEAService> keaServices) {
        this.keaServices = keaServices;
    }

}
