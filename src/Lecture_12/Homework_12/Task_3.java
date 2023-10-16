package Lecture_12.Homework_12;

import java.util.*;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter your text");
        String userInput = sn.nextLine().replaceAll("[^a-zA-Z]", "").toUpperCase();

        Map<Character, Integer> mostCommonLetters = new HashMap<>();

        for (char c : userInput.toCharArray()) {
            mostCommonLetters.put(c, mostCommonLetters.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedMostCommonLettersList = new ArrayList<>(mostCommonLetters.entrySet());

        Comparator<Map.Entry<Character, Integer>> entryComparator = new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> e1, Map.Entry<Character, Integer> e2) {
                return e2.getValue().compareTo(e1.getValue());
            }
        };

        Collections.sort(sortedMostCommonLettersList, entryComparator);

        System.out.println("Most common letters:");
        for (Map.Entry<Character, Integer> entry : sortedMostCommonLettersList) {
            char letter = entry.getKey();
            int frequency = entry.getValue();
            int percentageOfOccurrences = (int) ((double)frequency / userInput.length() * 100);
            StringBuilder percentageOfOccurrencesBuilder = new StringBuilder();

            for (int i = 0; i < percentageOfOccurrences; i++) {
                percentageOfOccurrencesBuilder.append("#");
            }

            String outputPercentageOfOccurrences = percentageOfOccurrencesBuilder.toString();

            System.out.printf("%c: %d %s%n", letter, frequency, outputPercentageOfOccurrences);
        }
    }
}
