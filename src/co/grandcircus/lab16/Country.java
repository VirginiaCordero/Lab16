package co.grandcircus.lab16;

public class Country {

	private String name;
	private String continent;

 public Country() {
	
 }
 public Country(String name, String continent) {
		super();
		this.name = name;
		this.continent = continent;
 }
 public void setName(String name) {
		this.name = name;
	}
 public void setContinent(String continent) {
	 	this.continent = continent;
 }
 public String getName() {
	 	return name;
 }
 public String getContinent() {
	 	return continent;
 }
 @Override
 public String toString() {
	 return "Country [name=" + name + ", continent=" + continent + "]";
 }
 }
 
 
