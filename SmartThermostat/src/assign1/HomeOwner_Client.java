/* Student id :1341632
 Name : Vaishali Rameshrao Dhulshette
 Course number : COEN 275
 Programming Assignment #1
 Date : 04/21/17*/
 package assign1;
import regulators.Environment;
import regulators.SimpleThermostat;
import regulators.SmartThermostat;

public class HomeOwner_Client {

	public static void main(String args[]) 
	{
		Environment environ = new Environment();
		environ.setCurrentTemperature(85);
		System.out.println(environ.getCurrentTemperature());
		environ.increase();
		System.out.println(environ.getCurrentTemperature());
		environ.reduce();
		environ.reduce();
		System.out.println(environ.getCurrentTemperature());

		//Create an instance of SimpleThermostat
		SimpleThermostat thermostat1 = new SimpleThermostat(environ);
		// Call methods on the SimpleThermostat instance
		thermostat1.showCurrentHomeTemperatureF();
		thermostat1.reduceTemperature(4);
		thermostat1.showCurrentHomeTemperatureF();
		thermostat1.increaseTemperature(2);
		thermostat1.showCurrentHomeTemperatureF();
		environ.reduce();
		thermostat1.showCurrentHomeTemperatureF();

		
		// Create an instance of SmartThermostat
		SmartThermostat thermostat2 = new SmartThermostat(environ);
		// Set thermostat mode to COOL. 
		thermostat2.showCurrentHomeTemperatureF();
		thermostat2.showCurrentHomeTemperatureC();
		thermostat2.coolAt(75);
		thermostat2.showCurrentHomeTemperatureF();
		thermostat2.showCurrentHomeTemperatureC();
		thermostat2.reduceTemperature(10);
		thermostat2.heatAt(75);
		thermostat2.showCurrentHomeTemperatureF();
		thermostat2.showCurrentHomeTemperatureC();
		thermostat2.showCurrentStatus();


	}

}
