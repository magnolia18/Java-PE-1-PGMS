package com.stackroute.junit;

public class CharacterRepeat {

    public String charRepeatInTheString (String str,int n) {
        int i;

        String str1 = str.substring(str.length() - n);

        for (i = 0; i < n; i++) {
            str += str1;
        }
        return str;


    }
}
