
public class CarManager
{   
    private CarDb _carsDb = new CarDb();
    private CarListFormatter _carListFormatter = new CarListFormatter();
    private BestCarSelector _bestCarSelector = new BestCarSelector();

    public Car getFromDb(final String carId)
    {
        for (Car car : _carsDb.get_carsDb()) {
            if (car.getId().equals(carId)) {
                return car;
            }
        }
        return null;
    }

    public String getCarsNames()
    {
        return _carListFormatter.getCarsNames(_carsDb.get_carsDb());
    }

    public Car getBestCar()
    {
        return _bestCarSelector.getBestCar(_carsDb.get_carsDb());
    }
}
