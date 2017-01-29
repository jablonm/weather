package others;

public class Coord {

	private Float lonf;
	private Float latf;
	private Double lond;
	private Double latd;
	
	public Float getLonf() {
		return lonf;
	}
	
	public void setLonf(Float lon) {
		this.lonf = lon;
	}
	
	public Float getLatf() {
		return latf;
	}

	public void setLatf(Float lat) {
		this.latf = lat;
	}
	
	public Double getLond() {
		return lond;
	}

	public void setLond(Double lond) {
		this.lond = lond;
	}

	public Double getLatd() {
		return latd;
	}

	public void setLatd(Double latd) {
		this.latd = latd;
	}

	public Coord(Float lonf, Float latf) {
		this.lonf = lonf;
		this.latf = latf;
	}
	
	public Coord(Double lond, Double latd) {
		this.lond = lond;
		this.latd = latd;
	}

	public Coord() {
	}

}