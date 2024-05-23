public class Main {

  public static class TooFarException extends Exception {

    public TooFarException() {
      super("Jesteś za daleko!");
    }
  }

  public static void main(String[] args) {

    try {
      int distance = 150;
      if (distance > 100) {
        throw new TooFarException();
      }
    } catch (Exception e) {
      System.out.println("Wystąpił błąd: " + e.getMessage());
    }
  }
}
