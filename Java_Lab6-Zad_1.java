import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    try {
      // Tworzymy obiekt scanner
      Scanner inp = new Scanner(System.in);

      // Komunikat o podaniu godziny i pobranie danych od użytkownika
      System.out.println("Podaj godzinę (liczba w zakresie0-24): ");
      int godzina = inp.nextInt();

      // Wyświetlenie godziny
      System.out.println("Podano godzinę: " + godzina);
    
      // W przypadku niezgodności wyrzucamy błąd
      if (godzina < 0 || godzina > 24) {
        throw new IllegalArgumentException("Błąd - podano wartość dla godziny z poza przedziału 0-24!");
      }
    }
    catch (Exception e) {
      System.out.println("Wystąpił błąd: " + e.getMessage());
    }
    // blok finally
    finally {
      System.out.println("Koniec programu. Życzę miłego dnia!");
    }    
  }
}
