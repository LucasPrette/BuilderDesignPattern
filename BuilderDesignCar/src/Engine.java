public class Engine {
    private double volume;
    private double mileage;
    private boolean started;

    public Engine(double volume, double mileage, boolean started) {
        this.volume = volume;
        this.mileage = mileage;
        this.started = started;
    }

    public boolean isStarted() {
        return this.started;
    }
    public double getMileage() {
        return this.mileage;
    }

    public double getVolume() {
        return this.volume;
    }
}
