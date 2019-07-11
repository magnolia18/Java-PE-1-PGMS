
package com.stackroute.junit;

public class CheckVowelsAndConsonants
{
    public String checkVowelorConsonant(String letter)
    {
        int i;

        String str = "";
        String nullVar = null;

        if(str != nullVar) {
            for (i = 0; i < letter.length(); i++) {
                char c = letter.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                        c == 'A' || c == 'E' || c == 'O' || c == 'U') {
                    str = str + "vowel" + " ";

                } else {
                    str = str + "consonant" + " ";

                }


            }
        }
        else
        {
            System.out.println("No input given");
        }
        return str.trim();

}
