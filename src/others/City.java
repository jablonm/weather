package others;

public class City implements Comparable<City> {

	private Long id;
	private String name;
	private String country;
	private Coord coord;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Coord getCoord() {
		return coord;
	}

	public void setCoord(Coord coord) {
		this.coord = coord;
	}

	public City(Long id, String name, String country, Coord coord) {
		this.id = id;
		this.name = name;
		this.country = country;
		this.coord = coord;
	}

	@Override
	public String toString() {
		return name;
	}

	public int compareTo(City o) {
		return o.getName().compareTo(this.getName());
	}
	
}