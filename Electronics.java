import java.util.Scanner;

public class Electronics {

    private String[][] ProdByCategory;
    private int productChoice;
    private int choice;
    private Cart cart = new Cart();

    public Electronics() {
        initializeProd();
    }

    public Cart getCart() {
        return cart;
    }

    private void initializeProd() {
        ProdByCategory = new String[][]{
                {"Phones and Tablets", "iPhone 14", "Samsung Galaxy Tab", "Redmi Note 9 Pro Max"},
                {"TVs and Audio Devices", "Sony 4K Smart TV", "LG OLED55CXPUA", "Samsung Neo QLED 8K"},
                {"Computers and Laptops", "Dell G15", "MacBook M1", "HP Spectre x360"},
                {"Home Appliances", "Microwave", "Toaster", "Coffee maker"},
                {"Gaming and Toys", "PlayStation 5", "Xbox Series X", "PlayStation VR"}
        };
    }

    public void displayProdByCategory() {
        String category = "";
        Scanner input = new Scanner(System.in);  

        System.out.print("Categories in DepElectronics:\n1. Phones and Tablets\n2. TVs and Audio Devices\n3. Computers and Laptops\n4. Home Appliances\n5. Gaming and Toys\nSelect a category:");

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
                category = "Phones and Tablets";
                break;
            case 2:
                category = "TVs and Audio Devices";
                break;
            case 3:
                category = "Computers and Laptops";
                break;
            case 4:
                category = "Home Appliances";
                break;
            case 5:
                category = "Gaming and Toys";
                break;
            default:
                System.out.println("Invalid choice.");
                displayProdByCategory();
        }

        for (int i = 0; i < ProdByCategory.length; i++) {
            String[] prodCategory = ProdByCategory[i];
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
