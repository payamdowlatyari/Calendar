//Payam Dowlatyari
//Setting
package com.calendar;

public class Setting {
    private String theme;
    private String timezone;

    public Setting(String theme, String timeZone){//constructor
        this.theme = theme;
        this.timezone = timeZone;
    }

    public void changeTheme(){//changes the theme
        if (this.theme == "dark" ){
            this.theme = "light";
        }
        else
        {
            this.theme = "dark";
        }

        System.out.println("Theme has changed to: " + theme);

    }

    public void changeTimeZone(String timezone) {//changes the time zone

        this.timezone = timezone;
        System.out.println("New Time Zone: " + timezone);
    }

}
