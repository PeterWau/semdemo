package com.napier.sem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class MenuMain extends Menu{

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
        System.out.print("Main Menu - Reports\n");
        System.out.print("1) Country.\n");
        System.out.print("2) City.\n");
        System.out.print("3) Capital City.\n");
        System.out.print("4) Population.\n");
        System.out.print("5) Language.\n");
        System.out.print("0) Exit.\n");
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

            case "1": // Country Reporting

                MenuCountry menuCountry = new MenuCountry();
                menuCountry.run();
                break;

            case "2": // City Reporting
                MenuCity menuCity = new MenuCity();
                menuCity.run();
                break;

            case "3": // Capital City Reporting
                MenuCapitalCity menuCapitalCity = new MenuCapitalCity();
                menuCapitalCity.run();
                break;

            case "4": // Population Reporting
                MenuPopulation menuPopulation = new MenuPopulation();
                menuPopulation.run();
                break;

            case "5":  // Language Reporting
                MenuLanguage menuLanguage = new MenuLanguage();
                menuLanguage.run();
                break;

            case "0":
                break;
            default:
                System.out.println("This is not a valid Menu Option! Please Select Another");
                break;
        }
    }
}
