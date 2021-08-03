package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class StoregeSings {
    static Random r = new Random();
    private static Map<Character, Integer> mapCaps = new HashMap<Character, Integer>();
    private static Map<Character, Integer> mapUppercase = new HashMap<Character, Integer>();

    private static char[] storegeSingsCaps = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
            'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    private static char[] storegeSingsUppercase = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
            'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public static char getStoregeSingsCaps() {
       return storegeSingsCaps[r.nextInt(storegeSingsCaps.length)];
    }

    public static char getGetStoregeSingsUppercase() {
        return storegeSingsUppercase[r.nextInt(storegeSingsCaps.length)];
    }

}
