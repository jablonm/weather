package main;

import domain.Current;

public class Main {

	public static void main(String[] args) {
		
		String city = "London";

		Weather weather = new Weather();
		Current currentWeather = weather.getWeather(city);
		
		System.out.println(currentWeather.getCity().getName());

	}
}
