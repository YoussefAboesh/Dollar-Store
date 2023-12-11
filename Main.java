import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    User u = new User();
    Departments dept = new Departments();
    Scanner scanner = new Scanner(System.in);
    u.chooseOne(scanner, dept);
    scanner.close();
  }
}
