import java.util.Arrays;
import java.util.Scanner;

public class r {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String input = scan.nextLine();

    // Split the input string into words
    String[] words = input.split("\\s+");


    // Reverse each word
    for (int i = 0; i < words.length; i++) {
      char[] charArray = words[i].toCharArray();
      int left = 0;
      int right = charArray.length - 1;
      while (left < right) {
        char temp = charArray[left];
        charArray[left] = charArray[right];
        charArray[right] = temp;
        left++;
        right--;
      }
      words[i] = new String(charArray);
    }
    String output = String.join(" ", words);
    System.out.println("Reversed string: " + output);
  }
}