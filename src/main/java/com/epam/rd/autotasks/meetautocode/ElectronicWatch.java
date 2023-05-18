package com.epam.rd.autotasks.meetautocode;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        // asking input from the user
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();

        // defining seconds, minutes and hours per day
        int second1 = 60*60*24;
        int secondsInAnHour = 60 * 60;
        int minutes = (seconds % secondsInAnHour) / 60;
        int hours = (seconds % second1) / secondsInAnHour;
        int second2 = seconds % 60;

        // constructing clock
        int secondsFirstDigit = second2 / 10;
        int secondsSecondDigit = second2 % 10;
        int minutesFirstDigit = minutes / 10;
        int minutesSecondDigit = minutes % 10;


        // displaying the final result
        System.out.println(hours+ ":" + minutesFirstDigit + minutesSecondDigit + ":" + secondsFirstDigit + secondsSecondDigit);


    }
}
