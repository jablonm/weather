package domain;

import javax.xml.bind.annotation.XmlAttribute;

public class Pressure {
	String value;
	String unit;
	public String getValue() {
		return value;
	}
	@XmlAttribute
	public void setValue(String value) {
		this.value = value;
	}
	public String getUnit() {
		return unit;
	}
	@XmlAttribute
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
