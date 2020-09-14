package com.company;

public class SpritService extends KEAService {

    public String name = "Sprit Service";
    final int no = 3;

    public void sanitize() {
        int count = 20;
        boolean first = true;
        StringBuilder sb = new StringBuilder();

        System.out.println("Dispensing sanitizer on white T-shirts...");

        sb.append("rubbing...");
        for (int i = 1; i < count; i++) {

            if (first) {
                first = false;
            } else {
                sb.insert(0, "still ");
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(sb.toString());
        }

        System.out.println("Sanitizer rubbing complete, please discard the used T-shirts, have a nice and safe day.");
    }

    @Override
    public void run(){
        sanitize();
    }

    @Override
    public String getName() {
        return name;
    }
}
