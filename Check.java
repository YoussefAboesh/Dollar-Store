import java.util.Scanner;

public class Check {

    private String city;
    private String address;
    private String phone;
    private String paymentMethod;
    private String email;
    private String password;
    private String cardnum;
    private String name;

    public Check() {
        this.city = "";
        this.address = "";
        this.phone = "";
        this.paymentMethod = "";
        this.email = "";
        this.password = "";
        this.cardnum = "";
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCardnum(String cardnum) {
        this.cardnum = cardnum;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getCardnum() {
        return cardnum;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void printReceipt() {
        System.out.println("\nReceipt");
        System.out.println("Thank you MR." + name);
        System.out.println("City: " + city);
        System.out.println("Address: " + address);
        System.out.println("phone number: " + phone);
        System.out.println("Payment Method: " + paymentMethod);
    }

    public void inputData() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your city: ");
        this.setCity(scanner.nextLine());

        System.out.println("Enter your address: ");
        this.setAddress(scanner.nextLine());

        System.out.println("Enter your phone: ");
        this.setphone(scanner.nextLine());

        System.out.println("Choose payment method: ");
        System.out.println("1. Cash");
        System.out.println("2. PayPal");
        System.out.println("3. visa");
        int choice = scanner.nextInt();
        scanner.nextLine();

        switch (choice) {
            case 1:
                this.setPaymentMethod("Cash");
                break;
            case 2:
                this.setPaymentMethod("PayPal\n");
                System.out.println("Email: ");
                this.setEmail(scanner.nextLine());
                System.out.println("Password: ");
                this.setPassword(scanner.nextLine());
                break;
            case 3:
                this.setPaymentMethod("visa");
                System.out.println("CARD NUM: ");
                this.setCardnum(scanner.nextLine());
                break;
            default:
                System.out.println("Invalid choice. Defaulting to Cash.");
                this.setPaymentMethod("Cash");
                break;
        }

        scanner.close();
        printReceipt();
        System.exit(0);
    }
}
