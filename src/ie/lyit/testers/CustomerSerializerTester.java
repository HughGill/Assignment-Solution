package ie.lyit.testers;
import ie.lyit.hotel.*;
import ie.lyit.serialize.*;
public class CustomerSerializerTester {

	public static void main(String[] args) {
		//Create instance variable of customer serializer
		CustomerSerializer cs = new CustomerSerializer();
		
		//create instance that will call the Menu class 
		Menu m = new Menu();
		
		//This deserializes the ArrayList
		//cs.readRecordsFromFile();
		
		//Do while loop so that it keeps asking user for input until they choose to quit
		do {
			m.display();
			
			m.readOption();
			//Switch thought the options that were listed with the display method
			switch(m.getOption()) {
			case 1:
				cs.add();
				break;
			case 2:
				cs.view();
				break;
			case 3:
				cs.edit();
				break;
			case 4:
				cs.delete();
				break;
			case 5:
				cs.list();
				break;
			case 6:break;
			default:System.out.println("Invalid option please try again...");
			}
			
		}while(m.getOption()!=6);
		
		//This serializes the arrayList
		cs.writeRecordsToFile();
	}

}
