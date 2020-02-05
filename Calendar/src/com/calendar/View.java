package com.calendar;
//Payam Dowlatyari
//View
import java.text.SimpleDateFormat;
import java.util.Date;

public class View {
   Date date;

   public View(Date date){
        this.date = date;
   }

   public void viewByYear(Calendar calendar){
       System.out.println("YEAR: " + calendar.get(Calendar.YEAR));

   }

    public void viewByMonth(Calendar calendar){

        System.out.println(new SimpleDateFormat("MMMM YYYY").format(calendar.getTime()));
        System.out.println(" S  M  T  W  T  F  S");

        String initialSpace = "";
        for (int i = 0; i < calendar.get(Calendar.DAY_OF_WEEK) - 1; i++) {
            initialSpace += "   ";
        }
        System.out.print(initialSpace);

        for (int i = 0, dayOfMonth = 1; dayOfMonth <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH); i++) {
            for (int j = ((i == 0) ? calendar.get(Calendar.DAY_OF_WEEK) - 1 : 0); j < 7 && (dayOfMonth <= calendar.getActualMaximum(Calendar.DAY_OF_MONTH)); j++) {
                System.out.printf("%2d ", dayOfMonth);
                dayOfMonth++;
            }
            System.out.println();
        }

    }
    public void viewByDay(Calendar calendar){
        System.out.print(calendar.get(Calendar.DAY_OF_MONTH) + " ");
        System.out.println(new SimpleDateFormat("MMMM YYYY").format(calendar.getTime()));


    }
}
