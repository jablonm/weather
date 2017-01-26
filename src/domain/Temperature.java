package domain;

import javax.xml.bind.annotation.XmlAttribute;

public class Temperature {
	String value;
	String min;
	String max;
	String unit;
	public String getValue() {
		return value;
	}
	@XmlAttribute
	public void setValue(String value) {
		this.value = value;
	}
	public String getMin() {
		return min;
	}
	@XmlAttribute
	public void setMin(String min) {
		this.min = min;
	}
	public String getMax() {
		return max;
	}
	@XmlAttribute
	public void setMax(String max) {
		this.max = max;
	}
	public String getUnit() {
		return unit;
	}
	@XmlAttribute
	public void setUnit(String unit) {
		this.unit = unit;
	}

}
