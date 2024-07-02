package com.converter.providers;

public class ExitProvider {

    public static void exit() throws InterruptedException {
        System.out.println("Exiting System");
        System.out.print("hang on a movement ");
        int i=1;
        while (i<4){
            Thread.sleep(450);
            System.out.print(".");
            i++;
        }
        System.exit(0);
    }
}
