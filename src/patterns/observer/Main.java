package patterns.observer;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        StatisticDisplay statisticDisplay = new StatisticDisplay(weatherData);
        ConditionDisplay conditionDisplay = new ConditionDisplay(weatherData);

        weatherData.setRandomMeasurements();
        weatherData.measurementsChanged();
        System.out.println(" ");
        weatherData.setRandomMeasurements();
        weatherData.measurementsChanged();

    }
}
