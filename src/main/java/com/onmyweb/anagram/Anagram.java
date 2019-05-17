package com.onmyweb.anagram;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        if (areAnagrams("silent", "listen")) {
            System.out.println("First set is anagram");
        }
        else {
            System.out.println("First set is NOT anagram");
        }
        if (areAnagrams("triangle", "integral")) {
            System.out.println("Second set is anagram");
        }
        else {
            System.out.println("Second set is NOT anagram");
        }

    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        for (int i=0; i<c1.length; i++) {
            if (c1[i] != c2[i]) {
                return false;
            }
        }
        return true;
    }

}
