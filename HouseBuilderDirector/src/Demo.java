public class Demo{
    public static void main(String[] args) {
        var director = new Director();
        var houseBuilder = new HouseBuilder();
        var housePlantBuilder = new HousePlantBuilder();

        director.constructCastle(houseBuilder);
        var house = houseBuilder.getHouse();
        System.out.println("House built: " + house.getHouseType());

        director.constructCastle(housePlantBuilder);
        var housePlant = housePlantBuilder.getHousePlant();
        System.out.println(housePlant.printInfo());

    }
}