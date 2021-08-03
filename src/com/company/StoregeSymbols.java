package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class StoregeSymbols {
    static Random r = new Random();
    private static Map<Character, Integer> mapCaps = new HashMap<Character, Integer>();

    private static char[] storegeSymbols = new char[]{'!', '@', '#', '$', '%', '^', '&', '*'};

    public static char getStoregeSymbols() {
        return storegeSymbols[r.nextInt(storegeSymbols.length)];

    }

}

