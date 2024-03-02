/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical8a;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author rahul
 */
public class Practical8a {

    private Calendar calendar;

    public Practical8a() {
        calendar = Calendar.getInstance();
    }

    public Calendar getCalender() {
        return calendar;
    }

    public Date getTime() {
        return calendar.getTime();
    }

    public int getHour() {
        return calendar.get(Calendar.HOUR_OF_DAY);
    }

    public int getMinute() {
        return calendar.get(Calendar.MINUTE);
    }

    public int getSecond() {
        return calendar.get(Calendar.SECOND);
    }
    
    public String getlava(){
        return "LAVA" ;
    }

}
