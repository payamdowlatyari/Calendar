package com.calendar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<User> users = new ArrayList<>();

        int response = 1;
        do {

            User user = register();

            Calendar calendar1 = login();
            user.calendars.add(calendar1);

            users.add(user);

            System.out.println("Would you like to add more users? 1)Yes 2)No");
            response = input.nextInt();

        } while (response == 1);

            //user.displayCalendar(calendar1);



            //System.out.println(user1.calendars.get(0).events.get(0).title);

    }

    public static User register(){


        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String name = input.nextLine();
        String theme, timeZone;


        System.out.println("Choose your theme: dark or light?");
        theme = input.nextLine();

        System.out.println("Choose time zone:");
        timeZone = input.nextLine();

        Setting setting1 = new Setting(theme,timeZone);

        User user1 = new User(name, setting1);


        return user1;

    }

    public static Calendar login(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1)Public or 2)Private");
        int publicity = input.nextInt();

        if (publicity == 1) {

            input = new Scanner(System.in);
            System.out.println("Enter your calendar's name:");
            String calendarName = input.nextLine();
            Calendar calendar = new Calendar(calendarName);

            System.out.println("Enter your event's title:");
            String eventTitle = input.nextLine();
            Event event = new Event(eventTitle);

            System.out.println("Enter year:");
            int year = input.nextInt();

            System.out.println("Enter month");
            int month = input.nextInt();

            System.out.println("Enter day");
            int day = input.nextInt();

            event.setStartingTime(year, month, day);
            event.setEndingTime(year, month, day);

            System.out.println("Enter hour");
            int hour = input.nextInt();
            event.setHour(hour);

            System.out.println("Enter minute");
            int minute = input.nextInt();
            event.setMinutes(minute);

            System.out.println("Would you like to repeat this event? 1)Yes 2)No");
            int repeat = input.nextInt();
            if (repeat == 1) {
                event.repeatEvent(true);
            }
            else {
                event.repeatEvent(false);
            }
            calendar.events.add(event);

            return calendar;

        }
        else {

            input = new Scanner(System.in);
            System.out.println("Enter your calendar's name: ");
            String calendarName = input.nextLine();
            ViewOnlyCalendar calendar = new ViewOnlyCalendar(calendarName);

            calendar.setPublicity(false);

            System.out.println("Enter your event's title: ");
            String eventTitle = input.nextLine();
            Event event = new Event(eventTitle);

            System.out.println("Enter year:");
            int year = input.nextInt();

            System.out.println("Enter month");
            int month = input.nextInt();

            System.out.println("Enter day");
            int day = input.nextInt();

            event.setStartingTime(year, month, day);
            event.setEndingTime(year, month, day);

            System.out.println("Enter hour");
            int hour = input.nextInt();
            event.setHour(hour);

            System.out.println("Enter minute");
            int minute = input.nextInt();
            event.setMinutes(minute);

            System.out.println("Would you like to repeat this event? 1)Yes 2)No");
            int repeat = input.nextInt();
            if (repeat == 1) {
                event.repeatEvent(true);
            }
            else {
                event.repeatEvent(false);
            }
            calendar.events.add(event);

            return calendar;

        }

    }
}
