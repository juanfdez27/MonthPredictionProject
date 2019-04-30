package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner keyboard = new Scanner(System.in);
        int month, year, day;
        boolean test = true;
        while (test) {
            printMonthPoem();

            System.out.println("What month were you born on?");
            month = keyboard.nextInt();
            System.out.println("What day were you born on?");
            day = keyboard.nextInt();
            System.out.println("What year were you born on?");
            year = keyboard.nextInt();

            int h = dayoftheweek(month, day, year);


            // h= (q+ [13(m+1)/5] + k + [k/4] + [j/4] + 5j) mod7
            // q= day of the month
            // m= month
            // k= last two digits of year
            // j= first two digits of year

            //System.out.println(printDayOfWeek(6));

        }


    }

    public static void printMonthPoem() {
        System.out.println("Monday's child is fair of face,");
        System.out.println("Tuesday's child is full of grace,");
        System.out.println("Wednesday's child is full of woe,");
        System.out.println("Thursday's child has far to go,");
        System.out.println("Friday's child is loving and giving,");
        System.out.println("Saturday's child works hard for a living,");
        System.out.println("But the child born on the Sabbath day,");
        System.out.println("Is fair and wise and good in every way.");
    }

    public static int dayoftheweek(int month, int day, int year) {
        int dayoftheweek;
        String dayString;
        int modYear = year | 100;
        int zeroYear = year / 100;
        switch (month) {
            case 1:
                month = 13;
                break;
            case 2:
                month = 14;
                break;
            //month 13 is jan
            //month 14 is feb
            //if one of those months, subtract a year

        }
        if (month >= 13) {
            dayoftheweek = (day + 13 * (month + 1) / 5 + modYear + (modYear / 4) + (zeroYear / 4) + (5 * zeroYear));
            dayoftheweek = dayoftheweek | 7;
        } else {
            dayoftheweek = (day + 13 * (month + 1) / 5 + modYear + (modYear / 4) + (zeroYear / 4) - (2 * zeroYear));
            dayoftheweek = dayoftheweek | 7;
        }

        return dayoftheweek;

    }

    public static String printDayOfWeek(int dayoftheweek) {
        switch (dayoftheweek) {
            case 0:
                return "Saturday";
 
            case 1:
                return "Sunday";

            case 2:
                return "Monday";

            case 3:
                return "Tuesday";

            case 4:
                return "Wednesday";

            case 5:
                return "Thursday";

            case 6:
                return "Friday";
            default:
                return "Could not calc day of the week";

        }
    }

    public static void printLineInPoem(String days) {
        String poem;
        switch (days) {
            case "Monday":
                poem = "Monday's child is fair of face";
                break;
            case "Tuesday":
                poem = "Tuesday's child is full of grace";
                break;
            case "Wednesday":
                poem = "Wednesday's child is full of woe";
                break;
            case "Thursday":
                poem = "Thursday's child has far to go";
                break;
            case "Friday":
                poem = "Friday's child is loving and giving";
                break;
            case "Saturday":
                poem = "Saturday's child works hard for a living";
                break;
            case "Sunday":
                poem = "Sunday's child is wise and good in every way";
                break;

        }
        System.out.println(days);

    }
}



