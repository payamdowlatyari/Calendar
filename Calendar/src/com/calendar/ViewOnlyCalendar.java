package com.calendar;

public class ViewOnlyCalendar extends Calendar {

    boolean publicity;
    User owner;

    public ViewOnlyCalendar( String name) {
        super(name);
    }

    public boolean checkIfAuthorized() {
        return publicity;
    }
}
