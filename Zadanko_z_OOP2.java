import java.util.Scanner;

public class exercise {

    public static class Pet {

        // Zmienne
        String name;
        int hunger;
        int tiredness;

        // Konstruktor
        public Pet(String n, int h, int t) {
            if (n.length() < 3) {
                throw new IllegalArgumentException("Name must be at least 3 characters long!");
            }
            name = n;
            hunger = h;
            tiredness = t;
        }

        // Metoda zwiększająca głód i zmęczenie
        public void passage_of_time() {
            this.hunger++;
            this.tiredness++;
        }

        // Metoda określająca humor zwierzaka
        public String mood() {
            if (this.hunger + this.tiredness < 5) {
                return "szczęśliwy";
            }
            if ((this.hunger + this.tiredness) >= 5 && (this.hunger + this.tiredness) <= 10) {
                return "szczęśliwy";
            }
            if ((this.hunger + this.tiredness) >= 11 && (this.hunger + this.tiredness) <= 15) {
                return "szczęśliwy";
            }
            else {
                return "wściekły";
            }
        }

        // Metoda informująca o nastroju zwierzaka
        public void talk() {
            this.passage_of_time();
            System.out.println("Jestem " + this.mood());
        }

        // Metoda zmniejszająca głód zwierzaka
        public void eat(int food) {
            this.passage_of_time();
            this.hunger = this.hunger - food;
            if (this.hunger < 0) {
                this.hunger = 0;
            }
        }

        // Metoda zmniejszająca zmęczenie zwierzaka
        public void play(int fun) {
            this.passage_of_time();
            this.tiredness = this.tiredness - fun;
            if (this.tiredness < 0) {
                this.tiredness = 0;
            }
        }

        // Reprezentacja zwierzaka w konsoli
        public void print_pet() {
            System.out.println("Imię: " + this.name);
            System.out.println("Głod: " + this.hunger);
            System.out.println("Zmęczenie: " + this.tiredness);
        }
    }

    public static void main(String[] args) {


        // Stworzenie zwierzaka i przechwytywanie błędów
        try {
            Scanner inp = new Scanner(System.in);
            int ammount = 0;
            Pet zwierzak = new Pet("Tofik", 0, 0);

            // Pętla na potrzeby działania programu
            boolean isTrue = true;
            while (isTrue) {

                System.out.print("1 - Nakarm\n2 - Pobaw się\n3 - Zapytaj o nastrój\n4 - Pokazuje dokładne statystyki obiektu\n5 - Zakończ interakcję\nJakie działanie chesz wykonać? ");
                String choice = inp.nextLine();
                switch (choice) {
                    case "1":
                        System.out.println("Podaj ilość jedzenia (liczba całkowita dodatnia niezerowa, podanie czegokolwiek innego używa wartości domyślnej '4'):");
                        ammount = inp.nextInt();
                        inp.nextLine();
                        if (ammount < 0) {
                            zwierzak.eat(4);
                            System.out.println('\n');
                        }
                        else {
                            zwierzak.eat(ammount);
                            System.out.println('\n');
                        }
                        break;
                    case "2":
                        System.out.println("Podaj ilość zabawy (liczba całkowita dodatnia niezerowa, podanie czegokolwiek innego używa wartości domyślnej '4'):");
                        ammount = inp.nextInt();
                        inp.nextLine();
                        if (ammount < 0) {
                            zwierzak.play(4);
                            System.out.println('\n');
                        }
                        else {
                            zwierzak.play(ammount);
                            System.out.println('\n');
                        }
                        break;
                    case "3":
                        zwierzak.talk();
                        System.out.println('\n');
                        break;
                    case "4":
                        zwierzak.print_pet();
                        System.out.println('\n');
                        break;
                    case "5":
                        isTrue = false;
                        break;
                    default:
                        throw new IllegalArgumentException("Must be only characters 1 to 5!");
                }
            }
        }
        catch (IllegalAccessError e) {
            System.out.println("Error " + e.getMessage());
        }
    }
}
