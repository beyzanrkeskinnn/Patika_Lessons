import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Metninizi giriniz : ");
        String text = scan.nextLine();
        String mostUsedWord = FindTheMostUsedWord(text);
        System.out.println("En çok geçen kelime : " + mostUsedWord);

    }

    public static String FindTheMostUsedWord(String text) {
        //split text into words
        String[] words = text.split(" ");
        HashMap<String, Integer> wordFrequencies = new HashMap<>();

        //calculate the frequency of each word
        for (String word : words) {
            word = word.replaceAll("[^a-zA-Z]", "").toLowerCase(); //convert letters to lowercase characters
            wordFrequencies.put(word, wordFrequencies.getOrDefault(word, 0) + 1); //there is a word, increase the counter by 1
        }

        // find the most occurring word
        String mostWords = null;
        int mostUsedWordCount = 0;
        for (Map.Entry<String, Integer> entry : wordFrequencies.entrySet()) {
            if (entry.getValue() > mostUsedWordCount) {
                mostWords = entry.getKey();
                mostUsedWordCount = entry.getValue();
            }
        }
        return mostWords;
    }
}
  