package vit_foodys_MS;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Sjt_foodys extends JFrame implements ActionListener{

	JLabel sjt_sjt_title_label; 
	JLabel sjt_photo_label;
	JLabel sjt_topics_label;
	JButton lassi_button;
	JButton canteen_button;
	JButton dominos_button;
	JButton back;
	Sjt_foodys()
	{
		Image logo=Toolkit.getDefaultToolkit().getImage("logo.jpg");
		ImageIcon foodys=new ImageIcon("sjt_foodys.jpg");
		
		sjt_sjt_title_label=new JLabel();
		sjt_photo_label=new JLabel();
		sjt_topics_label=new JLabel();
		lassi_button=new JButton();
		canteen_button=new JButton();
		dominos_button=new JButton();		
		back=new JButton();
		
		lassi_button.setBounds(600, 200, 350, 100);
		lassi_button.setText("  LASSI SHOP");
		lassi_button.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		lassi_button.setFocusable(false);
		lassi_button.setForeground(Color.white);
		lassi_button.setBackground(Color.red);
		lassi_button.addActionListener(this);
		
		canteen_button.setBounds(600, 300, 350, 100);
		canteen_button.setText("    CANTEEN  ");
		canteen_button.setFocusable(false);
		canteen_button.setForeground(Color.white);
		canteen_button.setBackground(Color.red);
		canteen_button.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		canteen_button.addActionListener(this);
		
		dominos_button.setBounds(600, 400, 350, 100);
		dominos_button.setText("     DOMINO'S ");
		dominos_button.setFocusable(false);
		dominos_button.setForeground(Color.white);
		dominos_button.setBackground(Color.red);
		dominos_button.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		dominos_button.addActionListener(this);

		sjt_sjt_title_label.setBounds(0,0, 500,100);
		sjt_sjt_title_label.setText("              SJT FOODYS");
		sjt_sjt_title_label.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,35));
		sjt_sjt_title_label.setForeground(Color.blue);
		sjt_sjt_title_label.setBackground(Color.white);//set background color
		sjt_sjt_title_label.setOpaque(true);
		
		back.setBounds(50, 600, 100, 30);
		back.setText("<<back");
		back.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,19));
		back.setFocusable(false);
		back.setForeground(Color.white);
		back.setBackground(Color.blue);
		back.addActionListener(this);
		
		sjt_photo_label.setBounds(0, 100, 600,500);
		sjt_photo_label.setIcon(foodys);
		
		sjt_topics_label.setBounds(501,0,500,700);
		sjt_topics_label.add(lassi_button);
		sjt_topics_label.add(canteen_button);
		sjt_topics_label.add(dominos_button);
		sjt_topics_label.add(back);
		sjt_topics_label.setBackground(Color.white);
		sjt_topics_label.setOpaque(true);
		
		this.setIconImage(logo);
		this.setTitle("SJT FOODYS");
		this.setSize(1000,700);
		this.setResizable(false);
		this.add(sjt_sjt_title_label);
		this.add(sjt_photo_label);
		this.add(sjt_topics_label);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.setLayout(null);
		this.setLocationRelativeTo(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==lassi_button)
		{
			Lassi_shop lassi=new Lassi_shop();
			this.dispose();
		}
		if(e.getSource()==canteen_button)
		{
			Canteen canteen1=new Canteen();
			this.dispose();
		}
		if(e.getSource()==dominos_button)
		{
			Dominos domino=new Dominos();
			this.dispose();
		}	
		if(e.getSource()==back)
		{
			Home home1=new Home();
			this.dispose();
		}
	}
}