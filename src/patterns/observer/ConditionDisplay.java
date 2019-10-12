package patterns.observer;

public class ConditionDisplay implements Observer, DisplayElement {
    private float Temperature;
    private float Humidity;
    private float Pressure;
    private Subject weatherData;

    public ConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update (float temp,float humidity, float pressure){
        this.Temperature = temp;
        this.Pressure = pressure;
        this.Humidity = humidity;
        display();
    }

    @Override
    public void display(){
        System.out.println("Текущее состояние");
        System.out.println("Температура " + Float.toString(Temperature));
        System.out.println("Давление " + Float.toString(Pressure));
        System.out.println("Влажность " + Float.toString(Humidity));
    }
}
