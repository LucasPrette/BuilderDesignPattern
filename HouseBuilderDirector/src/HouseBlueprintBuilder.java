public class HouseBlueprintBuilder implements Builder{

    /* Builder can create unrelated products which don't have the common interface
    *
    * In this case we are building the house blueprint. This allows to produce different
    * blueprints for different houses.
    *
    * */
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

    public HouseBlueprint getHousePlant() {
        return new HouseBlueprint(houseType, basement,structure, roof, interior);
    }
}
