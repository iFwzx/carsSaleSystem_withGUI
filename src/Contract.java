import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.*;

public class Contract extends JPanel {
	 String ContID="";
	 
	 JLabel Car_name , Car_ID , Cust_ID , status;
	
	Contract(String car_ID , String Car_name , ArrayList<User>user , int pos){
	
		this.ContID = String.valueOf(new Random().nextInt(10000000)) ;
			setBounds(6, 6, 811, 92);
			user.get(pos).setContract(ContID);
	    setLayout(new FlowLayout());
		
		JButton btnNewButton_31 = new JButton("Remove");
		btnNewButton_31.setBounds(688, 33, 117, 29);
		add(btnNewButton_31);
		
		btnNewButton_31.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
			}
			
		});
		
		JLabel lblNewLabel_33 = new JLabel("Status");
		lblNewLabel_33.setBounds(0, 0, 117, 86);
		add(lblNewLabel_33);
		
		 status = new JLabel (user.get(pos).Car_Purchese_Status);
		
		if(user.get(pos).Car_Purchese_Status == "Approved") {
			status.setForeground(Color.GREEN);
		}else {
			
			status.setForeground(Color.RED);
		}
		
		add(status);
		
		
		JLabel lblNewLabel_333 = new JLabel("Car name : "+Car_name);
		lblNewLabel_33.setBounds(0, 0, 117, 86);
		add(lblNewLabel_333);
		JLabel lblNewLabel_3333 = new JLabel("Car ID : " + car_ID);
		lblNewLabel_33.setBounds(0, 0, 117, 86);
		add(lblNewLabel_3333);
		
		JLabel Cont = new JLabel("Contract ID : "+ContID);
		Cont.setBounds(0, 0, 125, 86);
		add(Cont);
		
	}
	
	
	public String getContID() {
		return this.ContID;
	}
	

}
