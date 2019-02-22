package com.codecool.dynamicArrayDojo;

import java.util.Arrays;

// put your code here!
public class DynamicIntArray {

    private int[] staticArray;

    public DynamicIntArray() {
        staticArray = new int[0];
    }

    public DynamicIntArray(int length) {
        staticArray = new int[length];
    }

    @Override
    public String toString() {
        return Arrays.toString(staticArray).replace("[", " ").replace("]", "").replace(",", "");
    }

    public void add(int newInt) {
        int[] result = new int[staticArray.length + 1];
        System.arraycopy( staticArray, 0, result, 0, staticArray.length );
        result[staticArray.length] = newInt;
        staticArray = result;
    }

    public void remove(int removeIndex) {
        int[] result = new int[staticArray.length - 1];
        int counter = 0;
        for (int i = 0; i < staticArray.length; i++) {
            if(i != removeIndex) {
                result[counter] = staticArray[i];
                counter ++;
            }
        }
        staticArray = result;
    }

    public void insert(int index, int newInt) {
        int[] result = new int[staticArray.length + 1];
        if(index < staticArray.length) {
            for (int i = 0; i < index; i++) {
                result[i] = staticArray[i];
            }
            result[index] = newInt;
            for (int i = index; i < staticArray.length; i++) {
                result[i + 1] = staticArray[i];
            }
        }else{
            System.arraycopy( staticArray, 0, result, 0, staticArray.length );
            result[staticArray.length] = newInt;
        }
        staticArray = result;
    }


}
