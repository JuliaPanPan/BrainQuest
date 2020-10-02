import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to BrainQuest!");
        //instantiate a creature object
        Creature c = new Creature("Sphynx");
        Creature k = new Creature("Genie");

        System.out.println(c);
    }
}
