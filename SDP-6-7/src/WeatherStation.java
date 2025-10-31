import java.util.List;
import java.util.ArrayList;

public class WeatherStation implements Subject {
    private final List<Observer> observers = new ArrayList<>();
    private float temperature;
    private float humidity;
    private float pressure;
    private UpdateStrategy strategy;

    // этот метод получает новые данные от текущей стратегии
    public void updateWeather() {
        if (strategy != null) {
            WeatherData data = strategy.getWeatherUpdate();
            this.temperature = data.getTemperature();
            this.humidity = data.getHumidity();
            this.pressure = data.getPressure();
            notifyObservers();
        } else {
            System.out.println("no update strategy set");
        }
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // уведомляем всех подписчиков
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temperature, humidity, pressure);
        }
    }

    // метод для установки новой стратегии
    public void setUpdateStrategy(UpdateStrategy strategy) {
        this.strategy = strategy;
    }
}
