public class Car {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    private double fuel;

    public Car
            (
            CarType carType,
            int seats,
            Engine engine,
            Transmission transmission,
            TripComputer tripComputer,
            GPSNavigator gpsNavigator
            )
    {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public double getFuel() {
        return this.fuel;
    }

    public CarType getCarType() {
        return this.carType;
    }

    public Engine getEngine() {
        return this.engine;
    }

    public GPSNavigator getGpsNavigator() {
        return this.gpsNavigator;
    }

    public int getSeats() {
        return this.seats;
    }

    public Transmission getTransmission() {
        return this.transmission;
    }

    public TripComputer getTripComputer() {
        return this.tripComputer;
    }
}
