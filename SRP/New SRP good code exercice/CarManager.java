package com.directi.training.srp.exercise;

import java.util.ArrayList;
import java.util.List;

public class CarManager {
    private final List<Car> carsDb;

    public CarManager() {
        carsDb = new ArrayList<>();
        // Populate carsDb with Car objects (consider using a separate class for data access)
    }

    public Car getFromDb(String carId) {
        for (Car car : carsDb) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames() {
        // Move logic to a separate class for report generation
        return new CarReportGenerator(carsDb).getCarsList();
    }

    public Car getBestCar() {
        // Move logic to a separate class for car comparison
        return new CarComparator(carsDb).findBestCarByModel(); // Modify based on your criteria
    }
}