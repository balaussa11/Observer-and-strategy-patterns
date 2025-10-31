public class ManualUpdate implements UpdateStrategy {
    private final float temperature;
    private final float humidity;
    private final float pressure;

    public ManualUpdate(float t, float h, float p) {
        this.temperature = t;
        this.humidity = h;
        this.pressure = p;
    }

    @Override
    public WeatherData getWeatherUpdate() {
        return new WeatherData(temperature, humidity, pressure);
    }
}
