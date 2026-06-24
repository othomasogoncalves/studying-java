public class Main {
    public static void main(String[] args) throws Exception {
        // practice 1
        BankAccount bankAccount = new BankAccount();

        bankAccount.accountHolder = "Tom";
        bankAccount.setAccountNumber(777);
        bankAccount.setAccountBalance(10000);

        System.out.println("hi, " + bankAccount.accountHolder + "!");
        System.out.println("your account number is: " + bankAccount.getAccountNumber());
        System.out.println("your balance is: " + bankAccount.getAccountBalance());

        // practice 2
        PersonAge personAge = new PersonAge();

        personAge.setPersonName("Tom");
        personAge.setpAge(20);

        System.out.println(personAge.getPersonName() + " tem " + personAge.getpAge() + " anos");
        personAge.verifypAge();

        // practice 3
        Product product = new Product();

        product.setproductName("Playstation 5");
        product.setproductPrice(2500.00);

        System.out.println(product.getproductName());
        System.out.println(product.getproductPrice());

        if (product.getproductPrice() >= 2000.00) {
            product.applyDiscount(10);
        }

    }
}
