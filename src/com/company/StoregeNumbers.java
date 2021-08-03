package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;


public class StoregeNumbers {
    static Random r = new Random();
    private static Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    private static int[] storegeNumber = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};


    public static int getStoregeNumber() {
        return storegeNumber[r.nextInt(storegeNumber.length)];
    }


}
