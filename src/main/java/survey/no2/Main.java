package survey.no2;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String noPeriod = str.substring(0, str.length() - 1);
        String[] words = noPeriod.split(" ");
        int wordCount = words.length;
        int wordLengthSum = 0;
        for (String word : words) {
            if (word.startsWith("{")) {
                String optionString = word.substring(1, word.length() - 1);
                String[] options = optionString.split(",");
                int maxLength = Stream.of(options).map(s -> s.length()).max(Comparator.naturalOrder()).orElse(0);
                wordLengthSum += maxLength;
                continue;
            }
            wordLengthSum += word.length();
        }
        System.out.println((double) wordLengthSum / wordCount);
    }

}
