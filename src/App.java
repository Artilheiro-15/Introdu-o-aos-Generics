import java.util.Locale;
import java.util.Scanner;
import services.PrintService;

public class App {

  public static void main(String[] args) throws Exception {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
    System.out.println("==================================");

    // PrintService ps = new PrintService();

    PrintService<Integer> ps = new PrintService<>();

    System.out.print("How many values? ");
    int n = sc.nextInt();

    for (int i = 0; i < n; i++) {
      Integer value = sc.nextInt();
      ps.addValue(value);
    }

    ps.print();
    Integer x = ps.first();
    System.out.println("First: " + ps.first());

    System.out.println("================FIM==================");
    sc.close();
  }
}
