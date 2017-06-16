import Weather.WeatherChanger;
import Weather.WeatherInformation;
import WeatherObserver.Observer;
import WeatherObserver.SomeWeatherObserver;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        WeatherInformation weatherInformation = new WeatherInformation();

        List<Observer> observers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Observer observer = new SomeWeatherObserver("Observer nr " + (i+1));
            observers.add(observer);
            weatherInformation.register(observer);
            observer.setSubject(weatherInformation);
        }

        WeatherChanger weatherChanger = new WeatherChanger(weatherInformation);
        weatherChanger.start();

    }
}
