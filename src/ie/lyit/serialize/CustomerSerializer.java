/*Hugh P Gill
L00130253
CSDF
Software Implementation
Assignment 1
Date 13/11/17*/
package ie.lyit.serialize;
import java.util.*;
import ie.lyit.hotel.*;
import ie.lyit.dao.*;
import java.io.*;

public class CustomerSerializer implements CustomerDAO{
	private ArrayList<Customer> customers;
	
	private String FILENAME = "Customers.ser";
	
	
	public CustomerSerializer() {
		customers= new ArrayList<Customer>();
	}
	@Override
	public void add(){
		Scanner kb = new Scanner(System.in);
		
		String t,fN, sN, a, pN, eA;
		
		System.out.println("Enter Title: ");
		//kb.nextLine();
		t=kb.nextLine();
		System.out.println("Enter First Name: ");
		//kb.nextLine();
		fN=kb.nextLine();
		System.out.println("Enter Surname: ");
		//kb.nextLine();
		sN=kb.nextLine();
		System.out.println("Enter Address: ");
		//kb.nextLine();
		a=kb.nextLine();
		System.out.println("Enter Phone Number: ");
		//kb.nextLine();
		pN=kb.nextLine();
		System.out.println("Enter Email address: ");
		//kb.nextLine();
		eA=kb.nextLine();
		// Create a Book object
		Customer c = new Customer(t,fN,sN,a,pN,eA);
		// Read its details
		//c.read();	
		// And add it to the books ArrayList
		customers.add(c);
	}
	@Override
	public void list(){
		// for every Book object in books
        for(Customer c:customers)
			// display it
			System.out.println(c);
	}
	
	// This method will serialize the books ArrayList when called, 
	// i.e. it will write it to a file called books.ser
	@Override
	public void writeRecordsToFile(){
		ObjectOutputStream os=null;
		try {
			// Serialize the ArrayList...
			FileOutputStream fileStream = new FileOutputStream(FILENAME);
		
			os = new ObjectOutputStream(fileStream);
				
			os.writeObject(customers);
		}
		catch(FileNotFoundException fNFE){
			System.out.println("Cannot create file to store customer.");
		}
		catch(IOException ioE){
			System.out.println(ioE.getMessage());
		}
		finally {
			try {
				os.close();
			}
			catch(IOException ioE){
				System.out.println(ioE.getMessage());
			}
		}
	}

	// This method will deserialize the books ArrayList when called, 
	// i.e. it will restore the ArrayList from the file customers.ser
	@Override
	public void readRecordsFromFile(){
		ObjectInputStream is=null;
		
		try {
			// Deserialize the ArrayList...
			FileInputStream fileStream = new FileInputStream(FILENAME);
		
			is = new ObjectInputStream(fileStream);
				
			customers = (ArrayList<Customer>)is.readObject();	
		}
		catch(FileNotFoundException fNFE){
			System.out.println("Cannot create file to store customers.");
		}
		catch(IOException ioE){
			System.out.println(ioE.getMessage());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		finally {
			try {
				is.close();
			}
			catch(IOException ioE){
				System.out.println(ioE.getMessage());
			}
		}
	}
	@Override	
	public Customer view() {
			
		Scanner keyboard = new Scanner(System.in);
			
		System.out.println("Please enter customer number: ");
		int customerToView = keyboard.nextInt();
			
		for(Customer c:customers) {
				
			if(c.getNumber()==customerToView) {
				System.out.println(c);
				return c;
			}	
		}
		return null;	
	}	
	@Override	
	public void delete() {
		Customer c = view();
		
		if(c!= null) {
			customers.remove(c);
		}
	}
	@Override
	public void edit() {
		Customer c = view();
		
		if(c != null) {
			int index = customers.indexOf(c);
			
			c.read();
			
			customers.set(index, c);
		}
	}

}
