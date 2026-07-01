package br.com.thomas.oopchallenge.test;

import br.com.thomas.oopchallenge.vehicles.ModelCar;

public class App {
    public static void main(String[] args) throws Exception {
        ModelCar myCar = new ModelCar();
        myCar.defineModel("Lancer Evo");
        myCar.definePrice(1200000, 150000, 155000);
        myCar.carVersion("Automatic", "2.0 Forged Turbo");
        myCar.showInfo();
    }
}
