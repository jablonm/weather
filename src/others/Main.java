package others;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Main {
	
	public static BufferedReader readFile(String path) {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return br;
	}

	public static ArrayList<City> createCitiesList(String file) {
		BufferedReader br = Main.readFile(file);

		ArrayList<City> cities = new ArrayList<City>();
		String line = null;

		JSONParser parser = new JSONParser();
		try {
			while ((line = br.readLine()) != null) {
				Object obj = parser.parse(line);
				JSONObject jsonObject = (JSONObject) obj;

				Long id = (Long) jsonObject.get("_id"); // Dlaczego long?
				String name = (String) jsonObject.get("name");
				String country = (String) jsonObject.get("country");

				JSONObject jsonObjectCoord = (JSONObject) jsonObject.get("coord");

				Coord coord = new Coord();
				if (jsonObjectCoord.get("lon") instanceof Double) {
					Double lon = (Double) jsonObjectCoord.get("lon");
					coord.setLond(lon);
				} else if (jsonObjectCoord.get("lon") instanceof Float) {
					Float lon = (Float) jsonObjectCoord.get("lon");
					coord.setLonf(lon);
					;
				}
				if (jsonObjectCoord.get("lat") instanceof Double) {
					Double lat = (Double) jsonObjectCoord.get("lat");
					coord.setLatd(lat);
				} else if (jsonObjectCoord.get("lat") instanceof Float) {
					Float lat = (Float) jsonObjectCoord.get("lat");
					coord.setLatf(lat);
				}

				City city = new City(id, name, country, coord);
				cities.add(city);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		return cities;
	}
	
	public static void main(String[] args) {
		String file = "/home/miszx/git/korepetycje/weather/city.list.json";
		ArrayList<City> cities = new ArrayList<City>();
		cities = Main.createCitiesList(file);
		
		System.out.println(cities.size());		
		
	}
}
