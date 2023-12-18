import java.util.Scanner;

public class Clothes {
    Scanner scanner = new Scanner(System.in);

    public int entry;
    public int entry2;
    public int entry3;
    public int entry4;
    public int entry5;
    public int entry6;
    private Cart cart = new Cart();
    public String selectedProduct;

    public Clothes() {
        this.cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public void Category() {
        System.out.println("choose category: ");
        System.out.println(" 1 pants ");
        System.out.println(" 2 tshirts ");
        System.out.println(" 3 shoes ");
        System.out.println(" 4 dresses ");
        System.out.println(" 5 suits ");

        Scanner ss = new Scanner(System.in);
        while (true) {
            try {
                entry = scanner.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error! Please enter a valid number of categories.");
                scanner.nextLine();
            }
        }
        switch (entry) {
            case 1:
                System.out.println("Choose from pants:");
                System.out.println(" 1 blue jeans ");
                System.out.println(" 2 black jeans ");
                System.out.println(" 3 baggy ");
                System.out.println(" 4 shorts");
                while (true) {
                    try {
                        entry2 = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Error! Please enter a valid number of products.");
                        scanner.nextLine();
                    }
                }
                switch (entry2) {
                    case 1:
                        selectedProduct = "blue jeans";
                        System.out.println("[ You Selected blue jeans ]");
                        break;
                    case 2:
                        selectedProduct = "black jeans";
                        System.out.println("[ You Selected black jeans ]");
                        break;
                    case 3:
                        selectedProduct = "baggy";
                        System.out.println("[ You Selected baggy ] ");
                        break;
                    case 4:
                        selectedProduct = "shorts";
                        System.out.println("[ You Selected shorts ] ");
                        break;
                    default:
                        System.out.println("Invalid choice for pants");
                        Category();
                        break;
                }
                break;

            case 2:
                System.out.println("Choose from tshirts:");
                System.out.println(" 1 men's T-shirts ");
                System.out.println(" 2 woman's T-shirts ");
                System.out.println(" 3 pullovers ");
                System.out.println(" 4 oversize T-shirts");
                while (true) {
                    try {
                        entry3 = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Error! Please enter a valid number of products.");
                        scanner.nextLine();
                    }
                }
                switch (entry3) {
                    case 1:
                        selectedProduct = "men's T-shirts";
                        System.out.println("[ You Selected men's T-shirts ]");
                        break;
                    case 2:
                        selectedProduct = "woman's T-shirts";
                        System.out.println("[ You Selected woman's T-shirts ]");
                        break;
                    case 3:
                        selectedProduct = "pullovers";
                        System.out.println("[ You Selected pullovers ] ");
                        break;
                    case 4:
                        selectedProduct = "oversize T-shirts";
                        System.out.println("[ You Selected oversize T-shirts ] ");
                        break;
                    default:
                        System.out.println("Invalid choice for tshirts");
                        Category();
                        break;
                }
                break;
            case 3:
                System.out.println("Choose from shoes:");
                System.out.println(" 1 Nike shoes ");
                System.out.println(" 2 adidas shoes ");
                System.out.println(" 3 classic shoes ");
                System.out.println(" 4 woman's shoes");
                while (true) {
                    try {
                        entry4 = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Error! Please enter a valid number of products.");
                        scanner.nextLine();
                    }
                }
                switch (entry4) {
                    case 1:
                        selectedProduct = "Nike shoes";
                        System.out.println("[ You Selected Nike shoes ]");
                        break;
                    case 2:
                        selectedProduct = "adidas shoes";
                        System.out.println("[ You Selected adidas shoes ]");
                        break;
                    case 3:
                        selectedProduct = "classic shoes";
                        System.out.println("[ You Selected classic shoes ] ");
                        break;
                    case 4:
                        selectedProduct = "woman's shoes";
                        System.out.println("[ You Selected woman's shoes ] ");
                        break;
                    default:
                        System.out.println("Invalid choice for shoes");
                        Category();
                        break;
                }
                break;
            case 4:
                System.out.println("Choose from dresses:");
                System.out.println(" 1 midi Dress ");
                System.out.println(" 2 A-line Dress ");
                System.out.println(" 3 mini Dress ");
                System.out.println(" 4 shorts");
                while (true) {
                    try {
                        entry5 = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Error! Please enter a valid number of products.");
                        scanner.nextLine();
                    }
                }
                switch (entry5) {
                    case 1:
                        selectedProduct = "midi Dress";
                        System.out.println("[ You Selected midi Dress ]");
                        break;
                    case 2:
                        selectedProduct = "A-line Dress";
                        System.out.println("[ You Selected A-line Dress ]");
                        break;
                    case 3:
                        selectedProduct = "mini Dress";
                        System.out.println("[ You Selected mini Dress ] ");
                        break;
                    case 4:
                        selectedProduct = "wrap Dress";
                        System.out.println("[ You Selected wrap Dress ] ");
                        break;
                    default:
                        System.out.println("Invalid choice for dresses");
                        Category();
                        break;
                }
                break;
            case 5:
                System.out.println("Choose from suits:");
                System.out.println(" 1 Two-Button-suit ");
                System.out.println(" 2 black suit ");
                System.out.println(" 3 Double-Breasted-suit ");
                System.out.println(" 4 Dinner suit");
                while (true) {
                    try {
                        entry6 = scanner.nextInt();
                        break;
                    } catch (Exception e) {
                        System.out.println("Error! Please enter a valid number of products.");
                        scanner.nextLine();
                    }
                }
                switch (entry6) {
                    case 1:
                        selectedProduct = "Two-Button-suit";
                        System.out.println("[ You Selected Two-Button-suit ]");
                        break;
                    case 2:
                        selectedProduct = "black suit";
                        System.out.println("[ You Selected black suit ]");
                        break;
                    case 3:
                        selectedProduct = "Double-Breasted-suit";
                        System.out.println("[ You Selected Double-Breasted-suit ] ");
                        break;
                    case 4:
                        selectedProduct = "Dinner suit";
                        System.out.println("[ You Selected Dinner suit ] ");
                        break;
                    default:
                        System.out.println("Invalid choice for suits");
                        Category();
                        break;
                }
                break;
            default:
                System.out.println("Invalid category choice");
                Category();
                break;

        }
        System.out.println("1. Add to cart\n2. Remove from cart");
        int cartChoice;
        while (true) {
            try {
                cartChoice = ss.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error! Please Enter a Number from these options only in front of you");
                ss.nextLine();
            }
        }
        switch (cartChoice) {
            case 1:
                cart.addToCart(selectedProduct);
                break;
            case 2:
                cart.removeFromCart(selectedProduct);
                break;
            default:
                System.out.println("Invalid choice!");
                Category();
                break;
        }
        ss.close();
    }
}
