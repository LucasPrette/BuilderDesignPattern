public class House {
    private HouseType houseType;
    private String structure;
    private String basement;
    private String roof;
    private String interior;

    public House
            (
                    HouseType houseType,
                    String structure,
                    String basement,
                    String roof,
                    String interior
            )
    {
        this.houseType = houseType;
        this.structure = structure;
        this.basement = basement;
        this.roof = roof;
        this.interior = interior;
    }

    public void setHouseType(HouseType houseType) {
        this.houseType = houseType;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setBasement(String basement) {
        this.basement = basement;
    }

    public void setInterior(String interior) {
        this.interior = interior;
    }

    public HouseType getHouseType() {
        return this.houseType;
    }
}
