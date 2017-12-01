/*Hugh P Gill
L00130253
CSDF
Software Implementation
Assignment 1
Date 13/11/17*/
package ie.lyit.hotel;

public interface Payable {
	public abstract double calculateWage(double taxPercentage);
	// Don't have to put in public abstract
	public double incrementSalary(double incrementAmount);

}
