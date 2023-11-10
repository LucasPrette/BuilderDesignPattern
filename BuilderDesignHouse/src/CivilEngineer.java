public class CivilEngineer {
    private HouseBuilder houseBuilder;

    public CivilEngineer() {

    }
    public CivilEngineer(HouseBuilder houseBuilder){
        this.houseBuilder = houseBuilder;
    }

    public void getHouseToBuild(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    public House getHouse () {
        return this.houseBuilder.getHouse();
    }

    public void constructHouse() {
        this.houseBuilder.buildBasement();
        this.houseBuilder.buildStructure();
        this.houseBuilder.buildRoof();
        this.houseBuilder.buildInterior();
    }
}
