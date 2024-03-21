class Zajecia {
    
    // klasa punkt
    public class Vector {
        // talibca na wspolrzedne x, y, z
        public double[] arr = new double[3];

        // konstruktor
        Vector(double x, double y, double z) {
            // przypisujemy przekazane w parametrach wartosci do miejsc tablicy
            this.arr[0] = x;
            this.arr[1] = y;
            this.arr[2] = z;
        }

        // 1. metoda wypisujaca wektor
        public void wypisz() {
            System.out.println("[" + this.arr[0] + ", " + this.arr[1] + ", " + this.arr[2] + "]");
        }

        // 2. metoda zwracajaca dlugosc wektora
        public double lenght() {
            return Math.sqrt(Math.pow(this.arr[0], 2) + Math.pow(this.arr[1], 2) + Math.pow(this.arr[2], 2));
        }

        // 3. metoda zwracajaca roznice miedzy dwoma wektorami jako trzeci(nowy) wektor
        public Vector sub(Vector other) {
            double x = this.arr[0] - other.arr[0];
            double y = this.arr[1] - other.arr[1];
            double z = this.arr[2] - other.arr[2];

            Vector nowy = new Vector(x, y, z);
            return nowy;
        }
    }
    
    public static void main(String[] args) {

        // tworzymy wektory v1 oraz v2
        Vector v1 = new Vector(12, 0, -12);
        Vector v2 = new Vector(5, 5, 5);

        // metoda wypisz()
        System.out.println("Wektor v1: ");
        v1.wypisz();
        System.out.println("Wektor v1: ");
        v2.wypisz();
        System.out.println("\n");
        
        // metoda lenght()
        System.out.println("Dlugosc wektora v1: " + v1.lenght());
        System.out.println("Dlugosc wektora v2: " + v2.lenght());
        System.out.println("\n");
        
        // metoda sub()
        Vector v3 = v1.sub(v2);
        System.out.println("Wektor v3: ");
        v3.wypisz();
        System.out.println("Dlugosc wektora v3: " + v3.lenght());
    }
}
