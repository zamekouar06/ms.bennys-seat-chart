
   import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    int[] seats = { 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30 };

    String[] names = new String[15];

    for (int i = 0; i < names.length; i++) {
      System.out.println(names[i]);

      Scanner scan = new Scanner(System.in);

      System.out.println("what is your name?");
      String name = scan.next();
    }
  }
}