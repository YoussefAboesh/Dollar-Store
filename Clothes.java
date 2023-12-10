import java.util.Scanner;

public class Clothes {
    private String[] pants = { "blue jeans", "black jeans", "baggy", "shorts" };
    private String[] tshirts = { "men's T-shirts", "woman's T-shirts", "pullovers", "oversize T-shirts" };
    private String[] shoes = { "Nike shoes", "adidas shoes", "classic shoes", "woman's shoes" };
    private String[] dresses = { "midi Dress", "A-line Dress", "mini Dress", "wrap Dress" };
    private String[] suits = { "Two-Button-suit", "black suit", "Double-Breasted-suit", "Dinner suit" };

    private Cart cart;

    public Clothes() {
        this.cart = new Cart();
    }

    public Cart getCart() {
        return cart;
    }

    private void displayCategorychose() {
        System.out.println("Choose a category:\n1. Pants\n2. T-shirts\n3. Shoes\n4. Dresses\n5. Suits");
    }

    private void displayCategory(String[] category) {
        System.out.println("Choose a product:");
        for (int i = 0; i < category.length; i++) {
            System.out.println((i + 1) + ". " + category[i]);
        }
    }

    private void chooseProduct(String[] category) {
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice > category.length || choice <= 0) {
            System.out.println("Product is not available!");
            sc.close();
            return;
        }

        System.out.println("You chose: " + "(" + category[choice - 1] + ")");
        System.out.println("1. Add to cart\n2. Remove from cart");
        int cartChoice = sc.nextInt();

        switch (cartChoice) {
            case 1:
                cart.addToCart(category[choice - 1]);
                break;
            case 2:
                cart.removeFromCart(category[choice - 1]);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

        sc.close();
    }

    public void selectCategory() {
        displayCategorychose();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                displayCategory(pants);
                chooseProduct(pants);
                break;

            case 2:
                displayCategory(tshirts);
                chooseProduct(tshirts);
                break;

            case 3:
                displayCategory(shoes);
                chooseProduct(shoes);
                break;

            case 4:
                displayCategory(dresses);
                chooseProduct(dresses);
                break;

            case 5:
                displayCategory(suits);
                chooseProduct(suits);
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }
        sc.close();
    }

}
