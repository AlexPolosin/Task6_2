package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.dao.CarDao;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public String getWebCars(@RequestParam(value = "count", defaultValue = "5") int count
            , Model model) {
        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("BMW", 4 , "Black");
        Car car2 = new Car("Audi", 5 , "Blue");
        Car car3 = new Car("MB", 2 , "Green");
        Car car4 = new Car("Renault", 3 , "Red");
        Car car5 = new Car("Honda", 1 , "White");
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        cars = carService.getListCars(cars, count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
