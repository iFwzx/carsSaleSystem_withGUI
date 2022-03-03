import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.ScrollPane;

import javax.swing.JPanel;
import java.awt.CardLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.JScrollBar;
import javax.swing.JTextPane;
import java.awt.Point;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;

public class Wheels {
	JPanel User_interface;
	JLabel CAR_PIC_BUY_PAN;
	static JPanel panel_7 ;
	JLabel PIC;
	JLabel BuyCar_CarName_LBL;
	JLabel BuyCar_CarID_LBL;
	JLabel PIC3;
	static JPanel panel_3;
	static JLabel Status;
	JLabel PIC2;
	 JFrame frmFourWheels;
	 JPanel Support_cust;
	 final JPanel Home_header = new JPanel();
	static JLayeredPane layeredPane;
	private JTextField SginInPage_Username_TXTF;
	private JPasswordField SginInPage_Password_TXTF;
	JPanel Sign_up_Page;
	private JTextField RegisterPage_Fname_TXTF;
	JPanel Manage_Emp;
	private JTextField RegisterPage_MidName_TXTF;
	private JTextField RegisterPage_Lname_TXTF;
	JPanel Magane_CUST ;
	private JTextField RegisterPage_Email_TXTF;
	private JTextField RegisterPage_Age_TXTF;
	private JTextField RegisterPage_Password_TXTF;
	JPanel Buy_car_Panel;
	private JTextField RegisterPage_RE_Password_TXTF;
	JPanel Active_contracts;
	static JPanel ADMIN_PANE;
	private JTextField RegisterPage_Country_TXTF;
	JPanel Register_user ;
	JPanel Car_Showroom;
	JPanel About_Us ;
	 JScrollPane scrollPane ;
	 JPanel Branches;
	 private JTextField ActiveContracts_Search_TXTF;
	 private final JPanel About_us_header = new JPanel();
	 private JTextField Manage_Emp_Fname_TXTF;
	 private JTextField Manage_Emp_Midname_TXTF;
	 private JTextField Manage_Emp_Lname_TXTF;
	 private JTextField Manage_Emp_Email_TXTF;
	 JPanel Personal_info_Panel;
	 private JTextField Manage_Emp_Salary_TXTF;
	 private JTextField PaymentPane_CreditCard_TXTF;
	 private JTextField PaymentPane_Fullname_TXTF;
	 private JTextField PaymentPane_ExpireDate_TXTF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wheels window = new Wheels();
					window.frmFourWheels.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Wheels() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	static int pos=0 ,  num_cont=0;
	static ArrayList <User>user ;
	static ArrayList <Contract> contract;
	static boolean isSignIN= false;
	private JTextField ADMIN_Support_cust_TXTF;
	private JTextField ADMIN_Support_response_TXTF;
	private void initialize() {
		user = new ArrayList<User>();
		contract = new ArrayList<Contract>();
		loadUsers();
		frmFourWheels = new JFrame();
		frmFourWheels.setResizable(false);
		frmFourWheels.setTitle("Four Wheels");
		frmFourWheels.setBounds(100, 100, 839, 634);
		frmFourWheels.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmFourWheels.getContentPane().setLayout(new CardLayout(0, 0));
		
		 layeredPane = new JLayeredPane();
		frmFourWheels.getContentPane().add(layeredPane, "name_104930194005001");
		layeredPane.setLayout(new CardLayout(0, 0));
		
		JPanel Home_Page = new JPanel();
		layeredPane.add(Home_Page, "name_105045714925796");
		Home_Page.setLayout(null);
		Home_header.setBounds(0, 0, 839, 73);
		Home_header.setBackground(Color.WHITE);
		Home_Page.add(Home_header);
		Home_header.setLayout(null);
		
		
		JButton Menu_btn = new JButton("");
		Menu_btn.setBorderPainted(false);
		Menu_btn.setBackground(Color.WHITE);
		Menu_btn.setBorder(null);
		Menu_btn.setBounds(0, 6, 73, 52);
		Home_header.add(Menu_btn);
		Menu_btn.setFocusable(false);
		ImageIcon im = new ImageIcon("xbox-menu.png");
		Image imm  = im.getImage();
		Image sc = imm.getScaledInstance(40, 40, Image.SCALE_SMOOTH);
			im= new ImageIcon(sc);
			Menu_btn.setIcon(im);
		
		
		JLabel Logo = new JLabel("");
		Logo.setHorizontalAlignment(SwingConstants.CENTER);
		Logo.setBounds(155, 0, 449, 58);
		Home_header.add(Logo);
		ImageIcon img = new ImageIcon("Logo.png");
		Image img_22  = img.getImage();
		Image scaledimg_1 = img_22.getScaledInstance(200, 130, Image.SCALE_SMOOTH);
			img= new ImageIcon(scaledimg_1);
		Logo.setIcon(img);
		
		
		
		
		JButton HomePage_singin_btn = new JButton("Login");
		HomePage_singin_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Switch(Sign_up_Page);
			}
		});
		HomePage_singin_btn.setBounds(716, 18, 117, 29);
		Home_header.add(HomePage_singin_btn);
		
		JButton HomePage_Login_btn = new JButton("Sign up");
		HomePage_Login_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Switch(Register_user);
			}
		});
		HomePage_Login_btn.setBounds(599, 18, 117, 29);
		Home_header.add(HomePage_Login_btn);
		
		JButton HomePage_Contracts_btn = new JButton("");
		HomePage_Contracts_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Switch(Active_contracts);
			}
		});
		HomePage_Contracts_btn.setBounds(698, 464, 99, 87);
		HomePage_Contracts_btn.setIcon(new ImageIcon("serlogo.png"));
		HomePage_Contracts_btn.setBorderPainted(false);
		Home_Page.add(HomePage_Contracts_btn);
		
		JButton HomePage_CarshowRoom_btn = new JButton("");
		HomePage_CarshowRoom_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Switch(Car_Showroom);
			}
		});
		HomePage_CarshowRoom_btn.setBounds(562, 464, 99, 87);
		HomePage_CarshowRoom_btn.setIcon(new ImageIcon("carlogo.png"));
		HomePage_CarshowRoom_btn.setBorderPainted(false);
		Home_Page.add(HomePage_CarshowRoom_btn);
		
		JButton HomePage_AboutUS_btn = new JButton("");
		HomePage_AboutUS_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(About_Us);
			}
		});
		HomePage_AboutUS_btn.setBounds(433, 464, 117, 87);
		HomePage_AboutUS_btn.setIcon(new ImageIcon("aboutus.png"));
		HomePage_AboutUS_btn.setBorderPainted(false);
		Home_Page.add(HomePage_AboutUS_btn);
		
		JLabel lblNewLabel = new JLabel("About Us");
		lblNewLabel.setBounds(448, 558, 86, 16);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		Home_Page.add(lblNewLabel);
		
		JLabel lblViewCars = new JLabel("View Cars");
		lblViewCars.setBounds(575, 558, 86, 16);
		lblViewCars.setForeground(Color.WHITE);
		lblViewCars.setHorizontalAlignment(SwingConstants.CENTER);
		Home_Page.add(lblViewCars);
		
		JLabel lblNewLabel_1_1 = new JLabel("Search a Purchest Car");
		lblNewLabel_1_1.setBounds(673, 558, 150, 16);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		Home_Page.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(0, 74, 839, 532);
		lblNewLabel_1.setIcon(new ImageIcon("WallPaper.png"));
		Home_Page.add(lblNewLabel_1);
		
		ImageIcon imgm = new ImageIcon("WallPaper.png");
		Image imgmg  = imgm.getImage();
		Image sca = imgmg.getScaledInstance(839, 540, Image.SCALE_SMOOTH);
			imgm= new ImageIcon(sca);
			lblNewLabel_1.setIcon(imgm);
		
		 User_interface = new JPanel();
		layeredPane.add(User_interface, "name_105051055273916");
		User_interface.setLayout(new GridLayout(0, 1, 0, 0));
		
		JPanel USER_inner_Pane = new JPanel();
		User_interface.add(USER_inner_Pane);
		USER_inner_Pane.setLayout(null);
		USER_inner_Pane.setBackground(Color.WHITE);
		
		JButton btnNewButton_6 = new JButton("");
		btnNewButton_6.setFocusable(false);
		btnNewButton_6.setBorderPainted(false);
		btnNewButton_6.setBorder(null);
		btnNewButton_6.setBackground(Color.WHITE);
		btnNewButton_6.setBounds(0, 6, 73, 52);
		USER_inner_Pane.add(btnNewButton_6);
		btnNewButton_6.setIcon(im);
		
		JLabel Logo_1 = new JLabel("");
		Logo_1.setHorizontalAlignment(SwingConstants.CENTER);
		Logo_1.setBounds(211, 6, 449, 58);
		Logo_1.setIcon(img);
		USER_inner_Pane.add(Logo_1);
		
		JLabel lblNewLabel_3 = new JLabel("View Cars");
		lblNewLabel_3.setBounds(76, 310, 61, 16);
		USER_inner_Pane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("View Active contracts");
		lblNewLabel_3_1.setBounds(340, 310, 146, 16);
		USER_inner_Pane.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("View Personal information");
		lblNewLabel_3_2.setBounds(637, 310, 183, 16);
		USER_inner_Pane.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("Support");
		lblNewLabel_3_3.setBounds(76, 513, 61, 16);
		USER_inner_Pane.add(lblNewLabel_3_3);
		
		JButton UserInterface_CarShowRoom_btn = new JButton("");
		UserInterface_CarShowRoom_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(Car_Showroom);
			}
		});
		UserInterface_CarShowRoom_btn.setBorderPainted(false);
		UserInterface_CarShowRoom_btn.setIcon(new ImageIcon("carlogo.png"));
		UserInterface_CarShowRoom_btn.setBounds(48, 195, 117, 93);
		USER_inner_Pane.add(UserInterface_CarShowRoom_btn);
		
		JButton UserInterface_Contracts_btn = new JButton("");
		UserInterface_Contracts_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Switch(Active_contracts);
			}
		});
		UserInterface_Contracts_btn.setIcon(new ImageIcon("serlogo.png"));
		UserInterface_Contracts_btn.setBorderPainted(false);
		UserInterface_Contracts_btn.setBounds(346, 182, 117, 115);
		USER_inner_Pane.add(UserInterface_Contracts_btn);
		
		JButton UserInterface_PersonalInfo_btn = new JButton("");
		UserInterface_PersonalInfo_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Switch(Personal_info_Panel);
			}
		});
		UserInterface_PersonalInfo_btn.setBorderPainted(false);
		UserInterface_PersonalInfo_btn.setIcon(new ImageIcon("UserProfile.png"));
		UserInterface_PersonalInfo_btn.setBounds(666, 195, 117, 93);
		USER_inner_Pane.add(UserInterface_PersonalInfo_btn);
		
		JButton UserInterface_Support_btn = new JButton("");
		UserInterface_Support_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(Support_cust);
			}
		});
		UserInterface_Support_btn.setBorderPainted(false);
		UserInterface_Support_btn.setIcon(new ImageIcon("support.png"));
		UserInterface_Support_btn.setBounds(48, 408, 117, 93);
		USER_inner_Pane.add(UserInterface_Support_btn);
		
		JButton UserInterface_Branches_btn = new JButton("");
		UserInterface_Branches_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(Branches);
			}
		});
		UserInterface_Branches_btn.setIcon(new ImageIcon("Locus_LO.png"));
		UserInterface_Branches_btn.setBorderPainted(false);
		UserInterface_Branches_btn.setBounds(666, 392, 117, 109);
		USER_inner_Pane.add(UserInterface_Branches_btn);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Branches");
		lblNewLabel_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1_1.setBounds(678, 513, 105, 16);
		USER_inner_Pane.add(lblNewLabel_3_1_1);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(Home_Page);
				
				isSignIN = false;
			}
		});
		btnNewButton_1.setIcon(new ImageIcon("Logout.png"));
		btnNewButton_1.setBorderPainted(false);
		btnNewButton_1.setBounds(346, 408, 117, 93);
		USER_inner_Pane.add(btnNewButton_1);
		
		JLabel lblNewLabel_3_3_1 = new JLabel("Log out");
		lblNewLabel_3_3_1.setBounds(379, 513, 61, 16);
		USER_inner_Pane.add(lblNewLabel_3_3_1);
		
		 Sign_up_Page = new JPanel();
		layeredPane.add(Sign_up_Page, "name_105056510804428");
		Sign_up_Page.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(430, 117, 409, 414);
		Sign_up_Page.add(panel);
		panel.setLayout(null);
		
		SginInPage_Username_TXTF = new JTextField();
		SginInPage_Username_TXTF.setBackground(UIManager.getColor("Button.background"));
		SginInPage_Username_TXTF.setBounds(93, 123, 203, 32);
		panel.add(SginInPage_Username_TXTF);
		SginInPage_Username_TXTF.setColumns(10);
		
		SginInPage_Password_TXTF = new JPasswordField();
		SginInPage_Password_TXTF.setBackground(UIManager.getColor("Button.background"));
		SginInPage_Password_TXTF.setBounds(93, 244, 203, 32);
		panel.add(SginInPage_Password_TXTF);
		
		JButton SginInPage_SingIn_btn = new JButton("Sign in");
		SginInPage_SingIn_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String USR_name = SginInPage_Username_TXTF.getText();
				String Password = SginInPage_Password_TXTF.getText();
				
			 isSignIN=	signIn(USR_name,Password);
				
			if(isSignIN == true && !USR_name.trim().equals("admin")) {
				Switch(User_interface);
				System.out.println(pos);
			}else if(isSignIN == true && USR_name.trim().equals("admin")){
				
			}else {
				JOptionPane.showMessageDialog(null , "User name Or Password incorrect ! " , "ERROR" , JOptionPane.ERROR_MESSAGE);
				SginInPage_Username_TXTF.setText("");
				SginInPage_Password_TXTF.setText("");
			}
				
			SginInPage_Username_TXTF.setText("");
			SginInPage_Password_TXTF.setText("");
				
			}
		});
		SginInPage_SingIn_btn.setBackground(UIManager.getColor("Button.background"));
		SginInPage_SingIn_btn.setBounds(134, 322, 117, 29);
		panel.add(SginInPage_SingIn_btn);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("17004.png"));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(16, 108, 71, 60);
		panel.add(lblNewLabel_2);
		
		ImageIcon d = new ImageIcon("17004.png");
		Image j = d.getImage();
		Image scall = j.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		d = new ImageIcon(scall);
		lblNewLabel_2.setIcon(d);
		
		
		
		JLabel lblNewLabel_2_1 = new JLabel("");
		lblNewLabel_2_1.setIcon(new ImageIcon("102643.png"));
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setBounds(16, 233, 71, 60);
		panel.add(lblNewLabel_2_1);
		ImageIcon dd = new ImageIcon("102643.png");
		Image jj = dd.getImage();
		Image scal = jj.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		dd = new ImageIcon(scal);
		lblNewLabel_2_1.setIcon(dd);
		
		JLabel lblNewLabel_5 = new JLabel("Login to Account ");
		lblNewLabel_5.setFont(new Font("Mukta Mahee", Font.PLAIN, 19));
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBounds(104, 35, 192, 45);
		panel.add(lblNewLabel_5);
		
		ImageIcon ddd = new ImageIcon("audi.png");
		Image jjj = ddd.getImage();
		Image sss = jjj.getScaledInstance(839, 606, Image.SCALE_SMOOTH);
		ddd = new ImageIcon(sss);
		
		JButton btnNewButton_3 = new JButton("⬅");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Switch(Home_Page);
			}
		});
		btnNewButton_3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btnNewButton_3.setBounds(0, 0, 117, 33);
		Sign_up_Page.add(btnNewButton_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("audi.png"));
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(0, 0, 839, 606);
		Sign_up_Page.add(lblNewLabel_4);
		lblNewLabel_4.setIcon(ddd);
		
		 Register_user = new JPanel();
		layeredPane.add(Register_user, "name_105059814546582");
		Register_user.setLayout(null);
		
		RegisterPage_Fname_TXTF = new JTextField();
		RegisterPage_Fname_TXTF.setBackground(UIManager.getColor("Button.background"));
		RegisterPage_Fname_TXTF.setBounds(20, 34, 187, 45);
		Register_user.add(RegisterPage_Fname_TXTF);
		RegisterPage_Fname_TXTF.setColumns(10);
		
		RegisterPage_MidName_TXTF = new JTextField();
		RegisterPage_MidName_TXTF.setBackground(UIManager.getColor("Button.background"));
		RegisterPage_MidName_TXTF.setColumns(10);
		RegisterPage_MidName_TXTF.setBounds(20, 130, 187, 45);
		Register_user.add(RegisterPage_MidName_TXTF);
		
		RegisterPage_Lname_TXTF = new JTextField();
		RegisterPage_Lname_TXTF.setBackground(UIManager.getColor("Button.background"));
		RegisterPage_Lname_TXTF.setColumns(10);
		RegisterPage_Lname_TXTF.setBounds(20, 232, 187, 45);
		Register_user.add(RegisterPage_Lname_TXTF);
		
		RegisterPage_Email_TXTF = new JTextField();
		RegisterPage_Email_TXTF.setBackground(UIManager.getColor("Button.background"));
		RegisterPage_Email_TXTF.setColumns(10);
		RegisterPage_Email_TXTF.setBounds(20, 329, 187, 45);
		Register_user.add(RegisterPage_Email_TXTF);
		
		JComboBox RegisterPage_AccountKind_ComboBox = new JComboBox();
		RegisterPage_AccountKind_ComboBox.setBounds(610, 34, 170, 35);
		Register_user.add(RegisterPage_AccountKind_ComboBox);
		
		JLabel lblNewLabel_6 = new JLabel("First name");
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBounds(47, 22, 129, 16);
		Register_user.add(lblNewLabel_6);
		
		JLabel lblNewLabel_6_1 = new JLabel("Middle name");
		lblNewLabel_6_1.setForeground(Color.WHITE);
		lblNewLabel_6_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_1.setBounds(47, 114, 129, 16);
		Register_user.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_6_2 = new JLabel("Last name");
		lblNewLabel_6_2.setForeground(Color.WHITE);
		lblNewLabel_6_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_2.setBounds(47, 215, 129, 16);
		Register_user.add(lblNewLabel_6_2);
		
		JLabel lblNewLabel_6_3 = new JLabel("Email Address");
		lblNewLabel_6_3.setForeground(Color.WHITE);
		lblNewLabel_6_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3.setBounds(47, 301, 129, 16);
		Register_user.add(lblNewLabel_6_3);
		
		RegisterPage_Age_TXTF = new JTextField();
		RegisterPage_Age_TXTF.setBackground(UIManager.getColor("Button.background"));
		RegisterPage_Age_TXTF.setColumns(10);
		RegisterPage_Age_TXTF.setBounds(337, 34, 187, 45);
		Register_user.add(RegisterPage_Age_TXTF);
		
		RegisterPage_Password_TXTF = new JTextField();
		RegisterPage_Password_TXTF.setBackground(UIManager.getColor("Button.background"));
		RegisterPage_Password_TXTF.setColumns(10);
		RegisterPage_Password_TXTF.setBounds(337, 130, 187, 45);
		Register_user.add(RegisterPage_Password_TXTF);
		
		RegisterPage_RE_Password_TXTF = new JTextField();
		RegisterPage_RE_Password_TXTF.setBackground(UIManager.getColor("Button.background"));
		RegisterPage_RE_Password_TXTF.setColumns(10);
		RegisterPage_RE_Password_TXTF.setBounds(337, 232, 187, 45);
		Register_user.add(RegisterPage_RE_Password_TXTF);
		
		RegisterPage_Country_TXTF = new JTextField();
		RegisterPage_Country_TXTF.setBackground(UIManager.getColor("Button.background"));
		RegisterPage_Country_TXTF.setColumns(10);
		RegisterPage_Country_TXTF.setBounds(337, 329, 187, 45);
		Register_user.add(RegisterPage_Country_TXTF);
		
		JLabel lblNewLabel_6_3_1 = new JLabel("Age");
		lblNewLabel_6_3_1.setForeground(Color.WHITE);
		lblNewLabel_6_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3_1.setBounds(364, 22, 129, 16);
		Register_user.add(lblNewLabel_6_3_1);
		
		JLabel lblNewLabel_6_3_1_1 = new JLabel("PassWord");
		lblNewLabel_6_3_1_1.setForeground(Color.WHITE);
		lblNewLabel_6_3_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3_1_1.setBounds(364, 114, 129, 16);
		Register_user.add(lblNewLabel_6_3_1_1);
		
		JLabel lblNewLabel_6_3_1_1_1 = new JLabel("Re Enter Password");
		lblNewLabel_6_3_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_6_3_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3_1_1_1.setBounds(364, 215, 129, 16);
		Register_user.add(lblNewLabel_6_3_1_1_1);
		
		JLabel lblNewLabel_6_3_1_1_1_1 = new JLabel("Country");
		lblNewLabel_6_3_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_6_3_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6_3_1_1_1_1.setBounds(364, 315, 129, 16);
		Register_user.add(lblNewLabel_6_3_1_1_1_1);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon("addpic.png"));
		lblNewLabel_7.setBounds(567, 246, 266, 220);
		Register_user.add(lblNewLabel_7);
		
		
		
		 Car_Showroom = new JPanel();
		layeredPane.add(Car_Showroom, "name_105062844972215");
		Car_Showroom.setLayout(null);
		ImageIcon e = new ImageIcon("Ford-Expedition-XLT-MAX-4x4-2020.jpg");
		Image f = e.getImage();
		Image z = f.getScaledInstance(248, 267, Image.SCALE_SMOOTH);
		e = new ImageIcon(z);
		ImageIcon ee = new ImageIcon("Used-Cars-Sale-gear-patrol-dodge-challenger.jpg");
		Image ff = ee.getImage();
		Image zz = ff.getScaledInstance(248, 267, Image.SCALE_SMOOTH);
		ee = new ImageIcon(zz);
		ImageIcon eee = new ImageIcon("ext_GAZ_deg01.jpg");
		Image fff = eee.getImage();
		Image zzz = fff.getScaledInstance(248, 267, Image.SCALE_SMOOTH);
		eee = new ImageIcon(zzz);
		ImageIcon eeee = new ImageIcon("a61.jpg");
		Image ffff = eeee.getImage();
		Image zzzz = ffff.getScaledInstance(248, 267, Image.SCALE_SMOOTH);
		eeee = new ImageIcon(zzzz);
		
		ImageIcon eeeee = new ImageIcon("ext_G1M_deg01.jpg");
		Image fffff = eeeee.getImage();
		Image zzzzz = fffff.getScaledInstance(248, 267, Image.SCALE_SMOOTH);
		eeeee = new ImageIcon(zzzzz);
		ImageIcon eeeeee = new ImageIcon("audi-a6.jpg");
		Image ffffff = eeeeee.getImage();
		Image zzzzzz = ffffff.getScaledInstance(248, 267, Image.SCALE_SMOOTH);
		eeeeee = new ImageIcon(zzzzzz);
		
		
		
		
		JLabel lblNewLabel_10 = new JLabel("Filter by");
		lblNewLabel_10.setBounds(527, 11, 61, 16);
		Car_Showroom.add(lblNewLabel_10);
		
		JLabel lblNewLabel_30 = new JLabel("Cars");
		lblNewLabel_30.setBounds(234, 0, 249, 51);
		lblNewLabel_30.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
		Car_Showroom.add(lblNewLabel_30);
		
		JComboBox Car_Showroom_FilterBy_ComboBox = new JComboBox();
		Car_Showroom_FilterBy_ComboBox.setBounds(610, 6, 229, 27);
		Car_Showroom.add(Car_Showroom_FilterBy_ComboBox);
		
		JScrollPane Car_Showroom_ScrollPane = new JScrollPane();
		Car_Showroom_ScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		Car_Showroom_ScrollPane.setBounds(10, 63, 823, 595);
		Car_Showroom.add(Car_Showroom_ScrollPane);
		
		
		JPanel panel_1 = new JPanel();
		Car_Showroom_ScrollPane.setViewportView(panel_1);
		
	   
		panel_1.setPreferredSize(new Dimension(500,1200));
		panel_1.setLayout(null);
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(6, 6, 248, 317);
		panel_1.add(panel_2);
		panel_2.setLayout(null);
		
		JButton btnNewButton_14 = new JButton("Buy");
		
		btnNewButton_14.setBounds(68, 282, 117, 29);
		panel_2.add(btnNewButton_14);
		
		 PIC = new JLabel("");
		PIC.setIcon(new ImageIcon("Ford-Expedition-XLT-MAX-4x4-2020.jpg"));
		PIC.setBounds(0, 0, 248, 203);
		panel_2.add(PIC);
		PIC.setIcon(e);
		
		JLabel CAR_PAN_ID = new JLabel("1000");
		CAR_PAN_ID.setBounds(6, 230, 91, 29);
		panel_2.add(CAR_PAN_ID);
		
		JLabel CAR_PAN_NAME = new JLabel("Ford");
		CAR_PAN_NAME.setBounds(125, 230, 91, 29);
		panel_2.add(CAR_PAN_NAME);
		
		JPanel panel_2_1 = new JPanel();
		panel_2_1.setBounds(303, 6, 248, 317);
		panel_1.add(panel_2_1);
		panel_2_1.setLayout(null);
		
		 PIC2 = new JLabel("");
		PIC2.setIcon(new ImageIcon("Used-Cars-Sale-gear-patrol-dodge-challenger.jpg"));
		PIC2.setBounds(0, 0, 248, 196);
		panel_2_1.add(PIC2);
		PIC2.setIcon(ee);
		
		
		JButton btnNewButton_14_1 = new JButton("Buy");
		
		btnNewButton_14_1.setBounds(65, 282, 117, 29);
		panel_2_1.add(btnNewButton_14_1);
		
		JLabel CAR_PAN_ID_2 = new JLabel("1001");
		CAR_PAN_ID_2.setBounds(19, 226, 91, 29);
		panel_2_1.add(CAR_PAN_ID_2);
		
		JLabel CAR_PAN_NAME_2 = new JLabel("Chalinger");
		CAR_PAN_NAME_2.setBounds(138, 226, 91, 29);
		panel_2_1.add(CAR_PAN_NAME_2);
		
		JPanel panel_2_1_1 = new JPanel();
		panel_2_1_1.setBounds(581, 6, 217, 317);
		panel_1.add(panel_2_1_1);
		panel_2_1_1.setLayout(null);
		
		 PIC3 = new JLabel("");
		PIC3.setIcon(new ImageIcon("ext_GAZ_deg01.jpg"));
		PIC3.setBounds(0, 0, 223, 204);
		panel_2_1_1.add(PIC3);
		PIC3.setIcon(eee);
		
		JButton btnNewButton_14_1_1 = new JButton("Buy");
		
		btnNewButton_14_1_1.setBounds(60, 282, 117, 29);
		panel_2_1_1.add(btnNewButton_14_1_1);
		
		JLabel CAR_PAN_ID_3 = new JLabel("1003");
		CAR_PAN_ID_3.setBounds(6, 235, 91, 29);
		panel_2_1_1.add(CAR_PAN_ID_3);
		
		JLabel CAR_PAN_NAME_3 = new JLabel("Malibu");
		CAR_PAN_NAME_3.setBounds(125, 235, 91, 29);
		panel_2_1_1.add(CAR_PAN_NAME_3);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setBounds(6, 6, 248, 191);
		panel_1.add(lblNewLabel_11);
		
		JPanel panel_2_2 = new JPanel();
		panel_2_2.setBounds(6, 335, 248, 317);
		panel_2_2.setLayout(null);
		panel_1.add(panel_2_2);
		
		JButton btnNewButton_14_2 = new JButton("Buy");
		btnNewButton_14_2.setBounds(68, 282, 117, 29);
		panel_2_2.add(btnNewButton_14_2);
		
		JLabel lblNewLabel_12_2 = new JLabel("");
		lblNewLabel_12_2.setIcon(new ImageIcon("a61.jpg"));
		lblNewLabel_12_2.setBounds(0, 0, 248, 267);
		panel_2_2.add(lblNewLabel_12_2);
		lblNewLabel_12_2.setIcon(eeee);
		
		JPanel panel_2_2_1 = new JPanel();
		panel_2_2_1.setBounds(303, 335, 248, 317);
		panel_2_2_1.setLayout(null);
		panel_1.add(panel_2_2_1);
		
		JButton btnNewButton_14_2_1 = new JButton("Buy");
		btnNewButton_14_2_1.setBounds(68, 282, 117, 29);
		panel_2_2_1.add(btnNewButton_14_2_1);
		
		JLabel lblNewLabel_12_2_1 = new JLabel("");
		lblNewLabel_12_2_1.setIcon(new ImageIcon("ext_G1M_deg01.jpg"));
		lblNewLabel_12_2_1.setBounds(0, 0, 248, 267);
		panel_2_2_1.add(lblNewLabel_12_2_1);
		lblNewLabel_12_2_1.setIcon(eeeee);
		
		JPanel panel_2_2_1_1 = new JPanel();
		panel_2_2_1_1.setBounds(581, 335, 248, 317);
		panel_2_2_1_1.setLayout(null);
		panel_1.add(panel_2_2_1_1);
		
		JButton btnNewButton_14_2_1_1 = new JButton("Buy");
		btnNewButton_14_2_1_1.setBounds(68, 282, 117, 29);
		panel_2_2_1_1.add(btnNewButton_14_2_1_1);
		
		JLabel lblNewLabel_12_2_1_1 = new JLabel("");
		lblNewLabel_12_2_1_1.setIcon(new ImageIcon("audi-a6.jpg"));
		lblNewLabel_12_2_1_1.setBounds(0, 0, 248, 267);
		panel_2_2_1_1.add(lblNewLabel_12_2_1_1);
		lblNewLabel_12_2_1_1.setIcon(eeeeee);
		
		JButton btnNewButton_24 = new JButton("");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(Home_Page);
			}
		});
		btnNewButton_24.setIcon(new ImageIcon("home.png"));
		btnNewButton_24.setBorderPainted(false);
		btnNewButton_24.setBounds(6, 436, 117, 112);
		Car_Showroom.add(btnNewButton_24);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(isSignIN) {
					Switch(User_interface);
				}else {
					Switch(Home_Page);
				}
			}
		});
		btnNewButton_2.setBorderPainted(false);
		btnNewButton_2.setIcon(new ImageIcon("home.png"));
		btnNewButton_2.setBounds(10, 0, 117, 61);
		Car_Showroom.add(btnNewButton_2);
		
	
		ImageIcon dddd = new ImageIcon("addpic.png");
		Image jjjj = dddd.getImage();
		Image ssss = jjjj.getScaledInstance(200, 220, Image.SCALE_SMOOTH);
		dddd = new ImageIcon(ssss);
		lblNewLabel_7.setIcon(dddd);
		
		JRadioButton RegisterPage_Female_Radiobtn = new JRadioButton("Female");
		RegisterPage_Female_Radiobtn.setForeground(Color.WHITE);
		RegisterPage_Female_Radiobtn.setBounds(692, 130, 88, 23);
		Register_user.add(RegisterPage_Female_Radiobtn);
		
		JRadioButton RegisterPage_male_Radiobtn = new JRadioButton("Male");
		RegisterPage_male_Radiobtn.setForeground(Color.WHITE);
		RegisterPage_male_Radiobtn.setBounds(607, 130, 73, 23);
		Register_user.add(RegisterPage_male_Radiobtn);
		
		JCheckBox RegisterPage_Conditions_CheckBox = new JCheckBox("I accept all the terms and Conditions");
		RegisterPage_Conditions_CheckBox.setForeground(Color.WHITE);
		RegisterPage_Conditions_CheckBox.setBounds(6, 443, 274, 23);
		Register_user.add(RegisterPage_Conditions_CheckBox);
		
		JCheckBox RegisterPage_Offers_CheckBox = new JCheckBox("I want to receive lastest offers on email");
		RegisterPage_Offers_CheckBox.setForeground(Color.WHITE);
		RegisterPage_Offers_CheckBox.setBounds(6, 478, 312, 23);
		Register_user.add(RegisterPage_Offers_CheckBox);
		
		JButton RegisterPage_CreateAccount_btn = new JButton("Create Account");
		RegisterPage_CreateAccount_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(Car_Showroom);
			}
		});
		RegisterPage_CreateAccount_btn.setBounds(613, 498, 161, 45);
		Register_user.add(RegisterPage_CreateAccount_btn);
		
		JLabel lblNewLabel_8 = new JLabel("Account Category");
		lblNewLabel_8.setForeground(Color.WHITE);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(613, 22, 155, 16);
		Register_user.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setForeground(Color.WHITE);
		lblNewLabel_9.setIcon(new ImageIcon("back.png"));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(0, 0, 839, 606);
		Register_user.add(lblNewLabel_9);
		ImageIcon ddddd = new ImageIcon("back.png");
		Image jjjjj = ddddd.getImage();
		Image sssss = jjjjj.getScaledInstance(839, 606, Image.SCALE_SMOOTH);
		ddddd = new ImageIcon(sssss);
		lblNewLabel_9.setIcon(ddddd);
		
	
		 Active_contracts = new JPanel();
		 Active_contracts.setBackground(Color.WHITE);
		layeredPane.add(Active_contracts, "name_105066062940065");
		Active_contracts.setLayout(null);
		
		ActiveContracts_Search_TXTF = new JTextField();
		ActiveContracts_Search_TXTF.setBackground(UIManager.getColor("Button.background"));
		ActiveContracts_Search_TXTF.setBounds(6, 6, 385, 54);
		Active_contracts.add(ActiveContracts_Search_TXTF);
		ActiveContracts_Search_TXTF.setColumns(10);
		
		JButton ActiveContracts_Search_btn = new JButton("");
		ActiveContracts_Search_btn.setBorderPainted(false);
		ActiveContracts_Search_btn.setIcon(new ImageIcon("search.png"));
		ActiveContracts_Search_btn.setBounds(403, 6, 67, 54);
		Active_contracts.add(ActiveContracts_Search_btn);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		scrollPane_2.setBounds(6, 77, 827, 439);
		Active_contracts.add(scrollPane_2);
		
		 panel_3 = new JPanel();
		scrollPane_2.setViewportView(panel_3);
		panel_3.setLayout(new GridLayout(20,2));
		
		
		
		JLabel lblNewLabel_31 = new JLabel("Active Contracts");
		lblNewLabel_31.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblNewLabel_31.setBackground(Color.WHITE);
		lblNewLabel_31.setForeground(Color.BLACK);
		lblNewLabel_31.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_31.setBounds(479, 0, 354, 71);
		Active_contracts.add(lblNewLabel_31);
		
		JButton ActiveContracts_Home_btn = new JButton("");
		ActiveContracts_Home_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(isSignIN == true) {
					Switch(User_interface);
				}else {
					Switch(Home_Page);
				}
				
			}
		});
		ActiveContracts_Home_btn.setIcon(new ImageIcon("home.png"));
		ActiveContracts_Home_btn.setBounds(0, 518, 126, 82);
		Active_contracts.add(ActiveContracts_Home_btn);
		 About_Us = new JPanel();
		About_Us.setBackground(Color.WHITE);
		layeredPane.add(About_Us, "name_105068830652138");
		About_Us.setLayout(null);
		About_us_header.setBackground(Color.WHITE);
		About_us_header.setBounds(0, 0, 839, 71);
		About_Us.add(About_us_header);
		About_us_header.setLayout(null);
		
		JLabel lblNewLabel_15 = new JLabel("");
		lblNewLabel_15.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_15.setBounds(152, 0, 496, 71);
		About_us_header.add(lblNewLabel_15);
		lblNewLabel_15.setIcon(img);
		
		JButton btnNewButton_18 = new JButton("");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(Home_Page);
			}
		});
		btnNewButton_18.setBorderPainted(false);
		btnNewButton_18.setIcon(new ImageIcon("home.png"));
		btnNewButton_18.setBounds(0, 0, 95, 71);
		About_us_header.add(btnNewButton_18);
		
		JTextArea txtrWeCouldTell = new JTextArea();
		txtrWeCouldTell.setEditable(false);
		txtrWeCouldTell.setDragEnabled(false);
		txtrWeCouldTell.setText("We could tell you all about how, as an award-winning retailer, we are the leading car supermarket in the KSA, that we have thousands of cars in stock, or even how we make sure our cars are the most competitively-priced in the country with our Price Match Promise... but instead, we’ve produced this short video for you to watch. At CarShop, we’re huge fans of helping others! And because we’re dedicated to making a real difference, we’ve coined the term “CarShop Cares” for our charity programme. Working closely with our partner, Global’s Make Some Noise, we're committed to supporting children and young people in our communities and throughout the KSA.");
		txtrWeCouldTell.setBounds(128, 153, 561, 157);
		
		About_Us.add(txtrWeCouldTell);
		txtrWeCouldTell.setLineWrap(true);
		txtrWeCouldTell.setWrapStyleWord(true);
		
		JLabel lblNewLabel_16 = new JLabel("");
		lblNewLabel_16.setIcon(new ImageIcon("Screen Shot 2021-03-18 at 8.44.45 PM.png"));
		lblNewLabel_16.setBounds(0, 395, 343, 211);
		About_Us.add(lblNewLabel_16);
		
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon("wave.GIF"));
		lblNewLabel_17.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_17.setBounds(0, 71, 839, 535);
		About_Us.add(lblNewLabel_17);
		 ADMIN_PANE = new JPanel();
		layeredPane.add(ADMIN_PANE, "name_105071605393198");
		ADMIN_PANE.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(0, 0, 839, 77);
		ADMIN_PANE.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_18 = new JLabel("");
		lblNewLabel_18.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_18.setBounds(206, 0, 436, 77);
		panel_5.add(lblNewLabel_18);
		lblNewLabel_18.setIcon(img);
		
		JButton btnNewButton_19 = new JButton("");
		btnNewButton_19.setBorderPainted(false);
		btnNewButton_19.setIcon(im);
		btnNewButton_19.setBounds(0, 0, 106, 77);
		panel_5.add(btnNewButton_19);
		
		JButton ADMINPANE_addEmployee_btn = new JButton("");
		ADMINPANE_addEmployee_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Switch(Manage_Emp);
				
			}
		});
		ADMINPANE_addEmployee_btn.setIcon(new ImageIcon("Add_emp.png"));
		ADMINPANE_addEmployee_btn.setBorderPainted(false);
		ADMINPANE_addEmployee_btn.setBounds(37, 164, 154, 106);
		ADMIN_PANE.add(ADMINPANE_addEmployee_btn);
		
		JButton ADMINPANE_ManageCustomers_btn = new JButton("");
		ADMINPANE_ManageCustomers_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(Magane_CUST);
			}
		});
		ADMINPANE_ManageCustomers_btn.setIcon(new ImageIcon("CUST.png"));
		ADMINPANE_ManageCustomers_btn.setBorderPainted(false);
		ADMINPANE_ManageCustomers_btn.setBounds(668, 164, 154, 106);
		ADMIN_PANE.add(ADMINPANE_ManageCustomers_btn);
		
		
		JButton ADMINPANE_Logout_btn = new JButton("");
		ADMINPANE_Logout_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Switch(Home_Page);
			}
		});
		ADMINPANE_Logout_btn.setIcon(new ImageIcon("Logout.png"));
		ADMINPANE_Logout_btn.setBorderPainted(false);
		ADMINPANE_Logout_btn.setBounds(512, 414, 154, 106);
		ADMIN_PANE.add(ADMINPANE_Logout_btn);
		
		JLabel lblNewLabel_19_1 = new JLabel("Add Employee");
		lblNewLabel_19_1.setForeground(Color.WHITE);
		lblNewLabel_19_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19_1.setBounds(47, 267, 132, 21);
		ADMIN_PANE.add(lblNewLabel_19_1);
		
		JLabel lblNewLabel_19_1_1 = new JLabel("Customers Requests");
		lblNewLabel_19_1_1.setForeground(Color.WHITE);
		lblNewLabel_19_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19_1_1.setBounds(678, 267, 132, 21);
		ADMIN_PANE.add(lblNewLabel_19_1_1);
		
		JLabel lblNewLabel_19_1_1_1 = new JLabel("Log out");
		lblNewLabel_19_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_19_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19_1_1_1.setBounds(522, 532, 132, 21);
		ADMIN_PANE.add(lblNewLabel_19_1_1_1);
		
		JLabel lblNewLabel_19_1_1_1_1 = new JLabel("Customer Support");
		lblNewLabel_19_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_19_1_1_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_19_1_1_1_1.setBounds(193, 532, 132, 21);
		ADMIN_PANE.add(lblNewLabel_19_1_1_1_1);
		ImageIcon h = new ImageIcon("manager.png");
		Image hh = h.getImage();
		Image hhh = hh.getScaledInstance(839,530 , Image.SCALE_SMOOTH);
		h = new ImageIcon(hhh);
		
		 Manage_Emp = new JPanel();
		layeredPane.add(Manage_Emp, "name_105081092071292");
		Manage_Emp.setLayout(null);
		
		ADMINPANE_addEmployee_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(Manage_Emp);
			}
		});
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel_6.setBounds(54, 58, 711, 503);
		Manage_Emp.add(panel_6);
		panel_6.setLayout(null);
		
		Manage_Emp_Fname_TXTF = new JTextField();
		Manage_Emp_Fname_TXTF.setBackground(UIManager.getColor("Button.background"));
		Manage_Emp_Fname_TXTF.setBounds(6, 59, 254, 43);
		panel_6.add(Manage_Emp_Fname_TXTF);
		Manage_Emp_Fname_TXTF.setColumns(10);
		
		Manage_Emp_Midname_TXTF = new JTextField();
		Manage_Emp_Midname_TXTF.setBackground(UIManager.getColor("Button.background"));
		Manage_Emp_Midname_TXTF.setColumns(10);
		Manage_Emp_Midname_TXTF.setBounds(6, 143, 254, 43);
		panel_6.add(Manage_Emp_Midname_TXTF);
		
		Manage_Emp_Lname_TXTF = new JTextField();
		Manage_Emp_Lname_TXTF.setBackground(UIManager.getColor("Button.background"));
		Manage_Emp_Lname_TXTF.setColumns(10);
		Manage_Emp_Lname_TXTF.setBounds(6, 228, 254, 43);
		panel_6.add(Manage_Emp_Lname_TXTF);
		
		Manage_Emp_Email_TXTF = new JTextField();
		Manage_Emp_Email_TXTF.setBackground(UIManager.getColor("Button.background"));
		Manage_Emp_Email_TXTF.setColumns(10);
		Manage_Emp_Email_TXTF.setBounds(6, 310, 254, 43);
		panel_6.add(Manage_Emp_Email_TXTF);
		
		Manage_Emp_Salary_TXTF = new JTextField();
		Manage_Emp_Salary_TXTF.setBackground(UIManager.getColor("Button.background"));
		Manage_Emp_Salary_TXTF.setColumns(10);
		Manage_Emp_Salary_TXTF.setBounds(426, 59, 254, 43);
		panel_6.add(Manage_Emp_Salary_TXTF);
		
		JLabel lblNewLabel_21 = new JLabel("First name");
		lblNewLabel_21.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21.setBounds(68, 44, 119, 16);
		panel_6.add(lblNewLabel_21);
		
		JLabel lblNewLabel_21_2 = new JLabel("Last name");
		lblNewLabel_21_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21_2.setBounds(68, 215, 119, 16);
		panel_6.add(lblNewLabel_21_2);
		
		JLabel lblNewLabel_21_1 = new JLabel("Middle name");
		lblNewLabel_21_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21_1.setBounds(68, 127, 119, 16);
		panel_6.add(lblNewLabel_21_1);
		
		JLabel lblNewLabel_21_3 = new JLabel("E-Mail");
		lblNewLabel_21_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21_3.setBounds(68, 293, 119, 16);
		panel_6.add(lblNewLabel_21_3);
		
		JLabel lblNewLabel_21_3_1 = new JLabel("Salary");
		lblNewLabel_21_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_21_3_1.setBounds(494, 44, 119, 16);
		panel_6.add(lblNewLabel_21_3_1);
		
		JComboBox Manage_Emp_Position_ComboBox = new JComboBox();
		Manage_Emp_Position_ComboBox.setBounds(426, 144, 254, 43);
		panel_6.add(Manage_Emp_Position_ComboBox);
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(isSignIN != false) {
					BuyCar_CarName_LBL.setText(CAR_PAN_NAME.getText());
					BuyCar_CarID_LBL.setText(CAR_PAN_ID.getText());
					CAR_PIC_BUY_PAN.setIcon( PIC.getIcon());
				
					Switch(Buy_car_Panel);
				}else {
					JOptionPane.showMessageDialog(null, "To buy a car you need to Sign in !" , "Alert" , JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		JRadioButton Manage_Emp_Male_Radiobtn = new JRadioButton("Male");
		Manage_Emp_Male_Radiobtn.setBounds(439, 237, 87, 23);
		panel_6.add(Manage_Emp_Male_Radiobtn);
		
		JRadioButton Manage_Emp_Female_Radiobtn = new JRadioButton("Female");
		Manage_Emp_Female_Radiobtn.setBounds(582, 237, 87, 23);
		panel_6.add(Manage_Emp_Female_Radiobtn);
		
		JLabel lblNewLabel_22 = new JLabel("Position");
		lblNewLabel_22.setBounds(533, 127, 61, 16);
		panel_6.add(lblNewLabel_22);
		
		JComboBox Manage_Emp_Branch_ComboBox = new JComboBox();
		Manage_Emp_Branch_ComboBox.setBounds(426, 321, 254, 23);
		panel_6.add(Manage_Emp_Branch_ComboBox);
		
		JLabel lblNewLabel_23 = new JLabel("Branch");
		lblNewLabel_23.setBounds(522, 293, 61, 16);
		panel_6.add(lblNewLabel_23);
		
		JButton Manage_Emp_Done_btn = new JButton("Done");
		Manage_Emp_Done_btn.setBackground(UIManager.getColor("Button.background"));
		Manage_Emp_Done_btn.setBounds(243, 404, 203, 60);
		panel_6.add(Manage_Emp_Done_btn);
		
		JLabel lblNewLabel_26 = new JLabel("");
		lblNewLabel_26.setIcon(new ImageIcon("docs.png"));
		lblNewLabel_26.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_26.setBounds(257, 59, 170, 298);
		panel_6.add(lblNewLabel_26);
		ImageIcon  p = new ImageIcon("docs.png");
		Image  pp = p.getImage();
		Image ppp = pp.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
		 p = new ImageIcon(ppp);
		 lblNewLabel_26.setIcon(p);
		 
		 JButton ActiveContracts_Home_btn_1 = new JButton("");
		 ActiveContracts_Home_btn_1.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		Switch(ADMIN_PANE);
		 	}
		 });
		 ActiveContracts_Home_btn_1.setIcon(new ImageIcon("home.png"));
		 ActiveContracts_Home_btn_1.setBounds(6, 420, 126, 82);
		 panel_6.add(ActiveContracts_Home_btn_1);
		
		JLabel lblNewLabel_24 = new JLabel("");
		lblNewLabel_24.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_24.setBounds(177, 6, 486, 51);
		Manage_Emp.add(lblNewLabel_24);
		lblNewLabel_24.setIcon(img);
		
		JLabel lblNewLabel_25 = new JLabel("");
		lblNewLabel_25.setIcon(new ImageIcon("f.png"));
		lblNewLabel_25.setBounds(0, 0, 839, 606);
		Manage_Emp.add(lblNewLabel_25);
		lblNewLabel_25.setIcon(ddddd);
		
		JButton btnNewButton_27_1 = new JButton("");
		btnNewButton_27_1.setBorderPainted(false);
		btnNewButton_27_1.setBounds(0, 0, 117, 86);
		Manage_Emp.add(btnNewButton_27_1);
		
		 Magane_CUST = new JPanel();
		 Magane_CUST.setBackground(Color.WHITE);
		layeredPane.add(Magane_CUST, "name_145288483501377");
		Magane_CUST.setLayout(null);
		
		JLabel lblNewLabel_27 = new JLabel("");
		lblNewLabel_27.setBounds(229, 0, 349, 82);
		lblNewLabel_27.setHorizontalAlignment(SwingConstants.CENTER);
		Magane_CUST.add(lblNewLabel_27);
		lblNewLabel_27.setIcon(img);
		JLabel lblNewLabel_28 = new JLabel("Manage Customers");
		lblNewLabel_28.setBounds(0, 94, 291, 59);
		lblNewLabel_28.setFont(new Font("Lucida Grande", Font.PLAIN, 21));
		lblNewLabel_28.setHorizontalAlignment(SwingConstants.CENTER);
		Magane_CUST.add(lblNewLabel_28);
		
		
		
		panel_7 = new JPanel(new GridLayout(60,20)) ;
		
			
		
		
		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		scrollPane_3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane_3.setViewportView(panel_7);
		scrollPane_3.setBounds(0, 165, 839, 402);
		Magane_CUST.add(scrollPane_3);
		
		JButton btnNewButton_23 = new JButton("");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(ADMIN_PANE);
			}
		});
		btnNewButton_23.setBorderPainted(false);
		btnNewButton_23.setBounds(0, 0, 134, 82);
		btnNewButton_23.setIcon(new ImageIcon("home.png"));
		Magane_CUST.add(btnNewButton_23);
		
		 Personal_info_Panel = new JPanel();
		layeredPane.add(Personal_info_Panel, "name_43337860291006");
		Personal_info_Panel.setLayout(null);
		
		JButton btnNewButton_7 = new JButton("");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(User_interface);
			}
		});
		
		btnNewButton_7.setIcon(new ImageIcon("home.png"));
		btnNewButton_7.setBorderPainted(false);
		btnNewButton_7.setBounds(0, 0, 140, 90);
		Personal_info_Panel.add(btnNewButton_7);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBounds(152, 72, 506, 513);
		Personal_info_Panel.add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("Name");
		lblNewLabel_13.setBounds(0, 36, 250, 45);
		panel_4.add(lblNewLabel_13);
		
		JLabel lblNewLabel_13_1 = new JLabel("ID");
		lblNewLabel_13_1.setBounds(0, 368, 250, 45);
		panel_4.add(lblNewLabel_13_1);
		
		JLabel PersonalInfoPage_ID_LBL = new JLabel("");
		PersonalInfoPage_ID_LBL.setBounds(262, 368, 222, 45);
		panel_4.add(PersonalInfoPage_ID_LBL);
		
		JLabel PersonalInfoPage_Name_LBL = new JLabel("");
		PersonalInfoPage_Name_LBL.setBounds(278, 36, 222, 45);
		panel_4.add(PersonalInfoPage_Name_LBL);
		
		JPanel Support_Admin = new JPanel();
		layeredPane.add(Support_Admin, "name_43875944677138");
		Support_Admin.setLayout(null);
		
		JScrollPane scrollPane_4 = new JScrollPane();
		scrollPane_4.setBounds(6, 128, 827, 393);
		Support_Admin.add(scrollPane_4);
		
		JPanel panel_8 = new JPanel();
		scrollPane_4.setViewportView(panel_8);
		
		panel_8.setPreferredSize(new Dimension(827,393));
		panel_8.setLayout(null);
		
		JLabel lblNewLabel_33 = new JLabel("Customer ID : ");
		lblNewLabel_33.setBounds(6, 6, 144, 32);
		panel_8.add(lblNewLabel_33);
		
		JLabel Support_ADMIN_ID_LBL = new JLabel("");
		Support_ADMIN_ID_LBL.setBounds(164, 6, 144, 32);
		panel_8.add(Support_ADMIN_ID_LBL);
		
		JLabel lblNewLabel_33_1 = new JLabel("Customer name : ");
		lblNewLabel_33_1.setBounds(365, 6, 144, 32);
		panel_8.add(lblNewLabel_33_1);
		
		JLabel Support_ADMIN_name_LBL = new JLabel("");
		Support_ADMIN_name_LBL.setBounds(542, 6, 144, 32);
		panel_8.add(Support_ADMIN_name_LBL);
		
		ADMIN_Support_cust_TXTF = new JTextField();
		ADMIN_Support_cust_TXTF.setEditable(false);
		ADMIN_Support_cust_TXTF.setBounds(6, 63, 802, 102);
		panel_8.add(ADMIN_Support_cust_TXTF);
		ADMIN_Support_cust_TXTF.setColumns(10);
		
		ADMIN_Support_response_TXTF = new JTextField();
		ADMIN_Support_response_TXTF.setColumns(10);
		ADMIN_Support_response_TXTF.setBounds(6, 202, 802, 102);
		panel_8.add(ADMIN_Support_response_TXTF);
		
		
		
		JLabel lblNewLabel_14 = new JLabel("Support");
		lblNewLabel_14.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblNewLabel_14.setBounds(71, 26, 133, 100);
		Support_Admin.add(lblNewLabel_14);
		
		JButton btnNewButton_20 = new JButton("");
		btnNewButton_20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(ADMIN_PANE);
			}
		});
		btnNewButton_20.setIcon(new ImageIcon("home.png"));
		btnNewButton_20.setBorderPainted(false);
		btnNewButton_20.setBounds(722, 6, 111, 100);
		Support_Admin.add(btnNewButton_20);
		
		 Support_cust = new JPanel();
		layeredPane.add(Support_cust, "name_44418835483826");
		Support_cust.setLayout(null);
		
		JTextArea SupportCust_textarea = new JTextArea();
		SupportCust_textarea.setBounds(114, 141, 588, 324);
		Support_cust.add(SupportCust_textarea);
		SupportCust_textarea.setWrapStyleWord(true);
		SupportCust_textarea.setLineWrap(true);
		JButton btnNewButton = new JButton("Send");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				SupportCust_textarea.setText(ADMIN_Support_response_TXTF.getText());
				JOptionPane.showMessageDialog(null, "Message was sent successfuly","Alert",JOptionPane.INFORMATION_MESSAGE);
				ADMIN_Support_response_TXTF.setText("");
				ADMIN_Support_cust_TXTF.setText("");
			}
		});
		btnNewButton.setBounds(340, 316, 117, 29);
		panel_8.add(btnNewButton);
		JButton SupportCust_Send_btn = new JButton("Send");
		SupportCust_Send_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String message = SupportCust_textarea.getText();
				
				Support_ADMIN_ID_LBL.setText(user.get(pos).ID);
				Support_ADMIN_name_LBL.setText(user.get(pos).name);
				ADMIN_Support_cust_TXTF.setText(message);
				
				SupportCust_textarea.setText("");
				
				JOptionPane.showMessageDialog(SupportCust_Send_btn, "Message was sent successfuly","Alert",JOptionPane.INFORMATION_MESSAGE);
				
				
			}
		});
		SupportCust_Send_btn.setBounds(231, 504, 331, 29);
		Support_cust.add(SupportCust_Send_btn);
		btnNewButton_14_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(isSignIN != false) {
					BuyCar_CarName_LBL.setText(CAR_PAN_NAME_2.getText());
					BuyCar_CarID_LBL.setText(CAR_PAN_ID_2.getText());
					CAR_PIC_BUY_PAN.setIcon(PIC2.getIcon());
					
					Switch(Buy_car_Panel);
				
					
				}else {
					JOptionPane.showMessageDialog(null, "To buy a car you need to Sign in !" , "Alert" , JOptionPane.ERROR_MESSAGE);
				}
			
			}
		});
		JLabel lblNewLabel_19 = new JLabel("Write the Issue, and our staff will respond as soon as possible");
		lblNewLabel_19.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		lblNewLabel_19.setBounds(129, 82, 588, 54);
		Support_cust.add(lblNewLabel_19);
		
		JButton btnNewButton_27 = new JButton("");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(User_interface);
			}
		});
		btnNewButton_27.setBorderPainted(false);
		btnNewButton_27.setIcon(new ImageIcon("home.png"));
		btnNewButton_27.setBounds(716, 6, 117, 86);
		Support_cust.add(btnNewButton_27);
		
		 Branches = new JPanel();
		layeredPane.add(Branches, "name_44777765107250");
		Branches.setLayout(null);
		
		JButton btnNewButton_28 = new JButton("");
		btnNewButton_28.setBorderPainted(false);
		btnNewButton_28.setIcon(new ImageIcon("home.png"));
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(isSignIN == true) {
					Switch(User_interface);
				}else {
					Switch(Home_Page);
				}
				
			}
		});
		btnNewButton_28.setBounds(722, 0, 117, 95);
		Branches.add(btnNewButton_28);
		
		JLabel lblNewLabel_29 = new JLabel("Our Branches");
		lblNewLabel_29.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblNewLabel_29.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_29.setBounds(6, 18, 322, 68);
		Branches.add(lblNewLabel_29);
		
		JTextArea txtrRiyadhBranchesTahlia = new JTextArea();
		JScrollPane x =	new JScrollPane(txtrRiyadhBranchesTahlia);
		x.setBounds(6, 124, 419, 389);
		x.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		txtrRiyadhBranchesTahlia.setEditable(false);
		txtrRiyadhBranchesTahlia.setText("Riyadh Branches\n\nTahlia Street, King Fahd Road, beside Mobily\nHayat Mall, Gate 5\n\nRiyadh Gallery, Gate 6\n\nRabwah exit 15, Opp. to Othaim mall\n\nAl Nakheel Mall\n\nTala Mall\n\nKhurais Mall\n\nAl Salam Mall Gate 3\n\nHamra Mall Gate 3\nAlmadina Branches\n\nAl Nour Mall\n\nAl Manar Mall\nAl Khobar Branches\n\nAmwaj Mall, Gate 6\n\nDhahran Mall Gate 2\n\nAl Ta'if Branches\nJouri Mall");
		//txtrRiyadhBranchesTahlia.setBounds(16, 98, 823, 356);
		Branches.add(x);
		JButton ADMINPANE_Support_btn = new JButton("");
		ADMINPANE_Support_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Switch(Support_Admin);
			}
		});
		ADMINPANE_Support_btn.setIcon(new ImageIcon("support.png"));
		ADMINPANE_Support_btn.setBorderPainted(false);
		ADMINPANE_Support_btn.setBounds(200, 414, 112, 106);
		ADMIN_PANE.add(ADMINPANE_Support_btn);
		
		JLabel lblNewLabel_20 = new JLabel("");
		lblNewLabel_20.setIcon(new ImageIcon("manager.png"));
		lblNewLabel_20.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_20.setBounds(0, 76, 839, 530);
		ADMIN_PANE.add(lblNewLabel_20);
		lblNewLabel_20.setIcon(h);
		
		JLabel lblNewLabel_32 = new JLabel("");
		
		lblNewLabel_32.setBounds(6, 0, 833, 625);
		lblNewLabel_32.setIcon(fitpic("Our-Branches.png",lblNewLabel_32));
		Branches.add(lblNewLabel_32);
		
		 Buy_car_Panel = new JPanel();
		layeredPane.add(Buy_car_Panel, "name_45673029966188");
		Buy_car_Panel.setLayout(null);
		
		 CAR_PIC_BUY_PAN = new JLabel("");
		CAR_PIC_BUY_PAN.setBounds(0, 6, 287, 379);
		Buy_car_Panel.add(CAR_PIC_BUY_PAN);
		
		JLabel lblNewLabel_34 = new JLabel("Car ID ");
		lblNewLabel_34.setBounds(303, 56, 123, 54);
		Buy_car_Panel.add(lblNewLabel_34);
		
		 BuyCar_CarID_LBL = new JLabel("");
		BuyCar_CarID_LBL.setBounds(384, 56, 123, 54);
		Buy_car_Panel.add(BuyCar_CarID_LBL);
		
		JLabel lblNewLabel_34_1_1 = new JLabel("Car Name");
		lblNewLabel_34_1_1.setBounds(299, 167, 123, 54);
		Buy_car_Panel.add(lblNewLabel_34_1_1);
		
		 BuyCar_CarName_LBL = new JLabel("");
		BuyCar_CarName_LBL.setBounds(384, 167, 123, 54);
		Buy_car_Panel.add(BuyCar_CarName_LBL);
		
		JButton BuyCar_Confirm_btn = new JButton("Confirm");
		
		BuyCar_Confirm_btn.setBounds(176, 484, 423, 54);
		Buy_car_Panel.add(BuyCar_Confirm_btn);
		
		JPanel Payment_PANE = new JPanel();
		layeredPane.add(Payment_PANE, "name_48004684449069");
		Payment_PANE.setLayout(null);
		
		PaymentPane_CreditCard_TXTF = new JTextField();
		PaymentPane_CreditCard_TXTF.setBounds(200, 192, 391, 44);
		Payment_PANE.add(PaymentPane_CreditCard_TXTF);
		PaymentPane_CreditCard_TXTF.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Credit card ");
		lblNewLabel_12.setBounds(6, 192, 162, 44);
		Payment_PANE.add(lblNewLabel_12);
		
		PaymentPane_Fullname_TXTF = new JTextField();
		PaymentPane_Fullname_TXTF.setColumns(10);
		PaymentPane_Fullname_TXTF.setBounds(200, 254, 391, 44);
		Payment_PANE.add(PaymentPane_Fullname_TXTF);
		
		JLabel lblNewLabel_12_1 = new JLabel("Full name");
		lblNewLabel_12_1.setBounds(6, 254, 162, 44);
		Payment_PANE.add(lblNewLabel_12_1);
		
		PaymentPane_ExpireDate_TXTF = new JTextField();
		PaymentPane_ExpireDate_TXTF.setColumns(10);
		PaymentPane_ExpireDate_TXTF.setBounds(200, 310, 198, 44);
		Payment_PANE.add(PaymentPane_ExpireDate_TXTF);
		
		JLabel lblNewLabel_12_1_1 = new JLabel("Expier Date");
		lblNewLabel_12_1_1.setBounds(6, 310, 162, 44);
		Payment_PANE.add(lblNewLabel_12_1_1);
	   
		
		JButton PaymentPane_BuY_btn = new JButton("Buy");
		PaymentPane_BuY_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(contract.size() ==0) {
					contract.add(new Contract(BuyCar_CarID_LBL.getText() , BuyCar_CarName_LBL.getText(),user,pos));
					JOptionPane.showMessageDialog(null, "your Order sent seccessfuly","Done",JOptionPane.INFORMATION_MESSAGE);
					Switch(User_interface);
					panel_3.add(contract.get(0));
					new_Order(BuyCar_CarName_LBL.getText(), BuyCar_CarID_LBL.getText() );
					
					
					System.out.println(user.get(pos).contract);
				}else {
					JOptionPane.showMessageDialog(null, "You can't buy another car until your order number : " +contract.get(0).ContID + " is processed" , "Alert" , JOptionPane.ERROR_MESSAGE );
					Switch(User_interface);
				}
				
			
				}
		});
		PaymentPane_BuY_btn.setBounds(313, 408, 172, 44);
		Payment_PANE.add(PaymentPane_BuY_btn);
		
		
		
		btnNewButton_14_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(isSignIN != false) {
					BuyCar_CarName_LBL.setText(CAR_PAN_NAME_3.getText());
					BuyCar_CarID_LBL.setText(CAR_PAN_ID_3.getText());
					CAR_PIC_BUY_PAN.setIcon(PIC3.getIcon());
					
					Switch(Buy_car_Panel);
					
				}else {
					JOptionPane.showMessageDialog(null, "To buy a car you need to Sign in !" , "Alert" , JOptionPane.ERROR_MESSAGE);
				}
				
			}
		});
		
		BuyCar_Confirm_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//
				
				
				
				
				Switch(Payment_PANE);
				
				
			}
		});
		
		
	}
	
	static void Switch(JPanel panel) {
		layeredPane.removeAll();
		layeredPane.add(panel);
		layeredPane.repaint();
		layeredPane.revalidate();
		
	}
	
	public static ImageIcon fitpic(String url , JLabel L) {
		ImageIcon img = new ImageIcon(url);
		Image img2 = img.getImage();
		Image scaleImage = img2.getScaledInstance(L.getWidth(), L.getHeight(), Image.SCALE_SMOOTH);
		img = new ImageIcon(scaleImage);
		
		return img;
		
	}
	public static ImageIcon fitpicI(Icon url , JLabel L) {
		ImageIcon img  = new ImageIcon();
		Icon img2 =url;
		Image scaleImage = ((Image) img2).getScaledInstance(L.getWidth(), L.getHeight(), Image.SCALE_SMOOTH);
		img = new ImageIcon(scaleImage);
		
		return img;
		
	}
	public static ImageIcon fitpicB(String url , JButton L) {
		ImageIcon img = new ImageIcon(url);
		Image img2 = img.getImage();
		Image scaleImage = img2.getScaledInstance(L.getWidth(), L.getHeight(), Image.SCALE_SMOOTH);
		img = new ImageIcon(scaleImage);
		
		return img;
		
	}
	
	public static void new_Order(String id , String car_id) {
		panel_7.add(new CUST_M(user, pos , contract));
	}
	
	
	
	public static void loadUsers() {
		
			user.add(new User("khaled" , "1234" , "0505050505" , new Date()));
			user.add(new User("dokhal" , "5555" , "0505050505" , new Date()));
			user.add(new User("hasan" , "4444" , "0505050505" , new Date()));
			user.add(new User("fawaz" , "1111" , "0505050505" , new Date()));
			user.add(new User("sari" , "2222" , "0505050505" , new Date()));
		
	}
	
	public static boolean signIn(String USR_name , String Password) {
		
		if(USR_name.equals("admin") && Password.equals("admin")) {
			Switch(ADMIN_PANE);
			return true;
		}
		
		for(int i =0 ; i < user.size(); i++) {
			if(user.get(i).name.equals(USR_name) && user.get(i).ID.equals(Password)) {
				pos = i;
				return true;
			}
		}
		
		
		return false;
		
	}
}
