package Weather;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class WeatherChanger extends TimerTask {

    private WeatherInformation weatherInformation;
    private Random random = new Random();

    public WeatherChanger(WeatherInformation weatherInformation) {
        this.weatherInformation = weatherInformation;
    }

    @Override
    public void run() {
        weatherInformation.setWeather(newWeather());
    }

    private WeatherModel newWeather() {
        return new WeatherModel(random.nextInt(50) - 15, random.nextInt(60) + 40, random.nextInt(20), random.nextInt(100));
    }

    public void start(){
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(this,0,2000);
    }
}
