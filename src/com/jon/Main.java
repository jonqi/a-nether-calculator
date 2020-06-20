package com.jon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while(true) {
            print("\nInput scaanner coordinate.");
            Scanner scaanner = new Scanner(System.in);
            if (scaanner.hasNextDouble()) {
                print("scaanner coordinate: " + scaanner.nextDouble());
            } else {
                print("Please enter a number.");
            }
        }
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
