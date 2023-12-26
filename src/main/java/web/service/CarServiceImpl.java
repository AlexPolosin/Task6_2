package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getListCars(List<Car> cars, int count) {
        if (count >= 5 || count <= 0) {
            return cars;
        }
        List<Car> cars1 = cars.subList(0, count);
        return cars1;
    }
}
