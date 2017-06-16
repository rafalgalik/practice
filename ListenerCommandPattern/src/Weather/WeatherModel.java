package Weather;

public class WeatherModel {
    public int temperature;
    public int humidity;
    public int wind;
    public int rainChance;

    public WeatherModel(int temperature, int humidity, int wind, int rainChance) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.wind = wind;
        this.rainChance = rainChance;
    }
}
