package domain;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class City {
	String id;
	String name;
	Coord coord;
	public String getId() {
		return id;
	}
	@XmlAttribute
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}
	public Coord getCoord() {
		return coord;
	}
	@XmlElement
	public void setCoord(Coord coord) {
		this.coord = coord;
	}
	public Sun getSun() {
		return sun;
	}
	@XmlElement
	public void setSun(Sun sun) {
		this.sun = sun;
	}
	Sun sun;
	

}
