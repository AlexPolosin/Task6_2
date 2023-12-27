package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getListCars(List<Car> cars, int count) {
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
        if (count >= 5 || count <= 0) {
            return cars;
        }
        List<Car> listCars = cars.subList(0, count);
        return listCars;
    }
}
