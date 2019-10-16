package patterns.decorator;

public class Main {

    public static void main(String[] args) {
        Bevarage bevarage = new Espresso();
        System.out.println("COST: " + Double.toString(bevarage.cost()));
        bevarage.hasMilk(true);
        System.out.println("COST: " + Double.toString(bevarage.cost()));
    }
}
