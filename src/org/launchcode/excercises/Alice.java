package org.launchcode.excercises;

import java.util.Scanner;

public class Alice {
    public static void main(String[] args) {
        String alice = "Alice was beginning to get very tired of sitting by her sister on the bank";
        Scanner input = new Scanner(System.in);
        System.out.println("Search for:");
        String word = input.next().toLowerCase();
        int wordIndex = alice.indexOf(word.toLowerCase());
        int wordLength = word.length();
        if (alice.toLowerCase().contains(word)) {
            System.out.println(
                    "Word Found. Length: " + wordLength + " Located at index: " + wordIndex);
            String removeWord = alice.substring(0, wordIndex - 1).concat(alice.substring(wordIndex + wordLength));
            System.out.println(removeWord);
        } else {
            System.out.println("Word Not Found");
        }
        input.close();
    }
}
