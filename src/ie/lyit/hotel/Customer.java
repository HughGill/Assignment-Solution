/*Hugh P Gill
L00130253
CSDF
Software Implementation
Assignment 1
Date 13/11/17*/
package ie.lyit.hotel;
import javax.swing.*;
import java.io.*;
public class Customer extends Person{// INHERITANCE
	// Customer has name, address, & phoneNumber from Person  AND emailAddress, number
	private String emailAddress;    
	private int number;			    

	private static int nextNumber=1;// static for unique number - starts off at 1
	
	// Default Constructor
	//called when the is no Name details address or email address 	
	public Customer(){
		super();			
		emailAddress=null;
		// Set number to static nextNumber before incrementing nextNumber
		number=nextNumber++;
	}
	
	// Initialization Constructor
	public Customer(String t, String fN, String sn, String address, 
			        String pNo, String email){
		// Call super class constructor - Passing parameters required by Person ONLY!
		super(t, fN, sn, address, pNo);
		// And then initialize Customers own instance variables
		emailAddress=email;
		// And finally set number to static nextNumber before incrementing nextNumber
		number=nextNumber++;
	}

	// overides the Person toString() method
	@Override
	public String toString(){
		return super.toString() + "," + emailAddress;
	}

	// equals() method
	//checks if customer number is eqaul to another
	@Override
	public boolean equals(Object obj){
		Customer cObject;
		if (obj instanceof Customer)
		   cObject = (Customer)obj;
		else
		   return false;
		   
	    return(this.number==cObject.number);
	}

	// set() and get() methods
	public void setEmailAddress(String emailAddress){
		this.emailAddress=emailAddress;
	}
	
	public String getEmailAddress(){
		return this.emailAddress;
	}	
	
	public int getNumber(){
		return number;
	}
	public void read() {
	      JTextField enterTitle = new JTextField();
	      enterTitle.setText("" + this.getTitle());
	      JTextField enterFirstName = new JTextField();
	      enterFirstName.setText("" + this.getFirstName());
	      JTextField enterLastName = new JTextField();
	      enterLastName.setText("" + this.getSurName());
	      JTextField enterAddress = new JTextField();
	      enterAddress.setText("" + this.getAddress());
	      JTextField enterPhoneNumber = new JTextField();
	      enterPhoneNumber.setText("" + this.getPhoneNumber());
	      JTextField enterEmailAddress = new JTextField();
	      enterEmailAddress.setText(""+this.getEmailAddress());

	      Object[] message = {
	          "Customers Title:", enterTitle,
	          "Customers First Name:",enterFirstName,
	          "Customers Last Name:", enterLastName,
	          "Customers address:", enterAddress,
	          "Customers Phone No.:", enterPhoneNumber,
	          "Customers Email-address:", enterEmailAddress,
	          
	      };

	      int option = JOptionPane.showConfirmDialog(null, message, "Enter customer details", JOptionPane.OK_CANCEL_OPTION);

	      if (option == JOptionPane.OK_OPTION){
	    	  
	          this.title = enterTitle.getText();
	          this.firstName = enterFirstName.getText();
	          this.surname = enterLastName.getText();
	          this.address = enterAddress.getText();
	          this.phoneNumber = enterPhoneNumber.getText();
	          this.emailAddress = enterEmailAddress.getText();
	      }
	}
}
