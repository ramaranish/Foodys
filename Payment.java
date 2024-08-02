package vit_foodys_MS;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;

public class Payment extends JFrame implements ActionListener{
	JButton google_pay;
	JButton phonepe;
	JButton freecharge;
	JButton airtel_money;
	JButton paytm;
	JButton amazon_pay;
	JButton home;
	JLabel tem;
	
	
	
	ImageIcon  google_pay_icon;
	ImageIcon  phonepe_icon;
	ImageIcon  freecharge_icon;
	ImageIcon airtel_money_icon;
	ImageIcon  paytm_icon;
	ImageIcon  amazon_pay_icon;
	String name_title;
	String total_values;
	Payment(String name_title,String total_values)
	{
		this.total_values=total_values;
		this.name_title=name_title;
		Image logo=Toolkit.getDefaultToolkit().getImage("logo.jpg");
		
		
		google_pay_icon=new ImageIcon("google pay.png");
		phonepe_icon=new ImageIcon("phonepe.png");
		freecharge_icon=new ImageIcon("freecharge.png");
		airtel_money_icon=new ImageIcon("airtel money.png");
		paytm_icon=new ImageIcon("paytm.png");
		amazon_pay_icon=new ImageIcon("amazon pay.png");
		
		google_pay=new JButton();
		phonepe=new JButton();
		freecharge=new JButton();
		airtel_money=new JButton();
		paytm=new JButton();
		amazon_pay=new JButton();
		tem=new JLabel();
		
		google_pay.setBounds(100,80,220,240);
		google_pay.setIcon(google_pay_icon);
		google_pay.setBackground(Color.white);
		google_pay.setOpaque(true);
		google_pay.setFocusable(false);
		google_pay.addActionListener(this);
		
		phonepe.setBounds(380,80,220,240);
		phonepe.setIcon(phonepe_icon);
		phonepe.setBackground(Color.white);
		phonepe.setOpaque(true);
		phonepe.setFocusable(false);
		phonepe.addActionListener(this);
		
		amazon_pay.setBounds(640,80,220,240);
		amazon_pay.setIcon(amazon_pay_icon);
		amazon_pay.setBackground(Color.white);
		amazon_pay.setOpaque(true);
		amazon_pay.setFocusable(false);
		amazon_pay.addActionListener(this);
		
		freecharge.setBounds(100,360,220,240);
		freecharge.setIcon(freecharge_icon);
		freecharge.setBackground(Color.white);
		freecharge.setOpaque(true);
		freecharge.setFocusable(false);
		freecharge.addActionListener(this);
		
		paytm.setBounds(380,360,220,240);
		paytm.setIcon(paytm_icon);
		paytm.setBackground(Color.white);
		paytm.setOpaque(true);
		paytm.setFocusable(false);
		paytm.addActionListener(this);
		
		airtel_money.setBounds(640,360,220,240);
		airtel_money.setIcon(airtel_money_icon);
		airtel_money.setBackground(Color.white);
		airtel_money.setOpaque(true);
	    airtel_money.setFocusable(false);
	    airtel_money.addActionListener(this);
	    
	    home=new JButton();
		home.setBounds(50, 620, 150, 30);
		home.setText("<<Home");
		home.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,19));
		home.setFocusable(false);
		home.setForeground(Color.white);
		home.setBackground(Color.blue);
		home.addActionListener(this);
		
		this.add(airtel_money);
		this.add(amazon_pay);
		this.add(freecharge);
		this.add(google_pay);
		this.add(paytm);
		this.add(phonepe);
		this.add(home);
		this.add(tem);
		this.setIconImage(logo);
		this.setTitle("PAYMENT");
		this.setSize(1000,700);
		this.setResizable(false);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.setLayout(null);
		this.getContentPane().setBackground(Color.white);
	    this.setLocationRelativeTo(null);	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	
		if(e.getSource()==home)
		{
			Home home1=new Home();
			this.dispose();
		}
		if(e.getSource()==google_pay)
		{
			String name_google_pay="Google pay";
		    payments payment1=new payments(name_google_pay,name_title,total_values);
		    this.dispose();
		}
		if(e.getSource()==phonepe)
		{
			String name_phonepe="Phonepe";
			payments  payment2=new payments(name_phonepe,name_title,total_values);
			this.dispose();
		} 
		if(e.getSource()==freecharge)
		{
			String name_freecharge="FreeCharge";
			payments  payment3=new payments(name_freecharge,name_title,total_values);
			this.dispose();
		}
		if(e.getSource()==amazon_pay)
		{
			String name_amazon_pay="Amazon pay";
			payments payment4=new payments(name_amazon_pay,name_title,total_values);
			this.dispose();
		}
		if(e.getSource()==paytm)
		{
			String name_paytm="Paytm";
			payments  payment5=new payments(name_paytm,name_title,total_values);
			this.dispose();
		}
		if(e.getSource()==airtel_money)
		{
			String name_airtel_money="Airtel Money";
			payments payment5=new payments(name_airtel_money,name_title,total_values);
			this.dispose();
		}
	}

}

