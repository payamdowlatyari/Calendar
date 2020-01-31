package com.calendar;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);

//        System.out.print("Enter your name: ");
//        String name = input.nextLine();
//        String theme, timeZone;

//        System.out.println("Choose your theme: dark or light?");
//        theme = input.nextLine();
//
//        System.out.println("Choose time zone:");
//        timeZone = input.nextLine();

        Setting setting1 = new Setting("dark","US");

        User user1 = new User("Payam", setting1);

  //      user1.calendars[0] = new Calendar("Gregorian", "MyCalendar");
        Calendar calendar1 = new Calendar("MyCalendar");
        user1.displayCalendar(calendar1);

        user1.calendars.add(calendar1);

        setting1.changeTimeZone("UK");

        ViewOnlyCalendar calendar2 = new ViewOnlyCalendar("ViewCalnedar");

        Date todayDate = calendar2.getTime();
        System.out.println(calendar2.get(Calendar.DATE));
        System.out.println(calendar2.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar2.get(Calendar.YEAR));

        System.out.println(todayDate);



//        System.out.println(calendar1.YEAR);
//
//        System.out.println(setting1.theme);
//        setting1.changeTheme();
//        System.out.println(setting1.theme);
//
        Event event1 = new Event("MyEvent");
        event1.setHour(12);
        event1.setMinutes(30);
        event1.setStartingTime(2020,02,18);
        event1.setEndingTime(2020,02,18);
        event1.repeatEvent(false);
        event1.viewTimer();

        calendar1.addEvent(event1);
        user1.displayCalendar(calendar1);

        calendar1.removeEvent(event1);


        user1.displayCalendar(calendar1);



//
//        user1.displayCalendar(calendar1);
//
//
//        System.out.println(calendar1.events);

       // event1.startingTime =

//        event1.viewTimer();




        //  Calendar calendar3 = (Calendar) GregorianCalendar.getInstance();



    }
}
