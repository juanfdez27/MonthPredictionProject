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
        String dayString;
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
        switch (dayoftheweek){
            case 0:
                dayString = "Saturday";
                break;
            case 1:
                dayString = "Sunday";
                break;
            case 2:
                dayString = "Monday";
                break;
            case 3:
                dayString = "Tuesday";
                break;
            case 4:
                dayString = "Wednesday";
                break;
            case 5:
                dayString = "Thursday";
                break;
            case 6:
                dayString = "Friday";
                break;
        }
        System.out.println("You were born on a " +dayString+ ".");

    }
    public static void poem (String days){
        String poem;
        switch (days){
            case "Monday" : poem = "Monday's child is fair of face";
            break;
            case "Tuesday" : poem = "Tuesday's child is full of grace";
            break;
            case "Wednesday" : poem = "Wednesday's child is full of woe";
            break;
            case "Thursday" : poem = "Thursday's child has far to go";
            break;
            case "Friday" : poem = "Friday's child is loving and giving";
            break;
            case "Saturday" : poem = "Saturday's child works hard for a living";
            break;
            case "Sunday" :poem = "Sunday's child is wise and good in every way";
            break;

        }
        System.out.println(days);

    }
}



