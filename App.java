class App {
  public static void main(String args[]) {
    App.forLoop();
    App.whileLoop();
    App.doWhileLoop();
  }

  static String message = "I love java";

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
    int i = 0;
    do {
      System.out.println("using do while : " + message);
      i++;
    } while (i < 5);
  }
}
