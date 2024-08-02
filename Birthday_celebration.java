package vit_foodys_MS;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Birthday_celebration extends JFrame implements ActionListener{
	
	
	JLabel title;
	JLabel tem;
	JLabel first_name;
	JLabel last_name;
	JLabel name;
	JLabel time;
	JLabel date;
    JLabel day;
    JLabel month;
    JLabel year;
    JLabel msg;
    JLabel number;
    JLabel personal_email;
    JLabel vit_email;
    JLabel amount_name;
    JLabel amount;
    JLabel members;
    JLabel birth_pic_set;
    
	JTextField first_name_textfield;
	JTextField last_name_textfield;
	JTextField number_textfield;
	JTextField personal_email_textfield;
	JTextField vit_email_textfield;
    JTextField members_textfield;
	
	JComboBox days;
	JComboBox no_month;
	JComboBox no_year;
	JComboBox time_duration;
	
	JButton back;
	JButton clear;
	JButton register;
	JButton cancel;
	JButton home;
	
	ImageIcon birth_pic;
	
	Birthday_celebration()
	{
		Image logo=Toolkit.getDefaultToolkit().getImage("logo.jpg");
		birth_pic=new ImageIcon("birthday.jpg");
		
		String[] days_1= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String[] month_1= {"1","2","3","4","5","6","7","8","9","10","11","12"};
        String[] year_1= {"2022","2023","2024","2025","2026","2027","2028","2029","2030"};
        String[] time_limit={"8.00 AM-8.30 AM","8.30 AM-9.00 AM","9.00 AM-9.30 AM","9.30 AM-10.00 AM","10.00 AM-10.30 AM","10.30 AM-11.00 AM","11.00 AM-11.30 AM","11.30 AM-12.00 PM","12.00 PM-12.30 PM","12.30 PM-1.00 PM","1.00 PM-1.30 PM","1.30 PM-2.00 PM","2.00 PM-2.30 PM","2.30 PM-3.00 PM","3.00 PM-3.30 PM","3.30 PM-4.00 PM","4.00 PM-4.30 PM","4.30 PM-5.00 PM","5.00 PM-5.30 PM","5.30 PM-6.00 PM","6.00 PM-6.30 PM","6.30 PM-7.00 PM"};
		
        birth_pic_set=new JLabel();
        birth_pic_set.setBounds(50,100,200,150);
        birth_pic_set.setBackground(Color.DARK_GRAY);
        birth_pic_set.setOpaque(true);
        birth_pic_set.setIcon(birth_pic);
        
        
		title=new JLabel("BIRTHDAY CELEBRATION REGISTRATION");
		title.setBounds(240,0,600,50);
		title.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		title.setBackground(Color.DARK_GRAY);
		title.setForeground(Color.YELLOW);
		title.setHorizontalAlignment(JLabel.CENTER);
		title.setVerticalAlignment(JLabel.CENTER);
		title.setOpaque(true);
		title.setFocusable(false);
		
		name=new JLabel("Name");
		name.setBounds(300,70,150,30);
		name.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		name.setBackground(Color.DARK_GRAY);
		name.setForeground(Color.white);
		name.setHorizontalAlignment(JLabel.LEFT);
		name.setVerticalAlignment(JLabel.TOP);
		name.setOpaque(true);
		name.setFocusable(false);
				
		first_name=new JLabel("First Name");
		first_name.setBounds(450,110,150,20);
		first_name.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		first_name.setBackground(Color.DARK_GRAY);
		first_name.setForeground(Color.white);
		first_name.setHorizontalAlignment(JLabel.LEFT);
		first_name.setVerticalAlignment(JLabel.TOP);
		first_name.setOpaque(true);
		first_name.setFocusable(false);
		
		first_name_textfield=new JTextField();
		first_name_textfield.setBounds(450,70,200,25);
		first_name_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		first_name_textfield.setBackground(Color.white);
		first_name_textfield.setForeground(Color.black);
		first_name_textfield.setOpaque(true);
        first_name_textfield.setEnabled(true);
		
		
		last_name=new JLabel("Last Name");
		last_name.setBounds(670,110,150,20);
		last_name.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		last_name.setBackground(Color.DARK_GRAY);
		last_name.setForeground(Color.white);
		last_name.setHorizontalAlignment(JLabel.LEFT);
		last_name.setVerticalAlignment(JLabel.TOP);
		last_name.setOpaque(true);
		last_name.setFocusable(false);
		
		last_name_textfield=new JTextField();
		last_name_textfield.setBounds(670,70,160,25);
		last_name_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		last_name_textfield.setBackground(Color.white);
		last_name_textfield.setForeground(Color.black);
		last_name_textfield.setOpaque(true);
        last_name_textfield.setEnabled(true);
		
        date=new JLabel("Date");
		date.setBounds(300,140,150,30);
		date.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		date.setBackground(Color.DARK_GRAY);
		date.setForeground(Color.white);
		date.setHorizontalAlignment(JLabel.LEFT);
		date.setVerticalAlignment(JLabel.TOP);
		date.setOpaque(true);
		date.setFocusable(false);
		
		
		day=new JLabel("Day");
		day.setBounds(650,140,100,20);
		day.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		day.setBackground(Color.DARK_GRAY);
		day.setForeground(Color.white);
		day.setHorizontalAlignment(JLabel.LEFT);
		day.setVerticalAlignment(JLabel.TOP);
		day.setOpaque(true);
		day.setFocusable(false);
		
		days=new JComboBox(days_1);
		days.setBounds(650, 170, 80, 30);
		days.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		days.setBackground(Color.WHITE);
		days.setForeground(Color.BLACK);
		days.setOpaque(true);
		days.setFocusable(false);
		
		month=new JLabel("Month");
		month.setBounds(550,140,100,20);
		month.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,19));
		month.setBackground(Color.DARK_GRAY);
		month.setForeground(Color.white);
		month.setHorizontalAlignment(JLabel.LEFT);
		month.setVerticalAlignment(JLabel.TOP);
		month.setOpaque(true);
		month.setFocusable(false);
		
		no_month=new JComboBox(month_1);
		no_month.setBounds(550, 170, 80, 30);
		no_month.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		no_month.setBackground(Color.WHITE);
		no_month.setForeground(Color.BLACK);
		no_month.setOpaque(true);
		no_month.setFocusable(false);
		no_month.addActionListener(this);
		
		year=new JLabel("Year");
		year.setBounds(450,140,100,20);
		year.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		year.setBackground(Color.DARK_GRAY);
		year.setForeground(Color.white);
		year.setHorizontalAlignment(JLabel.LEFT);
		year.setVerticalAlignment(JLabel.TOP);
		year.setOpaque(true);
		year.setFocusable(false);
		

		no_year=new JComboBox(year_1);
		no_year.setBounds(450, 170, 80, 30);
		no_year.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		no_year.setBackground(Color.WHITE);
		no_year.setForeground(Color.BLACK);
		no_year.setOpaque(true);
		no_year.setFocusable(false);
        
		
        time=new JLabel("Time");
        time.setBounds(300,210,150,30);
 		time.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
 		time.setBackground(Color.DARK_GRAY);
 		time.setForeground(Color.white);
 		time.setHorizontalAlignment(JLabel.LEFT);
 		time.setVerticalAlignment(JLabel.TOP);
 		time.setOpaque(true);
 		time.setFocusable(false);
		
		time_duration=new JComboBox(time_limit);
		time_duration.setBounds(450, 210, 200, 30);
		time_duration.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		time_duration.setBackground(Color.WHITE);
		time_duration.setForeground(Color.BLACK);
		time_duration.setOpaque(true);
		time_duration.setFocusable(false);
		
        number=new JLabel("Phone Number");
        number.setBounds(300,250,150,30);
 		number.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
 		number.setBackground(Color.DARK_GRAY);
 		number.setForeground(Color.white);
 		number.setHorizontalAlignment(JLabel.LEFT);
 		number.setVerticalAlignment(JLabel.TOP);
 		number.setOpaque(true);
 		number.setFocusable(false);
        
 		number_textfield=new JTextField();
 		number_textfield.setBounds(450,250,380,25);
		number_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		number_textfield.setBackground(Color.white);
		number_textfield.setForeground(Color.black);
		number_textfield.setOpaque(true);
        number_textfield.setEnabled(true);
        number_textfield.addActionListener(this);
 		


        personal_email=new JLabel("Personal Mail ID");
        personal_email.setBounds(300,290,150,30);
 		personal_email.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
 		personal_email.setBackground(Color.DARK_GRAY);
 		personal_email.setForeground(Color.white);
 		personal_email.setHorizontalAlignment(JLabel.LEFT);
 		personal_email.setVerticalAlignment(JLabel.TOP);
 		personal_email.setOpaque(true);
 		personal_email.setFocusable(false);
        
 		personal_email_textfield=new JTextField();
 		personal_email_textfield.setBounds(450,290,380,25);
		personal_email_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		personal_email_textfield.setBackground(Color.white);
		personal_email_textfield.setForeground(Color.black);
		personal_email_textfield.setOpaque(true);
        personal_email_textfield.setEnabled(true);
        
        vit_email=new JLabel("VIT Mail ID");
        vit_email.setBounds(300,330,150,30);
 		vit_email.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
 		vit_email.setBackground(Color.DARK_GRAY);
 		vit_email.setForeground(Color.white);
 		vit_email.setHorizontalAlignment(JLabel.LEFT);
 		vit_email.setVerticalAlignment(JLabel.TOP);
 		vit_email.setOpaque(true);
 		vit_email.setFocusable(false);
        
 		vit_email_textfield=new JTextField();
 		vit_email_textfield.setBounds(450,330,380,25);
		vit_email_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		vit_email_textfield.setBackground(Color.white);
		vit_email_textfield.setForeground(Color.black);
		vit_email_textfield.setOpaque(true);
        vit_email_textfield.setEnabled(true);
        
        
        members=new JLabel("Total Members:");
        members.setBounds(300,370,150,30);
 		members.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
 		members.setBackground(Color.DARK_GRAY);
 		members.setForeground(Color.white);
 		members.setHorizontalAlignment(JLabel.LEFT);
 		members.setVerticalAlignment(JLabel.TOP);
 		members.setOpaque(true);
 		members.setFocusable(false);
        
 		
 		members_textfield=new JTextField();
 		members_textfield.setBounds(450,370,380,25);
		members_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		members_textfield.setBackground(Color.white);
		members_textfield.setForeground(Color.black);
		members_textfield.setOpaque(true);
        members_textfield.setEnabled(true);
        members_textfield.addActionListener(this);
        
        amount_name=new JLabel("Amount");
        amount_name.setBounds(300,420,150,40);
 		amount_name.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
 		amount_name.setBackground(Color.DARK_GRAY);
 		amount_name.setForeground(Color.ORANGE);
 		amount_name.setHorizontalAlignment(JLabel.LEFT);
 		amount_name.setVerticalAlignment(JLabel.CENTER);
 		amount_name.setOpaque(true);
 		amount_name.setFocusable(false);
        
 		amount=new JLabel("RS.600");
        amount.setBounds(450,420,150,40);
  		amount.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
  		amount.setBackground(Color.DARK_GRAY);
  		amount.setForeground(Color.yellow);
  		amount.setHorizontalAlignment(JLabel.CENTER);
  		amount.setVerticalAlignment(JLabel.CENTER);
  		amount.setOpaque(true);
  		amount.setFocusable(false);
		
		
		
		msg=new JLabel("");
		msg.setBounds(330, 510, 300, 30);
		msg.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		msg.setFocusable(false);
		msg.setForeground(Color.YELLOW);
		msg.setBackground(Color.DARK_GRAY);
		msg.setVisible(false);
		
		register=new JButton();
		register.setBounds(330, 550, 120, 30);
		register.setText("Register");
		register.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		register.setFocusable(false);
		register.setForeground(Color.white);
		register.setBackground(Color.RED);
		register.addActionListener(this);
		
		cancel=new JButton();
		cancel.setBounds(470, 550, 120, 30);
		cancel.setText("Cancel");
		cancel.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		cancel.setFocusable(false);
		cancel.setForeground(Color.white);
		cancel.setBackground(Color.RED);
		cancel.addActionListener(this);
		
		clear=new JButton();
		clear.setBounds(610, 550, 150, 30);
		clear.setText("Clear All");
		clear.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		clear.setFocusable(false);
		clear.setForeground(Color.white);
		clear.setBackground(Color.RED);
		clear.addActionListener(this);
		
		
		back=new JButton();
		back.setBounds(50, 600, 100, 30);
		back.setText("<<Back");
		back.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,19));
		back.setFocusable(false);
		back.setForeground(Color.white);
		back.setBackground(Color.blue);
		back.addActionListener(this);
		
		home=new JButton();
		home.setBounds(170, 600, 100, 30);
		home.setText("HOME");
		home.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,17));
		home.setFocusable(false);
		home.setForeground(Color.white);
		home.setBackground(Color.blue);
		home.addActionListener(this);
		
		
		tem=new JLabel(" ");
		
		this.add(back);
		this.add(home);
		this.add(title);
		this.add(first_name);
		this.add(last_name);
		this.add(first_name_textfield);
		this.add(last_name_textfield);
		this.add(day);
		this.add(month);
		this.add(year);
		this.add(date);
		this.add(days);
		this.add(name);
		this.add(number);
		this.add(time);
		this.add(amount);
		this.add(amount_name);
		this.add(time_duration);
		this.add(number_textfield);
		this.add(clear);
		this.add(cancel);
		this.add(register);
		this.add(no_month);
		this.add(no_year);
		this.add(birth_pic_set);
		this.add(personal_email);
		this.add(personal_email_textfield);
		this.add(vit_email);
		this.add(members);
		this.add(members_textfield);
		this.add(vit_email_textfield);
		this.add(msg);
		this.add(tem);
		this.pack();
		this.setIconImage(logo);
		this.setTitle("BIRTHDAY CELEBRATION REGISTRATION");
		this.setSize(1000,700);
		this.setResizable(false);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.setLayout(null);
		this.getContentPane().setBackground(Color.darkGray);
		this.setLocationRelativeTo(null);
	}

	public void clear()
	{
		first_name_textfield.setText("");
	    last_name_textfield.setText("");
		personal_email_textfield.setText("");
		vit_email_textfield.setText("");
	    number_textfield.setText("");
	    members_textfield.setText("");
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		  if(e.getSource()==back)
		   {
			   Main_foodys main_foodys2=new Main_foodys();
			   this.dispose();
		   }
		   if(e.getSource()==home)
			{
				Home home2=new Home();
				this.dispose();
			}
		   if(e.getSource()==no_month)
		   {
			   if(no_month.getSelectedItem()=="2")
			   {
				   days.removeItem("30");
				   days.removeItem("31");
				   days.removeItem("29");
			   }
			   if(no_month.getSelectedItem()=="4" || no_month.getSelectedItem()=="6" || no_month.getSelectedItem()=="9" || no_month.getSelectedItem()=="11"  )
			   {
				   
				   if(days.getItemAt(28)!="29" && days.getItemAt(29)!="30")
				   {
					   days.addItem("29");
				       days.addItem("30");
				       
				   }
				   days.removeItem("31");
			   }
			   if(no_month.getSelectedItem()=="1" || no_month.getSelectedItem()=="3" || no_month.getSelectedItem()=="5" || no_month.getSelectedItem()=="7" || no_month.getSelectedItem()=="8" || no_month.getSelectedItem()=="10" || no_month.getSelectedItem()=="12" )
			   { 
				   if(days.getItemAt(28)!="29")
				   {
					   days.addItem("29");
				   }
				   if(days.getItemAt(29)!="30")
				   {
					   days.addItem("30");
				   }
				   if(days.getItemAt(30)!="31")
				   {
					   days.addItem("31");
				   }
			   }
		   }
		
	    if(e.getSource()==clear)
	    {
	    	clear();
	    }
	    if(e.getSource()==cancel)
	    {
	    	this.dispose();
	    }
	    if(e.getSource()==register)
	    {
			if(first_name_textfield.getText().equals("") || last_name_textfield.getText().equals("") ||  number_textfield.getText().equals("") || personal_email_textfield.getText().equals("") || vit_email_textfield.getText().equals("") )
	    	{
	    		msg.setText("Please Fill The Form!!!");
	    		msg.setVisible(true);
	    	}
			else
			{
		    	   msg.setVisible(false);	
				   Payment payment1=new Payment("Birthday Celebration Registration","600");	
				   this.dispose();
			}
		   
	    }

	}
	}
