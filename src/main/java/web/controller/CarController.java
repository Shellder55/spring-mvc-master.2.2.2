package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String carCount(
            @RequestParam(name = "count", defaultValue = "5") int count, Model model
    ) {
        List<Car> listCar = new ArrayList<>();
        listCar.add(new Car(1, "Car1", 10));
        listCar.add(new Car(2, "Car2", 20));
        listCar.add(new Car(3, "Car3", 30));
        listCar.add(new Car(4, "Car4", 40));
        listCar.add(new Car(5, "Car5", 50));
        listCar = carService.getCarByCount(listCar, count);
        model.addAttribute("listCar", listCar);
        return "cars";
    }
}
