public class Director {
    public void constructSportCar(Builder builder) {
        builder.setCarType(CarType.SPORT_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3,0, false));
        builder.setTransmission(Transmission.MANUAL);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(5);
        builder.setEngine(new Engine(1.2,3, false));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator("Bauru/SP,naçoes unidas, 1111"));
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(6);
        builder.setEngine(new Engine(2.5,0, false));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }
}

