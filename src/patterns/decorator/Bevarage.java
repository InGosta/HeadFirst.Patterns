package patterns.decorator;

public abstract class Bevarage {

    public String description;

    public String getDescription(){
        return description;
    }

    public abstract double cost();


}
