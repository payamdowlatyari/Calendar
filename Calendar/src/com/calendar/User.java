//Payam Dowlatyari
//User
package com.calendar;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class User {

    String username;
    ArrayList<Icalendar> calendars;//Contains all Calendar objects
    String searchQuery;
    Setting setting;


    public User(String username, Setting setting) {//constructor

        this.username = username;
        this.setting = setting;
        calendars = new ArrayList<>(10);

    }


    public void displayCalendars(){//method to display all the calendars

        for (int i=0; i<calendars.size(); i++){
            System.out.println(calendars.get(i).getName());
        }

    }

    public void showCalendarLists(){//Display calendar by types, names and numbers
        for (int i=0; i<calendars.size(); i++){
            System.out.print(i+1 + ") ");
            System.out.print(calendars.get(i).publicity());
            System.out.print(" ");
            System.out.println(calendars.get(i).getName());

        }
    }

    public void deleteCalendar(Icalendar calendar){//delete a calendar from the list

        calendars.remove(calendar);

    }

    public void togglePrivateCalendar(Icalendar calendar){//makes private calendar public

        calendar.publicity();

    }

    public void updateCalendar(Icalendar calendar){//updates the calendar's name

        System.out.println("Enter a new name:");
        Scanner input = new Scanner(System.in);

        String newName = input.nextLine();


    }



    public int searchCalendar (String searchQuery){//method to search the calendars and return a Calendar object
                                                        //that has the same name as the search string
        this.searchQuery = searchQuery;

        for (int i=0; i< calendars.size(); i++){
            if (searchQuery.equals(calendars.get(i).getName())){

                return i;
            }
        }
        return -1;
    }


    public void displayDate(){//Displays today's date
        GregorianCalendar calendar = new GregorianCalendar();

        System.out.print("Today is ");
        System.out.println(calendar.getTime());
    }
}
