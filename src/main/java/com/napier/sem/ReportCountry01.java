package com.napier.sem;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class ReportCountry01 extends Report{

    @Override
    public void run() {
        ArrayList<Country> countries = new ArrayList<Country>();
        printCountries(countries);
    }

    /**
     * Gets all the countries
     * @return A list of all countries.
     */
    private ArrayList<Country> getCountries()
    {
        ArrayList<Country> countries = new ArrayList<Country>();
        return countries;
        /*
        try
        {
            // Create an SQL statement
            Statement stmt = con.createStatement();
            // Create string for SQL statement
            String strSelect =
                    "SELECT Code, Name, Continent, Population "
                            + "FROM country "
                            + "ORDER BY Population DESC";
            // Execute SQL statement
            ResultSet rset = stmt.executeQuery(strSelect);
            // Extract country information
            ArrayList<Country> countries = new ArrayList<Country>();
            while (rset.next())
            {
                Country country = new Country();
                country.Code = rset.getString("Code");
                country.Name = rset.getString("Name");
                country.Continent = rset.getString("Continent");
                country.Population = rset.getInt("Population");
                countries.add(country);
            }
            return countries;
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            System.out.println("Failed to get country details");
            return null;
        }

         */
    }

    /**
     * Prints a list of countries.
     * @param countries The list of countries to print.
     */
    private void printCountries(ArrayList<Country> countries)
    {
        // Print header
        System.out.println(String.format("%-10s %-30s %-30s %-20s", "Code", "Name", "Continent", "Population"));
        // Loop over all countries in the list
        for (Country country : countries)
        {
            String country_string =
                    String.format("%-10s %-30s %-30s %-20s",
                            country.Code, country.Name, country.Continent, country.Population);
            System.out.println(country_string);
        }
    }

}
