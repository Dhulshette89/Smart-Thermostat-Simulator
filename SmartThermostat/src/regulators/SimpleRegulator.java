/* Student id :1341632
 Name : Vaishali Rameshrao Dhulshette
 Course number : COEN 275
 Programming Assignment #1
 Date : 04/21/17*/
package regulators;

public interface SimpleRegulator 
{

	public double getCurrentHomeTemperatureF();

	public void showCurrentHomeTemperatureF();

	public void reduceTemperature(double noOfDegrees);

	public void increaseTemperature(double noOfDegrees);

}
