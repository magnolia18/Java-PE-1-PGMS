package com.stackroute.junit;

import java.util.Scanner;

public class LoopNumber
{
    int num,i,j;
    String ser="";
    public String loopSeries(int num)
    {

        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                ser=ser+i;
            }
        }
        return ser;


    }
}