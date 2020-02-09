//Payam Dowlatyari
//ViewOnlyCalendar
package com.calendar;

public class ViewOnlyCalendar extends Calendar {

    private boolean publicity;
    private User owner;

    public ViewOnlyCalendar( String name) {
        super(name);
    }//constructor

    public void setPublicity(boolean publicity) {
        this.publicity = publicity;
    }//setter method

    public void setOwner(User owner) {
        this.owner = owner;
    }//setter method

    public boolean checkIfAuthorized() {
        return publicity;
    }
}
