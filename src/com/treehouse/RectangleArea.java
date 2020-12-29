package com.treehouse;

public class RectangleArea {

    //Rectangle Area
//Have the function RectangleArea(strArr) take the array of strings stored in strArr,
// which will only contain 4 elements and be in the form (x y) where x and y are both integers,
// and return the area of the rectangle formed by the 4 points on a Cartesian grid.
// The 4 elements will be in arbitrary order. For example: if strArr is ["(0 0)", "(3 0)", "(0 2)", "(3 2)"]
// then your program should return 6 because the width of the rectangle is 3 and the height is 2 and the area
// of a rectangle is equal to the width * height.

//Examples
//Input: new String[] {"(1 1)","(1 3)","(3 1)","(3 3)"}
//Output: 4
//Input: new String[] {"(0 0)","(1 0)","(1 1)","(0 1)"}
//Output: 1

    public static String RectangleArea(String[] strArr) {

        // length * width to find area of rectangle
         Integer maxX = -1;
         Integer minX = -1;
         Integer maxY = -1;
         Integer minY = -1;

        for(int i = 0; i < strArr.length; i++) {
            String tempPoints = strArr[i].replaceAll("[()]", "");
            String [] tempXY = tempPoints.split(" ");
            int x = Integer.parseInt(tempXY[0]);
            int y = Integer.parseInt(tempXY[1]);

            if(minX == null || x < minX) minX = x;
            else if(x > maxX) maxX = x;

            if(minY == null || y < minY) minY = y;
            else if(y > maxY) maxY = y;
        }
        return String.valueOf((maxX - minX) * (maxY - minY));
    }
}
