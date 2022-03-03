import java.util.*;

public class User {

	
	
	String name , ID , Phone;
	Date BOD;
	
	String Car_Purchese_Status = "Pending";
	
	User(String name , String ID , String Phone , Date BOD){
		this.name = name;
		this.ID = ID;
		this.Phone = Phone;
		this.BOD = new Date();
	}
	
	ArrayList contract = new ArrayList();
	
	public void setContract(String ID){
		this.contract.add(ID);
	}
	
	
}
