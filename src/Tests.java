public class Tests {

    public static void main(String[] args){
        System.out.print("\nShould announce a creature: ");
        Creature a = new Creature("Hockey player");

        System.out.print("\nHealth should be set to 100 by default: ");
        System.out.println(a.health() == 100);

        System.out.print("\nCreature should have no default treasure: ");
        System.out.println(a.getTreasure() == null);
    
        System.out.print("\nTreasure's name is Golden Hockeystick: ");
        Treasure gh = new Treasure("Golden Hockeystick");
        System.out.println(gh.title().equals("Golden Hockeystick"));
        System.out.println();

    
    }
    
}
