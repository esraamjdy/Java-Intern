import java.util.*;
import java.util.Scanner;


public class SimpleWordDictionary {
    public static void main(String[] args) {
        // Initialize the word map
        Map<Character, List<String>> mp = new HashMap<>();
        for (char c='A'; c<='Z'; c++) {
            mp.put(c, new ArrayList<>());
        }
        Scanner scanner= new Scanner(System.in);

        //number of words
        System.out.println("Enter number of words: ");
        int n= scanner.nextInt();

        System.out.println("Enter words: ");

        //add words to the dictionary
        for(int i=0; i<n; i++){
            String s=scanner.next();
            addWord(mp,s);
        }

        //print all words
        System.out.println("All words in the dictionary:");
        printAllWords(mp);

        //print words of a specific letter
        System.out.println("\nWords starting with 'C':");
        printWordsOfLetter(mp,'C');

        System.out.println("\nWords starting with 'B':");
        printWordsOfLetter(mp,'B');

        System.out.println("\nWords starting with 'Z':");
        printWordsOfLetter(mp,'Z');
    }

    private static void addWord(Map<Character, List<String>> wordMap, String s) {
        if (s == null || s.isEmpty()) {
            return;
        }
        char firstChar = Character.toUpperCase(s.charAt(0));
        if (wordMap.containsKey(firstChar)) {
            wordMap.get(firstChar).add(s);
            Collections.sort(wordMap.get(firstChar));
        }
    }

    private static void printAllWords(Map<Character, List<String>> mp) {
        for (char c= 'A'; c<= 'Z'; c++) {
            List<String> words = mp.get(c);
            if (!words.isEmpty()) {
                System.out.println(c+": "+words);
            }
        }
    }

    private static void printWordsOfLetter(Map<Character, List<String>> wordMap, char letter) {
        char c = Character.toUpperCase(letter);
        if (wordMap.containsKey(c)) {
            List<String> words = wordMap.get(c);
            if (!words.isEmpty()) System.out.println(c + ": " + words);
            else System.out.println("No words found for the letter " + c);
        }
        else System.out.println("Invalid letter: "+letter);

    }
}
