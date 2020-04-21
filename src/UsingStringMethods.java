import java.util.Scanner;

public class UsingStringMethods {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word, substring;
        int wordLength, endIdx;

        System.out.println("Enter a word.");
        word = input.nextLine();
        substring = word;
        wordLength = word.length();

        System.out.printf("Enter an ending point from 0 to %d.\n", wordLength);
        endIdx = input.nextInt();

        if (endIdx <= wordLength) {
            substring = word.substring(0, endIdx);
            System.out.println(substring);
        } else {
            System.out.println("Index is larger than length.");
        }

        System.out.printf("The length of %s is: %d\n", word, wordLength);
        System.out.printf("The substring from 0 to %d is: %s", endIdx, substring);

    }

}