package com.napier.sem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MenuCountry extends Menu {
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
        System.out.print("Country Reports\n");
        System.out.print("1) All the countries in the world organised by largest population to smallest.\n");
        System.out.print("2) All the countries in a continent organised by largest population to smallest.\n");
        System.out.print("3) All the countries in a region organised by largest population to smallest.\n");
        System.out.print("4) The top N populated countries in the world where N is provided by the user.\n");
        System.out.print("5) The top N populated countries in a continent where N is provided by the user.\n");
        System.out.print("6) The top N populated countries in a region where N is provided by the user.\n");
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
        switch (choice) {

            case "1": //

                ReportCountry01 reportCountry01 = new ReportCountry01();
                reportCountry01.run();
                break;

            case "2": //
                break;

            case "3": //
                break;

            case "4": //
                break;

            case "5":  // Language Reporting
                break;

            case "0":
                break;
            default:
                System.out.println("This is not a valid Menu Option! Please Select Another");
                break;
        }
    }
}
