public class Product {
    private String productName;
    private double productPrice;
    private double discountedproductPrice;
    private double discountPercentage;

    public String getproductName() {
        return productName;
    }

    public double getproductPrice() {
        return productPrice;
    }

    public void setproductName(String productName) {
        this.productName = productName;
    }

    public void setproductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void applyDiscount(double discountPercentage) {
        discountedproductPrice = this.productPrice - (this.productPrice * discountPercentage / 100);
        System.out.println("the discounted price of the product is: " + discountedproductPrice);
    }
}
