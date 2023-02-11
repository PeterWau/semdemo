package com.napier.sem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuCity extends Menu{


    @Override
    public void run() {
        String selection;
        do {
            display();
            selection = select();
            action(selection);
        } while  (selection.startsWith("0") == false);
    }

    @Override
    public void display() {
        System.out.print("City Reports\n");
        System.out.print("1) All the cities in the world organised by largest population to smallest.\n");
        System.out.print("2) All the cities in a continent organised by largest population to smallest.\n");
        System.out.print("3) All the cities in a region organised by largest population to smallest.\n");
        System.out.print("4) All the cities in a country organised by largest population to smallest.\n");
        System.out.print("5) All the cities in a district organised by largest population to smallest.\n");
        System.out.print("0) Return to main menu.\n");
        System.out.print("\nEnter Your Menu Choice: ");
    }

    @Override
    public String select() {
        String choice;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            choice = br.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return choice;
    }

    @Override
    public void action(String choice) {

    }
}
