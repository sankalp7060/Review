import java.util.Scanner;

public class LongestWordLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "I love programming language";

        String[] words = s.split("\\s+"); 
        int maxLength = 0;
        String longest = ""; 

        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
                longest = word; 
            }
        }
        System.out.println(longest);
    }
}
