/*
OBJECTIVES:
● There will be a tester program that contains the following:
○ A collection of references that is the superclass type and holds references to the
subclass types
○ Use a loop to iterate through this array to:
■ Display each object using its toString method
■ Call a method that has been overridden in the subclasses
how many slots? how bout 3 x 3?

 */

//see ya man bet cus i gotta start studyin for the test lel aight peace
public class Tester {
    public static void main(String[] args) {
        CharSelect[] characterSlots = new CharSelect[6];

        Demon Luciel = new Demon("Hellblaze", "mage");
        CharSelect Lucifer = new Demon("Two Handed", "knight", "Sword");
        Angel Indra = new Angel("Heal Zone", "mage");
        Human Michael = new Human("Earth magic","juggernaut");
        CharSelect Ashi = new Human("Three Handed", "Juggernaut", "Axe");
        Angel Raziel = new Angel("Benevolent light","knight");

        characterSlots[0]= Luciel;
        characterSlots[1]= Lucifer;
        characterSlots[2]= Indra;
        characterSlots[3]= Michael;
        characterSlots[4]= Ashi;
        characterSlots[5]=  Raziel;

        for (CharSelect i : characterSlots){
            System.out.println(i.toString() + "<-- " + i.getClass());
            System.out.println();
        }



    }
}
