package br.com.thomas.oopchallenge.vehicles;


public class ModelCar extends Car {
    private String exchange;
    private String engine;

    public void carVersion (String exchange, String engine) {
        this.exchange = exchange;
        this.engine = engine;
    }

    @Override
    public void showInfo () {
        super.showInfo();
        System.out.println("Exchange: " + exchange);
        System.out.println("Engine: " + engine);
    }
}
