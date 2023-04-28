
public class Main {
    public static void main(String[] args) {
        Die die = new Die();
        die.setNumOfSides(20);

        for(int i = 1; i < 20; i++) {
            System.out.println(die.rollDie());
        }

    }

}