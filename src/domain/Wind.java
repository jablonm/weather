package domain;

import javax.xml.bind.annotation.XmlElement;

public class Wind {
	private Speed speed;
	private String deg;
    private String var_beg;
     private String var_end;
     private Direction direction;
	public Direction getDirection() {
		return direction;
	}
	@XmlElement
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public String getVar_beg() {
		return var_beg;
	}
	@XmlElement
	public void setVar_beg(String var_beg) {
		this.var_beg = var_beg;
	}
	public String getVar_end() {
		return var_end;
	}
	@XmlElement
	public void setVar_end(String var_end) {
		this.var_end = var_end;
	}
	public Speed getSpeed() {
		return speed;
	}
	@XmlElement
	public void setSpeed(Speed speed) {
		this.speed = speed;
	}
	public String getDeg() {
		return deg;
	}
	@XmlElement
	public void setDeg(String deg) {
		this.deg = deg;
	}

}
