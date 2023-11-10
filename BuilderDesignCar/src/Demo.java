public class Demo {
    public static void main(String[] args) {
        var director = new Director();
        var builder = new CarBuilder();
        var manualBuilder = new CarManualBuilder();


        director.constructSUV(builder);
        Car car = builder.getResult();
        System.out.println("Car built: " + car.getCarType());


        director.constructSUV(manualBuilder);
        Manual carManual = manualBuilder.getResult();

        System.out.println(carManual.printManual());

    }

}