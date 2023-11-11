public class Demo{

    /* Here is where the magic happens */

    /* The Demo class is the client class, is where the client will make the request to build
    * the necessary product */


    public static void main(String[] args) {

        var director = new Director();

        // Director gets the concrete builder object from the client
        // (application code). That's because application knows better which
        // builder to use to get a specific product.
        var houseBuilder = new HouseBuilder();
        director.constructCastle(houseBuilder);

        // The final product is often retrieved from a builder object, since
        // Director is not aware and not dependent on concrete builders and
        // products.
        var house = houseBuilder.getHouse();
        System.out.println("House built: " + house.getHouseType());


        var houseBlueprintBuilder = new HouseBlueprintBuilder();


        director.constructCastle(houseBlueprintBuilder);
        var houseBlueprint = houseBlueprintBuilder.getHousePlant();
        System.out.println(houseBlueprint.printInfo());




        /*We can also create personalized products by hand*/

        /*We call the concrete builder and give it the necessary items to construct
        * the product */
        houseBuilder.setHouseType(HouseType.TIPI_HOUSE);
        houseBuilder.buildBasement("ROCKS");
        houseBuilder.buildInterior("ICE");
        houseBuilder.buildStructure("WATER");
        houseBuilder.buildRoof("GLASS");

        /* We extract the final product */
        house = houseBuilder.getHouse();
        System.out.println("House built: " + house.getHouseType());

        /*And then we can use the blueprint concrete Builder to create a personalized
        * blueprint for our house */
        houseBlueprintBuilder.setHouseType(HouseType.TIPI_HOUSE);
        houseBlueprintBuilder.buildBasement("ROCKS");
        houseBlueprintBuilder.buildInterior("ICE");
        houseBlueprintBuilder.buildStructure("WATER");
        houseBlueprintBuilder.buildRoof("GLASS");

        /*Again we extract the product, so we can have all the information on our house */
        houseBlueprint = houseBlueprintBuilder.getHousePlant();
        System.out.println(houseBlueprint.printInfo());


    }
}