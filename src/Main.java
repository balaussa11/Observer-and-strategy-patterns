public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        Observer phoneDisplay = new PhoneDisplay();

        weatherStation.addObserver(phoneDisplay);

        //  real-time
        weatherStation.setUpdateStrategy(new RealTimeUpdate());
        weatherStation.updateWeather();
        weatherStation.updateWeather();

        //  manual
        weatherStation.setUpdateStrategy(new ManualUpdate(10, 85, 995));
        weatherStation.updateWeather();
    }
}
