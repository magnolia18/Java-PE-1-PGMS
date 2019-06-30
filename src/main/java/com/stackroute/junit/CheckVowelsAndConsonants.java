
package com.stackroute.junit;

public class CheckVowelsAndConsonants
{
    public String checkVowelorConsonant(String letter)
    {
        int i;

        String str="";

        for(i=0;i<letter.length();i++)
        {
            char c= letter.charAt(i);
            if(c=='a' || c=='e'||c=='i' ||c=='o'||c=='u' ||
                    c=='A' || c=='E' || c=='O' || c=='U')
            {
                str= str+"vowel"+" ";

            }
            else
            {
                str=str+"consonant"+" ";

            }


        }
        return str.trim();
    }

}
