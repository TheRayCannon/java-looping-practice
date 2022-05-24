class App {
  public static void main(String args[]) {
    App.forLoop();
    App.whileLoop();
    App.doWhileLoop();
  }

  static String message = "I love java";
  static String lunchParty = "Launch!";

  private static void forLoop() {
    for (int foo = 0; foo < 5; foo++) {
      System.out.println("using for loop: " + message);
    }
  }

  private static void whileLoop() {
    int i = 0;
    while (i < 5) {
      System.out.println("using while loop " + message);
      i++;
    }
  }

  private static void doWhileLoop() {
    int i = 10;
    do {
      System.out.println("using do while : " + i);
      i--;
      if (i == 0) {
        System.out.println(lunchParty);
      }
    } while (i > 0);

  }
}
