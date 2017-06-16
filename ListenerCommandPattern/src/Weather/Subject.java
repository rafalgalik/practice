package Weather;

import WeatherObserver.Observer;

public interface Subject {

    public void register(Observer obj);
    public Object getUpdate();
    public void notifyChange();
}
