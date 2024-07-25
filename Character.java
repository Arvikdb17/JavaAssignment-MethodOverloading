package WizardsAndWarriors2;

public class Character {
    String characterClass;
    int level;
    int hitPoints;

    public void setCharacterClass(String classType) {
        this.characterClass=classType;
    }

    public void setLevel(int level) {
        this.level=level;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints=hitPoints;
    }

    public enum travelMethod{
        WALKING,HORSEBACK
    }

}
