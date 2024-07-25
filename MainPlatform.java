package WizardsAndWarriors2;

import java.util.Scanner;

public class MainPlatform {
    public static void main(String[] args ){
        Scanner scanner=new Scanner(System.in);
        Character character=new Character();
        System.out.println("Enter name of the Character");
        character.setCharacterClass(scanner.next());
        System.out.println("Enter level of the character");
        character.setLevel(scanner.nextInt());
        System.out.println("Enter hit points of the Character");
        character.setHitPoints(scanner.nextInt());

        Destination destination=new Destination();
        System.out.println("Enter destination of the Character");
        destination.setName(scanner.next());
        System.out.println("Enter total inhabitants");
        destination.setInhabitants(scanner.nextInt());
        String resultString="";
        System.out.println("Select 1 or 2 for choosing travel method");
        System.out.println("1-----> Walking");
        System.out.println("2-----> Horseback");
        int travelMethod=scanner.nextInt();
        if(travelMethod==1)
            resultString=new GameMaster().describe(character,destination,Character.travelMethod.WALKING);
        else if (travelMethod==2) {
            resultString=new GameMaster().describe(character,destination,Character.travelMethod.HORSEBACK);
        }
        else
            resultString="Didn't enter proper travel Method";

        System.out.println(resultString);

    }
}
