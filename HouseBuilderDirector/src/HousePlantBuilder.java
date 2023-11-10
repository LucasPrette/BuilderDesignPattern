public class HousePlantBuilder implements Builder{
    private HouseType houseType;
    private String basement;
    private String roof;
    private String structure;
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

    public HousePlant getHousePlant() {
        return new HousePlant(houseType, basement,structure, roof, interior);
    }
}
