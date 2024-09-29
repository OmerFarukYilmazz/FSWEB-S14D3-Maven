package org.example.company;

import java.util.Objects;

public class Car {
    private String name;
    private boolean engine;
    private int cylinders,wheels;


    public Car(int cylinders ,String name ) {
        this.name = name;
        this.cylinders = cylinders;
        this.engine = true;
        this.wheels = 4;
    }

    public String startEngine(){
        PrintSimpleName();
        return ("the car's engine is starting");
    }

    private void PrintSimpleName() {
        System.out.println("Class name: " + getClass().getSimpleName());
    }

    public String accelerate(){
        PrintSimpleName();
        return ("the car is accelerating");
    }
    public String brake(){
        PrintSimpleName();
        return ("the car is braking");
    }
    public String getName() {
        return name;
    }
    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", engine=" + engine +
                ", cylinders=" + cylinders +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, cylinders);
    }
}
