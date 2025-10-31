class PhoneDisplay implements Observer {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.printf(" Phone Display → Temp: %.1f°C | Humidity: %.1f%% | Pressure: %.1f hPa%n",
                temperature, humidity, pressure);
    }
}
