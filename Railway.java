import javax.swing.*;

/*import com.sun.xml.internal.bind.v2.runtime.Name;*/

import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Railway implements ActionListener
{
String day[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
String month[]={"1","2","3","4","5","6","7","8","9","10","11","12"};
String year[]={"1980","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","20012","2013","2014","2015","2016","2017","2018",};
String year1[]={"2017","2018","2019","2020"};
String FromStation[]={"Hyderabad Decan","New Delhi","Tirupati","New Tinsukia Junction","Ambikapur","Adilabad"};
String ToStation[]={"New Delhi","Vishakapatnam","H Nizamuddin","Darbhanga Junction","Durg","Kollam Junction"};
String TicketType[]={"E-Ticket","I-Ticket"};
JFrame f;
JPanel p,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,p21,p22,p23,p24,p25,p26,p27,p28,p29,p30,p31,p32,p33,p34,p35,p36,p37,p38,p39,p40,p41,p42,p43,p44,p45,p46,p47,p48;
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35,b36,b37,b38,b39,b40,b41,b42,b43,b44,b45,b46,b47,b48,b49,b50,b51,b52,b53,b54,b55,b56,b57,b58,b59,b60,b61,b62,b63,b64,b65,b66,b67,b68,b69,b70,b71,b72,b73,b74,b75,b76,b77,b78,b79,b80,b81,b82,b83,b84,b85,b86,b87,b88,b89,b90,b91,b92,b93,b94,b95,b96,b97,b98,b99,b100,b101,b102,b103;
JPasswordField pf,pf1,pf2,pf3,pf4,pf5,pf6,pf7,pf8,pf9,pf10,pf11,pf12,pf13,pf14,pf15,pf16,pf17;
JTextField tf,tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8,tf9,tf10,tf11,tf12,tf13,tf14,tf15,tf16,tf17,tf18,tf19,tf20,tf21,tf22,tf23,tf24,tf25,tf26,tf27,tf28,tf29,tf30,tf31,tf32,tf33,tf34,tf35,tf36,tf37,tf38,tf39,tf40,tf41,tf42,tf43,tf44,tf45,tf46,tf47,tf48,tf49,tf50,tf51,tf52,tf53,tf54,tf55,tf56,tf57,tf58,tf59,tf60,tf61,tf62;
JLabel lb,lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10,lb11,lb12,lb13,lb14,lb15,lb16,lb17,lb18,lb19,lb20,lb21,lb22,lb23,lb24,lb25,lb26,lb27,lb28,lb29,lb30,lb31,lb32,lb33,lb34,lb35,lb36,lb37,lb38,lb39,lb40,lb41,lb42,lb43,lb44,lb45,lb46,lb47,lb48,lb49,lb50,lb51,lb52,lb53,lb54,lb55,lb56,lb57,lb58,lb59,lb60,lb61,lb62,lb63,lb64,lb65,lb66,lb67,lb68,lb69,lb70,lb71,lb72,lb73,lb74,lb75,lb76,lb77,lb78,lb79,lb80,lb81,lb82,lb83,lb84,lb85,lb86,lb87,lb88,lb89,lb90,lb91,lb92,lb93,lb94,lb95,lb96,lb97,lb98,lb99,lb100,lb101,lb102,lb103,lb104,lb105,lb106,lb107,lb108,lb109,lb110,lb111,lb112,lb113,lb114,lb115,lb116,lb117,lb118,lb119,lb120,lb121,lb122,lb123,lb124,lb125,lb126,lb127,lb128,lb129,lb130,lb131,lb132,lb133,lb134,lb135,lb136,lb137,lb138,lb139,lb140,lb141,lb142,lb143,lb144,lb145,lb146,lb147,lb148,lb149,lb150,lb151,lb152,lb153,lb154,lb155,lb156,lb157,lb158,lb159,lb160,lb161,lb162,lb163,lb164,lb165,lb166,lb167,lb168,lb169,lb170,lb171,lb172,lb173,lb174,lb175,lb176,lb177,lb178,lb179,lb180,lb181,lb182,lb183,lb184,lb185,lb186,lb187,lb188,lb189,lb190,lb191,lb192,lb193,lb194,lb195,lb196,lb197,lb198,lb199,lb200,lb201,lb202,lb203,lb204,lb205,lb206,lb207,lb208,lb209,lb210,lb211,lb212,lb213,lb214,lb215,lb216;
JComboBox cmb,cmb1,cmb2,cmb3,cmb4,cmb5,cmb6,cmb7,cmb8,cmb9,cmb10,cmb11,cmb12,cmb13,cmb14,cmb15,cmb16,cmb17,cmb18,cmb19,cmb20,cmb21,cmb22,cmb23;
JRadioButton rb,rb1,rb2,rb3;
Font fo,fo1,fo2,fo3,fo4,fo5,fo6,fo7,fo8,fo9,fo10,fo11,fo12,fo13,fo14,fo15,fo16;


double c=0,a=10000;


bean1 b=new bean1();

public Railway()
{
	f=new JFrame("Railway Management System");
	p=new JPanel();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 48 for Refund Rule menu//
		p48=new JPanel();
		b101=new JButton("Booking I-Tickets");
		b101.setBounds(300, 50, 200, 40);
		b101.addActionListener(this);
		b102=new JButton("Cancelling I-Tickets");
		b102.setBounds(300, 100, 200, 40);
		b102.addActionListener(this);
		b103=new JButton("Go Back");
		b103.setBounds(325, 170, 150, 30);
		b103.addActionListener(this);
		
		
		//Panel 48 is ending//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 47 is starting after the cancel Button//
		p47=new JPanel();
		fo15=new Font("TimesRoman",Font.PLAIN,20);
		lb215=new JLabel("Dear user, all your booked tickets have been cancelled. Your remaining amount will be transfered In");
		lb215.setBounds(10,20,900,30);
		lb215.setFont(fo15);
		fo16=new Font("TimesRoman",Font.PLAIN,20);
		lb216=new JLabel("Your account Please Go back to the HomePage and thanks for using the Railway management System");
		lb216.setBounds(10,70,900,30);
		lb216.setFont(fo16);
		b100=new JButton("Go Back");
		b100.setBounds(90,140,100,30);
		b100.addActionListener(this);
		
		//Panel 47 is ending right here//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 46 for after cancelling E-Ticket// 
		p46=new JPanel();
		fo14=new Font("TimesRoman",Font.BOLD,20);
		lb213=new JLabel("Hello User, Please enter your PNR No than press cancel button for cancelling Tickets...!!!");
		lb213.setBounds(50,10,800,30);
		lb213.setFont(fo14);
		lb214=new JLabel("PNR NO");
		lb214.setBounds(200, 50, 100, 20);
		tf62=new JTextField();
		tf62.setBounds(270,50,80,20);
		b99=new JButton("Cancel");
		b99.setBounds(270,100,90,30);
		b99.addActionListener(this);
		
		//Panel 46 is ending right here//
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 45 for Cancelling E-Ticket//
		p45=new JPanel();
		lb210=new JLabel("Username");
		tf61=new JTextField();
		lb211=new JLabel("Password");
		pf17=new JPasswordField();
		tf61.setBounds(290,50,100,20);
		pf17.setBounds(290,100,100,20);
		lb210.setBounds(200,50,60,20);
		lb211.setBounds(200,100,60,20);
		b97=new JButton("Login");
		b97.setBounds(200,150,70,30);
		b97.addActionListener(this);
		b98=new JButton("Go Back");
		b98.setBounds(200,210,100,30);
		b98.addActionListener(this);
		
		
		fo13=new Font("TimesRoman",Font.BOLD,20);
		lb212=new JLabel("Wrong Username Or Password Entered");
		lb212.setBounds(350, 10, 400, 30);
		lb212.setFont(fo13);
		lb212.setVisible(false);
		
		//Panel 45 is ending//
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 44 after the submit button of Booking I-Ticket panel//
		p44=new JPanel();
		lb208=new JLabel("Congratulations..!! You have just planned your Journey.");
		lb208.setBounds(20,40,350,20);
		lb209=new JLabel("Account Balance");
		lb209.setBounds(10, 80, 100, 20);
	    tf60=new JTextField("");
	    tf60.setBounds(110, 80, 80, 20);
		b96=new JButton("Go Back");
		b96.setBounds(20,120,100,20);
		b96.addActionListener(this);
		
		//panel 44 is ending now//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 43 for using Credit Card or Debit Card//
	
		p43=new JPanel();
		lb204=new JLabel("Card Number");
		lb204.setBounds(10, 10, 80,20);
		tf58=new JTextField();
		tf58.setBounds(90,10,50,20);
		lb205=new JLabel("Card PIN");
		lb205.setBounds(10, 40, 80,20);
		pf15=new JPasswordField();
		pf15.setBounds(90,40,50,20);
		lb206=new JLabel("CVV Number");
		lb206.setBounds(10, 70, 80,20);
		pf16=new JPasswordField();
		pf16.setBounds(90,70,50,20);
		lb207=new JLabel("Enter Amount");
		lb207.setBounds(10, 100, 80,20);
		tf59=new JTextField();
		tf59.setBounds(90,100,50,20);
		b95=new JButton("Submit");
		b95.setBounds(10, 130, 90, 20);
		b95.addActionListener(this);
		
		//Panel 43 is closing now// 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 42 for choosing the Payment method//
		p42=new JPanel();
		b93=new JButton("Credit Card");
		b93.setBounds(20,20,100,20);
		b93.addActionListener(this);
		b94=new JButton("Debit Card");
		b94.setBounds(20,50,100,20);
		b94.addActionListener(this);
		
		//Panel 42 is ending//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 41 is for after Booking E-Ticket login//
		p41=new JPanel();
		lb197=new JLabel("Plan My Journey");
		lb197.setBounds(10, 20, 100, 20);
		lb198=new JLabel("Username");
		lb198.setBounds(10, 50, 100, 20);
		tf56=new JTextField();
		tf56.setBounds(90, 50, 80, 20);
		
		lb199=new JLabel("PNR No");
		lb199.setVisible(true);
		lb199.setBounds(10,80,100,20);
		tf57=new JTextField("");
		tf57.setBounds(90,80,80,20);
		tf57.setToolTipText("Last 4 Digits of your Mobile Number");
		
		lb200=new JLabel("From Station");
		lb200.setBounds(10, 110, 100, 20);
		cmb18=new JComboBox(FromStation);
		cmb18.setBounds(90,110,100,20);
		lb201=new JLabel("To Station");
		lb201.setBounds(10, 140, 100, 20);
		cmb19=new JComboBox(ToStation);
		cmb19.setBounds(90,140,100,20);
		lb202=new JLabel("Journey Date");
		lb202.setBounds(10, 170, 100, 20);
		cmb20=new JComboBox(day);
		cmb20.setBounds(90,170,100,20);
		cmb21=new JComboBox(month);
		cmb21.setBounds(190,170,100,20);
		cmb22=new JComboBox(year1);
		cmb22.setBounds(290,170,100,20);
		lb203=new JLabel("Ticket Type");
		lb203.setBounds(10, 200, 100, 20);
		cmb23=new JComboBox(TicketType);
		cmb23.setBounds(90,200,100,20);
		b91=new JButton("Submit");
		b91.setBounds(10,250,80,20);
		b91.addActionListener(this);
		b92=new JButton("Cancel");
		b92.setBounds(10,300,80,30);
		b92.addActionListener(this);

		//panel 41 is ending here//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 40 for Booking I-Ticket//
		
		p40=new JPanel();
		lb194=new JLabel("Username");
		tf55=new JTextField();
		lb195=new JLabel("Password");
		pf14=new JPasswordField();
		tf55.setBounds(90,10,70,20);
		pf14.setBounds(90,40,70,20);
		lb194.setBounds(10,10,60,20);
		lb195.setBounds(10,40,60,20);
		b89=new JButton("Login");
		b89.setBounds(10,70,70,30);
		b89.addActionListener(this);
		b90=new JButton("Go Back");
		b90.setBounds(10,110,100,30);
	    b90.addActionListener(this);
	    lb196=new JLabel("Wrong Username Or Password Entered");
	    lb196.setVisible(false);
	    lb196.setBounds(200, 20, 300, 20);
	    
	    //Panel 40 is ending right now//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	///Panel 39 for Enquiry Menu for Train Fare menu//
	p39=new JPanel();
	lb191=new JLabel("Dear user, enter the Train No to check it's fare for your Journey :");
	lb191.setBounds(200, 20, 900, 20);
	lb192=new JLabel("Train No");
	lb192.setBounds(280, 50, 100, 20);
	tf53=new JTextField("");
	tf53.setBounds(350, 50, 80, 20);
	lb193=new JLabel("Train Fare");
	lb193.setBounds(280, 80, 100, 20);
	tf54=new JTextField("");
	tf54.setBounds(350, 80, 80, 20);
	b87=new JButton("FARE");
	b87.setBounds(350, 130, 100, 40);
	b87.addActionListener(this);
	b88=new JButton("Go Back");
	b88.setBounds(350, 180, 100, 40);
	b88.addActionListener(this);
	
	//Panel 39 is ending now//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 38 for Enquiry Menu for Train Enquiry Menu//
	p38=new JPanel();
	lb184=new JLabel("Dear user, enter the Train No to get all the details of that Train :");
	lb184.setBounds(200, 20, 900, 20);
	lb185=new JLabel("Train No");
	lb185.setBounds(280, 50, 100, 20);
	tf52=new JTextField();
	tf52.setBounds(350, 50, 80, 20);
	lb186=new JLabel("Name");
	lb186.setBounds(280, 80, 100, 20);
	tf47=new JTextField("");
	tf47.setBounds(350, 80, 200, 20);
	lb187=new JLabel("Start Time");
	lb187.setBounds(270, 110, 100, 20);
	tf48=new JTextField("");
	tf48.setBounds(350, 110, 100, 20);
	lb188=new JLabel("End Time");
	lb188.setBounds(280, 140, 100, 20);
	tf49=new JTextField("");
	tf49.setBounds(350, 140, 100, 20);
	lb189=new JLabel("Start Station");
	lb189.setBounds(270, 170, 100, 20);
	tf50=new JTextField("");
	tf50.setBounds(350, 170, 200, 20);
	lb190=new JLabel("End Station");
	lb190.setBounds(280, 200, 100, 20);
	tf51=new JTextField("");
	tf51.setBounds(350, 200, 200, 20);
	b85=new JButton("Find");
	b85.setBounds(350, 250, 100, 40);
	b85.addActionListener(this);
	b86=new JButton("Go Back");
	b86.setBounds(350, 300, 100, 40);
	b86.addActionListener(this);
	

	
	//Panel 38 is ending right here//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 37 for the Enquiry menu for the PNR Enquiry menu//
	p37=new JPanel();
	lb183=new JLabel("Dear user, please enter your PNR No to get your all journey deatails :");
	lb183.setBounds(200, 20, 900, 20);
	lb177=new JLabel("PNR No");
	lb177.setBounds(280, 50, 100, 20);
	tf39=new JTextField("");
	tf39.setBounds(350, 50, 80, 20);
	lb178=new JLabel("Username");
	lb178.setBounds(280, 80, 100, 20);
	tf40=new JTextField("");
	tf40.setBounds(350, 80, 80, 20);
	lb179=new JLabel("From Station");
	lb179.setBounds(270, 110, 100, 20);
	tf41=new JTextField("");
	tf41.setBounds(350, 110, 200, 20);
	lb180=new JLabel("To Station");
	lb180.setBounds(280, 140, 100, 20);
	tf42=new JTextField("");
	tf42.setBounds(350, 140, 200, 20);
	lb181=new JLabel("Journey Date");
	lb181.setBounds(270, 170, 100, 20);
	tf43=new JTextField("");
	tf43.setBounds(350, 170, 50, 20);
	tf44=new JTextField("");
	tf44.setBounds(410, 170, 50, 20);
	tf45=new JTextField("");
	tf45.setBounds(470, 170, 50, 20);
	lb182=new JLabel("Ticket Type");
	lb182.setBounds(280, 200, 100, 20);
	tf46=new JTextField("");
	tf46.setBounds(350, 200, 80, 20);
	b83=new JButton("Find");
	b83.setBounds(350, 250, 100, 40);
	b83.addActionListener(this);
	b84=new JButton("Cancel");
	b84.setBounds(350, 300, 100, 40);
	b84.addActionListener(this);
	
	//Panel 37 is ending//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 36 for Enquiry Menu for Reservation Enquiries//
	p36=new JPanel();
	fo12=new Font("TimesRoman",Font.BOLD,20);
	lb172=new JLabel("Steps to Follow :");
	lb172.setBounds(20, 30, 400, 30);
	lb172.setFont(fo12);
	lb173=new JLabel("1) Dear user, first you have to go to the User Guide Menu and need to click on User Registeration for registering yourself in Railaway Management System");
	lb173.setBounds(10, 70, 900, 30);
	lb174=new JLabel("2) If you have done that already, than ignore the above step and click on the Booking ticket menu or Tatkal book ticket menu according to your choice");
	lb174.setBounds(10, 110, 900, 30);
	lb175=new JLabel("3) After that choose the destinations in plan my journey menu and than pay the regionable amount for your tickets.");
	lb175.setBounds(10, 150, 900, 30);
	lb176=new JLabel("4) This is all you need to do and if you want to cancel your tickets than just use your PNR No for cancelling your tickets in the cancelling tickets menu.");
	lb176.setBounds(10, 190, 900, 30);
	b82=new JButton("Go Back");
	b82.setBounds(350, 250, 100, 40);
	b82.addActionListener(this);
	
	//Panel 36 is ending now//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 35 for Enquiry Menu//
	p35=new JPanel();
	b77=new JButton("Reservation Enquiries");
	b77.setBounds(300, 50, 200, 40);
	b77.addActionListener(this);
	b78=new JButton("PNR Enquiry");
	b78.setBounds(300, 100, 200, 40);
	b78.addActionListener(this);
	b79=new JButton("Train Enquiry");
	b79.setBounds(300, 150, 200, 40);
	b79.addActionListener(this);
	b80=new JButton("Train Fare Enquiry");
	b80.setBounds(300, 200, 200, 40);
	b80.addActionListener(this);
	b81=new JButton("Go Back");
	b81.setBounds(325, 260, 150, 40);
	b81.addActionListener(this);
	
	//Panel 35 is ending//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 34 is for Refund Rule for service tax rules// 
	p34=new JPanel();
	lb161=new JLabel("Net Banking");
	lb161.setBounds(200,10,100,20);
	lb162=new JLabel("State Bank of India - Rs. 10/- per transaction + Service Tax as applicable");
	lb162.setBounds(10,40,450,20);
	lb163=new JLabel("State Bank of India and Associates - Rs. 10/- per transaction");
	lb163.setBounds(10,70,350,20);
	lb164=new JLabel("Indian Bank - Rs. 10/- per transaction");
	lb164.setBounds(10,100,300,20);
	lb165=new JLabel("Union Bank of India - Rs. 10/- per transaction");
	lb165.setBounds(10,130,300,20);
	lb166=new JLabel("Andhra Bank - Rs.10/- + Service Tax as applicable");
	lb166.setBounds(10,160,300,20);
	lb167=new JLabel("Punjab National Bank - Rs. 10/- per transaction");
	lb167.setBounds(10,190,300,20);
	lb168=new JLabel("Allahabad Bank - Rs.10/-+ Service Tax as applicable");
	lb168.setBounds(10,220,300,20);
	lb169=new JLabel("Vijaya Bank - Rs.10/- +Service Tax as applicable");
	lb169.setBounds(10,250,300,20);
	lb170=new JLabel("AXIS Bank - Rs.10/- +Service Tax as applicable");
	lb170.setBounds(10,280,300,20);
	lb171=new JLabel("HDFC Bank - Rs.10/- + service tax as applicable");
	lb171.setBounds(10,310,300,20);
	b76=new JButton("Go Back");
	b76.setBounds(10, 340, 100, 30);
	b76.addActionListener(this);
	
	//Panel 34 is Ending//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 33 for Refund rule for Cancelling E-Ticket//
		p33=new JPanel();
		lb158=new JLabel("Username");
		tf38=new JTextField();
		lb159=new JLabel("Password");
		pf13=new JPasswordField();
		tf38.setBounds(290,50,100,20);
		pf13.setBounds(290,100,100,20);
		lb158.setBounds(200,50,60,20);
		lb159.setBounds(200,100,60,20);
		b74=new JButton("Login");
		b74.setBounds(200,150,70,30);
		b74.addActionListener(this);
		b75=new JButton("Go Back");
		b75.setBounds(200,210,100,30);
		b75.addActionListener(this);
		
		
		fo11=new Font("TimesRoman",Font.BOLD,20);
		lb160=new JLabel("Wrong Username Or Password Entered");
		lb160.setBounds(350, 10, 400, 30);
		lb160.setFont(fo11);
		lb160.setVisible(false);
		
		//Panel 33 is Ending//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 32 for Refund Rule menu//
	p32=new JPanel();
	b71=new JButton("Cancelling Tickets");
	b71.setBounds(300, 50, 200, 40);
	b71.addActionListener(this);
	b72=new JButton("Service Tax Rules");
	b72.setBounds(300, 100, 200, 40);
	b72.addActionListener(this);
	b73=new JButton("Go Back");
	b73.setBounds(325, 170, 150, 30);
	b73.addActionListener(this);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 31 is for Rules And Regulations//
	p31=new JPanel();
	fo10=new Font("TimesRoman",Font.BOLD,20);
	lb152=new JLabel("Rules & Regulations");
	lb152.setBounds(10, 30, 200, 30);
	lb152.setFont(fo10);
	lb153=new JLabel("1) Each & every passenger who would be travelling in the train should have it's own ticket. Otherwise that passenger will have to pay the panelty or");
	lb153.setBounds(10, 70, 900, 30);
	lb154=new JLabel("2) he/she will be sent to Jail. Nobody can't spit into the trains compartments. If anybody dare to do that then the passenger have to pay the Panelty of");
	lb154.setBounds(10, 110, 900, 30);
	lb155=new JLabel("3) Rs.2000. Nobody can't fight in train from others for any issue. It will very costly for the passenger who dare to do that.");
	lb155.setBounds(10, 150, 900, 30);
	lb156=new JLabel("4) Any male passenger don't allow to missbehave with a female passenger. That male passenger can be sent to Jail");
	lb156.setBounds(10, 190, 900, 30);
	lb157=new JLabel("5) Every passenger will have to show tickets to the ticket checker whenever he/she asked from you about tickets.");
	lb157.setBounds(10, 230, 900, 30);
	b70=new JButton("Go Back");
	b70.setBounds(350, 310, 100, 40);
	b70.addActionListener(this);
	
	///panel 31 is ending right here//
	
	
	
	
	
	
	
	
	
	
	//Panel 30 for Terms & Conditions//
	p30=new JPanel();
	fo9=new Font("TimesRoman",Font.BOLD,20);
	lb145=new JLabel("Terms & Conditions :");
	lb145.setBounds(10, 30, 200, 30);
	lb145.setFont(fo9);
	lb146=new JLabel("1) Every Passenger should have his own ticket while travelling in Train. Beacuse ticket checker will always asks you for your tickets.");
	lb146.setBounds(10, 70, 900, 30);
	lb147=new JLabel("2) Without tickets passengers will have to pay panelty or Government can directly send him/her to Jail");
	lb147.setBounds(10, 110, 900, 30);
	lb148=new JLabel("3) The Tatkal-Ticket can only be booked before 24 hours from the Journey date.");
	lb148.setBounds(10, 150, 900, 30);
	lb149=new JLabel("4) The User can't bring weapons while travelling. Example like : Knife");
	lb149.setBounds(10, 190, 900, 30);
	lb150=new JLabel("5) The male passengers are requested not to missbehave with female passengers. If anyone dare to do that, then that exact male passenger");
	lb150.setBounds(10, 230, 900, 30);
	lb151=new JLabel("will be redirected to the Jail for 3 months....!!!! Be aware of that.");
	lb151.setBounds(10, 270, 900, 30);
	b69=new JButton("Go Back");
	b69.setBounds(350, 310, 100, 40);
	b69.addActionListener(this);
	
	//Panel 30 is ending//
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Panel 29 for General Information panel//
	p29=new JPanel();
	b66=new JButton("Terms & Conditions");
	b66.setBounds(300, 50, 200, 40);
	b66.addActionListener(this);
	b67=new JButton("Rules & Regulations");
	b67.setBounds(300, 100, 200, 40);
	b67.addActionListener(this);
	b68=new JButton("Go Back");
	b68.setBounds(325, 170, 150, 30);
	b68.addActionListener(this);
	
	//Panel 29 is ending here//
	
	
	
	
	
	
	
	
	
	

	//Panel 28 for New Site Users//
	p28=new JPanel();
	lb134=new JLabel("Welcome New User, If you don't know how to use the Railway Management System or you have any query than please read the below instructions:");
	lb134.setBounds(10, 20, 900, 20);
	lb135=new JLabel("Dear user, you can easily book tickets right here, can cancel those tickets, can pay also here, can check different trains details,");
	lb135.setBounds(10, 50, 800, 20);
	lb136=new JLabel("can have your refund amount back right here, can also check routes of different trains, can also book tatkal tickets here");
	lb136.setBounds(10, 80, 900, 20);
	lb137=new JLabel("Steps to follow :");
	lb137.setBounds(10, 110, 900, 30);
	lb138=new JLabel("1) You need to register and create a New User Account for doing anything here, except checking details of Trains");
	lb138.setBounds(10, 150, 900, 30);
	lb139=new JLabel("2) You can book tickets, cancel tickets, can do your transaction here and everything else as described above");
	lb139.setBounds(10, 190, 900, 30);
	lb140=new JLabel("3) There is also a private place for the Administrator which a normal user can't access because it's Password protected....." );
	lb140.setBounds(10, 230, 900, 30);
	lb141=new JLabel("4) If you want to delete your registered account from Railway Management System than please contact the Administrator on 9818230732");
	lb141.setBounds(10, 270, 900, 30);
	lb142=new JLabel("After that your registered account will be removed by the Administrator from the Railway Management System");
	lb142.setBounds(10,310,900,30);
	lb143=new JLabel("Thanks for using the Railway management System.....again if you get any query than please call Administrator on 9818230732");
	lb143.setBounds(10,350,900,20);
	b65=new JButton("Go Back");
	b65.setBounds(350, 400, 100, 40);
	b65.addActionListener(this);
	
	
	
	//lb144=new JLabel();
	//lb144.setIcon(new ImageIcon("E:\\Wallpapers\\.jpg"));
	//lb144.setBounds(0,0,900,1000);

	
	
	//panel 28 is Ending//
	
	
	
	
	
	
	
	
	
	
	
	//Panel 26 for the Delete Button for user delete//
		p26=new JPanel();
		lb102=new JLabel("Name");
		lb102.setBounds(10,10,80,20);
		tf31=new JTextField();
		tf31.setBounds(90, 20, 100, 20);
		b51=new JButton("Delete");
		b51.setBounds(50, 100, 100, 20);
		b51.addActionListener(this);
		b52=new JButton("GO BACK");
		b52.setBounds(50,150,100,20);
		b52.addActionListener(this);
		
		
		lb108=new JLabel();
		lb108.setIcon(new ImageIcon("E:\\Wallpapers\\Background-Full-HD-1080p.-1920x1080-Wallpaper-train.jpg"));
		lb108.setBounds(0,0,900,1000);

		//Panel 26 is ending//
	
	
	
	
	
	
	
	
	
	
	//Panel 25 is for General User update//
	
	p25=new JPanel();
	lb79=new JLabel("Name");
	lb79.setBounds(10,10,60,20);
	lb80=new JLabel("Last Name");
	lb80.setBounds(10,40,80,20);
	tf23=new JTextField();
	tf23.setBounds(90,10,70,20);
	tf24=new JTextField();
	tf24.setBounds(90,40,70,20);
	lb81=new JLabel("E-mail");
	lb81.setBounds(10,70,60,20);
	tf25=new JTextField();
	tf25.setBounds(90,70,70,20);
	lb82=new JLabel("Phone No");
	lb82.setBounds(10,100,80,20);
	tf26=new JTextField();
	tf26.setBounds(90,100,80,20);
	lb83=new JLabel("Address");
	lb83.setBounds(10,130,80,20);
	tf27=new JTextField();
	tf27.setBounds(90,130,80,20);
	lb84=new JLabel("Aadhar No");
	lb84.setBounds(10,160,80,20);
	tf28=new JTextField();
	tf28.setBounds(90,160,80,20);
	lb85=new JLabel("DOB");
	lb85.setBounds(10,190,80,20);
	cmb15=new JComboBox(day);
	cmb15.setBounds(90,190,50,20);
	cmb16=new JComboBox(month);
	cmb16.setBounds(150,190,50,20);
	cmb17=new JComboBox(year);
	cmb17.setBounds(210,190,70,20);
	lb86=new JLabel("Gender");
	lb86.setBounds(10,220,80, 20);
	rb2=new JRadioButton("Male");
	rb3=new JRadioButton("Female");
	rb2.setBounds(90, 220, 80, 20);
	rb3.setBounds(180, 220, 80, 20);
	ButtonGroup bg=new ButtonGroup();
	lb87=new JLabel("Username");
	lb87.setBounds(10,250,80, 20);
	lb88=new JLabel("Password");
	lb88.setBounds(10,280,80, 20);
	lb89=new JLabel("Confirm Pass.");
	lb89.setBounds(10,310,110, 20);
	tf29=new JTextField();
	tf29.setBounds(90, 250, 70,20);
	pf11=new JPasswordField();
	pf11.setBounds(90, 280, 80, 20);
	pf12=new JPasswordField();
	pf12.setBounds(90, 310, 80, 20);
	b50=new JButton("Update");
	b50.setBounds(10, 350, 100, 20);
	b50.addActionListener(this);
	
	b64=new JButton("Go Back");
	b64.setBounds(10, 390, 100, 20);
	b64.addActionListener(this);
	
	
	lb107=new JLabel();
	lb107.setIcon(new ImageIcon("E:\\Wallpapers\\Background-Full-HD-1080p.-1920x1080-Wallpaper-train.jpg"));
	lb107.setBounds(0,0,900,1000);
	
	
	bg.add(rb2);
	bg.add(rb3);
	
	//Panel 25 is ending//
	
	
	
	//Panel 24 for the Delete Button for Train Delete//
	p24=new JPanel();
	lb77=new JLabel("Train_No");
	lb77.setBounds(10,10,100,20);
	tf22=new JTextField();
	tf22.setBounds(90, 20, 100, 20);
	lb78=new JLabel("Not Deleted Succesfully");
	lb78.setVisible(false);
	lb78.setBounds(10,200,80,20);
	b48=new JButton("GO BACK");
	b48.setBounds(50,150,100,20);
	b48.addActionListener(this);
	b47=new JButton("Delete");
	b47.setBounds(50, 100, 100, 20);
	b47.addActionListener(this);
	
	
	lb106=new JLabel();
	lb106.setIcon(new ImageIcon("E:\\Wallpapers\\Background-Full-HD-1080p.-1920x1080-Wallpaper-train.jpg"));
	lb106.setBounds(0,0,900,1000);

	//Panel 24 is ending//
	
	
	
	
	
	
	
	//Panel 23 for the Delete Button After Train Delete//
			p23=new JPanel();
			lb76=new JLabel();
			lb76.setText("Deleted Succesfully");
			lb76.setBounds(50,50,250,20);
			b46=new JButton("Go Back");
			b46.setBounds(50, 100, 100, 20);
			b46.addActionListener(this);
			
			
			lb105=new JLabel();
			lb105.setIcon(new ImageIcon("E:\\Wallpapers\\Background-Full-HD-1080p.-1920x1080-Wallpaper-train.jpg"));
			lb105.setBounds(0,0,900,900);
		
			//Panel 23 is ending//
	
	
	
	//Panel 22 for the Save Button After Train Update//
		p22=new JPanel();
		lb75=new JLabel();
		lb75.setText("Saved Succesfully");
		lb75.setBounds(50,50,200,20);
		b45=new JButton("Go Back");
		b45.setBounds(10, 200, 100, 20);
		b45.addActionListener(this);
		
		
		lb104=new JLabel();
		lb104.setIcon(new ImageIcon("E:\\Wallpapers\\Background-Full-HD-1080p.-1920x1080-Wallpaper-train.jpg"));
		lb104.setBounds(0,0,900,1000);
	
		//Panel 22 is ending//
		
		
		
	
	
	//Pane; 21 for updating Trains By Administrator Accounts//
	p21=new JPanel();
	lb69=new JLabel("Name");
	lb69.setBounds(10,10,50,20);
	lb70=new JLabel("Train No");
	lb70.setBounds(10,60,100,20);
	lb71=new JLabel("Start_Time");
	lb71.setBounds(10,100,100,20);
	lb72=new JLabel("End_Time");
	lb72.setBounds(10,140,100,20);
	lb73=new JLabel("Stat_Station");
	lb73.setBounds(10,180,100,20);
	lb74=new JLabel("End_Station");
	lb74.setBounds(10,220,100,20);
	tf16=new JTextField();
	tf16.setBounds(110,20,80,20);
	tf17=new JTextField();
	tf17.setBounds(110,60,80,20);
	tf18=new JTextField();
	tf18.setBounds(110,100,80,20);
	tf19=new JTextField();
	tf19.setBounds(110,140,80,20);
	tf20=new JTextField();
	tf20.setBounds(110,180,80,20);
	tf21=new JTextField();
	tf21.setBounds(110,220,80,20);
	b44=new JButton("Save");
	b44.setBounds(50, 260, 70, 20);
	b44.addActionListener(this);
	b49=new JButton("GO BACK");
	b49.setBounds(50,300,100,20);
	b49.addActionListener(this);
	
	
	lb103=new JLabel();
	lb103.setIcon(new ImageIcon("E:\\Wallpapers\\Background-Full-HD-1080p.-1920x1080-Wallpaper-train.jpg"));
	lb103.setBounds(0,0,900,1000);
	
	//Panel 21 is ending//
	
	
	
	
	
	
	//Panel 20 is starting after the cancel Button//
	p20=new JPanel();
	fo6=new Font("TimesRoman",Font.PLAIN,20);
	lb66=new JLabel("Dear user, all your booked tickets have been cancelled. Your remaining amount will be transfered In");
	lb66.setBounds(10,20,900,30);
	lb66.setFont(fo6);
	fo7=new Font("TimesRoman",Font.PLAIN,20);
	lb67=new JLabel("Your account Please Go back to the HomePage and thanks for using the Railway management System");
	lb67.setBounds(10,70,900,30);
	lb67.setFont(fo7);
	b39=new JButton("Go Back");
	b39.setBounds(90,140,100,30);
	b39.addActionListener(this);
	
	
	//lb126=new JLabel();
	//lb126.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	//lb126.setBounds(0,0,900,1000);
	
	///Panel 20 is ending//
	
	
	
	//Panel 19 for after cancelling E-Ticket// 
	p19=new JPanel();
	fo5=new Font("TimesRoman",Font.BOLD,20);
	lb65=new JLabel("Hello User, Please enter your PNR No than press cancel button for cancelling Tickets...!!!");
	lb65.setBounds(50,10,800,30);
	lb65.setFont(fo5);
	lb128=new JLabel("PNR NO");
	lb128.setBounds(200, 50, 100, 20);
	tf35=new JTextField();
	tf35.setBounds(270,50,80,20);
	b38=new JButton("Cancel");
	b38.setBounds(270,100,90,30);
	b38.addActionListener(this);
	
	
	
	//lb125=new JLabel();
	//lb125.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	//lb125.setBounds(0,0,900,900);
	
	//Panel 19 is ending// 
	
	
	//Panel 18 for Cancelling E-Ticket//
	p18=new JPanel();
	lb63=new JLabel("Username");
	tf15=new JTextField();
	lb64=new JLabel("Password");
	pf10=new JPasswordField();
	tf15.setBounds(290,50,100,20);
	pf10.setBounds(290,100,100,20);
	lb63.setBounds(200,50,60,20);
	lb64.setBounds(200,100,60,20);
	b37=new JButton("Login");
	b37.setBounds(200,150,70,30);
	b37.addActionListener(this);
	b56=new JButton("Go Back");
	b56.setBounds(200,210,100,30);
	b56.addActionListener(this);
	
	
	fo4=new Font("TimesRoman",Font.BOLD,20);
	lb129=new JLabel("Wrong Username Or Password Entered");
	lb129.setBounds(350, 10, 400, 30);
	lb129.setFont(fo4);
	lb129.setVisible(false);
	
	
	//lb124=new JLabel();
	//lb124.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	//lb124.setBounds(0,0,900,900);
	
	//Panel 18 is ending//
	
	
	//Panel 17 after the submit button of Tatkal Book panel//
	p17=new JPanel();
	lb62=new JLabel("Congratulations..!! You have just planned your Journey.");
	lb62.setBounds(20,40,350,20);
	lb131=new JLabel("Account Balance");
	lb131.setBounds(10, 80, 100, 20);
    tf37=new JTextField("");
    tf37.setBounds(110, 80, 80, 20);
	b36=new JButton("Go Back");
	b36.setBounds(20,120,100,20);
	b36.addActionListener(this);
	
	
	//lb123=new JLabel();
	//lb123.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	//lb123.setBounds(0,0,900,1000);
	
	//Panel 17 is ending here//
	
	
	
	//Panel 16 for using Credit Card or Debit Card//
		p16=new JPanel();
		lb58=new JLabel("Card Number");
		lb58.setBounds(10, 10, 80,20);
		tf13=new JTextField();
		tf13.setBounds(90,10,50,20);
		lb59=new JLabel("Card PIN");
		lb59.setBounds(10, 40, 80,20);
		pf8=new JPasswordField();
		pf8.setBounds(90,40,50,20);
		lb60=new JLabel("CVV Number");
		lb60.setBounds(10, 70, 80,20);
		pf9=new JPasswordField();
		pf9.setBounds(90,70,50,20);
		lb61=new JLabel("Enter Amount");
		lb61.setBounds(10, 100, 80,20);
		tf14=new JTextField();
		tf14.setBounds(90,100,50,20);
		b35=new JButton("Proceed");
		b35.setBounds(10, 130, 90, 20);
		b35.addActionListener(this);
		
		
		lb122=new JLabel();
		lb122.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
		lb122.setBounds(0,0,900,1000);
	
		//Panel 16 is ending now//
	
	
	
	//Panel 15 is starting Now For payment choosing method//
	p15=new JPanel();
	b33=new JButton("Credit Card");
	b33.setBounds(20,20,100,20);
	b33.addActionListener(this);
	b34=new JButton("Debit Card");
	b34.setBounds(20,50,100,20);
	b34.addActionListener(this);
	
	lb121=new JLabel();
	lb121.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	lb121.setBounds(0,0,900,1000);
	
	//Panel 15 is ending now//
	
	
	//Panel 14 is starting after the Tatkal Book ticket Login Page//
	p14=new JPanel();
	fo8=new Font("TimesRoman",Font.BOLD,30);
	lb53=new JLabel("Plan My Journey");
	lb53.setBounds(230, 20, 400, 40);
	lb53.setFont(fo8);
	lb97=new JLabel("Username");
	lb97.setBounds(230, 80, 100, 20);
	tf33=new JTextField();
	tf33.setBounds(320, 80, 80, 20);
	lb130=new JLabel("PNR No");
	lb130.setBounds(230, 110, 100, 20);
	tf36=new JTextField("");
	tf36.setBounds(320, 110, 80, 20);
	
	lb54=new JLabel("From Station");
	lb54.setBounds(230, 140, 100, 20);
	cmb9=new JComboBox(FromStation);
	cmb9.setBounds(320,140,100,20);
	lb55=new JLabel("To Station");
	lb55.setBounds(230, 170, 100, 20);
	cmb10=new JComboBox(ToStation);
	cmb10.setBounds(320,170,100,20);
	lb56=new JLabel("Journey Date");
	lb56.setBounds(230, 200, 100, 20);
	cmb11=new JComboBox(day);
	cmb11.setBounds(320,200,100,20);
	cmb12=new JComboBox(month);
	cmb12.setBounds(420,200,100,20);
	cmb13=new JComboBox(year1);
	cmb13.setBounds(520,200,100,20);
	lb57=new JLabel("Ticket Type");
	lb57.setBounds(230, 230, 100, 20);
	cmb14=new JComboBox(TicketType);
	cmb14.setBounds(320,230,100,20);
	b32=new JButton("Submit");
	b32.setBounds(230,280,80,30);
	b32.addActionListener(this);
	b63=new JButton("Cancel");
	b63.setBounds(230,320,80,30);
	b63.addActionListener(this);
	
	
	//lb120=new JLabel();
	//lb120.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	//lb120.setBounds(0,0,900,1000);
	
	//Panel 14 is ending now//
	
	
	
	
	//Panel 13 for Tatkal Book Ticket//
	p13=new JPanel();
	lb51=new JLabel("Username");
	tf12=new JTextField();
	lb52=new JLabel("Password");
	pf7=new JPasswordField();
	tf12.setBounds(90,10,70,20);
	pf7.setBounds(90,40,70,20);
	lb51.setBounds(10,10,60,20);
	lb52.setBounds(10,40,60,20);
	b31=new JButton("Login");
	b31.setBounds(90,70,70,20);
	b31.addActionListener(this);
	b59=new JButton("Cancel");
	b59.setBounds(90,100,100,30);
	b59.addActionListener(this);
	lb96=new JLabel("Wrong Username or Password Entered");
	lb96.setVisible(false);
	lb96.setBounds(200, 20, 300, 20);
	
	
	lb119=new JLabel();
	lb119.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	lb119.setBounds(0,0,900,1000);

	
	//Panel 13 is Ending//
	
	
	
	//Panel 12 for using Credit Card or Debit Card//
	p12=new JPanel();
	lb46=new JLabel("Card Number");
	lb46.setBounds(10, 10, 80,20);
	tf10=new JTextField();
	tf10.setBounds(90,10,50,20);
	lb47=new JLabel("Card PIN");
	lb47.setBounds(10, 40, 80,20);
	pf5=new JPasswordField();
	pf5.setBounds(90,40,50,20);
	lb48=new JLabel("CVV Number");
	lb48.setBounds(10, 70, 80,20);
	pf6=new JPasswordField();
	pf6.setBounds(90,70,50,20);
	lb49=new JLabel("Enter Amount");
	lb49.setBounds(10, 100, 80,20);
	tf11=new JTextField();
	tf11.setBounds(90,100,50,20);
	b30=new JButton("Submit");
	b30.setBounds(10, 130, 90, 20);
	b30.addActionListener(this);
	
	
	lb118=new JLabel();
	lb118.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	lb118.setBounds(0,0,900,1000);
	
	
	//Panel 12 is ending//
	
	
	//Panel 11 for choosing the Payment method//
	p11=new JPanel();
	b28=new JButton("Credit Card");
	b28.setBounds(20,20,100,20);
	b28.addActionListener(this);
	b29=new JButton("Debit Card");
	b29.setBounds(20,50,100,20);
	b29.addActionListener(this);
	
	
	lb117=new JLabel();
	lb117.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	lb117.setBounds(0,0,900,1000);
	
	
	//Panel 11 is ending//
	
	
	//Panel 10 for Bank Transaction//
	p10=new JPanel();
	lb35=new JLabel("Net Banking");
	lb35.setBounds(200,10,100,20);
	lb36=new JLabel("State Bank of India - Rs. 10/- per transaction + Service Tax as applicable");
	lb36.setBounds(10,40,450,20);
	lb37=new JLabel("State Bank of India and Associates - Rs. 10/- per transaction");
	lb37.setBounds(10,70,350,20);
	lb38=new JLabel("Indian Bank - Rs. 10/- per transaction");
	lb38.setBounds(10,100,300,20);
	lb39=new JLabel("Union Bank of India - Rs. 10/- per transaction");
	lb39.setBounds(10,130,300,20);
	lb40=new JLabel("Andhra Bank - Rs.10/- + Service Tax as applicable");
	lb40.setBounds(10,160,300,20);
	lb41=new JLabel("Punjab National Bank - Rs. 10/- per transaction");
	lb41.setBounds(10,190,300,20);
	lb42=new JLabel("Allahabad Bank - Rs.10/-+ Service Tax as applicable");
	lb42.setBounds(10,220,300,20);
	lb43=new JLabel("Vijaya Bank - Rs.10/- +Service Tax as applicable");
	lb43.setBounds(10,250,300,20);
	lb44=new JLabel("AXIS Bank - Rs.10/- +Service Tax as applicable");
	lb44.setBounds(10,280,300,20);
	lb45=new JLabel("HDFC Bank - Rs.10/- + service tax as applicable");
	lb45.setBounds(10,310,300,20);
	b27=new JButton("Go Back");
	b27.setBounds(10, 340, 100, 30);
	b27.addActionListener(this);
	
	
	lb116=new JLabel();
	lb116.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	lb116.setBounds(0,0,900,1000);
	
	
	
	
	//Panel 10 is ending//
	
	
	
	//Panel 9 after the submit button of Booking E-Ticket panel//
	p9=new JPanel();
	lb132=new JLabel("Congratulations..!! You have just planned your Journey.");
	lb132.setBounds(20, 40, 350, 20);
	lb133=new JLabel("Account Balance");
	lb133.setBounds(10, 80, 100, 20);
	tf32=new JTextField("");
	tf32.setBounds(110,80,100,20);
	b25=new JButton("Go Back");
	b25.setBounds(20,120,100,30);
	b25.addActionListener(this);
	
	
	//lb115=new JLabel();
	//lb115.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	//lb115.setBounds(0,0,900,1000);
	
	
	//Panel 9 is ending here//
	
	
	//Panel 8 is for after Booking E-Ticket login//
	p8=new JPanel();
	lb29=new JLabel("Plan My Journey");
	lb29.setBounds(10, 20, 100, 20);
	lb90=new JLabel("Username");
	lb90.setBounds(10, 50, 100, 20);
	tf30=new JTextField();
	tf30.setBounds(90, 50, 80, 20);
	
	lb127=new JLabel("PNR No");
	lb127.setVisible(true);
	lb127.setBounds(10,80,100,20);
	tf34=new JTextField("");
	tf34.setBounds(90,80,80,20);
	tf34.setToolTipText("Last 4 Digits of your Mobile Number");
	
	lb30=new JLabel("From Station");
	lb30.setBounds(10, 110, 100, 20);
	cmb3=new JComboBox(FromStation);
	cmb3.setBounds(90,110,100,20);
	lb31=new JLabel("To Station");
	lb31.setBounds(10, 140, 100, 20);
	cmb4=new JComboBox(ToStation);
	cmb4.setBounds(90,140,100,20);
	lb32=new JLabel("Journey Date");
	lb32.setBounds(10, 170, 100, 20);
	cmb5=new JComboBox(day);
	cmb5.setBounds(90,170,100,20);
	cmb6=new JComboBox(month);
	cmb6.setBounds(190,170,100,20);
	cmb7=new JComboBox(year1);
	cmb7.setBounds(290,170,100,20);
	lb33=new JLabel("Ticket Type");
	lb33.setBounds(10, 200, 100, 20);
	cmb8=new JComboBox(TicketType);
	cmb8.setBounds(90,200,100,20);
	b24=new JButton("Submit");
	b24.setBounds(10,250,80,20);
	b24.addActionListener(this);
	b62=new JButton("Cancel");
	b62.setBounds(10,300,80,30);
	b62.addActionListener(this);
	
	
	//lb114=new JLabel();
	//lb114.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	//lb114.setBounds(0,0,900,900);
	
	
	
	
	//Panel 8 is ending now//
	
	
	//Panel 7 for Booking E-Ticket//
	p7=new JPanel();
	lb27=new JLabel("Username");
	tf9=new JTextField();
	lb28=new JLabel("Password");
	pf4=new JPasswordField();
	tf9.setBounds(90,10,70,20);
	pf4.setBounds(90,40,70,20);
	lb27.setBounds(10,10,60,20);
	lb28.setBounds(10,40,60,20);
	b23=new JButton("Login");
	b23.setBounds(10,70,70,30);
	b23.addActionListener(this);
	b58=new JButton("Go Back");
	b58.setBounds(10,110,100,30);
    b58.addActionListener(this);
    lb95=new JLabel("Wrong Username Or Password Entered");
    lb95.setVisible(false);
    lb95.setBounds(200, 20, 300, 20);
    
    
    lb113=new JLabel();
	lb113.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	lb113.setBounds(0,0,900,1000);
    
	
	//Panel 7 is ending now//
	
	
	//Panel 5 for User Registration//
	p5=new JPanel();
	lb15=new JLabel("Name");
	lb15.setBounds(10,10,60,20);
	lb16=new JLabel("Last Name");
	lb16.setBounds(10,40,80,20);
	tf2=new JTextField();
	tf2.setBounds(90,10,70,20);
	tf3=new JTextField();
	tf3.setBounds(90,40,70,20);
	lb17=new JLabel("E-mail");
	lb17.setBounds(10,70,60,20);
	tf4=new JTextField();
	tf4.setBounds(90,70,70,20);
	lb18=new JLabel("Phone No");
	lb18.setBounds(10,100,80,20);
	tf5=new JTextField();
	tf5.setBounds(90,100,80,20);
	lb19=new JLabel("Address");
	lb19.setBounds(10,130,80,20);
	tf6=new JTextField();
	tf6.setBounds(90,130,80,20);
	lb20=new JLabel("Aadhar No");
	lb20.setBounds(10,160,80,20);
	tf7=new JTextField();
	tf7.setBounds(90,160,80,20);
	lb21=new JLabel("DOB");
	lb21.setBounds(10,190,80,20);
	cmb=new JComboBox(day);
	cmb.setBounds(90,190,50,20);
	cmb1=new JComboBox(month);
	cmb1.setBounds(150,190,50,20);
	cmb2=new JComboBox(year);
	cmb2.setBounds(210,190,70,20);
	lb22=new JLabel("Gender");
	lb22.setBounds(10,220,80, 20);
	rb=new JRadioButton("Male");
	rb1=new JRadioButton("Female");
	rb.setBounds(90, 220, 80, 20);
	rb1.setBounds(180, 220, 80, 20);
	ButtonGroup bg1=new ButtonGroup();
	lb23=new JLabel("Username");
	lb23.setBounds(10,250,80, 20);
	lb24=new JLabel("Password");
	lb24.setBounds(10,280,80, 20);
	lb25=new JLabel("Confirm Pass.");
	lb25.setBounds(10,310,110, 20);
	tf8=new JTextField();
	tf8.setBounds(90, 250, 70,20);
	pf2=new JPasswordField();
	pf2.setBounds(90, 280, 80, 20);
	pf3=new JPasswordField();
	pf3.setBounds(90, 310, 80, 20);
	b16=new JButton("Save");
	b16.setBounds(10, 350, 80, 20);
	b16.addActionListener(this);
	b57=new JButton("Cancel");
	b57.setBounds(10, 380, 80, 30);
	b57.addActionListener(this);
	
	
	
	lb112=new JLabel();
	lb112.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	lb112.setBounds(0,0,900,1000);
	
	
	
	
	bg1.add(rb);
	bg1.add(rb1);
	
	//Panel 5 is ending//
	
	//Panel 6 for the Save Button//
	p6=new JPanel();
	lb26=new JLabel();
	lb26.setText("Saved Succesfully");
	lb26.setBounds(50,50,200,20);
	b17=new JButton("Go Back");
	b17.setBounds(10, 200, 100, 20);
	b17.addActionListener(this);
	
	lb111=new JLabel();
	lb111.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	lb111.setBounds(0,0,900,1000);
	
	//Panel 6 is ending now//
	
	//Panel 4 for User Guide Menu//
	
	p4=new JPanel();
	lb14=new JLabel("Welcome To The User Guide Menu");
	lb14.setBounds(200,20,650,50);
	fo2=new Font("TimesRoman",Font.PLAIN,30);
	lb14.setFont(fo2);
	b12=new JButton("User_Registration");
	b12.setBounds(300,90,150,40);
	b12.addActionListener(this);
	b18=new JButton("Booking E-Ticket");
	b18.setBounds(300,140,150,40);
	b18.addActionListener(this);
	b19=new JButton("Bank Transaction");
	b19.setBounds(300,190,150,40);
	b19.addActionListener(this);
	b20=new JButton("Tatkal Ticktet");
	b20.setBounds(300,240,150,40);
	b20.addActionListener(this);
	b21=new JButton("Cancelling E-Ticket");
	b21.setBounds(300,290,150,40);
	b21.addActionListener(this);
	b22=new JButton("New Site Users");
	b22.setBounds(300,340,150,40);
	b22.addActionListener(this);
	b26=new JButton("Logout");
	b26.setBounds(300,390,150,40);
	b26.addActionListener(this);
	
	lb110=new JLabel();
	lb110.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	lb110.setBounds(0,0,900,1000);
	
	//Panel 4 is ending//
	
	
	//Creating a New Panel For Accessing the Admin account// 
	p1=new JPanel();
	b9=new JButton("Login");
	b9.addActionListener(this);
	lb8=new JLabel("Username");
	tf1=new JTextField();
	lb9=new JLabel("Password");
	b10=new JButton("Cancel");
	pf1=new JPasswordField();
	lb68=new JLabel("Wrong Username Or Password Entered");
	lb68.setVisible(false);
	lb68.setBounds(100,150,300, 20);
	tf1.setBounds(90,10,70,20);
	pf1.setBounds(90,40,70,20);
	b9.setBounds(90,70,70,20);
	b10.setBounds(90,110,73,20);
	b10.addActionListener(this);
	lb8.setBounds(10,10,60,20);
	lb9.setBounds(10,40,60,20);
	
	
	
	lb100=new JLabel();
	lb100.setIcon(new ImageIcon("E:\\Wallpapers\\Background-Full-HD-1080p.-1920x1080-Wallpaper-train.jpg"));
	lb100.setBounds(0,0,900,1000);
	
	
	
	//Panel created//
	
	
	//New Panel for IRCTC Application Download//
	p3=new JPanel();
	b15=new JButton("Go Back");
	b15.addActionListener(this);
	b15.setBounds(10, 140, 90, 20);
	lb11=new JLabel("For Windows- Go to store and search for IRCTC");
	lb12=new JLabel("For Android- Go to Playstore and search for IRCTC");
	lb13=new JLabel("For IOS- Go to Apple Store and search for IRCTC");
	lb11.setBounds(10, 20, 300, 20);
	lb12.setBounds(10, 60, 300, 20);
	lb13.setBounds(10, 100, 300, 20);
	
	
	lb109=new JLabel();
	lb109.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	lb109.setBounds(0,0,900,1000);
	
	
	//Ending this Application panel//
	
	
	//New Panel after Administrator logged in//
	p2=new JPanel();
	fo3=new Font("TimesRoman",Font.BOLD,20);
	lb10=new JLabel("Welcome Admin");
	lb10.setFont(fo3);
	lb10.setBounds(60, 20, 250, 30);
	b11=new JButton("Train Update");
	b11.setBounds(90,110,130,20);
	b40=new JButton("Train Delete");
	b40.setBounds(90,150,130,20);
	b41=new JButton("User Update");
	b41.setBounds(90,190,130,20);
	b42=new JButton("User Delete");
	b42.setBounds(90,230,130,20);
	b43=new JButton("Logout");
	b43.setBounds(90,270,130,30);
	
	
	
	lb101=new JLabel();
	lb101.setIcon(new ImageIcon("E:\\Wallpapers\\Background-Full-HD-1080p.-1920x1080-Wallpaper-train.jpg"));
	lb101.setBounds(0,0,900,1000);
	
	
	
	
	b11.addActionListener(this);
	b40.addActionListener(this);
	b41.addActionListener(this);
	b42.addActionListener(this);
	b43.addActionListener(this);
	
	//Panel created//
	
	
	
	
	//Panel 1 is for User Login//
	

	b2=new JButton("Login");
	b2.addActionListener(this);
	b3=new JButton("Download");
	b3.addActionListener(this);
	b4=new JButton("Go");
	b4.addActionListener(this);
	b5=new JButton("About_IRCTC");
	b5.addActionListener(this);
	b6=new JButton("Refund");
	b6.addActionListener(this);
	b7=new JButton("Enquiry");
	b7.addActionListener(this);
	b8=new JButton("Book I-Ticket");
	b8.addActionListener(this);
	lb=new JLabel("Username");
	lb1=new JLabel("Password");
	lb2=new JLabel("IRCTC App");
	lb3=new JLabel("User Guide");
	lb4=new JLabel("General Info");
	lb5=new JLabel("Refund Rule");
	lb6=new JLabel("Enquiries");
	lb7=new JLabel("I-Ticket");
	tf=new JTextField();
	pf=new JPasswordField();
	b55=new JButton("Go Back");
	b55.setBounds(10,360,130,30);
	b55.addActionListener(this);
	
	
	lb99=new JLabel();
	lb99.setIcon(new ImageIcon("E:\\Wallpapers\\Indian_Railway_Wallpaper.jpg"));
	lb99.setBounds(0,0,900,1000);
	
	
	
	fo1=new Font("TimesRoman",Font.BOLD,20);
	lb93=new JLabel("Wrong Username Or Password Entered");
	lb93.setBounds(250, 10, 400, 30);
	lb93.setFont(fo1);
	lb93.setVisible(false);
	
	
	
	lb.setBounds(10,10,60,20);
	tf.setBounds(90,10,70,20);
	lb1.setBounds(10,40,60,20);
	pf.setBounds(90,40,70,20);
	b2.setBounds(90,70,70,20);
	lb2.setBounds(10,120,80,20);
	b3.setBounds(90,120,90,20);
	lb3.setBounds(10, 160, 70, 20);
	b4.setBounds(90, 160, 90, 20);
	lb4.setBounds(10, 200, 80, 20);
	b5.setBounds(90, 200, 110, 20);
	lb5.setBounds(10, 240, 80, 20);
	b6.setBounds(90, 240, 90, 20);
	lb6.setBounds(10, 280, 80, 20);
	b7.setBounds(90, 280, 90, 20);
	lb7.setBounds(10, 320, 80, 20);
	b8.setBounds(90, 320, 110, 20);
	
	//Panel 1 is ending//
	
	
	
	//Panel 27 for the First Page of The Railway Management System//
	p27=new JPanel();
	b53=new JButton("Administrator");
	b53.setBounds(300, 100, 200, 50);
	b54=new JButton("User Login");
	b54.setBounds(300, 200, 200, 50);
	lb92=new JLabel("Welcome To Railway Management System");
	lb92.setForeground(Color.black);
	lb92.setBounds(150,20,600,50);
	fo=new Font("TimesRoman",Font.PLAIN,30);
	lb92.setFont(fo);
	lb98=new JLabel();
	lb98.setIcon(new ImageIcon("E:\\Wallpapers\\Train-Diesel-Engines-HD-Lovely-Wallpaper.jpg"));
	lb98.setBounds(0,0,900,1000);
	

	
	
	b53.addActionListener(this);
	b54.addActionListener(this);
	
	//Panel 27 is ending//
	
	
	
	
	p27.add(lb92);
	p27.add(b53);
	p27.add(b54);
	p27.add(lb98);
	p27.setLayout(null);
	p27.setVisible(true);
	
	
	
	
	
	
	
	
	
	p.add(lb7);
	p.add(b8);
	p.add(lb6);
	p.add(b7);
	p.add(lb5);
	p.add(b6);
	p.add(lb4);
	p.add(b5);
	p.add(lb3);
	p.add(b4);
	p.add(b3);
	p.add(lb2);
	p.add(b2);
	p.add(lb);
	p.add(lb1);
	p.add(lb93);
	p.add(tf);
	p.add(pf);
	p.add(b55);
	p.add(lb99);
	p.setLayout(null);
	p.setVisible(false);
	
	
	
	
	
	p1.setBackground(Color.cyan);
	p1.add(b9);
	p1.add(lb8);
	p1.add(tf1);
	p1.add(pf1);
	p1.add(lb9);
	p1.add(b10);
	p1.add(lb68);
	p1.add(lb100);
	p1.setLayout(null);
	p1.setVisible(false);
	
	p2.add(lb10);
	p2.add(b11);
	p2.add(b40);
	p2.add(b41);
	p2.add(b42);
	p2.add(b43);
	p2.add(lb101);
	p2.setLayout(null);
	p2.setVisible(false);
	
	p3.add(lb11);
	p3.add(lb12);
	p3.add(lb13);
	p3.add(b15);
	p3.add(lb109);
	p3.setLayout(null);
	p3.setVisible(false);
	
	
	p4.setBackground(Color.lightGray);
	p4.add(lb14);
	p4.add(b12);
	p4.add(b18);
	p4.add(b19);
	p4.add(b20);
	p4.add(b21);
	p4.add(b22);
	p4.add(b26);
	p4.add(lb110);
	p4.setLayout(null);
	p4.setVisible(false);
	
	p5.add(lb15);
	p5.add(lb16);
	p5.add(lb17);
	p5.add(lb18);
	p5.add(lb19);
	p5.add(lb20);
	p5.add(lb21);
	p5.add(lb22);
	p5.add(lb23);
	p5.add(lb24);
	p5.add(lb25);
	p5.add(tf2);
	p5.add(tf3);
	p5.add(tf4);
	p5.add(tf5);
	p5.add(tf6);
	p5.add(tf7);
	p5.add(tf8);
	p5.add(cmb);
	p5.add(cmb1);
	p5.add(cmb2);
	p5.add(rb);
	p5.add(rb1);
	p5.add(b16);
	p5.add(pf2);
	p5.add(pf3);
	p5.add(b57);
	p5.add(lb111);
	p5.setLayout(null);
	p5.setVisible(false);
	
	p6.add(lb26);
	p6.add(b17);
	p6.add(lb112);
	p6.setLayout(null);
	p6.setVisible(false);
	
	p7.add(lb27);
	p7.add(lb28);
	p7.add(pf4);
	p7.add(tf9);
	p7.add(b23);
	p7.add(b58);
	p7.add(lb95);
	p7.add(lb113);
	p7.setLayout(null);
	p7.setVisible(false);
	
	
	
	p8.setBackground(Color.LIGHT_GRAY);
	p8.add(lb29);
	p8.add(lb30);
	p8.add(lb31);
	p8.add(lb32);
	p8.add(lb33);
	p8.add(cmb3);
	p8.add(cmb4);
	p8.add(cmb5);
	p8.add(cmb6);
	p8.add(cmb7);
	p8.add(cmb8);
	p8.add(b24);
	p8.add(tf30);
	p8.add(lb90);
	p8.add(b62);
	//p8.add(lb114);
	p8.add(lb127);
	p8.add(tf34);
	p8.setLayout(null);
	p8.setVisible(false);
	
	
	p9.setBackground(Color.LIGHT_GRAY);
	p9.add(tf32);
	p9.add(b25);
	//p9.add(lb115);
	p9.add(lb132);
	p9.add(lb133);
	p9.setLayout(null);
	p9.setVisible(false);
	
	
	p10.add(lb35);
	p10.add(lb36);
	p10.add(lb37);
	p10.add(lb38);
	p10.add(lb39);
	p10.add(lb40);
	p10.add(lb41);
	p10.add(lb42);
	p10.add(lb43);
	p10.add(lb44);
	p10.add(lb45);
	p10.add(b27);
	p10.add(lb116);
	p10.setLayout(null);
	p10.setVisible(false);
	
	
	p11.add(b28);
	p11.add(b29);
	p11.add(lb117);
	p11.setLayout(null);
	p11.setVisible(false);
	
	
	p12.add(lb46);
	p12.add(lb47);
	p12.add(lb48);
	p12.add(lb49);
	p12.add(tf10);
	p12.add(tf11);
	p12.add(pf5);
	p12.add(pf6);
	p12.add(b30);
	p12.add(lb118);
	p12.setLayout(null);
	p12.setVisible(false);
	
	
	
	p13.add(lb51);
	p13.add(lb52);
	p13.add(lb96);
	p13.add(pf7);
	p13.add(tf12);
	p13.add(b31);
	p13.add(b59);
	p13.add(lb119);
	p13.setLayout(null);
	p13.setVisible(false);
	
	
	
	
	p14.setBackground(Color.LIGHT_GRAY);
	p14.add(lb53);
	p14.add(lb54);
	p14.add(lb55);
	p14.add(lb56);
	p14.add(lb57);
	p14.add(cmb9);
	p14.add(cmb10);
	p14.add(cmb11);
	p14.add(cmb12);
	p14.add(cmb13);
	p14.add(cmb14);
	p14.add(b32);
	p14.add(lb97);
	p14.add(tf33);
	p14.add(b63);
	//p14.add(lb120);
	p14.add(lb130);
	p14.add(tf36);
	p14.setLayout(null);
	p14.setVisible(false);
	
	
	
	p15.add(b33);
	p15.add(b34);
	p15.add(lb121);
	p15.setLayout(null);
	p15.setVisible(false);
	
	
	
	p16.add(lb58);
	p16.add(lb59);
	p16.add(lb60);
	p16.add(lb61);
	p16.add(tf13);
	p16.add(tf14);
	p16.add(pf8);
	p16.add(pf9);
	p16.add(b35);
	p16.add(lb122);
	p16.setLayout(null);
	p16.setVisible(false);
	
	
	
	p17.setBackground(Color.LIGHT_GRAY);
	p17.add(lb62);
	p17.add(b36);
	//p17.add(lb123);
	p17.add(lb131);
	p17.add(tf37);
	p17.setLayout(null);
	p17.setVisible(false);
	
	
	
	
	p18.setBackground(Color.lightGray);
	p18.add(lb63);
	p18.add(lb64);
	p18.add(tf15);
	p18.add(pf10);
	p18.add(b37);
	p18.add(b56);
	//p18.add(lb124);
	p18.add(lb129);
	p18.setLayout(null);
	p18.setVisible(false);
	
	
	
	p19.setBackground(Color.lightGray);
	p19.add(lb65);
	p19.add(b38);
	//p19.add(lb125);
	p19.add(lb128);
	p19.add(tf35);
	p19.setLayout(null);
	p19.setVisible(false);
	
	
	
	p20.setBackground(Color.lightGray);
	p20.add(lb66);
	p20.add(lb67);
	p20.add(b39);
	//p20.add(lb126);
	p20.setLayout(null);
	p20.setVisible(false);
	
	
	
	p21.add(lb69);
	p21.add(lb70);
	p21.add(lb71);
	p21.add(lb72);
	p21.add(lb73);
	p21.add(lb74);
	p21.add(tf16);
	p21.add(tf17);
	p21.add(tf18);
	p21.add(tf19);
	p21.add(tf20);
	p21.add(tf21);
	p21.add(b44);
	p21.add(b49);
	p21.add(lb103);
	p21.setLayout(null);
	p21.setVisible(false);
	
	
	
	
	p22.add(lb75);
	p22.add(b45);
	p22.add(lb104);
	p22.setLayout(null);
	p22.setVisible(false);
	
	
	
	
	p23.add(lb76);
	p23.add(b46);
	p23.add(lb105);
	p23.setLayout(null);
	p23.setVisible(false);
	
	
	
	
	p24.add(lb77);
	p24.add(lb78);
	p24.add(b47);
	p24.add(tf22);
	p24.add(b48);
	p24.add(lb106);
	p24.setLayout(null);
	p24.setVisible(false);
	
	
	
	
	p25.add(lb79);
	p25.add(lb80);
	p25.add(lb81);
	p25.add(lb82);
	p25.add(lb83);
	p25.add(lb84);
	p25.add(lb85);
	p25.add(lb86);
	p25.add(lb87);
	p25.add(lb88);
	p25.add(lb89);
	p25.add(tf23);
	p25.add(tf24);
	p25.add(tf25);
	p25.add(tf26);
	p25.add(tf27);
	p25.add(tf28);
	p25.add(tf29);
	p25.add(cmb15);
	p25.add(cmb16);
	p25.add(cmb17);
	p25.add(rb2);
	p25.add(rb3);
	p25.add(b50);
	p25.add(pf11);
	p25.add(pf12);
	p25.add(b64);
	p25.add(lb107);
	p25.setLayout(null);
	p25.setVisible(false);
	
	
	
	
	p26.add(lb102);
	p26.add(tf31);
	p26.add(b51);
	p26.add(b52);
	p26.add(lb108);
	p26.setLayout(null);
	p26.setVisible(false);
	
	
	
	
	
	p28.setBackground(Color.LIGHT_GRAY);
	p28.add(lb134);
	p28.add(lb135);
	p28.add(lb136);
	p28.add(lb137);
	p28.add(lb138);
	p28.add(lb139);
	p28.add(lb140);
	p28.add(lb141);
	p28.add(lb142);
	p28.add(lb143);
	//p28.add(lb144);
	p28.add(b65);
	p28.setLayout(null);
	p28.setVisible(false);
	
	
	
	
	
	
	
	
	p29.setBackground(Color.LIGHT_GRAY);
	p29.add(b66);
	p29.add(b67);
	p29.add(b68);
	p29.setLayout(null);
	p29.setVisible(false);
	
	
	
	
	
	
	
	
	p30.setBackground(Color.LIGHT_GRAY);
	p30.add(lb145);
	p30.add(lb146);
	p30.add(lb147);
	p30.add(lb148);
	p30.add(lb149);
	p30.add(lb150);
	p30.add(lb151);
	p30.add(b69);
	p30.setLayout(null);
	p30.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	
	
	p31.setBackground(Color.LIGHT_GRAY);
	p31.add(lb152);
	p31.add(lb153);
	p31.add(lb154);
	p31.add(lb155);
	p31.add(lb156);
	p31.add(lb157);
	p31.add(b70);
	p31.setLayout(null);
	p31.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	p32.setBackground(Color.LIGHT_GRAY);
	p32.add(b71);
	p32.add(b72);
	p32.add(b73);
	p32.setLayout(null);
	p32.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	
	p33.setBackground(Color.LIGHT_GRAY);
	p33.add(lb158);
	p33.add(lb159);
	p33.add(lb160);
	p33.add(tf38);
	p33.add(pf13);
	p33.add(b74);
	p33.add(b75);
	p33.setLayout(null);
	p33.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	p34.setBackground(Color.LIGHT_GRAY);
	p34.add(lb161);
	p34.add(lb162);
	p34.add(lb163);
	p34.add(lb164);
	p34.add(lb165);
	p34.add(lb166);
	p34.add(lb167);
	p34.add(lb168);
	p34.add(lb169);
	p34.add(lb170);
	p34.add(lb171);
	p34.add(b76);
	p34.setLayout(null);
	p34.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	
	p35.setBackground(Color.LIGHT_GRAY);
	p35.add(b77);
	p35.add(b78);
	p35.add(b79);
	p35.add(b80);
	p35.add(b81);
	p35.setLayout(null);
	p35.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	p36.setBackground(Color.LIGHT_GRAY);
	p36.add(lb172);
	p36.add(lb173);
	p36.add(lb174);
	p36.add(lb175);
	p36.add(lb176);
	p36.add(b82);
	p36.setLayout(null);
	p36.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	p37.setBackground(Color.LIGHT_GRAY);
	p37.add(lb177);
	p37.add(lb178);
	p37.add(lb179);
	p37.add(lb179);
	p37.add(lb180);
	p37.add(lb181);
	p37.add(lb182);
	p37.add(lb183);
	p37.add(tf39);
	p37.add(tf40);
	p37.add(tf41);
	p37.add(tf42);
	p37.add(tf43);
	p37.add(tf44);
	p37.add(tf45);
	p37.add(tf46);
	p37.add(b83);
	p37.add(b84);
	p37.setLayout(null);
	p37.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	p38.setBackground(Color.LIGHT_GRAY);
	p38.add(lb184);
	p38.add(lb185);
	p38.add(lb186);
	p38.add(lb187);
	p38.add(lb188);
	p38.add(lb189);
	p38.add(lb190);
	p38.add(tf47);
	p38.add(tf48);
	p38.add(tf49);
	p38.add(tf50);
	p38.add(tf51);
	p38.add(tf52);
	p38.add(b85);
	p38.add(b86);
	p38.setLayout(null);
	p38.setVisible(false);
	
	
	
	
	
	
	
	
	
	p39.setBackground(Color.LIGHT_GRAY);
	p39.add(lb191);
	p39.add(lb192);
	p39.add(lb193);
	p39.add(tf53);
	p39.add(tf54);
	p39.add(b87);
	p39.add(b88);
	p39.setLayout(null);
	p39.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	
	
	p40.setBackground(Color.LIGHT_GRAY);
	p40.add(lb194);
	p40.add(lb195);
	p40.add(lb196);
	p40.add(tf55);
	p40.add(pf14);
	p40.add(b89);
	p40.add(b90);
	p40.setLayout(null);
	p40.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	
	
	
	p41.setBackground(Color.LIGHT_GRAY);
	p41.add(lb197);
	p41.add(lb198);
	p41.add(lb199);
	p41.add(lb200);
	p41.add(lb201);
	p41.add(lb202);
	p41.add(lb203);
	p41.add(tf56);
	p41.add(tf57);
	p41.add(cmb18);
	p41.add(cmb19);
	p41.add(cmb20);
	p41.add(cmb21);
	p41.add(cmb22);
	p41.add(cmb23);
	p41.add(b91);
	p41.add(b92);
	p41.setLayout(null);
	p41.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	p42.setBackground(Color.LIGHT_GRAY);
	p42.add(b93);
	p42.add(b94);
	p42.setLayout(null);
	p42.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	
	p43.setBackground(Color.LIGHT_GRAY);
	p43.add(lb204);
	p43.add(lb205);
	p43.add(lb206);
	p43.add(lb207);
	p43.add(tf58);
	p43.add(tf59);
	p43.add(pf15);
	p43.add(pf16);
	p43.add(b95);
	p43.setLayout(null);
	p43.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	p44.setBackground(Color.LIGHT_GRAY);
	p44.add(lb208);
	p44.add(lb209);
	p44.add(tf60);
	p44.add(b96);
	p44.setLayout(null);
	p44.setVisible(false);
	
	
	
	
	
	
	
	p45.setBackground(Color.LIGHT_GRAY);
	p45.add(lb210);
	p45.add(lb211);
	p45.add(lb212);
	p45.add(tf61);
	p45.add(pf17);
	p45.add(b97);
	p45.add(b98);
	p45.setLayout(null);
	p45.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	
	p46.setBackground(Color.LIGHT_GRAY);
	p46.add(lb213);
	p46.add(lb214);
	p46.add(tf62);
	p46.add(b99);
	p46.setLayout(null);
	p46.setVisible(false);
	

	
	
	
	
	
	
	
	
	
	
	
	p47.setBackground(Color.LIGHT_GRAY);
	p47.add(lb215);
	p47.add(lb216);
	p47.add(b100);
	p47.setLayout(null);
	p47.setVisible(false);

	
	
	
	
	
	
	
	
	
	
	
	
	p48.setBackground(Color.LIGHT_GRAY);
	p48.add(b101);
	p48.add(b102);
	p48.add(b103);
	p48.setLayout(null);
	p48.setVisible(false);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	f.setSize(900, 1000);
	f.getContentPane().add(p27);
	f.setVisible(true);

}

public void actionPerformed(ActionEvent e)
{

	if(e.getSource()==b2)
	{
		String Username=tf.getText();
		String Password=String.valueOf(pf.getPassword());
		
		if(Username.length()>64 && Password.length()>64)
		{
			JOptionPane.showMessageDialog(null, "Index Out Of Bound");
			tf.setText("");
			pf.setText("");
		}
		
		Connection con=null;
		try 
		{
			//Registering Driver//
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			//Connecting to Database//
			 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
			
			 //Query
			 
			 Statement st= con.createStatement();
			 ResultSet rs=st.executeQuery("select Username,Password from register");
			 
			 
			 while(rs.next())
			 {
				 String r = rs.getString("Username");
				 String v = rs.getString("Password");
			 
			
			 if (Username.equals(r) && Password.equals(v)) 
			 {
				 JOptionPane.showMessageDialog(null, "Logged In Succesfully");
				 tf.setText("");
				 pf.setText("");
				 p.setVisible(false);
				 p4.setVisible(true);
				 lb93.setVisible(false);
			    f.getContentPane().add(p4);

			 }
		 else
		 {
			 tf.setText("");
			 pf.setText("");
			lb93.setVisible(true);
		 }
			 }
		}
		
			 
			  
		catch(ClassNotFoundException ex){
			ex.printStackTrace();
		}
	catch(SQLException ex){
		ex.printStackTrace();
		}
		finally{
			try
			{
				con.close();
			}
			catch(SQLException ex)
			{
				ex.printStackTrace();
				
			}
			
		}
		
		
	}
	if(e.getSource()==b3)
    {
		 lb93.setVisible(false);
    	p.setVisible(false);
    	p3.setVisible(true);
    	f.getContentPane().add(p3);
    }
	
	if(e.getSource()==b5)
	{
		 lb93.setVisible(false);
		p.setVisible(false);
		p29.setVisible(true);
		f.getContentPane().add(p29);
	}
	
	
	
	if(e.getSource()==b6)
	{
		 lb93.setVisible(false);
		p.setVisible(false);
		p32.setVisible(true);
		f.getContentPane().add(p32);
	}
	
	if(e.getSource()==b7)
	{
		 lb93.setVisible(false);
		p.setVisible(false);
		p35.setVisible(true);
		f.getContentPane().add(p35);
	}
	
	
	
	
	if(e.getSource()==b8)
	{
		 lb93.setVisible(false);
		p.setVisible(false);
		p48.setVisible(true);
		f.getContentPane().add(p48);
	}
	
	
	
	    if(e.getSource()==b10)
	    {
	    	 lb68.setVisible(false);
	    p1.setVisible(false);
	    p27.setVisible(true);
	    f.getContentPane().add(p27);
	    }
	    
	    
	    if(e.getSource()==b9)
	    {
	    	String value1=tf1.getText();
			String value2=String.valueOf(pf1.getPassword());
			
			if(value1.length()>20 && value2.length()>20)
			{
				JOptionPane.showMessageDialog(null, "Index Out Of Bound");
				tf1.setText("");
				pf1.setText("");
			}
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 Statement st= con.createStatement();
				 ResultSet rs=st.executeQuery("select Name,Password from details1");
				 
				 
				 while(rs.next())
				 {
					 String q = rs.getString("Name");
					 String p = rs.getString("Password");
				 
				
				 if (value1.equals(q) && value2.equals(p)) 
				 {
					 JOptionPane.showMessageDialog(null, "Logged In Succesfully");
					 tf1.setText("");
					 pf1.setText("");
					 lb68.setVisible(false);
					 p1.setVisible(false);
					 p2.setVisible(true);
				    f.getContentPane().add(p2);
					 
				 }
			 else
			 {
				 lb68.setVisible(true);
				 tf1.setText("");
				 pf1.setText("");
			 }
				 }
			}
			
				 
				  
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}
}	
	    	
	    if(e.getSource()==b11)
	    {
			p2.setVisible(false);
	    	p21.setVisible(true);
	    	f.getContentPane().add(p21);
	    }
	    if(e.getSource()==b4)
	    {
	    	 lb93.setVisible(false);
	    	p.setVisible(false);
	    	p4.setVisible(true);
	    	f.getContentPane().add(p4);
	    }
	    if(e.getSource()==b15)
	    {
	    	p3.setVisible(false);
	    	p.setVisible(true);
	    	f.getContentPane().add(p);
	    }
	    if(e.getSource()==b12)
	    {
	    	p4.setVisible(false);
	    	p5.setVisible(true);
	    	f.getContentPane().add(p5);
	    	
	    }
	    if(e.getSource()==b16)
	    {
	    	String Name=tf2.getText();
	    	String Lastname=tf3.getText();
	    	String Email=tf4.getText();
	    	String Phone=tf5.getText();
	    	String Address=tf6.getText();
	    	String Aadhaar_no=tf7.getText();
	    	String DD=cmb.getSelectedItem().toString();
	    	String MM=cmb1.getSelectedItem().toString();
	    	String YY=cmb2.getSelectedItem().toString();
	    	String Gender=null;
	    	String Username=tf8.getText();
	    	String Password=String.valueOf(pf2.getPassword());
	    	String Confirm=String.valueOf(pf3.getPassword());
	    	
	    	
	    	if(Name.length()>20 || Lastname.length()>20 || Email.length()>50 || Phone.length()>30 || Address.length()>40 || Aadhaar_no.length()>12 || DD.length()>20 || MM.length()>20 || YY.length()>20 || Username.length()>20 || Password.length()>64 || Confirm.length()>64)
	    	{
	    		JOptionPane.showMessageDialog(null, "Index Out Of Bounds");
	    		tf2.setText("");
	    		tf3.setText("");
	    		tf4.setText("");
	    		tf5.setText("");
	    		tf6.setText("");
	    		tf7.setText("");
	    		cmb.removeAllItems();
	    		cmb1.removeAllItems();
	    		cmb2.removeAllItems();
	    		rb.setText("");
	    		rb1.setText("");
	    		tf8.setText("");
	    		pf2.setText("");
	    		pf3.setText("");
	    	}
	    	
	    	
	   
	 
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 PreparedStatement p= con.prepareStatement("insert into register values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
				 
				 
				 
				 if(rb.isSelected())
					{
						Gender="Male";
					}
					if(rb1.isSelected())
					{
						Gender="Female";
					}
		
				 
				 
				 
				 p.setString(1, Name);
				 p.setString(2, Lastname);
				 p.setString(3, Email);
				 p.setString(4, Phone);
				 p.setString(5, Address);
				 p.setString(6, Aadhaar_no);
				 p.setString(7, DD);
				 p.setString(8, MM);
				 p.setString(9, YY);
				 p.setString(10, Gender);
				 p.setString(11, Username);
				 p.setString(12, Password);
				 p.setString(13, Confirm);
				 
				 int result=p.executeUpdate();
				 
				
			 
				 if(result>0)
				 {
					 JOptionPane.showMessageDialog(null, "Succesully Registered");
					 tf2.setText("");
					 tf3.setText("");
					 tf4.setText("");
					 tf5.setText("");
					 tf6.setText("");
					 tf7.setText("");
					 cmb.removeAllItems();
					 cmb1.removeAllItems();
					 cmb2.removeAllItems();
					 tf8.setText("");
					 rb.setText("");
					 rb1.setText("");
	                 pf2.setText("");
	                 pf3.setText("");
					 p5.setVisible(false);
				     p6.setVisible(true);
				     f.getContentPane().add(p6);
					 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Not Registered");
					 tf2.setText("");
					 tf3.setText("");
					 tf4.setText("");
					 tf5.setText("");
					 tf6.setText("");
					 tf7.setText("");
					 cmb.removeAllItems();
					 cmb1.removeAllItems();
					 cmb2.removeAllItems();
					 tf8.setText("");
					 rb.setText("");
					 rb1.setText("");
	                 pf2.setText("");
	                 pf3.setText("");
					 p5.setVisible(true);
					 f.getContentPane().add(p5);
				 }
			}
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}
	    	}
	    
	    
	    
	    
	    
	    if(e.getSource()==b17)
	    {
	    	p6.setVisible(false);
	    	p.setVisible(true);
	    	f.getContentPane().add(p);
	    }
	    
	    if(e.getSource()==b18)
	    {
	    	p4.setVisible(false);
	    	p7.setVisible(true);
	    	f.getContentPane().add(p7);
	    }
	    
	    if(e.getSource()==b22)
	    {
	    	p4.setVisible(false);
	    	p28.setVisible(true);
	    	f.getContentPane().add(p28);
	    }
	    
	    if(e.getSource()==b23)
	    {
	    	String Username=tf9.getText();
			String Password=String.valueOf(pf4.getPassword());
			
			if(Username.length()>64 && Password.length()>64)
			{
				JOptionPane.showMessageDialog(null, "Index Out Of Bound");
				tf9.setText("");
				pf4.setText("");
			}
			
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 Statement st= con.createStatement();
				 ResultSet rs=st.executeQuery("select Username,Password from register");
				 
				 
				 while(rs.next())
				 {
					 String p = rs.getString("Username");
					 String q = rs.getString("Password");
				 
				
				 if (Username.equals(p) && Password.equals(q)) 
				 {
					 JOptionPane.showMessageDialog(null, "Logged In Succesfully");
					 tf9.setText("");
					 pf4.setText("");
					 lb95.setVisible(false);
					 p7.setVisible(false);
					 p8.setVisible(true);
				    f.getContentPane().add(p8);

				 }
			 else
			 {
				tf9.setText("");
				pf4.setText("");
				 lb95.setVisible(true);
			 }
				 }
			}
			
				 
				  
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
				
			}
			
}
	    
	    if(e.getSource()==b24)
	    {
	    	String Username=tf30.getText();
	    	String PNR_No=tf34.getText();
	    	String From_Station=cmb3.getSelectedItem().toString();
	    	String To_Station=cmb4.getSelectedItem().toString();
	    	String DD=cmb5.getSelectedItem().toString();
	    	String MM=cmb6.getSelectedItem().toString();
	    	String YY=cmb7.getSelectedItem().toString();
	    	String Ticket_Type=cmb8.getSelectedItem().toString();
	    	
	    	
	    	
	    	if(Username.length()>50 || PNR_No.length()>4)
	    	{
	    		JOptionPane.showMessageDialog(null, "Index Out Of Bounds");
	    		tf30.setText("");
	    		tf34.setText("");
	    	}
	    	
	    	
	    	
	    	
	    	
	    	Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 PreparedStatement p= con.prepareStatement("insert into journey values(?,?,?,?,?,?,?,?)");
				 
				 
				 
				 
				 
				 
				 
				 
				 p.setString(1, Username);
				 p.setString(2, PNR_No);
				 p.setString(3, From_Station);
				 p.setString(4, To_Station);
				 p.setString(5, DD);
				 p.setString(6, MM);
				 p.setString(7, YY);
				 p.setString(8, Ticket_Type);
				
				 
				 int result=p.executeUpdate();
				 
				 if(result>0)
				 {
					 JOptionPane.showMessageDialog(null, "Journey Succesfully Planned");
						tf30.setText("");
						tf34.setText("");
						cmb3.removeAllItems();
						cmb4.removeAllItems();
						cmb5.removeAllItems();
						cmb6.removeAllItems();
						cmb7.removeAllItems();
						cmb8.removeAllItems();
					    p8.setVisible(false);
					    p11.setVisible(true);
					    f.getContentPane().add(p11);
					 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Journey Not Planned");
						tf30.setText("");
						tf34.setText("");
						cmb3.removeAllItems();
						cmb4.removeAllItems();
						cmb5.removeAllItems();
						cmb6.removeAllItems();
						cmb7.removeAllItems();
						cmb8.removeAllItems();
				 }
			}
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}
	    	
	    }
	    if(e.getSource()==b25)
	    {
	    	p9.setVisible(false);
	    	p4.setVisible(true);
	    	f.getContentPane().add(p4);
	    }
	    if(e.getSource()==b26)
	    {
	    	tf.setText("");
	    	pf.setText("");
	    	lb93.setVisible(false);
	    	p4.setVisible(false);
	    	p.setVisible(true);
	    	f.getContentPane().add(p);
	    	
	    }
	    if(e.getSource()==b19)
	    {
	    	p4.setVisible(false);
	    	p10.setVisible(true);
	    	f.getContentPane().add(p10);
	    }
	    if(e.getSource()==b27)
	    {
	    	p10.setVisible(false);
	    	p4.setVisible(true);
	    	f.getContentPane().add(p4);
	    }
	    if(e.getSource()==b28 || e.getSource()==b29) 
	    {
	    	p11.setVisible(false);
	    	p12.setVisible(true);
	    	f.getContentPane().add(p12);
	    }
	    if(e.getSource()==b30)
	    {
	    	String Card_No=tf10.getText();
	    	String Card_Pin=String.valueOf(pf5.getPassword());
	    	String CVV_No=String.valueOf(pf6.getPassword());
	    	String Total_Amount=tf11.getText();
	    	
	    	
	    	b.setNo1(Double.parseDouble(tf11.getText()));
			c=a-b.getNo1();
		    tf32.setText("" +c);

	   
	    	
	    	
	    	if(Card_No.length()>30 || Card_Pin.length()>20 || CVV_No.length()>3 || Total_Amount.length()>30 )
	    	{
	    		JOptionPane.showMessageDialog(null, "Index Out Of Bounds");
	    		tf10.setText("");
	    		pf5.setText("");
	    		pf6.setText("");
	    		tf11.setText("");
	    	}
	    	
	    	
	    	
	    	
	    	
	    	Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 PreparedStatement p= con.prepareStatement("insert into payment values(?,?,?,?)");
				 
				 
				 
				 
				 
				 
				 
				 
				 p.setString(1, Card_No);
				 p.setString(2, Card_Pin);
				 p.setString(3, CVV_No);
				 p.setString(4, Total_Amount);
				
				 
				 int result=p.executeUpdate();
				 
				 if(result>0)
				 {
					 JOptionPane.showMessageDialog(null, "Journey Succesfully Planned");
						tf10.setText("");
						pf5.setText("");
						pf6.setText("");
						tf11.setText("");
					    p12.setVisible(false);
					    p9.setVisible(true);
					    f.getContentPane().add(p9);
					 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Journey Not Planned");
						tf10.setText("");
						pf5.setText("");
						pf6.setText("");
						tf11.setText("");
						
				 }
			}
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}

	    	
	 
	    }
	    if(e.getSource()==b20)
	    {
	    	p4.setVisible(false);
	    	p13.setVisible(true);
	    	f.getContentPane().add(p13);
	    }
	    if(e.getSource()==b31)
	    {
	    	String Username=tf12.getText();
			String Password=String.valueOf(pf7.getPassword());
			
			
			
			if(Username.length()>64 && Password.length()>64)
			{
				JOptionPane.showMessageDialog(null, "Index Out Of Bound");
				tf12.setText("");
				pf7.setText("");
			}
			
			
			
			
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 Statement st= con.createStatement();
				 ResultSet rs=st.executeQuery("select Username,Password from register");
				 
				 
				 while(rs.next())
				 {
					 String r = rs.getString("Username");
					 String v = rs.getString("Password");
				 
				
				 if (Username.equals(r) && Password.equals(v)) 
				 {
					 JOptionPane.showMessageDialog(null, "Logged In Succesfully");
					 tf12.setText("");
					 pf7.setText("");
					 lb96.setVisible(false);
					 p13.setVisible(false);
					 p14.setVisible(true);
				    f.getContentPane().add(p14);

				 }
			 else
			 {
				tf12.setText("");
				pf7.setText("");
				 lb96.setVisible(true);
			 }
				 }
			}
			
				 
				  
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
				
			}
	 
}
	    if(e.getSource()==b32)
	    {
	    	
	    	String Username=tf33.getText();
	    	String PNR_No=tf36.getText();
	    	String From_Station=cmb9.getSelectedItem().toString();
	    	String To_Station=cmb10.getSelectedItem().toString();
	    	String DD=cmb11.getSelectedItem().toString();
	    	String MM=cmb12.getSelectedItem().toString();
	    	String YY=cmb13.getSelectedItem().toString();
	    	String Ticket_Type=cmb14.getSelectedItem().toString();
	    	
	    	
	    	
	    	if(Username.length()>50 || PNR_No.length()>4)
	    	{
	    		JOptionPane.showMessageDialog(null, "Index Out Of Bounds");
	    		tf33.setText("");
	    		tf36.setText("");
	    	}
	    	
	    	
	    	
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 PreparedStatement p= con.prepareStatement("insert into journey values(?,?,?,?,?,?,?,?)");
				 
				 
				 
				 
				 
				 
				 
				 p.setString(1, Username);
				 p.setString(2, PNR_No);
				 p.setString(3, From_Station);
				 p.setString(4, To_Station);
				 p.setString(5, DD);
				 p.setString(6, MM);
				 p.setString(7, YY);
				 p.setString(8, Ticket_Type);
				
				 
				 int result=p.executeUpdate();
				 
				 if(result>0)
				 {
					 JOptionPane.showMessageDialog(null, "Journey Succesfully Planned");
					 tf33.setText("");
					 tf36.setText("");
				     cmb9.removeAllItems();
				     cmb10.removeAllItems();
				     cmb11.removeAllItems();
				     cmb12.removeAllItems();
				     cmb13.removeAllItems();
				     cmb14.removeAllItems();
					 p14.setVisible(false);
					 p15.setVisible(true);
					 f.getContentPane().add(p15);
					 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Journey Not Planned");
					 tf33.setText("");
					 tf36.setText("");
				     cmb9.removeAllItems();
				     cmb10.removeAllItems();
				     cmb11.removeAllItems();
				     cmb12.removeAllItems();
				     cmb13.removeAllItems();
				     cmb14.removeAllItems();
				     p14.setVisible(true);
				     f.getContentPane().add(p14);
				 }
			}
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}
	    	
}
	    if(e.getSource()==b33)
	    {
	    	p15.setVisible(false);
	    	p16.setVisible(true);
	    	f.getContentPane().add(p16);
	    }
	    
	    if(e.getSource()==b34)
	    {
	    	p15.setVisible(false);
	    	p16.setVisible(true);
	    	f.getContentPane().add(p16);
	    }
	    
	    if(e.getSource()==b35)
	    {
	    	String Card_No=tf13.getText();
	    	String Card_Pin=String.valueOf(pf8.getPassword());
	    	String CVV_No=String.valueOf(pf9.getPassword());
	    	String Total_Amount=tf14.getText();
	    	
	    	
	    	b.setNo1(Double.parseDouble(tf14.getText()));
			c=a-b.getNo1();
		    tf37.setText("" +c);

	   
	    	
	    	
	    	if(Card_No.length()>30 || Card_Pin.length()>20 || CVV_No.length()>3 || Total_Amount.length()>30 )
	    	{
	    		JOptionPane.showMessageDialog(null, "Index Out Of Bounds");
	    		tf13.setText("");
	    		pf8.setText("");
	    		pf9.setText("");
	    		tf14.setText("");
	    	}
	    	
	    	
	    	
	    	
	    	
	    	Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 PreparedStatement p= con.prepareStatement("insert into payment values(?,?,?,?)");
				 
				 
				 
				 
				 
				 
				 
				 
				 p.setString(1, Card_No);
				 p.setString(2, Card_Pin);
				 p.setString(3, CVV_No);
				 p.setString(4, Total_Amount);
				
				 
				 int result=p.executeUpdate();
				 
				 if(result>0)
				 {
					 JOptionPane.showMessageDialog(null, "Journey Succesfully Planned");
						tf13.setText("");
						pf8.setText("");
						pf9.setText("");
						tf14.setText("");
					    p16.setVisible(false);
					    p17.setVisible(true);
					    f.getContentPane().add(p17);
					 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Journey Not Planned");
						tf13.setText("");
						pf8.setText("");
						pf9.setText("");
						tf14.setText("");
						
				 }
			}
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}
	    			  
	    }

	    
	    
	    if(e.getSource()==b36)
	    {
	    	p17.setVisible(false);
	    	p4.setVisible(true);
	    	f.getContentPane().add(p4);
	    }
	    
	    if(e.getSource()==b21)
	    {
	    	p4.setVisible(false);
	    	p18.setVisible(true);
	    	f.getContentPane().add(p18);
	    }
	    
	    if(e.getSource()==b37)
	    {
	    	String Username=tf15.getText();
			String Password=String.valueOf(pf10.getPassword());
			
			if(Username.length()>64 && Password.length()>64)
			{
				JOptionPane.showMessageDialog(null, "Index Out Of Bound");
				tf15.setText("");
				pf10.setText("");
			}
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 Statement st= con.createStatement();
				 ResultSet rs=st.executeQuery("select Username,Password from register");
				 
				 
				 while(rs.next())
				 {
					 String r = rs.getString("Username");
					 String v = rs.getString("Password");
				 
				
				 if (Username.equals(r) && Password.equals(v)) 
				 {
					 JOptionPane.showMessageDialog(null, "Logged In Succesfully");
					 tf15.setText("");
					 pf10.setText("");
					 lb129.setVisible(false);
					 p18.setVisible(false);
					 p19.setVisible(true);
				    f.getContentPane().add(p19);

				 }
			 else
			 {
				 tf15.setText("");
				 pf10.setText("");
				lb129.setVisible(true);
			 }
				 }
			}
			
				 
				  
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
				
			}
	    }
	    
	    if(e.getSource()==b38)
	    {
	    		String PNR_No=tf35.getText();
			
	    	
	    	
	    	if(PNR_No.length()>50)
	    	{
	    		JOptionPane.showMessageDialog(null, "Index Out Of Bounds");
	    		tf35.setText("");
	    	}
	    	
		
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //ResultSet rs=null;
				 
				 //Query
				 
				 PreparedStatement p=con.prepareStatement("delete from journey where PNR_No=?");
				 
		
				 
				  
			
				 
				 p.setString(1, PNR_No);
				 
				 int result=p.executeUpdate();
				 
				 if(result>0)
				 {
					 JOptionPane.showMessageDialog(null, "Succesully Deleted");
					 tf35.setText("");
					 p19.setVisible(false);
					 p20.setVisible(true);
					 f.getContentPane().add(p20);
					 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Not Deleted yet");
					 tf35.setText("");
					 p19.setVisible(true);
					 f.getContentPane().add(p19);
				 }
			}
			
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}
	    
	    }
	    
	    
	    
	    if(e.getSource()==b39)
	    {
	    	p20.setVisible(false);
	    	p4.setVisible(true);
	    	f.getContentPane().add(p4);
	    }
	    
	    if(e.getSource()==b40)
	    {
	    		p2.setVisible(false);
	    		p24.setVisible(true);
	    		f.getContentPane().add(p24);
	    }
	    
	    if(e.getSource()==b41)
	    {
	    	p2.setVisible(false);
	    	p25.setVisible(true);
	    	f.getContentPane().add(p25);
	    }
	    
	    if(e.getSource()==b42)
	    {
	    	p2.setVisible(false);
	    	p26.setVisible(true);
	    	f.getContentPane().add(p26);
	    }
	    
	    if(e.getSource()==b43)
	    {
	    	int dialogButton=JOptionPane.YES_NO_OPTION;
	    	JOptionPane.showConfirmDialog(null, "Do you really want to Logout");
	    	p2.setVisible(false);
	    	p27.setVisible(true);
	    	f.getContentPane().add(p27);
	    }
	    
	    if(e.getSource()==b44)
	    {
	    	String Name=tf16.getText();
	    	String Train_No=tf17.getText();
	    	String Start_Time=tf18.getText();
	    	String End_Time=tf19.getText();
	    	String Start_Station=tf20.getText();
	    	String End_Station=tf21.getText();
	    	
	    	
	    	
	    	if(Name.length()>50 || Train_No.length()>20 || Start_Time.length()>10 || End_Time.length()>10 || Start_Station.length()>50 || End_Station.length()>50)
	    	{
	    		JOptionPane.showMessageDialog(null, "Index Out Of Bounds");
	    		 tf16.setText("");
				 tf17.setText("");
				 tf18.setText("");
				 tf19.setText("");
				 tf20.setText("");
				 tf21.setText("");
	    	}
	    	
	    	
	    	
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 PreparedStatement p= con.prepareStatement("insert into train values(?,?,?,?,?,?)");
				 
				 
				 
				 
				 
				 
				 
				 
				 p.setString(1, Name);
				 p.setString(2, Train_No);
				 p.setString(3, Start_Time);
				 p.setString(4, End_Time);
				 p.setString(5, Start_Station);
				 p.setString(6, End_Station);
				
				 
				 int result=p.executeUpdate();
				 
				 if(result>0)
				 {
					 JOptionPane.showMessageDialog(null, "Succesully Inseretd");
					 tf16.setText("");
					 tf17.setText("");
					 tf18.setText("");
					 tf19.setText("");
					 tf20.setText("");
					 tf21.setText("");
					 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Not Inseretd");
					 tf16.setText("");
					 tf17.setText("");
					 tf18.setText("");
					 tf19.setText("");
					 tf20.setText("");
					 tf21.setText("");
				 }
			}
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}
	        p21.setVisible(false);
		    p22.setVisible(true);
		    f.getContentPane().add(p22);
	    }
	   
	    
	    if(e.getSource()==b45)
	    {
	    	p22.setVisible(false);
	    	p2.setVisible(true);
	    	f.getContentPane().add(p2);
	    }
	    if(e.getSource()==b46)
	    {
	    	p23.setVisible(false);
	    	p2.setVisible(true);
	    	f.getContentPane().add(p2);
	    }
	    if(e.getSource()==b47)
	    {
	    	String Train_No=tf22.getText();
			
	    	
	    	
	    	if(Train_No.length()>20)
	    	{
	    		JOptionPane.showMessageDialog(null, "Index Out Of Bounds");
	    		tf22.setText("");
	    	}
	    	
		
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //ResultSet rs=null;
				 
				 //Query
				 
				 PreparedStatement p=con.prepareStatement("delete from train where Train_No=?");
				 
		
				 
				  
			
				 
				 p.setString(1, Train_No);
				 
				 int result=p.executeUpdate();
				 
				 if(result>0)
				 {
					 JOptionPane.showMessageDialog(null, "Succesully Deleted");
					 tf22.setText("");
					 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Not Deleted yet");
					 tf22.setText("");
				 }
			}
			
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}

	    }
	    if(e.getSource()==b48)
	    {
	    	p24.setVisible(false);
	    	p2.setVisible(true);
	    	f.getContentPane().add(p2);
	    }
	    if(e.getSource()==b49)
	    {
	    	p21.setVisible(false);
	    	p2.setVisible(true);
	    	f.getContentPane().add(p2);
	    }
	    if(e.getSource()==b50)
	    {
	    	String Name=tf23.getText();
			String Lastname=tf24.getText();
			String Email=tf25.getText();
			String Phone=tf26.getText();
			String Address=tf27.getText();
			String Aaddhar_No=tf28.getText();
			String DD=cmb15.getSelectedItem().toString();
			String MM=cmb16.getSelectedItem().toString();
			String YY=cmb17.getSelectedItem().toString();
			String Gender=null;
			String Username=tf29.getText();
			String Password=String.valueOf(pf11.getPassword());
			String Confirm=String.valueOf(pf12.getPassword());
			
			
			
			
			if(Name.length()>20 || Lastname.length()>20 || Email.length()>50 || Phone.length()>30 || Address.length()>40 || Aaddhar_No.length()>12 || DD.length()>20 || MM.length()>20 || YY.length()>20 || Username.length()>20 || Password.length()>64 || Confirm.length()>64)
	    	{
	    		JOptionPane.showMessageDialog(null, "Index Out Of Bounds");
	    		tf2.setText("");
	    		tf3.setText("");
	    		tf4.setText("");
	    		tf5.setText("");
	    		tf6.setText("");
	    		tf7.setText("");
	    		cmb.removeAllItems();
	    		cmb1.removeAllItems();
	    		cmb2.removeAllItems();
	    		rb.setText("");
	    		rb1.setText("");
	    		tf8.setText("");
	    		pf2.setText("");
	    		pf3.setText("");
	    	}

			


			
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 PreparedStatement p=con.prepareStatement("update register set Name=?,Lastname=?,Email=?,Phone=?,Address=?,Aaddhar_No=?,DD=?,MM=?,YY=?,Gender=?,Username=?,Password=? where Confirm=?");
				 
				 
				 
				 if(rb2.isSelected())
					{
						Gender="Male";
					}
					if(rb3.isSelected())
					{
						Gender="Female";
					}
				 
				 
				 
				 p.setString(1, Name);
				 p.setString(2, Lastname);
				 p.setString(3, Email);
				 p.setString(4, Phone);
				 p.setString(5, Address);
				 p.setString(6, Aaddhar_No);
				 p.setString(7, DD);
				 p.setString(8, MM);
				 p.setString(9, YY);
				 p.setString(10, Gender);
				 p.setString(11, Username);
				 p.setString(12, Password);
				 p.setString(13, Confirm);
				 
				 int result=p.executeUpdate();
				 
				
				 
				 if (result>0)
				 {
					 JOptionPane.showMessageDialog(null, "Updated Succesfully");
					 tf2.setText("");
			    		tf3.setText("");
			    		tf4.setText("");
			    		tf5.setText("");
			    		tf6.setText("");
			    		tf7.setText("");
			    		cmb.removeAllItems();
			    		cmb1.removeAllItems();
			    		cmb2.removeAllItems();
			    		rb.setText("");
			    		rb1.setText("");
			    		tf8.setText("");
			    		pf2.setText("");
			    		pf3.setText("");
				 }
			 else
			 {
				 JOptionPane.showMessageDialog(null, "Not Updated Yet");
				 tf2.setText("");
		    		tf3.setText("");
		    		tf4.setText("");
		    		tf5.setText("");
		    		tf6.setText("");
		    		tf7.setText("");
		    		cmb.removeAllItems();
		    		cmb1.removeAllItems();
		    		cmb2.removeAllItems();
		    		rb.setText("");
		    		rb1.setText("");
		    		tf8.setText("");
		    		pf2.setText("");
		    		pf3.setText("");
			 }
				 }
				 
			
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}
}
	    
	    if(e.getSource()==b51)
	    {
	    	String Name=tf31.getText();
	    	
	    	
	    	if(Name.length()>20)
	    	{
	    		JOptionPane.showMessageDialog(null, "Index Out Of Bounds");
	    		tf31.setText("");
            }
			
		
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //ResultSet rs=null;
				 
				 //Query
				 
				 PreparedStatement p=con.prepareStatement("delete from register where name=?");
				 
		
				 
				  
			
				 
				 p.setString(1, Name);
				 
				 int result=p.executeUpdate();
				 
				 if(result>0)
				 {
					 JOptionPane.showMessageDialog(null, "Succesully Deleted");
					 tf31.setText("");
					 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Not Deleted yet");
					 tf31.setText("");
				 }
			}
			
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}
	    }
	    
	    if(e.getSource()==b52)
	    {
	    	p26.setVisible(false);
	    	p2.setVisible(true);
	    	f.getContentPane().add(p2);
	    }
	    
	    if(e.getSource()==b53)//Button For  Administrator Login//
	    {
	    	p27.setVisible(false);
	    	p1.setVisible(true);
	    	f.getContentPane().add(p1);
	    }
	    
	    if(e.getSource()==b54)//Button for User Login//
	    {
	    	p27.setVisible(false);
	    	p.setVisible(true);
	    	f.getContentPane().add(p);
	    }
	    
	    if(e.getSource()==b55)
	    {
	    	 lb93.setVisible(false);
	    	p.setVisible(false);
	    	p27.setVisible(true);
	    	f.getContentPane().add(p27);
	    }
	    
	    if(e.getSource()==b56)//Button of Cancelling E-Ticket for go back into the user guide menu//
	    {
	    	lb129.setVisible(false);
	    p18.setVisible(false);
	    p4.setVisible(true);
	    f.getContentPane().add(p4);
	    }
	    
	    if(e.getSource()==b57)//Cancel Button for cancelling the User's registration//
	    {
	    	p5.setVisible(false);
	    	p4.setVisible(true);
	    	f.getContentPane().add(p4);
	    }
	    
	    if(e.getSource()==b58)//Cancel Button for cancelling the Booking E-Ticket Menu/
	    {
	    	 lb95.setVisible(false);
	    	p7.setVisible(false);
	    	p4.setVisible(true);
	    	f.getContentPane().add(p4);
	    }
	    
	    if(e.getSource()==b59)//Cancel Button for cancelling the Tatkal Book Ticket Menu/
	    {
	    	lb96.setVisible(false);
	    	p13.setVisible(false);
	    	p4.setVisible(true);
	    	f.getContentPane().add(p4);
	    }
	    
	    if(e.getSource()==b62)
	    {
	    	int dialogButton=JOptionPane.YES_NO_OPTION;
	    	JOptionPane.showConfirmDialog(null, "Do you really want to Cancel");
	    	p8.setVisible(false);
	    	p4.setVisible(true);
	    	f.getContentPane().add(p4);
	    	
	    }
	    
	    if(e.getSource()==b63)
	    {
	    	int dialogButton=JOptionPane.YES_NO_OPTION;
	    	JOptionPane.showConfirmDialog(null, "Do you really want to Cancel");
	    	p14.setVisible(false);
	    	p4.setVisible(true);
	    	f.getContentPane().add(p4);
	    	
	    }
	    
	    if(e.getSource()==b64)
	    {
	    	p25.setVisible(false);
	    	p2.setVisible(true);
	    	f.getContentPane().add(p2);
	    }
	    
	    if(e.getSource()==b65)
	    {
	    	p28.setVisible(false);
	    	p4.setVisible(true);
	    	f.getContentPane().add(p4);
	    }
	    
	    if(e.getSource()==b66)
	    {
	    	p29.setVisible(false);
	    	p30.setVisible(true);
	    	f.getContentPane().add(p30);
	    }
	    
	    
	    if(e.getSource()==b67)
	    {
	    	p29.setVisible(false);
	    	p31.setVisible(true);
	    	f.getContentPane().add(p31);
	    }
	    
	    
	    
	    
	    if(e.getSource()==b68)
	    {
	    	p29.setVisible(false);
	    	p.setVisible(true);
	    	f.getContentPane().add(p);
	    }
	    
	    
	    if(e.getSource()==b69)
	    {
	    	p30.setVisible(false);
	    	p29.setVisible(true);
	    	f.getContentPane().add(p29);
	    }
	    
	    
	    
	    if(e.getSource()==b70)
	    {
	    	p31.setVisible(false);
	    	p29.setVisible(true);
	    	f.getContentPane().add(p29);
	    }
	    
	    
	    
	    if(e.getSource()==b71)
	    {
	    	p32.setVisible(false);
	    	p33.setVisible(true);
	    	f.getContentPane().add(p33);
	    }
	    
	    
	    
	    
	    if(e.getSource()==b72)
	    {
	    	p32.setVisible(false);
	    	p34.setVisible(true);
	    	f.getContentPane().add(p34);
	    }
	    
	    
	    
	    if(e.getSource()==b73)
	    {
	    	p32.setVisible(false);
	    	p.setVisible(true);
	    	f.getContentPane().add(p);
	    }

	    
	    if(e.getSource()==b74)
	    {
	    	String Username=tf38.getText();
			String Password=String.valueOf(pf13.getPassword());
			
			if(Username.length()>64 && Password.length()>64)
			{
				JOptionPane.showMessageDialog(null, "Index Out Of Bound");
				tf38.setText("");
				pf13.setText("");
			}
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 Statement st= con.createStatement();
				 ResultSet rs=st.executeQuery("select Username,Password from register");
				 
				 
				 while(rs.next())
				 {
					 String r = rs.getString("Username");
					 String v = rs.getString("Password");
				 
				
				 if (Username.equals(r) && Password.equals(v)) 
				 {
					 JOptionPane.showMessageDialog(null, "Logged In Succesfully");
					 tf38.setText("");
					 pf13.setText("");
					 lb160.setVisible(false);
					 p33.setVisible(false);
					 p19.setVisible(true);
				    f.getContentPane().add(p19);

				 }
			 else
			 {
				 tf38.setText("");
				 pf13.setText("");
				lb160.setVisible(true);
			 }
				 }
			}
			
				 
				  
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
				
			}
	    }
	    
	    if(e.getSource()==b75)
	    {
	    	 lb160.setVisible(false);
	    	p33.setVisible(false);
	    	p32.setVisible(true);
	    	f.getContentPane().add(p32);
	    }
	    
	    
	    
	    
	    if(e.getSource()==b76)
	    {
	    	p34.setVisible(false);
	    	p32.setVisible(true);
	    	f.getContentPane().add(p32);
	    }
	    
	    
	    if(e.getSource()==b77)
	    {
	    	p35.setVisible(false);
	    	p36.setVisible(true);
	    	f.getContentPane().add(p36);
	    }
	    
	    
	    
	    if(e.getSource()==b78)
	    {
	    	p35.setVisible(false);
	    	p37.setVisible(true);
	    	f.getContentPane().add(p37);
	    }
	    
	    
	    if(e.getSource()==b79)
	    {
	    	p35.setVisible(false);
	    	p38.setVisible(true);
	    	f.getContentPane().add(p38);
	    }
	    
	    
	    
	    if(e.getSource()==b80)
	    {
	    	p35.setVisible(false);
	    	p39.setVisible(true);
	    	f.getContentPane().add(p39);
	    }
	    
	    
	    
	    
	    
	    if(e.getSource()==b81)
	    {
	    	p35.setVisible(false);
	    	p.setVisible(true);
	    	f.getContentPane().add(p);
	    }
	    
	    
	    if(e.getSource()==b82)
	    {
	    	p36.setVisible(false);
	    	p35.setVisible(true);
	    	f.getContentPane().add(p35);
	    }
	    
	    
	    
	    
	    if(e.getSource()==b83)
	    {
	    	String PNR_No=tf39.getText();
			ResultSet rs=null;
	    	
			if(PNR_No.length()>4 )
			{
				JOptionPane.showMessageDialog(null, "Index Out Of Bound");
				tf39.setText("");
			}
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
			
				 PreparedStatement p=con.prepareStatement("select * from journey where PNR_No=?");
				 
				 p.setString(1, PNR_No);
				 
				 rs=p.executeQuery();
				 
				 while(rs.next())
				 {
					tf40.setText(rs.getString("Username"));
					tf41.setText(rs.getString("From_Station"));
					tf42.setText(rs.getString("To_Station"));
					tf43.setText(rs.getString("DD"));
					tf44.setText(rs.getString("MM"));
					tf45.setText(rs.getString("YY"));
					tf46.setText(rs.getString("Ticket_Type"));
					
					
				 }
			}
			
				 
				  
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
				
			}
	    }
	    
	    
	    
	    if(e.getSource()==b84)
	    {
	    	tf39.setText("");
	    	tf40.setText("");
	    	tf41.setText("");
	    	tf42.setText("");
	    	tf43.setText("");
	    	tf44.setText("");
	    	tf45.setText("");
	    	tf46.setText("");
	    	p37.setVisible(false);
	    	p35.setVisible(true);
	    	f.getContentPane().add(p35);
	    }
	    
	    
	    if(e.getSource()==b85)
	    {
	    	String Train_No=tf52.getText();
			ResultSet rs=null;
	    	
			if(Train_No.length()>20 )
			{
				JOptionPane.showMessageDialog(null, "Index Out Of Bound");
				tf52.setText("");
			}
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
			
				 PreparedStatement p=con.prepareStatement("select * from train where Train_No=?");
				 
				 p.setString(1, Train_No);
				 
				 rs=p.executeQuery();
				 
				 while(rs.next())
				 {
					tf47.setText(rs.getString("name"));
					tf48.setText(rs.getString("Start_Time"));
					tf49.setText(rs.getString("End_Time"));
					tf50.setText(rs.getString("Start_Station"));
					tf51.setText(rs.getString("End_Station"));
					
				 }
			}
			
				 
				  
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
				
			}
	    }
	    
	    
	    if(e.getSource()==b86)
	    {
	    	tf47.setText("");
	    	tf48.setText("");
	    	tf49.setText("");
	    	tf50.setText("");
	    	tf51.setText("");
	    	tf52.setText("");
	    	p38.setVisible(false);
	    	p35.setVisible(true);
	    	f.getContentPane().add(p35);
	    }
	    
	    
	    
	    
	    if(e.getSource()==b87)
	    {
	    	String Train_No=tf53.getText();
			ResultSet rs=null;
	    	
			if(Train_No.length()>20 )
			{
				JOptionPane.showMessageDialog(null, "Index Out Of Bound");
				tf53.setText("");
			}
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
			
				 PreparedStatement p=con.prepareStatement("select * from trains where Train_No=?");
				 
				 p.setString(1, Train_No);
				 
				 rs=p.executeQuery();
				 

				 
				 while(rs.next())
				 {
					tf54.setText(rs.getString("Train_Fare"));
					
				 }
			
			}
			
			
			
				 
				  
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
				
			}
	    }
	    
	    
	    
	    if(e.getSource()==b88)
	    {
	    	tf53.setText("");
	    	tf54.setText("");
	    	p39.setVisible(false);
	    	p35.setVisible(true);
	    	f.getContentPane().add(p35);
	    }
	    
	    
	    if(e.getSource()==b89)
	    {
	    	String Username=tf55.getText();
			String Password=String.valueOf(pf14.getPassword());
			
			if(Username.length()>64 && Password.length()>64)
			{
				JOptionPane.showMessageDialog(null, "Index Out Of Bound");
				tf55.setText("");
				pf14.setText("");
			}
			
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 Statement st= con.createStatement();
				 ResultSet rs=st.executeQuery("select Username,Password from register");
				 
				 
				 while(rs.next())
				 {
					 String p = rs.getString("Username");
					 String q = rs.getString("Password");
				 
				
				 if (Username.equals(p) && Password.equals(q)) 
				 {
					 JOptionPane.showMessageDialog(null, "Logged In Succesfully");
					 tf55.setText("");
					 pf14.setText("");
					 lb196.setVisible(false);
					 p40.setVisible(false);
					 p41.setVisible(true);
				    f.getContentPane().add(p41);

				 }
			 else
			 {
				tf55.setText("");
				pf14.setText("");
				 lb196.setVisible(true);
			 }
				 }
			}
			
				 
				  
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
				
			}
	    }
	    
	    if(e.getSource()==b90)
	    {
	    	 lb196.setVisible(false);
	    	p40.setVisible(false);
	    	p48.setVisible(true);
	    	f.getContentPane().add(p48);
	    }
	    
	    
	    if(e.getSource()==b91)
	    {
	    	String Username=tf56.getText();
	    	String PNR_No=tf57.getText();
	    	String From_Station=cmb18.getSelectedItem().toString();
	    	String To_Station=cmb19.getSelectedItem().toString();
	    	String DD=cmb20.getSelectedItem().toString();
	    	String MM=cmb21.getSelectedItem().toString();
	    	String YY=cmb22.getSelectedItem().toString();
	    	String Ticket_Type=cmb23.getSelectedItem().toString();
	    	
	    	
	    	
	    	if(Username.length()>50 || PNR_No.length()>4)
	    	{
	    		JOptionPane.showMessageDialog(null, "Index Out Of Bounds");
	    		tf56.setText("");
	    		tf57.setText("");
	    	}
	    	
	    	
	    	
	    	
	    	
	    	Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 PreparedStatement p= con.prepareStatement("insert into journey values(?,?,?,?,?,?,?,?)");
				 
				 
				 
				 
				 
				 
				 
				 
				 p.setString(1, Username);
				 p.setString(2, PNR_No);
				 p.setString(3, From_Station);
				 p.setString(4, To_Station);
				 p.setString(5, DD);
				 p.setString(6, MM);
				 p.setString(7, YY);
				 p.setString(8, Ticket_Type);
				
				 
				 int result=p.executeUpdate();
				 
				 if(result>0)
				 {
					 JOptionPane.showMessageDialog(null, "Journey Succesfully Planned");
						tf56.setText("");
						tf57.setText("");
						cmb18.removeAllItems();
						cmb19.removeAllItems();
						cmb20.removeAllItems();
						cmb21.removeAllItems();
						cmb22.removeAllItems();
						cmb23.removeAllItems();
					    p41.setVisible(false);
					    p42.setVisible(true);
					    f.getContentPane().add(p42);
					 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Journey Not Planned");
						tf56.setText("");
						tf57.setText("");
						cmb18.removeAllItems();
						cmb19.removeAllItems();
						cmb20.removeAllItems();
						cmb21.removeAllItems();
						cmb22.removeAllItems();
						cmb23.removeAllItems();
				 }
			}
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}
	    }
	    
	    
	    
	    
	    if(e.getSource()==b92)
	    {
	    	int dialogButton=JOptionPane.YES_NO_OPTION;
	    	JOptionPane.showConfirmDialog(null, "Do you really want to Cancel");
	    	p41.setVisible(false);
	    	p40.setVisible(true);
	    	f.getContentPane().add(p40);
	    	
	    }
	    
	    
	    
	    
	    if(e.getSource()==b93 || e.getSource()==b94) 
	    {
	    	p42.setVisible(false);
	    	p43.setVisible(true);
	    	f.getContentPane().add(p43);
	    }
	    
	    
	    
	    if(e.getSource()==b95)
	    {
	    	String Card_No=tf58.getText();
	    	String Card_Pin=String.valueOf(pf15.getPassword());
	    	String CVV_No=String.valueOf(pf16.getPassword());
	    	String Total_Amount=tf59.getText();
	    	
	    	
	    	b.setNo1(Double.parseDouble(tf59.getText()));
			c=a-b.getNo1();
		    tf60.setText("" +c);

	   
	    	
	    	
	    	if(Card_No.length()>30 || Card_Pin.length()>20 || CVV_No.length()>3 || Total_Amount.length()>30 )
	    	{
	    		JOptionPane.showMessageDialog(null, "Index Out Of Bounds");
	    		tf58.setText("");
	    		pf15.setText("");
	    		pf16.setText("");
	    		tf59.setText("");
	    	}
	    	
	    	
	    	
	    	
	    	
	    	Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 PreparedStatement p= con.prepareStatement("insert into payment values(?,?,?,?)");
				 
				 
				 
				 
				 
				 
				 
				 
				 p.setString(1, Card_No);
				 p.setString(2, Card_Pin);
				 p.setString(3, CVV_No);
				 p.setString(4, Total_Amount);
				
				 
				 int result=p.executeUpdate();
				 
				 if(result>0)
				 {
					 JOptionPane.showMessageDialog(null, "Journey Succesfully Planned");
						tf58.setText("");
						pf15.setText("");
						pf16.setText("");
						tf59.setText("");
					    p43.setVisible(false);
					    p44.setVisible(true);
					    f.getContentPane().add(p44);
					 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Journey Not Planned");
						tf56.setText("");
						pf15.setText("");
						pf16.setText("");
						tf57.setText("");
						
				 }
			}
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}
	    			  
	    }
	    
	    
	    
	    if(e.getSource()==b96)
	    {
	    	p44.setVisible(false);
	    	p48.setVisible(true);
		    f.getContentPane().add(p48);
	    }
	    
	    
	    
	    
	    if(e.getSource()==b97)
	    {
	    	String Username=tf61.getText();
			String Password=String.valueOf(pf17.getPassword());
			
			if(Username.length()>64 && Password.length()>64)
			{
				JOptionPane.showMessageDialog(null, "Index Out Of Bound");
				tf61.setText("");
				pf17.setText("");
			}
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //Query
				 
				 Statement st= con.createStatement();
				 ResultSet rs=st.executeQuery("select Username,Password from register");
				 
				 
				 while(rs.next())
				 {
					 String r = rs.getString("Username");
					 String v = rs.getString("Password");
				 
				
				 if (Username.equals(r) && Password.equals(v)) 
				 {
					 JOptionPane.showMessageDialog(null, "Logged In Succesfully");
					 tf61.setText("");
					 pf17.setText("");
					 lb212.setVisible(false);
					 p45.setVisible(false);
					 p46.setVisible(true);
				    f.getContentPane().add(p46);

				 }
			 else
			 {
				 tf61.setText("");
				 pf17.setText("");
				lb212.setVisible(true);
			 }
				 }
			}
			
				 
				  
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
				
			}

	    }
	    
	    
	    
	    if(e.getSource()==b98)
	    {
	    	lb212.setVisible(false);
	    	p45.setVisible(false);
	    	p48.setVisible(true);
		    f.getContentPane().add(p48);
	    }
	    
	    
	    
	    	if(e.getSource()==b99)
	    	{
	    		String PNR_No=tf62.getText();
			
	    	
	    	
	    	if(PNR_No.length()>50)
	    	{
	    		JOptionPane.showMessageDialog(null, "Index Out Of Bounds");
	    		tf62.setText("");
	    	}
	    	
		
			
			Connection con=null;
			try 
			{
				//Registering Driver//
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				//Connecting to Database//
				 con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "System", "methanol");
				
				 //ResultSet rs=null;
				 
				 //Query
				 
				 PreparedStatement p=con.prepareStatement("delete from journey where PNR_No=?");
				 
		
				 
				  
			
				 
				 p.setString(1, PNR_No);
				 
				 int result=p.executeUpdate();
				 
				 if(result>0)
				 {
					 JOptionPane.showMessageDialog(null, "Succesully Deleted");
					 tf62.setText("");
					 p46.setVisible(false);
					 p47.setVisible(true);
					 f.getContentPane().add(p47);
					 }
				 else
				 {
					 JOptionPane.showMessageDialog(null, "Not Deleted yet");
					 tf62.setText("");
					 p46.setVisible(true);
					 f.getContentPane().add(p46);
				 }
			}
			
			catch(ClassNotFoundException ex){
				ex.printStackTrace();
			}
		catch(SQLException ex){
			ex.printStackTrace();
			}
			finally{
				try
				{
					con.close();
				}
				catch(SQLException ex)
				{
					ex.printStackTrace();
					
				}
			}
	    }
	    	
	    	
	    	
	    	if(e.getSource()==b100)
	    	{
	    		p47.setVisible(false);
	    		p48.setVisible(true);
	    		f.getContentPane().add(p48);
	    	}
	    	
	    	
	    	
	    	if(e.getSource()==b101)
	    	{
	    		p48.setVisible(false);
	    		p40.setVisible(true);
	    		f.getContentPane().add(p40);
	    	}
	    	
	    	
	    	
	    	if(e.getSource()==b102)
	    	{
	    		p48.setVisible(false);
	    		p45.setVisible(true);
	    		f.getContentPane().add(p45);
	    	}
	    	
	    	
	    	
	    	
	    	
	    	
	    	
	    	if(e.getSource()==b103)
	    	{
	    		p48.setVisible(false);
	    		p.setVisible(true);
	    		f.getContentPane().add(p);
	    	}
	    	





	    

}

public static void main(String args[])
{
	Railway rlwy=new Railway();
}
}
