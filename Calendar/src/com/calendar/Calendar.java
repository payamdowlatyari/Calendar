package com.calendar;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Calendar extends GregorianCalendar {

    String calendarType;
    String name;
    ArrayList<Event> events;
    View view;

    public Calendar(String name){

        this.calendarType = "Gregorian";
        this.name = name;
        this.view = new View(getTime());
        this.events = new ArrayList<>(10);
    }

    public void addEvent(Event event){
        this.events.add(event);
    }

    public void removeEvent(Event event){
        events.remove(event);

    }
    public void updateEvent(){


    }
    public void filterCalendar(){

    }

    public int selectEvent(String event){
        //for (int i=0 ; i<10 )
        return events.indexOf(event);

    }

    public void getEvent(){

    }



}
