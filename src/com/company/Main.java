package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner keyboard = new Scanner(System.in);
        int month, year, day;
        boolean test = true;
        while (test){
            System.out.println("Monday's child is fair of face,");
            System.out.println("Tuesday's child is full of grace,");
            System.out.println("Wednesday's child is full of woe,");
            System.out.println("Thursday's child has far to go,");
            System.out.println("Friday's child is loving and giving,");
            System.out.println("Saturday's child works hard for a living,");
            System.out.println("But the child born on the Sabbath day,");
            System.out.println("Is fair and wise and good in every way.");

            System.out.println("What month were you born on?");
            month = keyboard.nextInt();
            System.out.println("What day were you born on?");
            day = keyboard.nextInt();
            System.out.println("What year were you born on?");
            year = keyboard.nextInt();


            // h= (q+ [13(m+1)/5] + k + [k/4] + [j/4] + 5j) mod7
            // q= day of the month
            // m= month
            // k= last two digits of year
            // j= first two digits of year

        }

    }
    public static void dayoftheweek (int month, int day, int year){
        int dayoftheweek;
        int modYear = year|100;
        int zeroYear = year/100;
        switch (month){
            case 1: month=13;
            break;
            case 2: month=14;
            break;
            //month 13 is jan
            //month 14 is feb
            //if one of those months, subtract a year

        }
        if (month>=13) {
            dayoftheweek = (day + 13 * (month + 1) / 5 + modYear + modYear / 4 + zeroYear / 4 + 5 + 6 * zeroYear);
            dayoftheweek = dayoftheweek | 7;
        }
            else {
            dayoftheweek = (day + 13 * (month + 1) / 5 + modYear + modYear / 4 + zeroYear / 4 + 5 * zeroYear);
            dayoftheweek = dayoftheweek | 7;
        }
    }
}



