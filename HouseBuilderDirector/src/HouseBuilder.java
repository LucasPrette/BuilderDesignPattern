public class HouseBuilder implements Builder {

    /* Concrete builder who will implement all the steps from the Interface */
    private HouseType houseType;
    private String structure;
    private String basement;
    private String roof;
    private String interior;

    @Override
    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }
    @Override
    public void buildStructure(String structure) {
        this.structure = structure;
    }

    @Override
    public void buildBasement(String basement) {
        this.basement = basement;
    }

    @Override
    public void buildInterior(String interior) {
        this.interior = interior;
    }

    @Override
    public void buildRoof(String roof) {
        this.roof = roof;
    }

    public House getHouse() {
        return new House(houseType,structure, basement, roof, interior);
    }
}
