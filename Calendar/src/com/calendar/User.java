package com.calendar;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class User {

    String username;
    ArrayList<Calendar> calendars;
    String searchQuery;
    Setting setting;


    public User(String username, Setting setting) {

        this.username = username;
        this.setting = setting;
        calendars = new ArrayList<>(10);

    }

    public void displayCalendar(Calendar calendar){

        GregorianCalendar cal = new GregorianCalendar();

        int dayOfMonth = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH);
        int year = cal.get(Calendar.YEAR);
        int weekday = cal.get(Calendar.DAY_OF_WEEK);

        cal.add(Calendar.DAY_OF_MONTH, 100);
        GregorianCalendar birthday = new GregorianCalendar(1994, Calendar.JANUARY, 1);
        birthday.add(Calendar.DAY_OF_MONTH, 10000);

        System.out.printf("Todays date is " +month + "/" +dayOfMonth +"/" +year +".");
        System.out.printf(" It is day " +weekday +" of the week");
        System.out.println("");

    }

    public Calendar searchCalendar (String searchQuery){
        this.searchQuery = searchQuery;

        for (int i=0; i< calendars.size(); i++){
            if (searchQuery == calendars.get(i).name){
                return calendars.get(i);
            }
        }
        return null;
    }
}
