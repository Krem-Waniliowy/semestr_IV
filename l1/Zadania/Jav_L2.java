import java.util.Random;
import java.util.Scanner;

public class main {
    
    // funkcja quicksort
    public static int quicksort(int tab[], int left, int right, int max_i) {

        if(left < right) {
        int d = divide(tab, left, right, max_i);

        // Działamy na 2 podtablicach, z lewej i prawej strony elementu oznaczonego
        // jako d, czyli j zwracanago przez funkcję divide
        // Trochę jak na zasadzie binary search gdzie mamy lewą i prawą stronę od wskazanego elementu
        // tylko tym razem element wskazywany jest przez indeks zwrócony przez funkcję divide
        quicksort(tab, left, d - 1);
        quicksort(tab, d + 1, right);
        }
        return tab;
    }
    
    // funkcja do podziału tablicy i zamiany elementów
    public static int divide(int tab[], int left, int right, int max_i) {

        Random r = new Random();
        int low = 0;
        int high = max_i;
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

        int size = 10;
        int[] tab = {4, -12, 44, 10, -5, 0, -2, 123, 0, 45};

        for (int i = 0; i < size; i++) {
            System.out.print(tab[i] + " ");
        }
        
        return 0;
    }
}
