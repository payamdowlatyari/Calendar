//Payam Dowlatyari
//PrivateCalendar
package com.calendar;


public class PrivateCalendar extends GeneralCalendar {

    public PrivateCalendar(String name) {
        super(name);
    }

    @Override
    public boolean publicity() {
        return false;
    }


//######################################################################################### duplicate code
//    public void addEvent(Event event){
//        this.events.add(event);
//    }//adds an event
//
//    public void removeEvent(Event event){ this.events.remove(event); }//deletes an event
//
//    public void updateEvent(Event event, String title){//updates an event
//        this.events.remove(event);
//        Event newEvent = new Event(title);
//        this.events.add(newEvent);
//    }
//
//    @Override
//    public String getName() {
//        return this.name;
//    }
//
//
//    public Event filterCalendar(String keyword){//filters an event based on the given keyword
//
//        for (int i=0; i<events.size(); i++){
//            if (events.get(i).title.equals(keyword) ){
//
//                return events.get(i);
//            }
//
//        }
//        return null;
//
//    }
//
//    public Event selectEvent(int index){
//        return events.get(index);
//    }//select and return an Event object by index
//
//    public Event getEvent(int index){//getter method
//        return events.get(index);
//
//    }

    //######################################################################################### duplicate code


}
