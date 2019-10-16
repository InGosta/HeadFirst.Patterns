package patterns.decorator;

public class Main {

    public static void main(String[] args) {
        Bevarage bevarage = new DarkRoast();
        System.out.println(bevarage.getDescription() + " " + Double.toString(bevarage.cost()) + " р.");

        Bevarage bevarage2 = new Espresso();
        bevarage2 = new Mocha(bevarage2);
        bevarage2 = new Mocha(bevarage2);
        bevarage2 = new Whip(bevarage2);
        System.out.println(bevarage2.getDescription() + " " + Double.toString(bevarage2.cost()) + " р.");
    }
}
