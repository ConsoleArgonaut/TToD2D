package source;

/**
 * @author  Michael
 * @version 1.0
 * @since   1.0    16.12.2016
 */

public class Building {
    /**
     * This variable is used to save the name of a
     * @see Building as String.
     */
    private String name;

    /**
     * This variable is used to assign a
     * @see Types to a
     * @see Building
     */
    private Types.buildingType type;

    /**
     * This constructor is used to initialize the above defined variables in their default state.
     */
    public Building(){
        name = "";
        type = Types.buildingType.Unknown;
    }

    /**
     * This method is used to assign
     * @param buildingName is used to assign a value to String name
     * @param buildingType is used to assign a value to Types.buildingType type
     */
    public Building(String buildingName, Types.buildingType buildingType){
        name = buildingName;
        type = buildingType;
    }

    public String getName(){
        return name;
    }
    public void setName(String buildingName){
        name = buildingName;
    }
    public Types.buildingType getType(){
        return type;
    }
    public void setType(Types.buildingType buildingType){
        type = buildingType;
    }
}
