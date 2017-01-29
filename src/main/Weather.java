package main;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import domain.Current;

//		BufferedReader br = new BufferedReader(content.read(b));
//		int b;
//		while ((b = content.read()) != -1) {		
//			System.out.print((char)b); 
//		}
//		System.out.println(response.getStatusLine().getStatusCode());

public class Weather {

	private static String URL = "http://api.openweathermap.org/data/2.5/weather?"
			+ "mode=xml&APPID=01d244afe0bcb3eee74b8d7ea179b35a&q=";
	
	public Current getWeather(String city) {
		InputStream content = null;
		Current weather = null;
		
		try {
			content = getContentFromUrl(URL + city);
			weather = createWeather(content);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
		return weather;
	}

	private Current createWeather(InputStream content) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(Current.class);
		Current current = (Current) context.createUnmarshaller().unmarshal(content);
		
		//System.out.println(current.getClouds().getValue());
		return current;
	}

	private InputStream getContentFromUrl(String url) throws IOException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		
		HttpResponse response = null;
		try {
			response = client.execute(request);
		} catch (ClientProtocolException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		InputStream content = response.getEntity().getContent();
		return content;
	}

}