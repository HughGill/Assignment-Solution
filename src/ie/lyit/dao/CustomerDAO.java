package ie.lyit.dao;
import ie.lyit.hotel.Customer;
public interface CustomerDAO {
	public abstract void add();
	public abstract void list();
	public abstract void writeRecordsToFile();
	public abstract void readRecordsFromFile();
	public abstract Customer view();
	public abstract void delete();
	public abstract void edit();
}
