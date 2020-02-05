//Payam Dowlatyari
//CountTimer
package com.calendar;

import java.util.Date;
import java.util.TimerTask;

public class CountTimer extends TimerTask {

    Date remainTime;
    int countdown = 100;

    public void countRemainTime(Date startingTime){

        Date todayDate = new Date();

        this.remainTime =  startingTime;

        if (todayDate == startingTime) {
            System.out.println(startingTime);

        }
        else {
            System.out.println(todayDate);

        }
    }

    @Override
    public void run() {
        countdown = countdown - 1;
        System.out.println(countdown);
    }
}
