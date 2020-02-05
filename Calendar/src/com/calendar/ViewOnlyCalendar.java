//Payam Dowlatyari
//ViewOnlyCalendar
package com.calendar;

public class ViewOnlyCalendar extends Calendar {

    private boolean publicity;
    private User owner;

    public ViewOnlyCalendar( String name) {
        super(name);
    }

    public void setPublicity(boolean publicity) {
        this.publicity = publicity;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public boolean checkIfAuthorized() {
        return publicity;
    }
}
