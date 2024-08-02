package vit_foodys_MS;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Main_foodys extends JFrame implements ActionListener{
	JLabel main_main_title_label; 
	JLabel main_photo_label;
	JLabel main_topics_label;
	JLabel tem;
	JButton icecream_button;
	JButton event_button;
	JButton birthday_button;
	JButton samsung_button;
	JButton back;
	
	Main_foodys()
	{
		
		Image logo=Toolkit.getDefaultToolkit().getImage("logo.jpg");
		ImageIcon foodys=new ImageIcon("main_foodys1.jpg");
		tem=new JLabel(" ");
		
		main_main_title_label=new JLabel();
		main_photo_label=new JLabel();
		main_topics_label=new JLabel();
		icecream_button=new JButton();
		event_button=new JButton();
		birthday_button=new JButton();
		back=new JButton();
		samsung_button=new JButton();
		
		back.setBounds(50, 600, 100, 30);
		back.setText("<<back");
		back.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,19));
		back.setFocusable(false);
		back.setForeground(Color.white);
		back.setBackground(Color.blue);
		back.addActionListener(this);
		
		icecream_button.setBounds(500, 100, 450, 100);
		icecream_button.setText("AMUL ICECREAM SHOP");
		icecream_button.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		icecream_button.setFocusable(false);
		icecream_button.setForeground(Color.white);
		icecream_button.setBackground(Color.red);
		icecream_button.addActionListener(this);
		
		event_button.setBounds(500, 200, 450, 100);
		event_button.setText("EVENT REGISTRATION");
		event_button.setFocusable(false);
		event_button.setForeground(Color.white);
		event_button.setBackground(Color.red);
		event_button.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		event_button.addActionListener(this);
		
		birthday_button.setBounds(500, 300, 450, 100);
		birthday_button.setText("BIRTHDAY CELEBRATION REGISTRATION");
		birthday_button.setFocusable(false);
		birthday_button.setForeground(Color.white);
		birthday_button.setBackground(Color.red);
		birthday_button.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		birthday_button.addActionListener(this);

		samsung_button.setBounds(500, 400, 450, 100);
		samsung_button.setText("SAMSUNG MOBILE SHOP");
		samsung_button.setFocusable(false);
		samsung_button.setForeground(Color.white);
		samsung_button.setBackground(Color.red);
		samsung_button.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		samsung_button.addActionListener(this);
		
		main_main_title_label.setBounds(0,0, 600,100);
		main_main_title_label.setText("              MAIN FOODYS");
		main_main_title_label.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,35));
		main_main_title_label.setForeground(Color.blue);
		main_main_title_label.setBackground(Color.white);//set background color
		main_main_title_label.setOpaque(true);
		
		
		main_photo_label.setBounds(0, 100, 500,400);
		main_photo_label.setIcon(foodys);
		
		main_topics_label.setBounds(501,0,500,700);
		main_topics_label.add(icecream_button);
		main_topics_label.add(event_button);
		main_topics_label.add(birthday_button);
		main_topics_label.add(samsung_button);
		main_topics_label.add(back);
		main_topics_label.setBackground(Color.white);
		main_topics_label.setOpaque(true);
		
		this.setIconImage(logo);
		this.setTitle("MAIN FOODYS");
		this.setSize(1000,700);
		this.setResizable(false);
		this.add(main_main_title_label);
		this.add(main_photo_label);
		this.add(main_topics_label);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==icecream_button)
		{
			Icecream_shop icecream=new Icecream_shop();
			this.dispose();
		}
		if(e.getSource()==event_button)
		{
			Event_registration event=new Event_registration();
			this.dispose();
		}
		if(e.getSource()==birthday_button)
		{
			Birthday_celebration birthday=new Birthday_celebration();
			this.dispose();
		}
		if(e.getSource()==samsung_button)
		{
			Samsung_mobile samungmobile=new Samsung_mobile();
			this.dispose();
		}
		if(e.getSource()==back)
		{
			Home home1=new Home();
			this.dispose();
		}
	}
}