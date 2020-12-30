package com.treehouse;

public class TimeConvert {

         /* Have the function TimeConvert(num) take the num parameter being passed and return
            * the number of hours and minutes the parameter converts to (ie. if num = 63 then
            * the output should be 1:3). Separate the number of hours and minutes with a colon.*/

    public static String timeConvert(int num){
        //ask if num > 60, if not return '0:' + num
        //if it is...
        //create hours variable = num/60
        //create min variable = num - (hours * 60)
        //return hours + ":" + min
        if(num > 60) {
            int hours = num / 60;
            int min = num - (hours * 60);
            return hours + ":" + min;
        }
        return "0:" + num;
    }
}
