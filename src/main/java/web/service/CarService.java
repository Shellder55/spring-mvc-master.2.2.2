package web.service;

import web.model.Car;

import java.util.List;

public interface CarService {
    List<Car> addCar();

    List<Car> getCarByCount(List<Car> list, int count);
}
