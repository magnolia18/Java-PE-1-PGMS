package com.stackroute.junit;

public class GuessNumber {
    public String guessInputnumberWithTarget(int n)

    {
        int target=25;
        if(n<target)
        {
            return "Number guessed is less than the original number";
        }
        else if(n>target)
        {
            return "Number guessed is more than the target";
        }
        else if(n<0)
        {
            return "Entered number is negative";
        }
        else {
            return "entered number matches the target number";
        }

    }
}


