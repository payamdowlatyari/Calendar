//Payam Dowlatyari
//Icalendar interface
package com.calendar;

import java.util.ArrayList;

public interface Icalendar {

    ArrayList<Event> events = null;

    boolean publicity();
    void addEvent(Event event);
    void removeEvent(Event event);
    void updateEvent(Event event, String title);
    String getName();
    Event getEvent(int index);
    Event filterCalendar(String keyword);
    Event selectEvent(int index);
}
