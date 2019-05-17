package com.onmyweb.isomorphic;

import java.util.HashMap;
import java.util.Map;

public class Isomorphic {
    private boolean isIsomorphic(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>(0);

        for (int i=0; i<str1.length(); i++) {
            Character c1 = str1.charAt(i);
            Character c2 = str2.charAt(i);
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;
                }
            }
            else {
                if (map.containsValue(c2)) {
                    // c2 is already mapped to some character in S1, it cannot be mapped again.
                    return false;
                }
                else {
                    map.put(c1, c2);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Isomorphic isomorphic = new Isomorphic();
        System.out.println("turtle and tletur are Isomorhic: " + isomorphic.isIsomorphic("turtle", "tletur"));
        System.out.println("Paper and Title are Isomorhic: " + isomorphic.isIsomorphic("Paper", "Title"));
        System.out.println("Add and Egg are Isomorhic: " + isomorphic.isIsomorphic("Add", "Egg"));
        System.out.println("Foo and Bar are Isomorhic: " + isomorphic.isIsomorphic("Foo", "Bar"));
        System.out.println("br and rr are Isomorhic: " + isomorphic.isIsomorphic("br", "rr"));
    }
}
