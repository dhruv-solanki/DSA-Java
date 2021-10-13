package com.dhruvsolanki.Arrays;

import java.util.ArrayList;
import java.util.List;

// Q: Add to Array-Form of Integer
public class AddToArrayForm {
    public static void main(String[] args) {
        int[] num = {1, 2, 0, 0};
        int k = 34;

        List<Integer> arrayForm = new ArrayList<Integer>();
        arrayForm = addToArrayForm(num, k);
    }

    static List<Integer> addToArrayForm(int[] num, int k) {
        int sum = 0;
        for(int i=0; i<num.length; i++) {
            sum += num[i];

            if(i == num.length - 1) {
                continue;
            } else {
                sum = sum * 10;
            }
        }

        List<Integer> arrayForm = new ArrayList<Integer>();
        return arrayForm;
    }
}
