public class Manual {
    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public Manual
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

    public String printManual() {
        String info = "";
        info += "Type of car: " + this.carType + "\n";
        info += "Seats: " + this.seats + "\n";
        info += "Engine: " + this.engine + "\n";
        info += "Transmission: " + this.transmission + "\n";
        info += "Trip computer: " + this.tripComputer + "\n";
        info += "GPS navigator: " + this.gpsNavigator + "\n";

        return info;
    }
}
