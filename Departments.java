import java.util.Scanner;

public class Departments {
    protected String productName;
    protected double productPrice;
    protected int id;
    private Clothes clothes;
    private Electronics electronics;
    private AccessoriesAndMakeup accessoriesAndMakeup;
    private Foods foods;

    public Departments() {
        this.clothes = new Clothes();
        this.electronics = new Electronics();
        this.accessoriesAndMakeup = new AccessoriesAndMakeup();
        this.foods = new Foods();
    }

    public Departments(String a, double b) {
        this.productName = a;
        this.productPrice = b;
    }

    public Foods getFoods() {
        return foods;
    }

    public AccessoriesAndMakeup getAccessoriesAndMakeup() {
        return accessoriesAndMakeup;
    }

    public Clothes getClothes() {
        return clothes;
    }

    public Electronics getElectronics() {
        return electronics;
    }

    public void selectdep() {
        System.out.println("select department\n");
        System.out.println("1- Food.\n");
        System.out.println("2- Electronics.\n");
        System.out.println("3- Clothes.\n");
        System.out.println("4- AccessoriesAndMakeup.\n");

        Scanner input = new Scanner(System.in);

        try {
        } catch (Exception e) {
            System.out.println("Error! Please Enter The Number Of Department you want");
        }

        id = input.nextInt();

        switch (id) {
            case 1:
                foodCat();
                break;
            case 2:
                electronicsCat();
                break;
            case 3:
                clothesCat();
                break;
            case 4:
                AccessoriesAndMakeupCat();
                break;
            default:
                System.out.println("Error!\n" + "Please Enter The Number Of Department you want");
                selectdep();
                break;
        }
        input.close();
    }

    public void foodCat() {
        foods.displayProdByCategory();
    }

    public void electronicsCat() {
        electronics.displayProdByCategory();
    }

    public void clothesCat() {
        clothes.Category();
    }

    public void AccessoriesAndMakeupCat() {
        accessoriesAndMakeup.Category();
    }

}
