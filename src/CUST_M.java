import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class CUST_M extends JPanel{
    JLabel d = new JLabel("");
	public CUST_M(ArrayList<User> user , int pos , ArrayList<Contract>cont) {
	super(new FlowLayout(FlowLayout.CENTER, 0, 0));
	 FlowLayout layout = (FlowLayout)this.getLayout();
     layout.setHgap(10);
     setBackground(new Color(124,131,139));
		setBounds(6, 6, 807, 95);
		JButton	 btnNewButton_23 = new JButton(" Accept ");
			btnNewButton_23.setBounds(710, 17, 91, 58);
		add(btnNewButton_23);
		
		JButton	 btnNewButton_23_1 = new JButton(" Decline ");
		btnNewButton_23_1.setBounds(607, 17, 91, 58);
		add(btnNewButton_23_1);
		
		JLabel lblNewLabel_32 = new JLabel("  Customer ID:  ");
		lblNewLabel_32.setBounds(6, 6, 124, 28);
		add(lblNewLabel_32);
		JLabel Cust_ID_MANAGE = new JLabel(user.get(pos).ID);
		Cust_ID_MANAGE.setBounds(149, 6, 124, 28);
	    add(Cust_ID_MANAGE);
		
		JLabel lblNewLabel_32_1 = new JLabel("  Car ID:  ");
		lblNewLabel_32_1.setBounds(6, 47, 124, 28);
		add(lblNewLabel_32_1);
		
		
		
		JLabel CAR_ID_MANAGE = new JLabel("1234");
		CAR_ID_MANAGE.setBounds(149, 53, 124, 28);
	    add(CAR_ID_MANAGE);
	 
		
	    btnNewButton_23.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == btnNewButton_23) {

				
									
								
						
						
						user.get(pos).Car_Purchese_Status ="Approved";
						cont.get(0).status.setText(user.get(pos).Car_Purchese_Status);
						cont.get(0).status.setForeground(Color.green);
					JOptionPane.showMessageDialog(null, "the customer number : " + user.get(pos).ID + " has been accepted to buy car ID: " + "1234" +"  Contract number : " + cont.get(0).ContID, "DONE" , JOptionPane.INFORMATION_MESSAGE);
					setVisible(false);
					cont.clear();
					
					
				}
				
				
				
			}
	    	
	    });
	    btnNewButton_23_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (e.getSource() == btnNewButton_23_1){
					
						
							
							
							
									
					user.get(pos).Car_Purchese_Status ="Declined";
					cont.get(0).status.setText(user.get(pos).Car_Purchese_Status);
					cont.get(0).status.setForeground(Color.RED);
					JOptionPane.showMessageDialog(null, "the customer number : " +user.get(pos).ID +" has been Declined to buy car ID: " + "1234"  +"  Contract number : " + cont.get(0).ContID," DONE ", JOptionPane.INFORMATION_MESSAGE);
					setVisible(false);
					cont.clear();
				
				
				}
				
			}
	    	
	    });
		
	}

}
