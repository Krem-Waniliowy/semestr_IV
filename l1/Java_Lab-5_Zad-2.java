import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static class ImTab<T> {
        private List<T> list;

        // Konstruktor w oparciu o varargs
        @SafeVarargs
        public ImTab(T... elements) {
            this.list = new ArrayList<>(Arrays.asList(elements));
        }

        // Metoda zwracająca element na konkretnej pozycji
        public T getElement(int index) {
            if (index >= 0 && index < list.size()) {
                return list.get(index);
            } else {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
        }

        // Metoda zwracająca rozmiar listy
        public int getSize() {
            return list.size();
        }
    }

    public static void main(String[] args) {
        ImTab<String> stringTab = new ImTab<>("One", "Two", "Three", "Four");

        for (int i = 0; i < stringTab.getSize(); i++) {
            System.out.println(stringTab.getElement(i));
        }

        ImTab<Integer> integerTab = new ImTab<>(1, 2, 3, 4);

        for (int i = 0; i < integerTab.getSize(); i++) {
            System.out.println(integerTab.getElement(i));
        }
    }
}
