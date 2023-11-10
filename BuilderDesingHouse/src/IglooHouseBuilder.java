public class IglooHouseBuilder implements HouseBuilder{
    private House house;

    public IglooHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildBasement() {
        house.setBasement("");
    }

    @Override
    public void buildStructure() {
        house.setBasement("");
    }

    @Override
    public void buildRoof() {
        house.setRoof("");
    }

    @Override
    public void buildInterior() {
        house.setInterior("");
    }

    public House getHouse() {
        return this.house;
    }
}
