/* Student id :1341632
 Name : Vaishali Rameshrao Dhulshette
 Course number : COEN 275
 Programming Assignment #1
 Date : 04/21/17*/
package regulators;

public class Environment
{
	private double currentTemperature;
	
	public void setCurrentTemperature(double temperature) 
	{
		System.out.println("Environment :: setCurrentTemperature - setting current temperature to parameter value");
		currentTemperature=temperature;
	}

	public double getCurrentTemperature() 
	{
		System.out.println("Environment :: getCurrentTemperature - return current temperature value");
		return currentTemperature;
	}

	public void reduce() 
	{
		System.out.println("Environment ::reduce - reducing temperature by a degree");
		currentTemperature = currentTemperature-1;
	}

	public void increase() 
	{
		System.out.println("Environment :: increase - increasing temperature by a degree");
		currentTemperature = currentTemperature+1;
	}

}
