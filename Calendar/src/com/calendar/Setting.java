package com.calendar;

public class Setting {
    String theme;
    String timezone;
    //String timeZones [] = {"US", "UK" };

    public Setting(String theme, String timeZone){
        this.theme = theme;
        this.timezone = timeZone;
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

    public void changeTimeZone(String timezone) {

//        TimeZone timeZone = TimeZone.getTimeZone("UTC");
//        Calendar calendar = (Calendar) Calendar.getInstance(timeZone);
//        SimpleDateFormat simpleDateFormat =
//                new SimpleDateFormat("EE MMM dd HH:mm:ss zzz yyyy", Locale.US);
//        simpleDateFormat.setTimeZone(timeZone);
//
//        System.out.println("Time zone: " + timeZone.getID());
//        System.out.println("default time zone: " + TimeZone.getDefault().getID());
//        System.out.println();
//
//        System.out.println("UTC:     " + simpleDateFormat.format(calendar.getTime()));
//        System.out.println("Default: " + calendar.getTime());

        this.timezone = timezone;
        System.out.println("New Time Zone: " + timezone);
    }

}
