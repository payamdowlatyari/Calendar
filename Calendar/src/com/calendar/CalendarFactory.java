//Payam Dowlatyari
//CalendarFactory
package com.calendar;

import java.util.Scanner;

public class CalendarFactory {//Factory design pattern

    public Icalendar getInstance(String str){
        System.out.println("Enter the name of your calendar:");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        if (str.equals("public"))
            return new PublicCalendar(name);
        else
            return new PrivateCalendar(name);
    }
}
