package vit_foodys_MS;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Samsung_mobile extends JFrame implements ActionListener{
	
	
	JButton samsung_mobile1;
	JButton samsung_mobile2;
	JButton samsung_mobile3;
	JButton samsung_mobile4;
	JButton samsung_mobile5;
	JButton samsung_mobile6;
	JButton samsung_mobile7;
	JButton samsung_mobile8;
	JButton samsung_mobile9;
	JButton samsung_mobile10;
	JButton samsung_mobile11;
	JButton samsung_mobile12;
	JButton back;
	JButton home;
    JLabel tem;
    ImageIcon samsung1;
    ImageIcon samsung2;
    ImageIcon samsung3;
    ImageIcon samsung4;
    ImageIcon samsung5;
    ImageIcon samsung6;
    ImageIcon samsung7;
    ImageIcon samsung8;
    ImageIcon samsung9;
    ImageIcon samsung10;
    ImageIcon samsung11;
    ImageIcon samsung12;
	
	Samsung_mobile()
	{
		Image logo=Toolkit.getDefaultToolkit().getImage("logo.jpg");
		tem=new JLabel();
		samsung_mobile1=new JButton();
		samsung_mobile2=new JButton();
		samsung_mobile3=new JButton();
		samsung_mobile4=new JButton();
		samsung_mobile5=new JButton();
		samsung_mobile6=new JButton();
		samsung_mobile7=new JButton();
		samsung_mobile8=new JButton();
		samsung_mobile9=new JButton();
		samsung_mobile10=new JButton();
		samsung_mobile11=new JButton();
		samsung_mobile12=new JButton();
		
		back=new JButton("Back");
		back.setBackground(Color.BLUE);
		back.setForeground(Color.white);
		back.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,13));
		back.setOpaque(true);
		back.setBounds(5, 630, 70, 30);
		back.addActionListener(this);
		back.setFocusable(false);

		home=new JButton("Home");
		home.setBackground(Color.BLUE);
		home.setFocusable(false);
		home.setForeground(Color.white);
		home.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,13));
		home.setOpaque(true);
		home.setBounds(5, 595, 70, 30);
		home.addActionListener(this);
		
		samsung1=new ImageIcon("samsung1.jpg");
		samsung2=new ImageIcon("samsung2.jpg");
		samsung3=new ImageIcon("samsung3.jpg");
		samsung4=new ImageIcon("samsung4.jpg");
		samsung5=new ImageIcon("samsung5.jpg");
		samsung6=new ImageIcon("samsung6.jpg");
		samsung7=new ImageIcon("samsung7.jpg");
		samsung8=new ImageIcon("samsung8.jpg");
		samsung9=new ImageIcon("samsung9.jpg");
		samsung10=new ImageIcon("samsung10.jpg");
		samsung11=new ImageIcon("samsung11.jpg");
		samsung12=new ImageIcon("samsung12.jpg");
		
		samsung_mobile1.setBounds(80,0,200,220);
		samsung_mobile1.setIcon(samsung1);
		samsung_mobile1.setBackground(Color.white);
		samsung_mobile1.setOpaque(true);
		samsung_mobile1.setFocusable(false);
		samsung_mobile1.addActionListener(this);
		
		samsung_mobile2.setBounds(310,0,200,220);
		samsung_mobile2.setIcon(samsung2);
		samsung_mobile2.setBackground(Color.white);
		samsung_mobile2.setOpaque(true);
		samsung_mobile2.setFocusable(false);
		samsung_mobile2.addActionListener(this);
		
		samsung_mobile3.setBounds(540,0,200,220);
		samsung_mobile3.setIcon(samsung3);
		samsung_mobile3.setBackground(Color.white);
		samsung_mobile3.setOpaque(true);
		samsung_mobile3.setFocusable(false);
		samsung_mobile3.addActionListener(this);
		
		samsung_mobile4.setBounds(770,0,200,220);
		samsung_mobile4.setIcon(samsung4);
		samsung_mobile4.setBackground(Color.white);
		samsung_mobile4.setOpaque(true);
		samsung_mobile4.setFocusable(false);
		samsung_mobile4.addActionListener(this);
		
		samsung_mobile5.setBounds(80,225,200,220);
		samsung_mobile5.setIcon(samsung5);
		samsung_mobile5.setBackground(Color.white);
		samsung_mobile5.setOpaque(true);
		samsung_mobile5.setFocusable(false);
		samsung_mobile5.addActionListener(this);
		
		samsung_mobile6.setBounds(310,225,200,220);
		samsung_mobile6.setIcon(samsung6);
		samsung_mobile6.setBackground(Color.white);
		samsung_mobile6.setOpaque(true);
		samsung_mobile6.setFocusable(false);
		samsung_mobile6.addActionListener(this);
		
		samsung_mobile7.setBounds(540,225,200,220);
		samsung_mobile7.setIcon(samsung7);
		samsung_mobile7.setBackground(Color.white);
		samsung_mobile7.setOpaque(true);
		samsung_mobile7.setFocusable(false);
		samsung_mobile7.addActionListener(this);
		
		samsung_mobile8.setBounds(770,225,200,220);
		samsung_mobile8.setIcon(samsung8);
		samsung_mobile8.setBackground(Color.white);
		samsung_mobile8.setOpaque(true);
		samsung_mobile8.setFocusable(false);
		samsung_mobile8.addActionListener(this);
		
		samsung_mobile9.setBounds(80,450,200,220);
		samsung_mobile9.setIcon(samsung9);
		samsung_mobile9.setBackground(Color.white);
		samsung_mobile9.setOpaque(true);
		samsung_mobile9.setFocusable(false);
		samsung_mobile9.addActionListener(this);
		
		samsung_mobile10.setBounds(310,450,200,220);
		samsung_mobile10.setIcon(samsung10);
		samsung_mobile10.setBackground(Color.white);
		samsung_mobile10.setOpaque(true);
		samsung_mobile10.setFocusable(false);
		samsung_mobile10.addActionListener(this);
		
		samsung_mobile11.setBounds(540,450,200,220);
		samsung_mobile11.setIcon(samsung11);
		samsung_mobile11.setBackground(Color.white);
		samsung_mobile11.setOpaque(true);
		samsung_mobile11.setFocusable(false);
		samsung_mobile11.addActionListener(this);
		
		samsung_mobile12.setBounds(770,450,200,220);
		samsung_mobile12.setIcon(samsung12);
		samsung_mobile12.setBackground(Color.white);
		samsung_mobile12.setOpaque(true);
		samsung_mobile12.setFocusable(false);
		samsung_mobile12.addActionListener(this);
		
		
		this.add(back);
		this.add(home);
		this.add(samsung_mobile1);
		this.add(samsung_mobile2);
		this.add(samsung_mobile3);
		this.add(samsung_mobile4);
		this.add(samsung_mobile5);
		this.add(samsung_mobile6);
		this.add(samsung_mobile7);
		this.add(samsung_mobile8);
		this.add(samsung_mobile9);
		this.add(samsung_mobile10);
		this.add(samsung_mobile11);
		this.add(samsung_mobile12);
		this.add(tem);
		this.setIconImage(logo);
		this.setTitle("SAMSUNG MOBILE SHOP");
		this.setSize(1000,720);
		this.setResizable(false);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
		this.setVisible(true);	
		this.setLayout(null);
		this.getContentPane().setBackground(Color.white);
	    this.setLocationRelativeTo(null);	
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==back)
		{
			Main_foodys mainfoodys=new Main_foodys();
			this.dispose();
		}
		if(e.getSource()==home)
		{
			Home home1=new Home();
			this.dispose();
		}
		if(e.getSource()==samsung_mobile1)
		{
			Payment a1=new Payment("Mobile Phone","18499");
			this.dispose();
		}
		if(e.getSource()==samsung_mobile2)
		{
			Payment a1=new Payment("Mobile Phone","13050");
			this.dispose();
		}
		if(e.getSource()==samsung_mobile3)
		{
			Payment a1=new Payment("Mobile Phone","25499");
			this.dispose();
		}
		if(e.getSource()==samsung_mobile4)
		{
			Payment a1=new Payment("Mobile Phone","41999");
			this.dispose();
		}
		if(e.getSource()==samsung_mobile5)
		{
			Payment a1=new Payment("Mobile Phone","21290");
			this.dispose();
		}
		if(e.getSource()==samsung_mobile6)
		{
			Payment a1=new Payment("Mobile Phone","16049");
			this.dispose();
		}
		if(e.getSource()==samsung_mobile7)
		{
			Payment a1=new Payment("Mobile Phone","16999");
		}
		if(e.getSource()==samsung_mobile8)
		{
			Payment a1=new Payment("Mobile Phone","59999");
			this.dispose();
		}
		if(e.getSource()==samsung_mobile9)
		{
			Payment a1=new Payment("Mobile Phone","124500");
			this.dispose();
		}
		if(e.getSource()==samsung_mobile10)
		{
			Payment a1=new Payment("Mobile Phone","44990");
			this.dispose();
		}
		if(e.getSource()==samsung_mobile11)
		{
			Payment a1=new Payment("Mobile Phone","59999");
			this.dispose();
		}
		if(e.getSource()==samsung_mobile12)
		{
			Payment a1=new Payment("Mobile Phone","53000");
			this.dispose();
		}
		
	}

}

