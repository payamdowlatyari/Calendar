//Payam Dowlatyari
//PublicCalendar
package com.calendar;

public class PublicCalendar extends GeneralCalendar {

    public PublicCalendar(String name) {
        super(name);
    }

    @Override
    public boolean publicity() {
        return true;
    }
//######################################################################################### duplicate code


//    public void addEvent(Event event){
//        this.events.add(event);
//    }//adds an event
//
//    @Override
//    public String getName() {
//        return this.name;
//    }
//
//    @Override
//    public Event getEvent() {
//        return null;
//    }
//
//    public void removeEvent(Event event){ this.events.remove(event); }//deletes an event
//
//    public void updateEvent(Event event, String title){//updates an event
//        this.events.remove(event);
//        Event newEvent = new Event(title);
//        this.events.add(newEvent);
//    }
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
//
//
//######################################################################################### duplicate code

}
