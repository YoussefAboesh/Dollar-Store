import java.util.Scanner;

interface IUser {
    String getUsername();

    String getPass();

    String getEmail();
}

public class User implements IUser {
    protected String username;
    protected String pass;
    protected String email;
    protected Check check;

    public User() {
    }

    public User(String name) {
        this.username = name;
    }

    public User(String name, String email, String pass) {
        this.username = name;
        this.email = email;
        this.pass = pass;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPass() {
        return pass;
    }

    @Override
    public String getEmail() {
        return email;
    }

    private void displayWelcome() {
        System.out.println("Welcome to dollar store!\n" + "0.Exit\n1.Login\n2.Sign up");
    }

    public void login(Scanner s, Departments dept) {
        System.out.println("Enter your username:");
        String username = s.next();
        dept.getFoods().getCart().getCheck().setName(username);
        dept.getClothes().getCart().getCheck().setName(username);
        dept.getElectronics().getCart().getCheck().setName(username);
        dept.getAccessoriesAndMakeup().getCart().getCheck().setName(username);
        System.out.println("Enter your password:");
        s.next();
        System.out.println("Welcome back! '" + username + "'\n");
        dept.selectdep();
    }

    private void signUp(Scanner s, Departments dept) {
        System.out.println("Enter your username:");
        String username = s.next();
        dept.getFoods().getCart().getCheck().setName(username);
        dept.getClothes().getCart().getCheck().setName(username);
        dept.getElectronics().getCart().getCheck().setName(username);
        dept.getAccessoriesAndMakeup().getCart().getCheck().setName(username);
        System.out.println("Enter your email:");
        s.next();
        System.out.println("Enter your password:");
        s.next();
        System.out.println("Welcome, Mr: '" + username + "'\n");
        dept.selectdep();
    }

    public void chooseOne(Scanner s, Departments dept) {
        displayWelcome();
        int choice;
        while (true) {
            try {
                choice = s.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Error! Please Enter a Number from these options only in front of you");
                s.nextLine();
            }
        }

        switch (choice) {
            case 0:
                System.out.println("Thanks for visiting our store.");
                break;
            case 1:
                this.login(s, dept);
                break;
            case 2:
                this.signUp(s, dept);
                break;
            default:
                System.out.println("Error!");
                chooseOne(s, dept);
                break;
        }
    }

}
