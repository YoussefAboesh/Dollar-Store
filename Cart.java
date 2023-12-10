import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
    public Departments department;
    public Check check = new Check();
    private ArrayList<String> items;

    public Cart() {
        this.items = new ArrayList<>();
    }

    public Check getCheck() {
        return check;
    }

    public void addToCart(String product) {
        items.add(product);
        System.out.println(product + " added to cart.");
        offerOptions();
    }

    public void removeFromCart(String product) {
        this.department = new Departments();
        System.out.println(product + " is not in cart.");
        department.selectdep();
    }

    private void confirm() {
        check.inputData();
    }

    private void changeproduct() {
        this.department = new Departments();
        System.out.println("waiting..");
        department.selectdep();
    }

    public void offerOptions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an option:");
        System.out.println("1. Confirm Purchase");
        System.out.println("2. change product");

        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                confirm();
                break;
            case 2:
                changeproduct();
                break;
            default:
                System.out.println("Invalid choice. Please choose a valid option.");
                offerOptions();
        }

        scanner.close();
        return;
    }
}
