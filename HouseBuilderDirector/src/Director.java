public class Director {
    public void constructWoodenHouse(Builder builder) {
        builder.setHouseType(HouseType.WOODEN_HOUSE);
        builder.buildBasement("Planks");
        builder.buildStructure("Logs");
        builder.buildRoof("Palm tree leafs");
        builder.buildInterior("none");
    }

    public void constructCastle(Builder builder) {
        builder.setHouseType(HouseType.CASTLE);
        builder.buildBasement("Rocks");
        builder.buildStructure("Stones");
        builder.buildRoof("Wood");
        builder.buildInterior("Medieval");
    }

    public void constructTipiHouse(Builder builder) {
        builder.setHouseType(HouseType.TIPI_HOUSE);
        builder.buildBasement("Wooden poles");
        builder.buildStructure("Wood and ice");
        builder.buildRoof("Wood, caribou and seal skin");
        builder.buildInterior("fire wood");
    }
}
