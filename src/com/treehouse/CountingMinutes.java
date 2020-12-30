package com.treehouse;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CountingMinutes {

    public static String countingMinutes(String str) throws ParseException {
        // create variables for totalMin, totalHr, min
        // split the time on ("-")
        // create SimpleDateFormat sdf with ("hh:mma")
        // sdf.parse(first time section)
        // sdf.parse(second time section)
        // calculate total time with time1 - time2
        //

        Integer totalMinutes, totalHr, min;

        String[] split = str.split("-");
        String time1 = split[0];
        String time2 = split[1];

        SimpleDateFormat sdf = new SimpleDateFormat("hh:mma");
        Date date1 = sdf.parse(time1);
        Date date2 = sdf.parse(time2);

        Long totalTime = date1.getTime() - date2.getTime();

        if(date2.getTime() < date1.getTime()) {
            Integer hr = (int) Math.floor(totalTime / 3600000);
            totalHr = 24 - hr;
            min = (int) Math.floor((totalTime - hr * 3600000) / 60000);
        }
        else {
            totalHr = (int) Math.floor(totalTime / 3600);
            min = (int) Math.floor((totalTime - totalHr * 3600000) / 60000);
        }

        totalMinutes = (totalHr * 60) - min;
        return totalMinutes.toString();
    }
}
