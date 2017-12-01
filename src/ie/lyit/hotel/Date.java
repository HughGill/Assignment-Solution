/*Hugh P Gill
L00130253
CSDF
Software Implementation
Assignment 1
Date 13/11/17*/
package ie.lyit.hotel;

public class Date {
	private int day;
	private int month;
	private int year;

	// Default Constructor 
	// called is there is noting entered
	public Date(){
	   day=month=year=0;
	}

	// Initialization Constructor
	//constructs a Date object
  	public Date(int day, int month, int year) throws IllegalArgumentException{
 	   if(day < 1 || day > 31 || month < 1 || month > 12 || year < 1900)
		   throw new IllegalArgumentException("Invalid Date.");		
  		
       this.day = day;
       this.month = month;
	   this.year = year;
    }

	// toString() method
	@Override
    public String toString(){
		return (day + "/" + month + "/" + year);
	}
	
	// equals() method
	// ==> Called when comparing an object with another object, e.g. - if(d1.equals(d2))
	@Override
   public boolean equals(Object o){
		// First check if o is a null reference to prevent run-time exceptions
		if(o == null) 
         return false;
	
		// Next check if o references the current object, if it does it must be equal
		if (this == o)
			return true;
         
		// Next check if o is in fact a Date object
		if(!(o instanceof Date))
			return false;
		else
		{
			// If none of the above are true, cast o to a Date object so that
            // we can compare the object's instance variables and methods
			Date other = (Date)o;
			
			return (this.day == other.day) &&
				   (this.month == other.month) &&
				   (this.year == other.year);
		}
	}
	
	// create set and get methods
	public void setDay(int setDayTo) throws IllegalArgumentException{
		   if(setDayTo < 1 || setDayTo > 31)
			   throw new IllegalArgumentException("Invalid day.");
		   
		   // if there was no exception thrown 
	       day=setDayTo;
	}
	
	public int getDay(){
		return day;
	}
	
	public void setMonth(int setMonthTo)throws IllegalArgumentException{
	 	   if(setMonthTo < 1 || setMonthTo > 12)
	 		   throw new IllegalArgumentException("Invalid month.");		

	 		// if there was no exception thrown
	 		month = setMonthTo;
	}
	
	public int getMonth(){
		return month;
	}
	
	public void setYear(int setYearTo)throws IllegalArgumentException{
	 	   if(setYearTo <1900)
	 		   throw new IllegalArgumentException("Invalid year.");		

	 	   // if there was no exception thrown
	 	   year = setYearTo;
	}
	
	public int getYear(){
		return year;
	}

}
