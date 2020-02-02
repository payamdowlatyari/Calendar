package com.calendar;

import java.util.ArrayList;

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


        System.out.println("Today:");

        //for(int i = 0; i < calendar.size(); i++) {


//            System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
//            System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
//            System.out.println("WEEK_OF_YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
//            System.out.println("WEEK_OF_MONTH: " + calendar.get(Calendar.WEEK_OF_MONTH));
//            System.out.println("DATE: " + calendar.get(Calendar.DATE));
//            System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
//            System.out.println("DAY_OF_YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
//            System.out.println("DAY_OF_WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
//            System.out.println("DAY_OF_WEEK_IN_MONTH: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
//            System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));
//            System.out.println("HOUR: " + calendar.get(Calendar.HOUR));
//            System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
//            System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
//            System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
//            System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
//            System.out.println("ZONE_OFFSET: " + (calendar.get(Calendar.ZONE_OFFSET)/(60*60*1000)));

       //  }
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
