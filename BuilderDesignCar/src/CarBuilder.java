public class CarBuilder implements Builder {
    private CarType car;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;


    public void setCarType(CarType car) {
        this.car = car;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public Car getResult() {
        return new Car(car, seats, engine, transmission,tripComputer,gpsNavigator);
    }

}
