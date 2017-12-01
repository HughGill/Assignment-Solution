/*Hugh P Gill
L00130253
CSDF
Software Implementation
Assignment 1
Date 13/11/17*/
package ie.lyit.hotel;

public abstract class Person extends Name{
	protected Name name; // COMPOSITION - Person HAS-A name
	protected String address;
	protected String phoneNumber;

	// Default Constructor
	//Called when constructor is empty
	public Person(){
	   name=new Name();
	   address=null;
	   phoneNumber=null;
	}

	// Initialization Constructor
	public Person(String t, String fN, String sn, String address, String phoneNumber){
		name=new Name(t, fN, sn);	// Calls Name initialization constructor
		this.address=address;
		this.phoneNumber=phoneNumber;
	}
	
	
	// ==> Calls Name's toString() to display name and
	@Override  // Overrides Object toString()
	public String toString(){
		return name + "," + address + "," + phoneNumber;
	}	
	
	// equals() method
	// ==> Called when comparing an object with another object, 
	//     e.g. - if(p1.equals(p2))				
	// ==> Calls Name's equals() to compare name to personIn's name, and
	//		compares phoneNumber to personIn's phoneNumber
	@Override  // Overrides Object equals()
	public boolean equals(Object obj){
	   Person pObject;
	   if (obj instanceof Person)
	      pObject = (Person)obj;
	   else
	      return false;
	   
       return(name.equals(pObject.name) &&
    		  address.equals(pObject.address) && 
			  phoneNumber.equals(pObject.phoneNumber));
	}
	
	// set() and get() methods
	public void setName(Name nameIn){
		name = nameIn;
	}
	public Name getName(){
		return name;
	}

	public void setAddress(String addressIn){
		address = addressIn;
	}
	public String getAddress(){
		return address;
	}
	
	public void setPhoneNumber(String phoneNumberIn){
		phoneNumber = phoneNumberIn;
	}
	public String getPhoneNumber(){
		return phoneNumber;
	}
}
