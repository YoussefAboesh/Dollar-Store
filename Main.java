import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    try {
      var fileStream = new FileOutputStream("./output-file.txt", true);
      System.setOut(new PrintStream(fileStream));
      System.out.println("------------------------------------------");
    } catch (Exception e) {
      System.err.println(e);
    }
    User u = new User();
    Departments dept = new Departments();
    Scanner scanner = new Scanner(System.in);
    u.chooseOne(scanner, dept);
    scanner.close();
  }
}
