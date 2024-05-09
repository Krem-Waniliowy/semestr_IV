import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {

  public static void main(String[] args) {

    // Pobieranie znaku
    System.out.println("Podaj całkowitą liczbę dodatnią: ");
    Scanner s = new Scanner(System.in);
    int start = 0; // You might want to modify this if you want a different starting point
    int end = s.nextInt();

    // Przefiltrowanie liczb
    IntStream.rangeClosed(start, end).filter(num -> num % 2 != 0).forEach(System.out::println);
  }
}
