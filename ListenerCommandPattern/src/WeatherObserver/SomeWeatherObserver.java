package WeatherObserver;

import Weather.Subject;
import Weather.WeatherModel;

public class SomeWeatherObserver implements Observer {

    public String observerName;
    private WeatherModel currentWeather;
    private Subject weatherInformation;

    public SomeWeatherObserver(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update() {
        currentWeather = (WeatherModel) weatherInformation.getUpdate();
        System.out.println("This is observer: " + observerName + ". " + "Current weather: " +
                "Temp - " + currentWeather.temperature + "\u00b0C, " +
                "Humidity - " + currentWeather.humidity + "%, " +
                "Wind - " + currentWeather.wind + "m/s, " +
                "Rain chanse - " + currentWeather.rainChance + "%");
    }

    @Override
    public void setSubject(Subject obj) {
        this.weatherInformation = obj;
    }
}
