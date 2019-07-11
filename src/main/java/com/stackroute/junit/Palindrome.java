package com.stackroute.junit;

public class Palindrome {
    public String checkPalindromeNumber(int number)
    {
        int n1, sum = 0, temp, rem, rem2, sum2 = 0;
        n1 = number;
        String result;
        while (n1 != 0)
        {
            rem = n1 % 10;
            sum = (sum * 10) + rem;
            n1 = n1 / 10;
        }
        if ((sum != 0) & (sum < 0) & (sum == number))
        {
            while (n1 > 0)
            {
                rem2 = n1 % 10;
                if (rem2 % 2 == 0)
                {

                    sum2 = sum2 + rem2;
                }

                n1 = n1 / 10;
            }
            if(sum2<25)
            {
                return number+" "+"is a palindrome with sum of even numbers less than 25" ;
            }
            else
            {
                return number+" "+"is a palindrome with sum of even numbers greater than 25" ;
            }


        }
        else
        {
            return number+" "+"is not a palindrome";
        }



    }
}
