package com.stackroute.junit;

public class Sorting {
    public String sortingDesc(int num) {

        int count=0, sum = 0, i, j,n=num;
        int arr[]=new int[40];

        int temp=0;
        while (num > 0) {
            if(num<0)
            {
                return "entered number is negative";
            }
            else if(num==0)
            {
                return "entered number is zero.Cant calculate sum";
            }
            else {
                arr[count] = num % 10;
                count++;
                num = num / 10;
            }
        }

        for (i = 0; i < count; i++) {
            for (j = i + 1; j < count; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[i];

                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        int res=0;
        for (i = 0; i < count; i++) {
            res = (res * 10) + arr[i];
        }

        System.out.println(res);


        for(i=0;i<count;i++) {
            if (arr[i] % 2 == 0) {
                sum = sum + arr[i];

            }
        }

        System.out.println(sum);


        if(sum>15) {
            return "true";
        }


        else
        {
            return "false";
        }

    }
}