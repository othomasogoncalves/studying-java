import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) throws Exception {
        String name = "Thomás Gonçalves";
        String accountType = "Corrente";
        double balance = 300000.00;

        System.out.println("*********************");
        System.out.println("\ncustomer name: " + name);
        System.out.println("account type: " + accountType);
        System.out.println("current balance: " + balance);
        System.out.println("\n*********************");

        String menu = """
                ** enter your option **
                1. check balance
                2. transfer value
                3. receive value
                4. exit
                """;
        Scanner reading = new Scanner(System.in);

        int option = 0;
        while (option != 4) {
            System.out.println(menu);
            option = reading.nextInt();

            if (option == 1) {
                System.out.println("the updated balance is: " + balance);
            } else if (option == 2) {
                System.out.println("what amount do you wish to transfer? ");
                double value = reading.nextDouble();
                if (value > balance) {
                    System.out.println("insufficient funds");
                } else {
                    balance -= value;
                    System.out.println("your balance is now: " + balance);
                }
            } else if (option == 3) {
                System.out.println("what amount would you like to receive? ");
                double value = reading.nextDouble();
                balance += value;
                System.out.println("your balance is now: " + balance);
            } else if (option != 4) {
                System.out.println("invalid option!");
            }

        }

    }
}
