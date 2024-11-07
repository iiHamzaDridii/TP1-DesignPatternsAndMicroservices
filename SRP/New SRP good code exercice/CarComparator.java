package com.directi.training.srp.exercise;

public class CarComparator {
    private final List<Car> cars;

    public CarComparator(List<Car> cars) {
        this.cars = cars;
    }

    public Car findBestCarByModel() {
        Car bestCar = null;
        for (Car car : cars) {
            if (bestCar == null || car.getModel().compareTo(bestCar.getModel()) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}