package com.company;

public class SpritService extends KEAService{


    public void sanitize() {
        System.out.println("Dispensing sanitizer on white T-shirts...");
        System.out.println("Rubbing...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Sanitizer rubbing complete, please discard the used T-shirts, have a nice and safe day.");
    }
}
