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

    public void removeEvent(Event event){ this.events.remove(event); }

    public void updateEvent(Event event, String title){
        this.events.remove(event);
        Event newEvent = new Event(title);
        this.events.add(newEvent);
    }
    public Event filterCalendar(String keyword){

        for (int i=0; i<events.size(); i++){
            if (events.get(i).title.equals(keyword) ){

                return events.get(i);
            }

        }
        return null;

    }

    public Event selectEvent(int index){
        return events.get(index);
    }

    public void getEvent(){

    }



}
