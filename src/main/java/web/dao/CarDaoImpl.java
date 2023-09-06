package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> addCar() {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car(1, "Car1", 10));
        listCar.add(new Car(2, "Car2", 20));
        listCar.add(new Car(3, "Car3", 30));
        listCar.add(new Car(4, "Car4", 40));
        listCar.add(new Car(5, "Car5", 50));
        listCar.add(new Car(6, "Car6", 60));
        listCar.add(new Car(7, "Car7", 70));
        listCar.add(new Car(8, "Car8", 80));
        return listCar;
    }

    @Override
    public List<Car> getCarByCount(List<Car> list, int count) {
        if (count > 5) {
            return new ArrayList<>(list);
        } else if (count < 0) {
            return list.stream().limit(0).collect(Collectors.toList());
        } else {
            return list.stream().limit(count).collect(Collectors.toList());
        }
    }
}
