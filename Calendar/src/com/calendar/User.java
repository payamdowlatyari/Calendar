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
        System.out.println("Dispaly Events:");

        for(int i = 0; i < calendar.events.size(); i++) {
            System.out.print(calendar.events.get(i).title);
        }
    }
}
