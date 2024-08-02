package vit_foodys_MS;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class Home extends JFrame implements ActionListener
{
	JLabel title_label; 
	JLabel photo_label;
	JLabel topics_label;
	JButton main_button;
	JButton sjt_button;
	Home()
	{
		Image logo=Toolkit.getDefaultToolkit().getImage("logo.jpg");
		ImageIcon foodys=new ImageIcon("foodys.png");
		
		title_label=new JLabel();
		photo_label=new JLabel();
		topics_label=new JLabel();
		main_button=new JButton();
		sjt_button=new JButton();
		
		main_button.setBounds(750, 300, 200, 70);
		main_button.setText("MAIN FOODYS");
		main_button.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		main_button.setFocusable(false);
		main_button.setForeground(Color.white);
		main_button.setBackground(Color.red);
		main_button.addActionListener(this);
		
		sjt_button.setBounds(750, 370, 200, 70);
		sjt_button.setText("SJT FOODYS");
		sjt_button.setFocusable(false);
		sjt_button.setForeground(Color.white);
		sjt_button.setBackground(Color.red);
		sjt_button.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		sjt_button.addActionListener(this);

		title_label.setBounds(0,0, 700,100);
		title_label.setText("  VIT FOODYS MANAGEMENT SYSTEM ");
		title_label.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,35));
		title_label.setForeground(Color.blue);
		title_label.setBackground(Color.white);//set background color
		title_label.setOpaque(true);
		
		
		photo_label.setBounds(100, 100, 700,600);
		photo_label.setIcon(foodys);
		
		topics_label.setBounds(701,0,300,700);
		topics_label.add(main_button);
		topics_label.add(sjt_button);
		topics_label.setBackground(Color.white);
		topics_label.setOpaque(true);
		
		this.setIconImage(logo);
		this.setTitle("VIT FOODYS MANAGEMENT SYSTEM");
		this.setSize(1000,700);
		this.setResizable(false);
		this.add(title_label);
		this.add(photo_label);
		this.add(topics_label);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.setLocationRelativeTo(null);
		this.setLayout(null);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==main_button)
		{
		    Main_foodys mainfoodys=new Main_foodys();	
		    this.dispose();
		}
		if(e.getSource()==sjt_button)
		{
			Sjt_foodys sjtfoodys=new Sjt_foodys();
			this.dispose();
		}
		
	}
}

public class Main {

	public static void main(String[] args) {
		Home home1=new Home();
	
	}
}