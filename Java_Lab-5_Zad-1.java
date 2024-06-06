public class Main {

  public static void main(String[] args) {
    Sklep<String, Double> sklep1 = new Sklep<>("Chrupki", 4.99);
    System.out.println("Produkt: " + sklep1.getJeden() + " Cena: " + sklep1.getDwa());

    Sklep<String, Double> sklep2 = new Sklep<>("Opona", 56.49);
    System.out.println("Produkt: " + sklep2.getJeden() + " Cena: " + sklep2.getDwa());
  }

  static class Sklep<A, B> {
    private A jeden;
    private B dwa;

    // konstruktor
    public Sklep(A jeden, B dwa) {
      this.jeden = jeden;
      this.dwa = dwa;
    }

    // getter jeden
    public A getJeden() {
      return jeden;
    }

    // getter dwa
    public B getDwa() {
      return dwa;
    }

    // setter jeden
    public void setJeden(A jeden) {
      this.jeden = jeden;
    }

    // setter dwa
    public void setDwa(B dwa) {
      this.dwa = dwa;
    }
  }
}
