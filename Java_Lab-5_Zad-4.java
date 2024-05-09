import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
  
  public static void main(String[] args) {

    var miasta = Arrays.asList("Kraków", "Gdynia", "Warszawa", "Wrocław", "Poznań", "Katowice");

    var filtrowane_miasta = miasta.stream().filter(miasto -> miasto.length() == 6).collect(Collectors.toList());

    // Zmiana z tego kodu na powyższy
    // long counter = 0;
    // for (String miasto : miasta) {
    //     if (miasto.length() == 6) {
    //         counter++;
    //     }
    // }
    
    for (String miasto : filtrowane_miasta) {
      System.out.println(miasto);
    }
  }
}
