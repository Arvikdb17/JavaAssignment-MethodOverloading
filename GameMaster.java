package WizardsAndWarriors2;


public class GameMaster {
    public static String describe(Character character){
        // => "You're a level 4 Wizard with 28 hit points."
        return "You're a level "+character.level+" "+character.characterClass+" with "+character.hitPoints+" hit points ";
    }
    public static String describe(Destination destination){
        // => "You've arrived at Muros, which has 732 inhabitants."
        return "You've arrived at "+ destination.name+", which has "+destination.inhabitants+" inhabitants. ";
    }
    public static String describe( Enum travelMethod){
        // => "You're traveling to your destination on horseback."
        if(travelMethod.name()=="WALKING")
            return "You're traveling to your destination on Walking. ";

        return "You're traveling to your destination on horseback. ";
    }

    public String describe(Character character, Destination destination, Character.travelMethod travelMethod) {
        return describe(character)+describe(travelMethod)+describe(destination);
    }
}
