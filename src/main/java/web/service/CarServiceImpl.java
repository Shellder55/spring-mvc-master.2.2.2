package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    CarDaoImpl carDaoImpl = new CarDaoImpl();

    public List<Car> addCar() {
        return carDaoImpl.addCar();
    }

    public List<Car> getCarByCount(List<Car> list, int count) {
        return carDaoImpl.getCarByCount(list, count);
    }
}
