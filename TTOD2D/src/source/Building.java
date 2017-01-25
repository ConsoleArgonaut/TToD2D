package source;

/**
 * @author Michael
 * @version 1.0
 * @since 1.0    16.12.2016
 */

public class Building {
    private String name;
    private Types.buildingType type;

    public Building(){
        name = "";
        type = Types.buildingType.Unknown;
    }

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
