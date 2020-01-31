package com.calendar;

import java.util.Date;

public class CountTimer {

    Date remainTime;

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
}
