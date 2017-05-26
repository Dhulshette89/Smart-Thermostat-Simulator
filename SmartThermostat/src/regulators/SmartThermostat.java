/* Student id :1341632
 Name : Vaishali Rameshrao Dhulshette
 Course number : COEN 275
 Programming Assignment #1
 Date : 04/21/17*/
package regulators;
import java.util.Date;


public class SmartThermostat extends SimpleThermostat implements SmartRegulator 
{
	private static int STEP=3;
	private TempMode mode;
	private Date currentTime;
	
	public SmartThermostat(Environment  environ) 
	{
		super(environ);
		System.out.println("SmartThermostat:: SmartThermostat - constructor called to initialize curretTime and mode to default value");
		currentTime= new Date();
		mode =TempMode.COOL;
	}

	public void showCurrentHomeTemperatureC() 
	{
		System.out.println("SmartThermostat::showCurrentHomeTemperature - display current home temperature");
		double tempC;
		tempC = (this.getCurrentHomeTemperatureF()-32)*5/9;
		tempC=(double)Math.round(tempC*100d)/100d;
		System.out.println("The current home temperature is: "+tempC+" degrees Celsius");

	}

	public void setMode(TempMode mode) 
	{
		System.out.println("SmartThermostat::setMode - setting mode to parameter value");
		this.mode= mode;
	}
	
	public void coolAt(double temperature)
	{
		System.out.println("SmartThermostat::coolAt - decreasing temperature by defined STEP");
		if(mode==TempMode.COOL)
		{
			if(super.getCurrentHomeTemperatureF()>=temperature)
			{
				super.reduceTemperature(STEP);
			}
		}
		
	}


	
	public void heatAt(double temperature) 
	{
		System.out.println("SmartThermostat::heatAt - increasing temperature by defined STEP");
		if(mode==TempMode.HEAT)
		{
			if(super.getCurrentHomeTemperatureF()<=temperature)
			{
				super.increaseTemperature(STEP);
			}
		}
	}


	public void showDateTime() 
	{
		System.out.println("SmartThermostat::showDateTime - displaying current date and time");
		System.out.println("The date & time is:"+ currentTime);
	}

	public void showCurrentStatus()
	{
		System.out.println("SmartThermostat::showCurrentStatus - show date , time , mode & temperature in Fahernheit & centigrade");
		this.showDateTime();
		System.out.println("The current mode is "+ mode+".");
		System.out.println("Current temperature is "+this.getCurrentHomeTemperatureF()+" Fahrenheit");
		this.showCurrentHomeTemperatureC();
	}

	}

