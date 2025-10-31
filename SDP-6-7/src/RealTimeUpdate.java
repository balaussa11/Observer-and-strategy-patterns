import java.util.Random;

public class RealTimeUpdate implements UpdateStrategy {
    private final Random random = new Random();

    @Override
    public WeatherData getWeatherUpdate() {
        float temp = 15 + random.nextFloat() * 15;      // 15–30°C
        float humidity = 40 + random.nextFloat() * 40;  // 40–80%
        float pressure = 980 + random.nextFloat() * 40; // 980–1020 hPa
        return new WeatherData(temp, humidity, pressure);
    }
}
