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

            int response2 = 1;

            do {
                Calendar calendar = createCalendar();
                user.calendars.add(calendar);

                System.out.println("Would you like to add more calendars? 1)Yes 2)No");
                response2 = input.nextInt();
            }while (response2 == 1);

            users.add(user);


            System.out.println("Would you like to add more users? 1)Yes 2)No");
            response = input.nextInt();



        } while (response == 1);

        View view = new View(users.get(0).calendars.get(0).getTime());

        view.viewByDay(users.get(0).calendars.get(0));

        //users.get(0).calendars.get(0).events.get(0).viewTimer();

        //users.get(0).calendars.get(0).events.get(0).viewTimer();

          //  users.get(0).displayCalendar(users.get(0).calendars.get(0));

       // System.out.println(users.get(0).calendars.get(0).getTime());



            //System.out.println(user1.calendars.get(0).events.get(0).title);

    }

    public static User register(){


        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = input.nextLine();
        String theme, timeZone;


        System.out.println("Choose your theme: dark or light?");
        theme = input.nextLine();

        System.out.println("Choose time zone:");
        timeZone = input.nextLine();

        Setting setting = new Setting(theme,timeZone);

        User user = new User(username, setting);

        return user;

    }

    public static Calendar createCalendar(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1)Public or 2)Private");
        int publicity = input.nextInt();

        if (publicity == 1) {

            input = new Scanner(System.in);
            System.out.println("Enter your calendar's name:");
            String calendarName = input.nextLine();
            Calendar calendar = new Calendar(calendarName);

            System.out.println("Would you like to add an event? 1)Yes 2)No");
            int response = input.nextInt();

            while (response == 1) {

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
                } else {
                    event.repeatEvent(false);
                }


                calendar.addEvent(event);
            }
            return calendar;

        }
        else {

            input = new Scanner(System.in);
            System.out.println("Enter your calendar's name: ");
            String calendarName = input.nextLine();
            ViewOnlyCalendar calendar = new ViewOnlyCalendar(calendarName);

            calendar.setPublicity(false);

            System.out.println("Would you like to add an event? 1)Yes 2)No");
            int response = input.nextInt();

            while (response == 1) {

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
                } else {
                    event.repeatEvent(false);
                }
                calendar.addEvent(event);

            }

            return calendar;

        }

    }
}
