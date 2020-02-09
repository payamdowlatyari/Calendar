//Payam Dowlatyari
//Event
package com.calendar;

import java.util.ArrayList;
import java.util.Date;

public class Event {
    String title;
    ArrayList<User> sharedUser;
    int hour, minute ;
    Date startingTime;
    Date endingTime;
    boolean isRepeat;
    Date endtime;
    CountTimer timer;

    public Event(String title){
        this.title = title;
    }//constructor


    public void setHour(int hour){
        this.hour = hour;
    }

    public void setMinutes(int minute){
        this.minute = minute;
    }

    public void setStartingTime(int y, int m, int d){
        startingTime = new Date(y, m, d);
    }

    public void setEndingTime(int y, int m, int d){
        endingTime = new Date(y, m, d);
    }

    public void repeatEvent(boolean repeat){
        isRepeat = repeat;
    }

    public void viewTimer(){//display the timer

        this.timer = new CountTimer();
        timer.countRemainTime(startingTime);
        timer.scheduledExecutionTime();
        System.out.println(timer.scheduledExecutionTime());

    }
}
