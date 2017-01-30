package main;

import gui.Window;
import others.CitiesWithWeather;

public class Main {

	public static void main(String[] args) {
		
		//Weather weather = new Weather();
		//Current currentWeather = weather.getWeather(city);
		
		Window window = new Window(CitiesWithWeather.createCitiesList("/home/mjab/git/weather/city.list.json"));
		window.setVisible(true);
		
	}
}
