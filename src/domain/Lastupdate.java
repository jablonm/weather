package domain;

import javax.xml.bind.annotation.XmlAttribute;

public class Lastupdate {
	String value;

	public String getValue() {
		return value;
	}
	@XmlAttribute
	public void setValue(String value) {
		this.value = value;
	}

}
