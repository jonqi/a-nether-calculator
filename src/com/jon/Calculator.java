package com.jon;

import java.util.Scanner;

public class Calculator {

    public void startCalculator() {
        double xCoord = getCoordinate();
        double yCoord = getCoordinate();
        double zCoord = getCoordinate();
        print("(" + (int) (xCoord / 8) + ", " + (int) yCoord + ", " + (int) (zCoord  / 8) + ")");
    }

    private double getCoordinate() {
        double coordinate = 0.0;
        while (true) {
            print("\nInput scanner coordinate.");
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextDouble()) {
                coordinate = scanner.nextDouble();
                print("scanner coordinate: " + coordinate);
                break;
            } else {
                print("Please enter a number.");
            }
        }
        return coordinate;
    }

    private void print(String s) {
        System.out.println(s);
    }

}
