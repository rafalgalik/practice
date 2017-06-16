package WeatherObserver;

import Weather.Subject;

public interface Observer {

    public void update();
    public void setSubject(Subject obj);
}
