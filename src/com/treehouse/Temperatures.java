package com.treehouse;

import java.util.Arrays;
import java.util.Stack;

public class Temperatures {

    public static void main(String[] args) {

        int[] T = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] result = {1, 1, 4, 2, 1, 1, 0, 0};

        System.out.println(Arrays.toString(dailyTemperatures(T)));

    }

        // daily temperatures T
        // return an int[] containing the current numbers next highest number
        // if there are no higher numbers left put 0.

    public static int[] dailyTemperatures(int[] T) {

        int[] arr = new int[T.length]; // create a new int[] of the same size
        Stack<Integer> st = new Stack<Integer>(); // create a Stack

        int i = 0; // initialize a counter
        while (true) { // start a while loop with true
            if (i == T.length) { // if we are on the last element - set it to 0 and break the loop
                arr[T.length - 1] = 0; // add a 0 for last index of new array
                break;
            }
            if (st.isEmpty()) { // if our stack is empty
                st.add(i); // add our count
                i++; // increase count
            } else if (T[i] <= T[st.peek()]) { // if current element of T is <= last element on our stack
                st.add(i); // add count to stack
                i++;    // increase count
            } else if (T[i] > T[st.peek()]) { //if current element of T is > T[top of stack]
                arr[st.peek()] = i - st.peek(); // arr[top of stack] = difference between i - stack.peek
                st.pop(); // take the last element off the stack
            }
        }
        return arr;
    }
}

