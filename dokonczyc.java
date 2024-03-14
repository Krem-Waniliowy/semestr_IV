class Zajecia {
    
    // klasa punkt
    public static class Point {
        public double x;
        public double y;
        Point(double a, double b) {
            this.x = a;
            this.y = b;
        }
        void wypisz() {
            System.out.println("X = " + this.x);
            System.out.println("Y = " + this.y);
        }
    }
    
    // klasa wektor
    public static class Vector extends Point {
        public double z;
        Vector(double a, double b, double c) {
            super(a, b);
            this.z = c;
        }
        void wypisz() {
            System.out.println("X = " + this.x);
            System.out.println("Y = " + this.y);
            System.out.println("Z = " + this.z);
        }
        
        // metoda liczaca dlugosc wektora
        void dlugosc() {
            System.out.println(Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2) + Math.pow(this.z, 2)));
        }
        // metoda liczaca cos innego tez pod pierwiastkiem
        void odleglosc(Vector v2) {
            
            double a = Math.pow(this.x - v2.x, 2);
            double b = Math.pow(this.y - v2.y, 2);
            double c = Math.pow(this.z - v2.z, 2);
            double wynik = Math.sqrt(a + b + c);
        
            System.out.println(wynik);
        }
        
        // dodawanie wektorow
        public Vector add(Vector v2) {
            double a = this.x + v2.x;
            double b = this.y + v2.y;
            double c = this.z + v2.z;
            
            Vector nowy = new Vector(a, b, c);
            
            return nowy;
        }
        // metoda mul
        
    }
    
    public static void main(String[] args) {
        
        Point NewPoint = new Point(12, 0);
        Vector v1 = new Vector(13, 1, 11);
        Vector v2 = new Vector(23, 10, -11);
        NewPoint.wypisz();
        v1.wypisz();
        v1.dlugosc();
        v1.odleglosc(v2);
        Vector v3 = v1.add(v2);
        v3.wypisz();
    }
}
