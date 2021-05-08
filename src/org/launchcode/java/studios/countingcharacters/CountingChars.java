package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);
        HashMap<Character, Integer> characterCount = initialize();

        System.out.println ("Enter string: ");
        String sentence = input.nextLine();
        input.close();
        char[] sentenceToChar = sentence.toCharArray();

        counter (sentenceToChar, characterCount);
        display (characterCount);

    }

    static HashMap<Character, Integer> initialize () {

        HashMap<Character, Integer> count = new HashMap<>();
        char bigLetter = 'A';
        char smallLetter = 'a';

        for (; bigLetter != 'Z'+1; bigLetter++ ) {

            count.put(bigLetter, 0);

        }

        for (; smallLetter != 'z'+1; smallLetter++ ) {

            count.put(smallLetter, 0);

        }

        return count;

    }

    static void counter (char[] letters, HashMap<Character, Integer> count) {

        for (int i = 0 ; i < letters.length; i++) {

            if (count.containsKey(letters[i])){

                count.put (letters[i], count.get(letters[i])+1);

            }

        }

    }

    static void display (HashMap<Character, Integer> count) {

        for (Map.Entry<Character, Integer> characters: count.entrySet()) {

            if (characters.getValue() != 0) {

                System.out.println (characters.getKey() + ": " + characters.getValue());

            }

        }

    }

}