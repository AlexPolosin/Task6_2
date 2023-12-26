package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.List;


@Repository
public class CarDaoImpl implements CarDao {

    @Override
    public List<Car> getListCars(List<Car> cars, int count) {
        if (count >= 5 || count <= 0) {
            return cars;
        }
        List<Car> cars1 = cars.subList(0, count);
        return cars1;
    }
}
