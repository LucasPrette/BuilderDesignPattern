public class Director {

    /* The director defines the order that the product will be constructed
    * which steps are coming first or not.
    *
    * It also has pre-made products, so can just choose automatically and it will build.
    *
    * However, if necessary, you can build a specific house but without using the director. */
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
