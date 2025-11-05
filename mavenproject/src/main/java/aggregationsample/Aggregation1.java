package aggregationsample;

public class Aggregation1 {

	String city;
	String country;
	
	Aggregation1 (String city, String country)  
	{
		this.city=city;
		this.country=country;
		
	}
	
	public void display()
	{
		System.out.println(city);
		System.out.println(country);
	}
	
	
	
}
