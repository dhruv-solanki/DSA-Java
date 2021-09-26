package com.dhruvsolanki.Arrays;

// Q:  Check if the Sentence Is Pangram
// Pangram: if every letter of English alphabet appears at least one then that String is said Pangram.
// LeetCode
public class Pangram {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        
        boolean isPangram = checkIfPangram(sentence);
        System.out.println(isPangram);
    }

    static boolean checkIfPangram(String sen) {
        boolean isPangram = false;

        for(int i=97; i<123; i++) {
            char temp = (char)i;
            if( sen.indexOf(temp) != -1 ) {
                isPangram = true;
            } else {
                isPangram = false;
                break;
            }
        }

        return isPangram;
    }
}
