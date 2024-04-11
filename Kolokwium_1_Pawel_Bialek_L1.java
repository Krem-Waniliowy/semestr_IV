class Zadanko {
    // 1. klasa punkt
    public static class Point {
        // zmienne
        double x;
        double y;
        
        // konstruktor
        Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
    
    // 2.a. klasa trojkat
    public static class Triangle {
        // zmienne
        Point p1;
        Point p2;
        Point p3;
    
        // 2.b. konstruktor
        Triangle(Point a, Point b, Point c) {
            this.p1 = a;
            this.p2 = b;
            this.p3 = c;
        }
        
        // 2.c. bok
        public static double bok(Point a, Point b) {
            double xx = a.x - b.x;
            double yy = a.y - b.y;
            double bok = Math.sqrt(Math.pow(xx, 2) + Math.pow(yy, 2));
            
            return bok;
        }
        
        // 2.d. kosinus kata
        public static double kosinus(double a, double b, double c) {
            double kos = (Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 2)) / (2 * a * b);
            
            return kos;
        }
        
        // 2.e. czy jest prostokatny
        // zakladamy ze a oraz b (pierwsze 2 paramatry) przedstawiaja przyprostokatne a c jest przeciwprostokatna
        public static void prostokatny(double a, double b, double c) {
            if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2)) {
                System.out.println("Trojkat o podanych bokach jest prostokatny!");
            }
            else {
                System.out.println("Trojkat o podanych bokach nie jest prostokatny!");
            }
        }
    }
    
    public static void main(String[] args) {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(3, 0);
        Point p3 = new Point(0, 4);
        
        Triangle t = new Triangle(p1, p2, p3);
        double bok_a = Triangle.bok(p1, p2);
        double bok_b = Triangle.bok(p2, p3);
        double bok_c = Triangle.bok(p3, p1);
        
        System.out.println("Bok a = " + bok_a);
        System.out.println("Bok b = " + bok_b);
        System.out.println("Bok c = " + bok_c);
        
        double kos = Triangle.kosinus(bok_a, bok_b, bok_c);
        System.out.println("Kosinus kata miedzy bokami a i b = " + kos);
        t.prostokatny(bok_a, bok_b, bok_c);
        

    }
}
