package gui;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

import domain.Current;
import main.Weather;
import others.City;

@SuppressWarnings("serial")
public class Window extends JFrame{
	
//	private Current current;
//	private ArrayList<City> cities;
//	
//	public void setCurrent(Current current) {
//		this.current = current;
//	}
//	
//	public void setCities(ArrayList<City> cities) {
//		this.cities = cities;
//	}

	public Window(ArrayList<City> cities) throws HeadlessException {
		JLabel labelDeg = new JLabel("Lista miast z dostępną pogodą.");
		final JComboBox<City> citiesCombo = new JComboBox<City>(cities.toArray(new City[cities.size()]));
		final JLabel city = new JLabel();
		citiesCombo.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				Weather weather = new Weather();
				Current current = weather.getWeather(((City) citiesCombo.getSelectedItem()).getId());
				city.setText(current.getCity().getName());
				
			}
		});
		
		Container container = getContentPane();
		
		container.setLayout(new GridBagLayout());
		GridBagConstraints grid = new GridBagConstraints();
		
		grid.fill = GridBagConstraints.HORIZONTAL;
		grid.gridx=0;
		grid.gridy=0;
		container.add(labelDeg, grid);
		
		grid.fill = GridBagConstraints.HORIZONTAL;
		grid.gridx = 1;
		grid.gridy = 0;
		container.add(citiesCombo, grid);
		
		grid.fill = GridBagConstraints.HORIZONTAL;
		grid.gridx = 2;
		grid.gridy = 0;
		container.add(city, grid);
		
		pack();
		setSize(400, 400);
		setTitle("Okienko");
	}
	
	
}
