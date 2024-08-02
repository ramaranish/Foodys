package vit_foodys_MS;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.*;

public class Event_registration extends JFrame implements ActionListener,ItemListener{
	
	
	JLabel title;
	JLabel tem;
	JLabel first_name;
	JLabel last_name;
	JLabel name;
	JLabel time;
    JLabel event_no;
	JLabel event_type;
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
    
	JTextField first_name_textfield;
	JTextField last_name_textfield;
	JTextField event_no_textfield;
	JTextField number_textfield;
	JTextField personal_email_textfield;
	JTextField vit_email_textfield;
	
	
	Choice event_types;
	
	JComboBox days;
	JComboBox no_month;
	JComboBox no_year;
	JComboBox time_duration;
	
	JButton back;
	JButton clear;
	JButton register;
	JButton cancel;
	JButton home;
	
	JLabel event_pic_set;
	
	ImageIcon event_pic;
	
	Event_registration()
	{
		Image logo=Toolkit.getDefaultToolkit().getImage("logo.jpg");
	    event_pic=new ImageIcon("event.jpg");
		
	    
	    
		String[] days_1= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        String[] month_1= {"1","2","3","4","5","6","7","8","9","10","11","12"};
        String[] year_1= {"2022","2023","2024","2025","2026","2027","2028","2029","2030"};
        String[] time_limit={"8.00 AM-10.00 AM","10.00 AM-12.00 PM","12.00 PM-2.00 PM","3.00 PM-5.00 PM","5.00 PM-7.00 PM"};
		
        
        event_pic_set=new JLabel();
        event_pic_set.setBounds(50,200,200,150);
        event_pic_set.setBackground(Color.DARK_GRAY);
        event_pic_set.setOpaque(true);
        event_pic_set.setIcon(event_pic);
        
		title=new JLabel("EVENT REGISTRATION");
		title.setBounds(300,0,400,50);
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
		
        event_no=new JLabel("Event Number");
		event_no.setBounds(300,150,150,30);
		event_no.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		event_no.setBackground(Color.DARK_GRAY);
		event_no.setForeground(Color.white);
		event_no.setHorizontalAlignment(JLabel.LEFT);
		event_no.setVerticalAlignment(JLabel.TOP);
		event_no.setOpaque(true);
		event_no.setFocusable(false);
        
		event_no_textfield=new JTextField();
		event_no_textfield.setBounds(450,150,380,25);
		event_no_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		event_no_textfield.setBackground(Color.white);
		event_no_textfield.setForeground(Color.black);
		event_no_textfield.setOpaque(true);
        event_no_textfield.setEnabled(true);
        
        number=new JLabel("Phone Number");
        number.setBounds(300,350,150,30);
 		number.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
 		number.setBackground(Color.DARK_GRAY);
 		number.setForeground(Color.white);
 		number.setHorizontalAlignment(JLabel.LEFT);
 		number.setVerticalAlignment(JLabel.TOP);
 		number.setOpaque(true);
 		number.setFocusable(false);
        
 		number_textfield=new JTextField();
 		number_textfield.setBounds(450,350,380,25);
		number_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		number_textfield.setBackground(Color.white);
		number_textfield.setForeground(Color.black);
		number_textfield.setOpaque(true);
        number_textfield.setEnabled(true);
 	
 		
        time=new JLabel("Time");
        time.setBounds(300,310,150,30);
 		time.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
 		time.setBackground(Color.DARK_GRAY);
 		time.setForeground(Color.white);
 		time.setHorizontalAlignment(JLabel.LEFT);
 		time.setVerticalAlignment(JLabel.TOP);
 		time.setOpaque(true);
 		time.setFocusable(false);


        personal_email=new JLabel("Personal Mail ID");
        personal_email.setBounds(300,390,150,30);
 		personal_email.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
 		personal_email.setBackground(Color.DARK_GRAY);
 		personal_email.setForeground(Color.white);
 		personal_email.setHorizontalAlignment(JLabel.LEFT);
 		personal_email.setVerticalAlignment(JLabel.TOP);
 		personal_email.setOpaque(true);
 		personal_email.setFocusable(false);
        
 		personal_email_textfield=new JTextField();
 		personal_email_textfield.setBounds(450,390,380,25);
		personal_email_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		personal_email_textfield.setBackground(Color.white);
		personal_email_textfield.setForeground(Color.black);
		personal_email_textfield.setOpaque(true);
        personal_email_textfield.setEnabled(true);
        
        vit_email=new JLabel("VIT Mail ID");
        vit_email.setBounds(300,430,150,30);
 		vit_email.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
 		vit_email.setBackground(Color.DARK_GRAY);
 		vit_email.setForeground(Color.white);
 		vit_email.setHorizontalAlignment(JLabel.LEFT);
 		vit_email.setVerticalAlignment(JLabel.TOP);
 		vit_email.setOpaque(true);
 		vit_email.setFocusable(false);
        
 		vit_email_textfield=new JTextField();
 		vit_email_textfield.setBounds(450,430,380,25);
		vit_email_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		vit_email_textfield.setBackground(Color.white);
		vit_email_textfield.setForeground(Color.black);
		vit_email_textfield.setOpaque(true);
        vit_email_textfield.setEnabled(true);
        
        amount_name=new JLabel("Total Amount");
        amount_name.setBounds(300,470,150,30);
 		amount_name.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
 		amount_name.setBackground(Color.DARK_GRAY);
 		amount_name.setForeground(Color.white);
 		amount_name.setHorizontalAlignment(JLabel.LEFT);
 		amount_name.setVerticalAlignment(JLabel.CENTER);
 		amount_name.setOpaque(true);
 		amount_name.setFocusable(false);
        
 		amount=new JLabel("RS.5000");
        amount.setBounds(450,470,150,30);
  		amount.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
  		amount.setBackground(Color.white);
  		amount.setForeground(Color.BLACK);
  		amount.setHorizontalAlignment(JLabel.CENTER);
  		amount.setVerticalAlignment(JLabel.CENTER);
  		amount.setOpaque(true);
  		amount.setFocusable(false);
 		
        event_type=new JLabel("Event Type");
		event_type.setBounds(300,190,150,30);
		event_type.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		event_type.setBackground(Color.DARK_GRAY);
		event_type.setForeground(Color.white);
		event_type.setHorizontalAlignment(JLabel.LEFT);
		event_type.setVerticalAlignment(JLabel.TOP);
		event_type.setOpaque(true);
		event_type.setFocusable(false);
		

		event_types=new Choice();
		event_types.add("Dance and Music Competitions-Rs.5000");
		event_types.add("Singing Competitions-Rs.3000");
		event_types.add("Movie Marathon-Rs.2500");
		event_types.add("Social Responsibility-Rs.2000");
		event_types.add("Innovation and Discovery-Rs.2700");
		event_types.add("Food Fest-Rs.3300");
		event_types.setBounds(450,190,380, 40);
		event_types.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		event_types.setBackground(Color.WHITE);
		event_types.setForeground(Color.BLACK);
		event_types.setFocusable(false);
		event_types.addItemListener(this);
		
		date=new JLabel("Date");
		date.setBounds(300,240,150,30);
		date.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		date.setBackground(Color.DARK_GRAY);
		date.setForeground(Color.white);
		date.setHorizontalAlignment(JLabel.LEFT);
		date.setVerticalAlignment(JLabel.TOP);
		date.setOpaque(true);
		date.setFocusable(false);
		
		
		day=new JLabel("Day");
		day.setBounds(650,240,100,20);
		day.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		day.setBackground(Color.DARK_GRAY);
		day.setForeground(Color.white);
		day.setHorizontalAlignment(JLabel.LEFT);
		day.setVerticalAlignment(JLabel.TOP);
		day.setOpaque(true);
		day.setFocusable(false);
        
		time_duration=new JComboBox(time_limit);
		time_duration.setBounds(450, 315, 200, 30);
		time_duration.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		time_duration.setBackground(Color.WHITE);
		time_duration.setForeground(Color.BLACK);
		time_duration.setOpaque(true);
		time_duration.setFocusable(false);
		
		days=new JComboBox(days_1);
		days.setBounds(650, 265, 80, 30);
		days.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		days.setBackground(Color.WHITE);
		days.setForeground(Color.BLACK);
		days.setOpaque(true);
		days.setFocusable(false);
		
		month=new JLabel("Month");
		month.setBounds(550,240,100,20);
		month.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,19));
		month.setBackground(Color.DARK_GRAY);
		month.setForeground(Color.white);
		month.setHorizontalAlignment(JLabel.LEFT);
		month.setVerticalAlignment(JLabel.TOP);
		month.setOpaque(true);
		month.setFocusable(false);
		
		no_month=new JComboBox(month_1);
		no_month.setBounds(550, 265, 80, 30);
		no_month.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		no_month.setBackground(Color.WHITE);
		no_month.setForeground(Color.BLACK);
		no_month.setOpaque(true);
		no_month.setFocusable(false);
		no_month.addActionListener(this);
		
		year=new JLabel("Year");
		year.setBounds(450,240,100,20);
		year.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		year.setBackground(Color.DARK_GRAY);
		year.setForeground(Color.white);
		year.setHorizontalAlignment(JLabel.LEFT);
		year.setVerticalAlignment(JLabel.TOP);
		year.setOpaque(true);
		year.setFocusable(false);
		

		no_year=new JComboBox(year_1);
		no_year.setBounds(450, 265, 80, 30);
		no_year.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		no_year.setBackground(Color.WHITE);
		no_year.setForeground(Color.BLACK);
		no_year.setOpaque(true);
		no_year.setFocusable(false);
		
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
		this.add(event_no);
		this.add(event_type);
		this.add(event_types);
		this.add(first_name_textfield);
		this.add(last_name_textfield);
		this.add(event_no_textfield);
		this.add(event_pic_set);
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
		this.add(personal_email);
		this.add(personal_email_textfield);
		this.add(vit_email);
		this.add(vit_email_textfield);
		this.add(msg);
		this.add(tem);
		this.pack();
		this.setIconImage(logo);
		this.setTitle("EVENT REGISTRATION");
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
		event_no_textfield.setText("");
		personal_email_textfield.setText("");
		vit_email_textfield.setText("");
	    number_textfield.setText("");
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
	    	if(first_name_textfield.getText().equals("") || last_name_textfield.getText().equals("") || event_no_textfield.getText().equals("") || number_textfield.getText().equals("") || personal_email_textfield.getText().equals("") || vit_email_textfield.getText().equals("") || number_textfield.getText().equals(""))
	    	{
	    		msg.setText("Please Fill The Form!!!");
	    		msg.setVisible(true);
	    	}
	    	else
	    	{
	    	   msg.setVisible(false);	
			   if(event_types.getSelectedItem().equals("Dance and Music Competitions-Rs.5000"))
		    	{
		    		Payment payment1=new Payment("Event Registration","5000");
		    	}
		    	if(event_types.getSelectedItem().equals("Singing Competitions-Rs.3000"))
		    	{
		    		Payment payment2=new Payment("Event Registration","3000");
		    	}
		    	if(event_types.getSelectedItem().equals("Movie Marathon-Rs.2500"))
		    	{
		    		Payment payment3=new Payment("Event Registration","2500");
		    	}
		    	if(event_types.getSelectedItem().equals("Social Responsibility-Rs.2000"))
		    	{
		    		Payment payment4=new Payment("Event Registration","2000");
		    	}
		    	if(event_types.getSelectedItem().equals("Innovation and Discovery-Rs.2700"))
		    	{
		    		Payment payment5=new Payment("Event Registration","2700");
		    	}
		    	if(event_types.getSelectedItem().equals("Food Fest-Rs.3300"))
		    	{
		    		Payment payment6=new Payment("Event Registration","3300");
		    	}
		    	 this.dispose();
		   }
	    }
	    
	    }
	    	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getSource()==event_types)
	    {
	    	if(event_types.getSelectedItem().equals("Dance and Music Competitions-Rs.5000"))
	    	{
	    		amount.setText("Rs.5000");
	    	}
	    	if(event_types.getSelectedItem().equals("Singing Competitions-Rs.3000"))
	    	{
	    		amount.setText("Rs.3000");
	    	}
	    	if(event_types.getSelectedItem().equals("Movie Marathon-Rs.2500"))
	    	{
	    		amount.setText("Rs.2500");
	    	}
	    	if(event_types.getSelectedItem().equals("Social Responsibility-Rs.2000"))
	    	{
	    		amount.setText("Rs.2000");
	    	}
	    	if(event_types.getSelectedItem().equals("Innovation and Discovery-Rs.2700"))
	    	{
	    		amount.setText("Rs.2700");
	    	}
	    	if(event_types.getSelectedItem().equals("Food Fest-Rs.3300"))
	    	{
	    		amount.setText("Rs.3300");
	    	}
	}


	}
	}
