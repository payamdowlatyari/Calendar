//Payam Dowlatyari
//Main
package com.calendar;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();//Contains all the user objects

        int exitOrNot;
        int userIndex = 0;
        do {

            Scanner input = new Scanner(System.in);

            System.out.println("Choose an option: ");//Main menu
            System.out.println("1) LOGIN");
            System.out.println("2) REGISTER");
            System.out.println("3) EXIT");

            int option = input.nextInt();

            if (option == 1) { //Login
                User user = login();

                for (int i=0; i< users.size(); i++){
                    if (user.username.equals(users.get(i).username)){
                        System.out.println("You logged in!");
                        userIndex = i;
                    }

                }

            } else if (option == 2){ //Register
                User user = register();
                users.add(user);
                userIndex = users.indexOf(user);

            } else {
                break;
            }


            System.out.println("Choose one:"); //Second menu
            System.out.println("1)EXIT");
            System.out.println("2)RESTART");
            System.out.println("3)CRATE A CALENDAR");
            System.out.println("4)DISPLAY CALENDARS");
            System.out.println("5)SEARCH CALENDARS");

            exitOrNot = input.nextInt();

            if (exitOrNot == 3){//Creating a new calendar
                Calendar calendar = createCalendar();
                users.get(userIndex).calendars.add(calendar);
            }
            else if (exitOrNot == 4){//Displaying all the calendars

                users.get(userIndex).displayCalendars();

            }
            else if (exitOrNot == 5) {//Searching calendars for a specific name

                input = new Scanner(System.in);
                System.out.println("What is the calendar's name?");
                String searchQuery = input.nextLine();

                int calendarIndex = users.get(userIndex).searchCalendar(searchQuery);

                Calendar calendar = users.get(userIndex).calendars.get(calendarIndex);

                if (calendar != null) {
                    System.out.println(searchQuery + " exists!");
                    System.out.println("What would you like to do?");
                    System.out.println("1)DISPLAY EVENTS");
                    System.out.println("2)ADD AN EVENT");
                    System.out.println("3)REMOVE AN EVENT");
                    System.out.println("4)UPDATE AN EVENT");

                    int eventOption = input.nextInt();

                    if (eventOption == 1){
                        for (int i=0; i<calendar.events.size(); i++){
                            System.out.println(calendar.events.get(i).title);
                        }
                    }
                    else if (eventOption == 2){
                        Event newEvent = createEvent();
                        users.get(userIndex).calendars.get(calendarIndex).addEvent(newEvent);
                    }
                    else if (eventOption == 3){
                        System.out.println("What is the event title?");
                        String eventTitle = input.nextLine();
                        for (int i=0; i<users.get(userIndex).calendars.get(calendarIndex).events.size(); i++){
                            if (eventTitle.equals(users.get(userIndex).calendars.get(calendarIndex).events.get(i).title)){
                                users.get(userIndex).calendars.get(calendarIndex).removeEvent(users.get(userIndex).calendars.get(calendarIndex).events.get(i));
                                System.out.println(eventTitle + " has been removed");
                            }
                        }
                    }
                    else if (eventOption == 4){
                        System.out.println("What is the event title?");
                        String eventTitle = input.nextLine();
                        for (int i=0; i<users.get(userIndex).calendars.get(calendarIndex).events.size(); i++){
                            if (eventTitle.equals(users.get(userIndex).calendars.get(calendarIndex).events.get(i).title)){
                                users.get(userIndex).calendars.get(calendarIndex).updateEvent(users.get(userIndex).calendars.get(calendarIndex).events.get(i),eventTitle);
                                System.out.println(eventTitle + " has been updated");
                            }
                        }
                    }


                }
                else {
                    System.out.println(searchQuery + " does not exist!");
                }
            }

        }while (exitOrNot != 1);



        System.out.println("Thank you!");

    }

    public static User register(){//Register method creates a new User object and returns it

        Scanner input = new Scanner(System.in);

        System.out.println("Create a username: ");
        String username = input.nextLine();

        System.out.println("Would you like to change the Default setting? 1)Yes 2)No (theme: dark, timezone: US)");
        int response = input.nextInt();
        
        Setting setting = null;

        if (response == 2) {

            setting = new Setting("dark", "US");
        }else {

        setting = settings();

        }
        User user = new User(username, setting);

        return user;
    }

    public static User login(){//creates and returns a temporary User object to check if user exists

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String username = input.nextLine();

        Setting setting = new Setting("dark","US");

        User user = new User(username, setting);

        return user;
    }

    public static Calendar createCalendar(){//method for creating a new Calendar object
        Scanner input = new Scanner(System.in);

        System.out.println("What type of calendar? 1)Public or 2)Private");
        int publicity = input.nextInt();

        if (publicity == 1) {

            input = new Scanner(System.in);
            System.out.println("Enter your calendar's name:");
            String calendarName = input.nextLine();
            Calendar calendar = new Calendar(calendarName);

            System.out.println("Would you like to add an event? 1)Yes 2)No");
            int response = input.nextInt();

            while (response == 1) {

                calendar.addEvent(createEvent());

                System.out.println("Would you like to add more events? 1)Yes 2)No");
                response = input.nextInt();
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

                input = new Scanner(System.in);

                calendar.addEvent(createEvent());

                System.out.println("Would you like to add more events? 1)Yes 2)No");
                response = input.nextInt();

            }

            return calendar;

        }

    }

    public static Event createEvent(){ //method for creating a new Event object

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your event's title: ");
        String eventTitle = input.nextLine();
        Event event = new Event(eventTitle);

        System.out.println("The event starts:");
        System.out.println("Enter year");
        int year = input.nextInt();

        System.out.println("Enter month");
        int month = input.nextInt();

        System.out.println("Enter day");
        int day = input.nextInt();

        event.setStartingTime(year, month, day);

        System.out.println("The event ends:");
        System.out.println("Enter year:");
        year = input.nextInt();

        System.out.println("Enter month");
        month = input.nextInt();

        System.out.println("Enter day");
        day = input.nextInt();
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

        return event;

    }

    public static Setting settings(){//method to change the default settings

        Scanner input = new Scanner(System.in);

        String theme, timeZone;

        System.out.println("Choose your theme: dark or light?");
        theme = input.nextLine();

        System.out.println("Choose time zone:");
        timeZone = input.nextLine();

        Setting setting = new Setting(theme,timeZone);

        return setting;
    }
}
