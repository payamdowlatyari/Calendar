package com.calendar;

public class Setting {
    String theme;
    String timeZone;

    public Setting(String theme, String timeZone){
        this.theme = theme;
        this.timeZone = timeZone;
    }

    public void changeTheme(){
        if (this.theme == "dark" ){
            this.theme = "light";
        }
        else
        {
            this.theme = "dark";
        }

        System.out.println("Theme has changed to: " + theme);

    }

    public void changeTimeZone(String timeZone) {
        this.timeZone = timeZone;
        System.out.println("New Time Zone: " + timeZone);
    }

    }
