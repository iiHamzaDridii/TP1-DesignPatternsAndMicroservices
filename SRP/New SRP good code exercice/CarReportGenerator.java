package com.directi.training.srp.exercise;

public class CarReportGenerator {
    private final List<Car> cars;

    public CarReportGenerator(List<Car> cars) {
        this.cars = cars;
    }

    public String getCarsList() {
        StringBuilder sb = new StringBuilder();
        for (Car car : cars) {
            sb.append(car.getBrand()).append(" ").append(car.getModel()).append(", ");
        }
        return sb.substring(0, sb.length() - 2);
    }
}