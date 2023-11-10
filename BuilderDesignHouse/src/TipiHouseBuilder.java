public class TipiHouseBuilder implements HouseBuilder {
    private House house;

    public  TipiHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setInterior("");
    }

    @Override
    public void buildStructure() {
        house.setStructure("");
    }

    @Override
    public void buildRoof() {
        house.setRoof("");
    }
    @Override
    public void buildInterior() {
        house.setInterior("");
    }
    @Override
    public House getHouse() {
        return this.house;
    }
}
