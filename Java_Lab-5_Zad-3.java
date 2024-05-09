import java.util.Arrays;

public class Main {
  
  public static void main(String[] args) {

    var dni = new String[] {"Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota", "Niedziela"};

    Arrays.sort(dni, (a, b) -> Integer.compare(a.length(), b.length()));

    for (String dzien : dni) {
      System.out.println(dzien);
      System.out.println("Ilość znaków w ciągu: " + dzien.length() + "\n");
    }
  }
}
