package org.example.arge;

public class CarFactory {
    public static void main(String[] args) {
        CarSkeleton electricCar = new ElectricCar("Tesla" , "Model Y" ,700 ,1200);
        CarSkeleton hybridCar = new HybridCar("Toyota" , "Yaris E" , 500, 1000 , 4);
        CarSkeleton gasPoweredCar = new GasPoweredCar("Honda" , "Civic" , 17, 4);
        startEngine(electricCar);
        startEngine(hybridCar);
        startEngine(gasPoweredCar);
    }

    public static void startEngine(CarSkeleton carSkeleton){
        System.out.println(carSkeleton.startEngine());
    }
}
