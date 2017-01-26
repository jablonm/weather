package domain;

import javax.xml.bind.annotation.XmlAttribute;

public class Direction {
	String value;
	String code;
	String name;
	public String getValue() {
		return value;
	}
	@XmlAttribute
	public void setValue(String value) {
		this.value = value;
	}
	public String getCode() {
		return code;
	}
	@XmlAttribute
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	@XmlAttribute
	public void setName(String name) {
		this.name = name;
	}

}
