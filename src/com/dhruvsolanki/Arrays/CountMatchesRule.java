package com.dhruvsolanki.Arrays;

import java.util.ArrayList;
import java.util.List;

// Q: Count Items Matching a Rule
// LeetCode
public class CountMatchesRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<List<String>>();
        ArrayList<String> item1 = new ArrayList<String>();
        item1.add("phone");
        item1.add("blue");
        item1.add("pixel");

        ArrayList<String> item2 = new ArrayList<String>();
        item2.add("computer");
        item2.add("silver");
        item2.add("lenovo");

        ArrayList<String> item3 = new ArrayList<String>();
        item3.add("phone");
        item3.add("gold");
        item3.add("iphone");

        items.add(item1);
        items.add(item2);
        items.add(item3);

        String ruleKey = "type";
        String ruleValue = "phone";

        int count = countMatches(items, ruleKey, ruleValue);
        System.out.println("Count:" + count);
    }

    static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
//        for(int i=0; i<items.size(); i++) {
//            if(ruleKey == "type") {
//                if(items.get(i).get(0) == ruleValue) {
//                    count++;
//                }
//            } else if(ruleKey == "color") {
//                if(items.get(i).get(1) == ruleValue) {
//                    count++;
//                }
//            } else if(ruleKey == "name") {
//                if(items.get(i).get(2) == ruleValue) {
//                    count++;
//                }
//            }
//        }
        for(List item : items) {
            if(ruleKey.equals("type")) {
                if(ruleValue.equals(item.get(0))) {
                    count++;
                }
            } else if(ruleKey.equals("color")) {
                if(ruleValue.equals(item.get(1))) {
                    count++;
                }
            } else {
                if(ruleValue.equals(item.get(2))) {
                    count++;
                }
            }
        }

        return count;
    }
}
