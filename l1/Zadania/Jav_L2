import java.util.Random;
import java.util.Scanner;

public class main {

    public static int quicksort(int tab) {


        return tab;
    }

    // funkcja do podziału tablicy i zamiany elementów
    public static int divide(int tab[], int size, int left, int right) {

        Random r = new Random();
        int low = 10;
        int high = 100;
        int random_num = r.nextInt(high-low) + low;
        int pivot = tab[random_num];

        int temp = 0;

        int i = left;
        int j = right;

        while (true) {
            while (tab[i] < tab[pivot]) {
                i++;
            }
            while (tab[j] < tab[pivot]) {
                j--;
            }
            if (i<j) {
                temp = tab[i];
                tab[i] = tab[j];
                tab[j] = temp;
            }
            if (i>= j) {
                break;
            }
        }

        return j;
    }

    public static void main (String[] args) {
//        System.out.println("Hello!");

//        double a = 2.0;
//        double b = 3.0;

        // zadanie nr.1
//        System.out.println(Math.pow(a, b));
//        System.out.println(Math.pow(b, a));
//        System.out.println(Math.sqrt(a + b));

        // zadanie nr.2
//        int c = 1/0;
//        double d = 1.0/0.0;
//        double e = "xyz"; // co zrobić żeby dostać NaN -> 'Not a Number'

//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);

        // zadanie nr.3
//        boolean check = true;
//        if (check) {
//            check = false;
//            System.out.println("Check zostało zamienione na 'False', patrz -> check: " + check);
//        }

        // zadanie nr.4
//        Scanner in = new Scanner(System.in);
//        String f = in.nextLine();
//        int g = in.nextInt();

//        System.out.println(f);
//        System.out.println(g);

        // zadanie nr.5
        double a = 1;
        double b = 0;
        double c = 4;

        double delta = (Math.pow(b, 2) - (4*a*c));
        if (delta < 0) {
            System.out.println("Delta jest mniejsza od 0! Brak rozwiązań!");

        }
        else {
            double delta_sqrt = Math.sqrt(delta);

            double x_1 = ((-b) - delta_sqrt)/(2*a);
            double x_2 = ((-b) + delta_sqrt)/(2*a);

            System.out.println(x_1);
            System.out.println(x_2);
        }



    }
}
