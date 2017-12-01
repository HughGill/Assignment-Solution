/*Hugh P Gill
L00130253
CSDF
Software Implementation
Assignment 1
Date 13/11/17*/
package ie.lyit.hotel;

public class Name {
	protected String title;
	protected String firstName;	
	protected String surname;		
	
	// Constructors to initialise the Instance Variables
	public Name(){
	   title=firstName=surname=null;
	}

	// Initialization Constructor
	public Name(String t, String fN, String sn){
		title=t;
		firstName=fN;
		surname=sn;
	}

	// toString() method
	@Override
	public String toString(){
	   return title + " " + firstName + " " + surname;
	}
	
	// equals() method
	@Override
	public boolean equals(Object obj){
	   Name nObject;
	   if (obj instanceof Name)
	      nObject = (Name)obj;
	   else
	       return false;
	 
	   return this.title.equals(nObject.title)
	          && this.firstName.equals(nObject.firstName)
	          && this.surname.equals(nObject.surname);
	}

	// get methods and set methods
	public String getTitle(){
	   return title;
	}
	
	public String getFirstName(){
	   return firstName;
	}
	
	public String getSurName(){
	   return surname;
	}

	
	public void setTitle(String setTitleTo){
	   title=setTitleTo;
	}
	
	public void setFirstName(String setFirstNameTo){
	   firstName=setFirstNameTo;
	}
	
	public void setSurname(String setSurnameTo){
	   surname=setSurnameTo;
	}

	public boolean isFemale(){
		if(title.equalsIgnoreCase("Miss") || 
		   title.equalsIgnoreCase("Ms") || 
		   title.equalsIgnoreCase("Mrs")) 
		    return true;
		else
		    return false;
	}	
}