class payments extends JFrame implements ActionListener
{
	
	JLabel payment_pic_label;
	JLabel title;
	JLabel payment_title;
	JLabel number;
	JLabel password;
	JLabel amount;
	JLabel amount_value;
	JLabel pink;
	JButton home;
	JButton button1;
	
	JTextField number_textfield;
	JPasswordField password_textfield;
	
	ImageIcon payment_pic;
	String set_name_title;
	String total_values;
	String name_payment;
	Connection con=null;
	ResultSet rs=null;
	PreparedStatement st=null;
	Statement smt;
	String qry="";
	payments(String name_payment,String name_title,String total_values)
	{
		connect();
		this.set_name_title=name_title;
		this.total_values=total_values;
		this.name_payment=name_payment;
		
		pink=new JLabel();
		pink.setBounds(480, 50, 470, 500);
		pink.setBackground(Color.pink);
		pink.setOpaque(true);
		
		
		payment_pic=new ImageIcon("payment_pic.jpeg");
		
		payment_pic_label=new JLabel();
		payment_pic_label.setBounds(0, 0, 980,700);
		payment_pic_label.setIcon(payment_pic);
		
		title=new JLabel();
		title.setBounds(0, 50, 470, 50);
		title.setText(name_payment);
		title.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,35));
		title.setBackground(Color.pink);
		title.setForeground(Color.red);
		title.setOpaque(true);
		title.setVerticalAlignment(JLabel.CENTER);
		title.setHorizontalAlignment(JLabel.CENTER);
		
		payment_title=new JLabel();
		payment_title.setBounds(0, 100, 470, 100);
		payment_title.setText(set_name_title);
		payment_title.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
        payment_title.setForeground(Color.WHITE);
        payment_title.setBackground(Color.pink);
        payment_title.setOpaque(true);
        payment_title.setVerticalAlignment(JLabel.CENTER);
        payment_title.setHorizontalAlignment(JLabel.CENTER);
		
        number=new JLabel();
        number.setBounds(10, 200, 200, 50);
		number.setText("Phone Number");
		number.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
        number.setForeground(Color.BLACK);
        number.setBackground(Color.pink);
        number.setOpaque(true);
        number.setVerticalAlignment(JLabel.TOP);
        number.setHorizontalAlignment(JLabel.LEFT);
        
        number_textfield=new JTextField(10);
        number_textfield.setBounds(210, 200, 200, 40);
        number_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		number_textfield.setBackground(Color.white);
		number_textfield.setForeground(Color.black);
		number_textfield.setOpaque(true);
		number_textfield.setEnabled(true);
        
        password=new JLabel();
        password.setBounds(10, 250, 200, 50);
		password.setText("Enter Password");
		password.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
        password.setForeground(Color.BLACK);
        password.setBackground(Color.pink);
        password.setOpaque(true);
        password.setVerticalAlignment(JLabel.TOP);
        password.setHorizontalAlignment(JLabel.LEFT);
        
        
        password_textfield=new JPasswordField();
        password_textfield.setBounds(210, 250, 200, 40);
        password_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		password_textfield.setBackground(Color.white);
		password_textfield.setForeground(Color.black);
		password_textfield.setEnabled(true);
		
		amount=new JLabel();
		amount.setBounds(10,300,200,50);
		amount.setText("Amount");
		amount.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
        amount.setForeground(Color.BLACK);
        amount.setBackground(Color.pink);
        amount.setOpaque(true);
        amount.setVerticalAlignment(JLabel.TOP);
        amount.setHorizontalAlignment(JLabel.LEFT);
        
        amount_value=new JLabel();
		amount_value.setBounds(210,300,200,40);
		amount_value.setText("Rs."+total_values);
		amount_value.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
        amount_value.setForeground(Color.BLACK);
        amount_value.setBackground(Color.WHITE);
        amount_value.setOpaque(true);
        amount_value.setVerticalAlignment(JLabel.CENTER);
        amount_value.setHorizontalAlignment(JLabel.CENTER);
        
        button1=new JButton(" SUBMIT");
		button1.setBounds(250, 350, 100, 40);
		button1.setForeground(Color.white);
		button1.setBackground(Color.red);
		button1.setOpaque(true);
		button1.setFocusable(false);
		button1.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
		button1.addActionListener(this);
		
		
		home=new JButton("HOME");
		home.setBounds(10, 350, 100, 40);
		home.setForeground(Color.white);
		home.setBackground(Color.BLUE);
		home.setOpaque(true);
		home.setFocusable(false);
		home.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
		home.addActionListener(this);
        
		pink.add(title);
		pink.add(payment_title);
		pink.add(number);
		pink.add(number_textfield);
		pink.add(password);
		pink.add(password_textfield);
		pink.add(amount);
		pink.add(amount_value);
		pink.add(button1);
		pink.add(home);
		payment_pic_label.add(pink);
		
		Image logo=Toolkit.getDefaultToolkit().getImage("logo.jpg");
		this.setIconImage(logo);
		this.setTitle("PAYMENT");
		this.setSize(980,700);
		this.add(payment_pic_label);
		this.setResizable(false);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.setLayout(null);
		this.getContentPane().setBackground(Color.white);
	    this.setLocationRelativeTo(null);	
	}

	public void connect()
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dbs2?characterEncoding=utf8","root","Ranjith30052004");
		Statement stmt=con.createStatement();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==home)
		{
			Home home1=new Home();
			this.dispose();
		}
	    if(e.getSource()==button1)
	    {
	    	try {
	    	long number=0,amount=0;
			String name="",password="";
	    	String number1=number_textfield.getText();
	    	String password1=password_textfield.getText();
	    	long amount1=0;
	    	long number2=0;
	    	String password2 ="";
			long total_values1=Long.parseLong(total_values);
	    	     try {
	    	            number2=Long.parseLong(number1);
	    	            password2=password1;
	    	     }
	    	     catch(Exception exc)
	    	     {	    		
	    	    	 JOptionPane.showMessageDialog(null,"Please Enter the Number","Incomplete",JOptionPane.WARNING_MESSAGE);
	    	      }
	    	if(!number1.isEmpty() && !password1.isEmpty())
	    	{
			    qry="SELECT * from RV18 where NUMBER="+number1;
				smt=con.createStatement();
				rs=smt.executeQuery(qry);
			    if(rs.next())
			    {
			    	name=rs.getString("NAME");
			    	number=rs.getLong("NUMBER");
			    	password=rs.getString("PASSWORD");
      		    	amount=rs.getLong("AMOUNT");
			    	amount1=amount-total_values1;
			    	
			    	if(amount1<0)
			    	{
			    		JOptionPane.showMessageDialog(null,name+" , Your Account Balance is lesser than Total Amount","Low Balance",JOptionPane.WARNING_MESSAGE);
			    		
			    	}
			    	else if(!password.equals(password2))
			    	{
			    		JOptionPane.showMessageDialog(null,name+" , Your Password is Incorrect","Incorrect",JOptionPane.ERROR_MESSAGE);
			    		password_textfield.setText("");
			    	}
			    	else
			    	{
			    		qry="update  RV18 set NAME=?,AMOUNT=? Where number=?";
						st=con.prepareStatement(qry);
					    st.setString(1,name);
					    st.setLong(2, amount1);
						st.setLong(3, number);
					    st.executeLargeUpdate();
					    JOptionPane.showMessageDialog(null,name+" , Amount Successfully Paid","Payment",JOptionPane.INFORMATION_MESSAGE);
					    this.dispose();
					    thank t=new thank();
			    	}
			    }
			    else
			    {
			    	password_textfield.setText("");
			    	number_textfield.setText("");
			    	JOptionPane.showMessageDialog(null,"Number or Password is Incorrect","Incorrect",JOptionPane.ERROR_MESSAGE);
			    }
	    	}
	    	}
	    	catch(Exception ex)
	    	{
	    		ex.printStackTrace();
	    	}
	    }
		
	}
	
}
class thank extends JFrame
{
	
	thank() throws InterruptedException
	{
	    Image logo=Toolkit.getDefaultToolkit().getImage("logo.jpg");
	    ImageIcon thank_you=new ImageIcon("thank.gif");
	    JLabel label1=new JLabel();
	    thank_you.getImage().flush();
	    label1.setIcon(thank_you);
		this.setIconImage(logo);
		this.setTitle("Thank You");
		this.setSize(980,547);
		this.add(label1);
		this.setResizable(false);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.setLayout(null);
		this.getContentPane().setBackground(Color.white);
	    this.setLocationRelativeTo(null);	
	}
}