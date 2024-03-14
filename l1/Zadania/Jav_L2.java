import java.util.Random;

public class Main {
    
    public static void quicksort(int tab[], int left, int right) {

        if(left < right) {
            int d = divide(tab, left, right);
            quicksort(tab, left, d - 1);
            quicksort(tab, d + 1, right);
        }
    }
    
    public static int divide(int tab[], int left, int right) {

        Random r = new Random();
        int random_num = r.nextInt(right - left + 1) + left;
        int pivot = tab[random_num];

        int i = left - 1;

        for (int j = left; j < right; j++) {
            if (tab[j] < pivot) {
                i++;
                int temp = tab[i];
                tab[i] = tab[j];
                tab[j] = temp;
            }
        }

        int temp = tab[i + 1];
        tab[i + 1] = tab[right];
        tab[right] = temp;

        return i + 1;
    }

    public static void main (String[] args) {

        int size = 10;
        int[] tab = {4, -12, 44, 10, -5, 0, -2, 123, 0, 45};

        for (int i = 0; i < size; i++) {
            System.out.print(tab[i] + " ");
        }
        System.out.println();

        quicksort(tab, 0, size - 1);

        for (int i = 0; i < size; i++) {
            System.out.print(tab[i] + " ");
        }
    }
}
