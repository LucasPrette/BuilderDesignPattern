public class HouseBlueprint {

    /*HouseBlueprint is a product class*/
    private HouseType houseType;
    private String basement;
    private String roof;
    private String structure;
    private String interior;

    public HouseBlueprint
            (
                    HouseType houseType,
                    String basement,
                    String roof,
                    String structure,
                    String interior
            )
    {
        this.houseType = houseType;
        this.basement = basement;
        this.roof = roof;
        this.structure = structure;
        this.interior = interior;
    }

    public String printInfo() {
        String info = "";
        info += "Type of house: " + this.houseType + "\n";
        info += "Basement : " + this.basement + "\n";
        info += "Structure : " + this.structure + "\n";
        info += "Roof: " + this.roof + "\n";
        info += "Interior: " + this.interior + "\n";

        return info;
    }
}
