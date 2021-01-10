package com.codedifferently;

import java.util.Arrays;

import static java.util.Arrays.sort;


public class Solution {

    // int matchingLetters;

    /**
     * String Scramble
     * Have the function StringScramble(str1,str2) take both parameters being passed and return the boolean true if
     * a portion of str1 characters can be rearranged to match str2, otherwise return the string false.
     * For example: if str1 is "rkqodlw" and str2 is "world" the output should return true.
     * Punctuation and symbols will not be entered with the parameters.
     *
     * @param str1
     * @param str2
     * @return
     */
    public Boolean stringScramble(String str1, String str2) {
        // count the chars in each
        // if count of str1 is less than str2, return false--not enough letters to do the job
        // convert both to lower case
        // break strings into char arrays
        // sort each
        // for each char in str1, see if str2 contains it (maybe this should be worded the other way around, but the code doesn't care?)
        // if they are all contained return true
/*
        int countLettersInStr1;
        int countLettersInStr2;


       if (str1.length() < str2.length()) {
         return false;
        } else {
            String str1Lc = str1.toLowerCase();
            String str2Lc = str2.toLowerCase();
            char[] str1Arr = str1Lc.toCharArray();
            char[] str2Arr = str2Lc.toCharArray();
            Arrays.sort(str1Arr);
            Arrays.sort(str2Arr);
            String str1Sorted = Arrays.toString(str1Arr);
            String str2Sorted = Arrays.toString(str2Arr);
            for (int i = 0; i < str1.length(); i++) {
                int comparison = Character.compare(str1Sorted.charAt(i), str2Sorted.charAt(i));
                if (comparison != 0) {
                    matchingLetters = 0;
                    return false;
                } else {
                    matchingLetters++;
                    if (matchingLetters == str2.length())
                        return true;
                }

            }
        return false;
       }

    }
}
*/

        //from Alberto--so much better!

        boolean match = false;
        int counter = 0;
        char[] str1Arr = str1.toCharArray();

        for (char character : str1Arr) {
            String temp = "" + character;
            if (str2.contains(temp)) {
                counter++;
            }
        }
        if (str2.length() == counter) {
            match = true;
        }
        return match;
    }
}


