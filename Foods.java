import java.util.Scanner;

public class Foods {
    private String[][] ProdByCategory;
    private int productChoice;
    private int choice;
    private Cart cart = new Cart();

    public Foods() {
        initializeProd();
    }

    private void initializeProd() {
        ProdByCategory = new String[][] {
                { "canned food", "Canned Vegetables", "Canned Soup", "Canned Fruit", "Canned Fish", "Canned Beans" },
                { "Freezers", "Ice Cream and Frozen Desserts", "Frozen Seafood", "Frozen Entrees and Meals",
                        "Frozen Meat and Poultry", "Frozen Fruits" },
                { "vegetables and fruits", "Apples", "Bananas", "Carrots", "tomatoes", "Strawberries" },
                { "Drinks", "Tea", "Fruit Juices", "Soft Drinks/Sodas", "Bottled Water", "Coffee" },
                { "Chocolates", "Ferrero Rocher", "Cadbury", "Milka", "Galaxy", "Kinder" }
        };
    }

    public Cart getCart() {
        return cart;
    }

    public void displayProdByCategory() {
        String category = "";
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Categories in DepFoods:\n1. canned food\n2. Freezers\n3. vegetables and fruits\n4. Drinks\n5. Chocolates\nSelect a category:");

        while (true) {
            try {
                choice = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error! Please enter a valid number.");
                input.nextLine();
            }
        }

        switch (choice) {
            case 1:
                category = "canned food";
                break;
            case 2:
                category = "Freezers";
                break;
            case 3:
                category = "vegetables and fruits";
                break;
            case 4:
                category = "Drinks";
                break;
            case 5:
                category = "Chocolates";
                break;
            default:
                System.out.println("Invalid choice.");
                displayProdByCategory();
        }

        for (String[] prodCategory : ProdByCategory) {
            if (prodCategory[0].equals(category)) {
                System.out.println("\nProducts in " + category + ":");
                for (int j = 1; j < prodCategory.length; j++) {
                    System.out.println(j + ". " + prodCategory[j]);
                }
                break;
            }
        }

        System.out.print("Choose a product:");

        while (true) {
            try {
                productChoice = input.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error! Please enter a valid number.");
                input.nextLine();
            }
        }

        if (productChoice > 0 && productChoice <= ProdByCategory[choice - 1].length - 1) {
            String selectedProduct = ProdByCategory[choice - 1][productChoice];
            System.out.println("\nYou selected: " + selectedProduct);
        } else {
            System.out.println("\nInvalid product choice.");
        }
        System.out.println("1. Add to cart\n2. Remove from cart");
        int cartChoice = input.nextInt();
        switch (cartChoice) {
            case 1:
                cart.addToCart(ProdByCategory[choice - 1][productChoice]);
                break;
            case 2:
                cart.removeFromCart(ProdByCategory[choice - 1][productChoice]);
                break;
            default:
                System.out.println("Invalid choice!");
                displayProdByCategory();
                break;
        }

        input.close();
    }
}
