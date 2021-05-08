package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main (String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print ("Enter word length: ");
        int wordLength = input.nextInt();

        input.close();

        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(1.0);
        numbers.add(2.0);
        numbers.add(4.0);
        numbers.add(6.0);
        numbers.add(16.0);
        numbers.add(30.0);
        numbers.add(44.0);
        numbers.add(128.0);
        numbers.add(355.0);
        numbers.add(59.0);

        System.out.println (sum(numbers));

        ArrayList<String> words = new ArrayList<>();

        words.add("Monkey");
        words.add("Lions");
        words.add("Tiger");
        words.add("Bears");
        words.add("Test");

        ArrayList<String> fiveLetterWords = fiveLetter(words, wordLength);

        for (String word: fiveLetterWords) {

            System.out.println(word);

        }



    }

    static double sum (ArrayList<Double> numberArray) {

        double numberSum = 0;

        for (double number: numberArray) {

            if (number%2 == 0) {

                numberSum += number;

            }

        }

        return numberSum;

    }

    static ArrayList<String> fiveLetter (ArrayList<String> stringArray, int length) {

        ArrayList<String> five = new ArrayList<>();

        for (String word: stringArray) {

            if (word.length() == length) {

                five.add(word);

            }

        }

        return five;

    }

}
