package br.com.thomas.oopchallenge.vehicles;


public class Car {
    private String model;
    private double priceYear1;
    private double priceYear2;
    private double priceYear3;

    public void defineModel (String model) {
        this.model = model;
    }

    public void definePrice (double priceYear1, double priceYear2, double priceYear3) {
        this.priceYear1 = priceYear1;
        this.priceYear2 = priceYear2;
        this.priceYear3 = priceYear3;
    }

    public double calculatesHighestPrice() {
        double highestPrice = priceYear1;

        if (priceYear2 < highestPrice) {
            highestPrice = priceYear2;
        }

        if (priceYear3 < highestPrice) {
            highestPrice = priceYear3;
        }

        return highestPrice;
    }

    public double calculatesLowestPrice() {
        double lowestPrice = priceYear1;

        if (priceYear2 > lowestPrice) {
            lowestPrice = priceYear2;
        }

        if (priceYear3 > lowestPrice) {
            lowestPrice = priceYear3;
        }

        return lowestPrice;
    }

    public void showInfo () {
        System.out.println("Model: " + model);
        System.out.println("Pice Year 1: " + priceYear1);
        System.out.println("Pice Year 2: " + priceYear2);
        System.out.println("Pice Year 3: " + priceYear3);
        System.out.println("Highest price: " + calculatesHighestPrice());
        System.out.println("Lowest price: " + calculatesLowestPrice());
    }
}