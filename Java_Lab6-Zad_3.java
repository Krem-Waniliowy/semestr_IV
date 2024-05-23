import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        double liczba = 0;

        while (true) {
            try {
                // Wstęp
                System.out.println("Podaj liczbę: ");
                liczba = inp.nextDouble();
                double sqrtl = Math.sqrt(liczba);
                System.out.println("Pierwiastek z podanej liczby to: " + sqrtl);

                // część pierwsza
                if (liczba < 0) {
                    throw new IllegalArgumentException("Podałeś/aś ujemną liczbę!");
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Wprowadzono nieprawidłową wartość. Spróbuj ponownie.");
                inp.next(); // Wyczyść bufor, aby umożliwić użytkownikowi ponowne wprowadzenie danych
            } catch (Exception e) {
                System.out.println("Wystąpił błąd: " + e.getMessage());
                break;
            }
        }
    }
}
