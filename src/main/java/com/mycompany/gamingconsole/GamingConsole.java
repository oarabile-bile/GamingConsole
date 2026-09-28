/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsole;

/**
 *
 * @author Student
 */

public class GamingConsole {

    public static void main(String[] args) {
        
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        
        int[][] sales = {
            {1000, 2000, 3000}, // Cape Town
            {2000, 3000, 4000}, // Port Elizabeth
            {1500, 1100, 1200}  // Pretoria
        };

        // 1. Display Header & Console Columns
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-18s", "");
        for (String console : consoles) {
            System.out.printf("%-12s", console);
        }
        System.out.println();

        // 2. Display Sales Table Data
        for (int i = 0; i < cities.length; i++) {
            //column Alignment
            System.out.printf("%-18s", cities[i]);
            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-12d", sales[i][j]);
            }
            System.out.println();
        }

        System.out.println("------------------------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("------------------------------------------------------------------");
       
        
        int maxSales = -1;
        String topCity = "";

        
        for (int i = 0; i < cities.length; i++) {
            int cityTotal = 0;
            for (int j = 0; j < consoles.length; j++) {
                cityTotal += sales[i][j];
            }

            System.out.printf("%-18s %d%n", cities[i], cityTotal);

            
            if (cityTotal > maxSales) {
                maxSales = cityTotal;
                topCity = cities[i];
            }
        }

      
        System.out.println("------------------------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + topCity);
       
    }
}
