
package com.stackroute.junit;

public class StringReverse {
    public String reverseOfAString(String str)
    {
        int i;
        String reverse = "";
        int length = str.length();
        for (i = length - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);


        }
        return reverse;
    }
}