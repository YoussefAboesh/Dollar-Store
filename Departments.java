import java.util.Scanner;

public class Departments {
    protected String prname;
    protected double prprice;
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
        this.prname = a;
        this.prprice = b;
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
        System.out.println("4- Makeup and accessories.\n");

        Scanner input = new Scanner(System.in);

        try {
        } catch (Exception e) {
            System.out.println("Error! Please Enter The Number Of Department you want");
        }

        id = input.nextInt();

        switch (id) {
            case 1:
                foodarges();
                break;
            case 2:
                Electarges();
                break;
            case 3:
                Clotharges();
                break;
            case 4:
                Beautyarges();
                break;
            default:
                System.out.println("Error!\n" + "Please Enter The Number Of Department you want");
                selectdep();
                break;
        }
        input.close();
    }

    public void foodarges() {
        foods.displayProdByCategory();
    }

    public void Electarges() {
        electronics.displayProdByCategory();
    }

    public void Clotharges() {
        clothes.selectCategory();
    }

    public void Beautyarges() {
        accessoriesAndMakeup.Category();
    }

}