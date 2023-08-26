package web.service;

import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class CarServiceImpl extends CarDaoImpl {

    CarDaoImpl carDaoImpl = new CarDaoImpl();

    public List<Car> getCarByCount(List<Car> list, int count) {
        return carDaoImpl.getCarByCount(list, count);
    }
}
