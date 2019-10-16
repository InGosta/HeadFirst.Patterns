package patterns.decorator;

public abstract class Bevarage {
    public String description;
    public boolean milk = false;
    public  boolean soy = false;
    public  boolean mocha = false;
    public  boolean whip = false;

    public void getDescription(){
        System.out.println("Description: " + description);
    }
    public double cost(){
        double cost = 0;

        if (milk){
            cost+=50;
        }
        if (soy){
            cost+=150;
        }
        if (mocha){
            cost+=80;
        }
        if (whip){
            cost+=200;
        }
        return cost;
    }

    public void hasMilk(boolean milk){
        this.milk = milk;
    }
    public boolean getMilk(){
       return milk;
    }

    public void hasSoy(boolean soy){
        this.soy = soy;
    }
    public boolean getSoy(){
        return soy;
    }

    public void hasMocha(boolean mocha){
        this.soy = mocha;
    }
    public boolean getMocha(){
        return mocha;
    }

    public void hasWhip(boolean whip){
        this.whip = whip;
    }
    public boolean getWhip(){
        return whip;
    }
}
