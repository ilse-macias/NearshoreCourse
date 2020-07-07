package com.example.helloworld;

public class Utilities {
    public static void printMessage(String msg) throws InterruptedException {
        System.out.println("*** "+ msg + "***");
        Thread.sleep(5000); //I know is a bad technique, but for the moment I'll use that.
    }
}
