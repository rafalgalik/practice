package Weather;

import WeatherObserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherInformation implements Subject {

    private WeatherModel weather;
    private List<Observer> observers;

    public WeatherInformation() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        if (!observers.contains(obj)) observers.add(obj);
    }

    @Override
    public WeatherModel getUpdate() {
        return weather;
    }

    @Override
    public void notifyChange() {

        for (Observer observer : observers) {
            observer.update();
        }

    }

    public void setWeather(WeatherModel weather) {
        this.weather = weather;
        notifyChange();
    }
}
