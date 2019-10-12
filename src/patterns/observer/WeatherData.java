package patterns.observer;

import java.util.ArrayList;
import java.util.Random;

public class WeatherData implements Subject {
    private ArrayList <Observer> observers;
    private float temperature;
    private float pressure;
    private float humidity;

    public WeatherData(){
        observers = new ArrayList<>();
    }

    private float getTemperature (){
        Random rand =new Random();
        return rand.nextFloat();
    }

    private float getHumidity (){
        Random rand =new Random();
        return rand.nextFloat();
    }

    private float getPressure (){
        Random rand =new Random();
        return rand.nextFloat();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observers.indexOf(o);

        if (i>0){
            observers.remove(i);
        }
    }

    @Override
    public void notifyObserver() {

        for (Observer obs: observers) {
            obs.update(temperature, pressure, humidity);
        }
    }

    public void measurementsChanged(){
        notifyObserver();
    }

    public void setMeasurements (float temp, float pressure, float humidity){
        this.temperature = temp;
        this.pressure = pressure;
        this.humidity = humidity;
    }

    public void setRandomMeasurements (){
        this.temperature = getTemperature();
        this.pressure = getPressure();
        this.humidity = getHumidity();
    }



}
