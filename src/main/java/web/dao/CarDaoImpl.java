package web.dao;

import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getCarByCount(List<Car> list, int count){
        return list.stream().limit(count).collect(Collectors.toList());
    }
}
