
import java.util.List;

public class BestCarSelector {
    
    public Car getBestCar(List<Car> carsDb)
    {
        Car bestCar = null;
        for (Car car : carsDb) {
            if (bestCar == null || car.compareTo(bestCar) > 0) {
                bestCar = car;
            }
        }
        return bestCar;
    }
}
