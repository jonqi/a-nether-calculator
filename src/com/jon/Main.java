package com.jon;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            while (true) {
                print("\nInput scanner coordinate.");
                Scanner scanner = new Scanner(System.in);
                if (scanner.hasNextDouble()) {
                    print("scanner coordinate: " + scanner.nextDouble());
                    break;
                } else {
                    print("Please enter a number.");
                }
            }
        }
    }

    private static void print(String s) {
        System.out.println(s);
    }
}
