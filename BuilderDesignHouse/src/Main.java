public class Main {
    public static void main(String[] args) {
        HouseBuilder iglooBuilder = new IglooHouseBuilder();
        HouseBuilder tipiBuilder = new TipiHouseBuilder();

        CivilEngineer engineer = new CivilEngineer();

        engineer.getHouseToBuild(iglooBuilder);
        engineer.constructHouse();
        House house = engineer.getHouse();
        System.out.println("Builder constructed: " + house);

        engineer.getHouseToBuild(tipiBuilder);
        engineer.constructHouse();
        house = engineer.getHouse();
        System.out.println("Builder constructed: " + house);
    }
}