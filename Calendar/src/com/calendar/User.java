//Payam Dowlatyari
//User
package com.calendar;

import java.util.ArrayList;

public class User {

    String username;
    ArrayList<Calendar> calendars;//Contains all Calendar objects
    String searchQuery;
    Setting setting;


    public User(String username, Setting setting) {//constructor

        this.username = username;
        this.setting = setting;
        calendars = new ArrayList<>(10);

    }

    public void displayCalendars(){//method to display all the calendars

        for (int i=0; i<calendars.size(); i++){
            System.out.println(calendars.get(i).name);
        }

    }

    public int searchCalendar (String searchQuery){//method to search the calendars and return a Calendar object
                                                        //that has the same name as the search string
        this.searchQuery = searchQuery;

        for (int i=0; i< calendars.size(); i++){
            if (searchQuery.equals(calendars.get(i).name)){

                return i;
            }
        }
        return -1;
    }
}
