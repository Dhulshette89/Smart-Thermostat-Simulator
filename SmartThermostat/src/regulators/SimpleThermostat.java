/* Student id :1341632
 Name : Vaishali Rameshrao Dhulshette
 Course number : COEN 275
 Programming Assignment #1
 Date : 04/21/17*/
package regulators;

public class SimpleThermostat implements SimpleRegulator 
{
	private Environment environ;
	private TSensor sensor;
	public SimpleThermostat(Environment  environ)
	{
		System.out.println("SimpleThermostat:: SimpleThermostat - constructor called & initialized data members");
		this.environ= environ; // Initializing value to data member
		sensor = new TSensor(environ);
	}

	public double getCurrentHomeTemperatureF()
	{
		System.out.println("SimpleThermostat:: getCurrentHomeTemperatureF- returned current temperature value");
		return sensor.getCurrentHomeTemperature();
	}

	public void showCurrentHomeTemperatureF() 
	{
		System.out.println("SimpleThermostat::showCurrentHomeTemperatureF - display current temperature");
		System.out.println("The current home temperature is :"+ this.getCurrentHomeTemperatureF() +"Fahrenheit");
	}

	public void reduceTemperature(double noOfDegrees) 
	{	
		System.out.println("SimpleThermostat:: reduceTemperature - decreasing temperature by parameter value");
		double t=getCurrentHomeTemperatureF()-noOfDegrees;
		environ.setCurrentTemperature(t);
	}

	public void increaseTemperature(double noOfDegrees)
	{
		System.out.println("SimpleThermostat::increaseTemperature - increasing temperature by parameter values");
		double t=getCurrentHomeTemperatureF()+ noOfDegrees;
		this.environ.setCurrentTemperature(t);
	}

	public class TSensor 
	{
		private Environment environ;
		public TSensor(Environment  environ) 
		{
			System.out.println("TSensor :: TSensor - constructor called");
			this.environ= environ;
		}

		public double getCurrentHomeTemperature() 
		{
			System.out.println("TSensor :: getCurrentHomeTemperature - return current temperature value");
			return environ.getCurrentTemperature();
			
		}

	}

}
