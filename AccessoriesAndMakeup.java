import java.util.Scanner;

public class AccessoriesAndMakeup {
    Scanner scanner = new Scanner(System.in);

    public int entry;
    public int entry2;
    public int entry3;
    private Cart cart = new Cart();
    public String selectedProduct;

    public AccessoriesAndMakeup() {
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
        System.out.println(" 1 Accessories ");
        System.out.println(" 2 Makeup ");

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
                System.out.println("Choose from Accessories:");
                System.out.println(" 1 Ring ");
                System.out.println(" 2 Necklace ");
                System.out.println(" 3 Belt ");
                System.out.println(" 4 Scarf");
                System.out.println(" 5 Glasses");
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
                        selectedProduct = "Ring";
                        System.out.println("[ You Selected Ring ]");
                        break;
                    case 2:
                        selectedProduct = "Necklace";
                        System.out.println("[ You Selected Necklaces ]");
                        break;
                    case 3:
                        selectedProduct = "Belt";
                        System.out.println("[ You Selected Belt ] ");
                        break;
                    case 4:
                        selectedProduct = "Scarf";
                        System.out.println("[ You Selected Scarf ] ");
                        break;
                    case 5:
                        selectedProduct = "Glasses";
                        System.out.println("[ You Selected Glasses ] ");
                        break;
                    default:
                        System.out.println("Invalid choice for Accessories");
                        Category();
                        break;
                }
                break;

            case 2:
                System.out.println(" Choose from Makeup ");
                System.out.println(" 1 Lipstick ");
                System.out.println(" 2 Eyeshadow ");
                System.out.println(" 3 Mascara ");
                System.out.println(" 4 Foundation ");
                System.out.println(" 5 Eyeliner");

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
                        selectedProduct = "Lipstick";
                        System.out.println("[ You Selected Lipstick ]");
                        break;
                    case 2:
                        selectedProduct = "Eyeshadow";
                        System.out.println("[ You Selected Eyeshadow ]");
                        break;
                    case 3:
                        selectedProduct = "Mascara";
                        System.out.println("[ You Selected Mascara ] ");
                        break;
                    case 4:
                        selectedProduct = "Foundation";
                        System.out.println("[ You Selected Foundation ] ");
                        break;
                    case 5:
                        selectedProduct = "Eyeliner";
                        System.out.println("[ You Selected Eyeliner ] ");
                        break;
                    default:
                        System.out.println("Invalid choice for Makeup");
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
