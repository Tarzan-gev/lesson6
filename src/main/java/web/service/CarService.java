package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class CarService {

    private final List<Car> carList = new ArrayList<>();

    public CarService() {
        carList.add(new Car("Mercedes", "Белый", 3.5));
        carList.add(new Car("BMW", "Чёрный", 3.0));
        carList.add(new Car("Toyota", "Синий", 2.0));
        carList.add(new Car("Bentley", "Серебряный", 6.0));
        carList.add(new Car("Bugatti", "Оранжевый", 8.0));
    }


    public List<Car> getCars(int count) {
        if (count >= carList.size() || count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
