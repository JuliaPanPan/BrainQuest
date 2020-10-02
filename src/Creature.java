public class Creature {

    //instance variable aka "this"
    private String name;
    private int health = 100;
    private Treasure booty;


    /**
     * Creature constructor
     */
    public Creature(String cName){
        System.out.println(cName + " is born!");
        this.name = cName;
    }

    public Creature(String name, Treasure t){
        this(name);
        booty = t;
    }

    public Creature(String name, int health){
        this.health = health;

    }

    //ACCESORS -- part of the concept of encapsulation

    public String name(){
        return this.name;
    }

    public int health(){
        return this.health;
    }

    public Treasure getTreasure(){
        return this.booty;
    }

    //MUTATORS -- another part of encapsulation

    public void name(String name){
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name + " - Health:" + this.health; 
    }

    /**
     * Overloaded constructors
     */
    public Creature() {
        this.name = "Villager";
    }
}
