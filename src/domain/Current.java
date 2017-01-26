package domain;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Current {
	City city;
	Temperature temperature;
	Pressure pressure;
	Wind wind;
	Clouds clouds;
	Visibility visibility;
	Precipatation precipatation;
	Weather weather;
	Lastupdate lastUpdate;
	public City getCity() {
		return city;
	}
	@XmlElement
	public void setCity(City city) {
		this.city = city;
	}
	public Temperature getTemperature() {
		return temperature;
	}
	@XmlElement
	public void setTemperature(Temperature temp) {
		this.temperature = temp;
	}
	public Pressure getPressure() {
		return pressure;
	}
	@XmlElement
	public void setPressure(Pressure pressure) {
		this.pressure = pressure;
	}
	public Wind getWind() {
		return wind;
	}
	@XmlElement
	public void setWind(Wind wind) {
		this.wind = wind;
	}
	public Clouds getClouds() {
		return clouds;
	}
	@XmlElement
	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}
	public Visibility getVisibility() {
		return visibility;
	}
	@XmlElement
	public void setVisibility(Visibility visibility) {
		this.visibility = visibility;
	}
	public Precipatation getPrecipatation() {
		return precipatation;
	}
	@XmlElement
	public void setPrecipatation(Precipatation precipatation) {
		this.precipatation = precipatation;
	}
	public Weather getWeather() {
		System.out.println("Pogoda taka piękna.");
		return weather;
	}
	@XmlElement
	public void setWeather(Weather weather) {
		this.weather = weather;
	}
	public Lastupdate getLastupdate() {
		return lastUpdate;
	}
	@XmlElement
	public void setLastupdate(Lastupdate lastUpdate) {
		this.lastUpdate = lastUpdate;
	}
	
	

}
