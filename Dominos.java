package vit_foodys_MS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dominos extends JFrame implements ActionListener,MouseListener{
	   JCheckBox chicago_style;
	   JCheckBox neapolitan;
	   JCheckBox sicilian_pizza;
	   JCheckBox margherita_pizza;
	   JCheckBox pepsi;
	   JLabel label5;
	   JButton button1; 
	   JButton pay;
	   JButton back;
	   JButton home;
	   JLabel title;
	   JLabel subtitle1;
	   JLabel subtitle2;
	   JLabel leftlabel;
	   JLabel bill_title;
	   JLabel total;
	   JLabel total_value;
	   JTextField chicago_style_textfield;
	   JTextField neapolitan_textfield;
	   JTextField sicilian_pizza_textfield;
	   JTextField margherita_pizza_textfield;
	   JTextField pepsi_textfield;
	   Choice items;
	   JLabel subtitle3;
	   ImageIcon dominos;
	   ImageIcon margherita_pizza_pic;
	   ImageIcon sicilian_pizza_pic;
	   ImageIcon chicago_style_pic;
	   ImageIcon neapolitan_pizza_pic;
	   ImageIcon pepsi_pic;
	   String total_valuess;
		String name_title="Domino's Pizza";
		Dominos()
		{
			Image logo=Toolkit.getDefaultToolkit().getImage("logo.jpg");
			
			dominos=new ImageIcon("dominos.jpg");
			sicilian_pizza_pic=new ImageIcon("sicilian_pizza.jpg");
			chicago_style_pic=new ImageIcon("chicago_style.jpg");
			neapolitan_pizza_pic=new ImageIcon("neapolitan_pizza.jpg");
			pepsi_pic=new ImageIcon("pepsi.jpg");
			margherita_pizza_pic=new ImageIcon("margherita.jpg");
			 
			title=new JLabel("DOMINO'S");
			title.setBounds(300,0,400,50);
			title.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
			title.setBackground(Color.orange);
			title.setForeground(Color.BLACK);
			title.setHorizontalAlignment(JLabel.CENTER);
			title.setVerticalAlignment(JLabel.CENTER);
			title.setOpaque(true);
			title.setFocusable(false);
			
		   
			subtitle1=new JLabel("Select the items");
			subtitle1.setBounds(400,50,150,50);
			subtitle1.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			subtitle1.setBackground(Color.DARK_GRAY);
			subtitle1.setForeground(Color.green);
			subtitle1.setOpaque(true);
			subtitle1.setFocusable(false);
			
			subtitle2=new JLabel("  Enter NO. of quantity");
			subtitle2.setBounds(750,50,250,50);
			subtitle2.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			subtitle2.setBackground(Color.DARK_GRAY);
			subtitle2.setForeground(Color.green);
			subtitle2.setOpaque(true);
			subtitle2.setFocusable(false);
			
			chicago_style_textfield=new JTextField();
			neapolitan_textfield=new JTextField();
			sicilian_pizza_textfield=new JTextField();
			margherita_pizza_textfield=new JTextField();
			pepsi_textfield=new JTextField();
			
			chicago_style_textfield.setBounds(750,100,200,30);
			chicago_style_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
			chicago_style_textfield.setBackground(Color.white);
			chicago_style_textfield.setForeground(Color.red);
			chicago_style_textfield.setOpaque(true);
			chicago_style_textfield.setEnabled(false);
			
			neapolitan_textfield.setBounds(750,150,200,30);
			neapolitan_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
			neapolitan_textfield.setBackground(Color.white);
			neapolitan_textfield.setForeground(Color.red);
			neapolitan_textfield.setOpaque(true);
			neapolitan_textfield.setEnabled(false);
			
			sicilian_pizza_textfield.setBounds(750,200,200,30);
			sicilian_pizza_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
			sicilian_pizza_textfield.setBackground(Color.white);
			sicilian_pizza_textfield.setForeground(Color.red);
			sicilian_pizza_textfield.setOpaque(true);
			sicilian_pizza_textfield.setEnabled(false);
			
			margherita_pizza_textfield.setBounds(750,250,200,30);
			margherita_pizza_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
			margherita_pizza_textfield.setBackground(Color.white);
			margherita_pizza_textfield.setForeground(Color.red);
			margherita_pizza_textfield.setOpaque(true);
			margherita_pizza_textfield.setEnabled(false);
			
			pepsi_textfield.setBounds(750,300,200,30);
			pepsi_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
			pepsi_textfield.setBackground(Color.white);
			pepsi_textfield.setForeground(Color.red);
			pepsi_textfield.setOpaque(true);
			pepsi_textfield.setEnabled(false);
			
			leftlabel=new JLabel();
			leftlabel.setBounds(20,55,350,350);
			leftlabel.setIcon(dominos);
			
			chicago_style=new JCheckBox("Chicago Style Pizza- Rs.499");
			chicago_style.setBounds(400,100,300,30);
			chicago_style.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			chicago_style.setBackground(Color.yellow);
			chicago_style.setForeground(Color.black);
			chicago_style.setFocusable(false);
			chicago_style.addActionListener(this);
			chicago_style.addMouseListener(this);
			
			neapolitan=new JCheckBox("Neapolitan Pizza- Rs.249");
			neapolitan.setBounds(400,150,300,30);
			neapolitan.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			neapolitan.setBackground(Color.yellow);
			neapolitan.setForeground(Color.black);
			neapolitan.setFocusable(false);
			neapolitan.addActionListener(this);
			neapolitan.addMouseListener(this);
			
			sicilian_pizza=new JCheckBox("Sicilian Pizza - Rs.349");
			sicilian_pizza.setBounds(400,200,300,30);
			sicilian_pizza.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			sicilian_pizza.setBackground(Color.yellow);
			sicilian_pizza.setForeground(Color.black);
			sicilian_pizza.setFocusable(false);
			sicilian_pizza.addActionListener(this);
			sicilian_pizza.addMouseListener(this);
			
			pepsi=new JCheckBox("Pepsi - Rs.99");
			pepsi.setBounds(400,300,300,30);
			pepsi.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			pepsi.setBackground(Color.yellow);
			pepsi.setForeground(Color.black);
			pepsi.setFocusable(false);
			pepsi.addActionListener(this);
			pepsi.addMouseListener(this);
			
			margherita_pizza=new JCheckBox("Margherita pizza - Rs.399");
			margherita_pizza.setBounds(400,250,300,30);
			margherita_pizza.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			margherita_pizza.setBackground(Color.yellow);
			margherita_pizza.setForeground(Color.black);
			margherita_pizza.setFocusable(false);
			margherita_pizza.addActionListener(this);
			margherita_pizza.addMouseListener(this);
			
		    label5=new JLabel("   ");
		    
			button1=new JButton(" SUBMIT");
			button1.setBounds(780, 340, 150, 40);
			button1.setForeground(Color.white);
			button1.setBackground(Color.red);
			button1.setOpaque(true);
			button1.setFocusable(false);
			button1.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
			button1.addActionListener(this);
		    
			back=new JButton();
			back.setBounds(50, 600, 100, 30);
			back.setText("<<back");
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
			
			bill_title=new JLabel();
			bill_title.setBounds(400, 400,500,50);
			bill_title.setBackground(Color.DARK_GRAY);
			bill_title.setForeground(Color.white);
			bill_title.setOpaque(true);
			bill_title.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
			
			subtitle3=new JLabel("YOU SELECTED ITEMS:");
			subtitle3.setBounds(400, 450, 400, 50);
			subtitle3.setBackground(Color.DARK_GRAY);
			subtitle3.setForeground(Color.green);
			subtitle3.setOpaque(true);
			subtitle3.setVisible(false);
			subtitle3.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
			
		    items=new Choice();
			items.setBounds(400, 500, 400, 100);
			items.setVisible(false);
			items.setFocusable(false);
			items.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			
			total=new JLabel("TOTAL AMOUNT");
			total.setBounds(400, 540, 400, 50);
			total.setBackground(Color.DARK_GRAY);
			total.setForeground(Color.green);
			total.setOpaque(true);
			total.setVisible(false);
			total.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
			
			total_value=new JLabel();
			total_value.setBounds(400, 600, 190, 50);
			total_value.setBackground(Color.white);
			total_value.setForeground(Color.BLACK);
			total_value.setOpaque(true);
			total_value.setVisible(false);
			total_value.setVerticalAlignment(JLabel.CENTER);
			total_value.setHorizontalAlignment(JLabel.CENTER);
			total_value.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
			
			pay=new JButton("PAY");
			pay.setBounds(600,600,100, 50);
			pay.setBackground(Color.red);
			pay.setForeground(Color.white);
			pay.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
			pay.setVisible(false);
			pay.setFocusable(false);
			pay.setOpaque(true);
			pay.addActionListener(this);
			
			this.add(items);
			this.add(chicago_style);
			this.add(neapolitan);
			this.add(sicilian_pizza);
			this.add(margherita_pizza);
			this.add(chicago_style_textfield);
			this.add(sicilian_pizza_textfield);
			this.add(neapolitan_textfield);
			this.add(margherita_pizza_textfield);
			this.add(pepsi_textfield);
			this.add(pepsi);
			this.add(button1);
			this.add(subtitle1);
			this.add(subtitle2);
			this.add(title);
			this.add(leftlabel);
			this.add(pay);
			this.add(back);
			this.add(home);
			this.add(total);
			this.add(total_value);
			this.add(subtitle3);
			this.add(bill_title);
			this.add(label5);
			this.pack();
			this.setIconImage(logo);
			this.setTitle("DOMINO'S");
			this.setSize(1000,700);
			this.setResizable(false);
			this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
			this.setVisible(true);	
			this.setLayout(null);
			this.getContentPane().setBackground(Color.DARK_GRAY);
		    this.addMouseListener(this);
		    this.setLocationRelativeTo(null);
		}


		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			String amt1=chicago_style_textfield.getText();
			String amt2=neapolitan_textfield.getText();
			String amt3=sicilian_pizza_textfield.getText();
			String amt4=margherita_pizza_textfield.getText();
			String amt5=pepsi_textfield.getText();
			
			int total_values=0,a=0,b=0,c=0,d=0,f=0;
			
			if(chicago_style.isSelected())
			{
				chicago_style_textfield.setEnabled(true);
				chicago_style_textfield.setText("1");
			}
			else
			{
				chicago_style_textfield.setText(null);
				chicago_style_textfield.setEnabled(false);	
			}
			if(margherita_pizza.isSelected())
			{
				margherita_pizza_textfield.setEnabled(true);	
				margherita_pizza_textfield.setText("1");
			}
			else
			{
				margherita_pizza_textfield.setText(null);
				margherita_pizza_textfield.setEnabled(false);	
			}
			if(neapolitan.isSelected())
			{
				neapolitan_textfield.setEnabled(true);
				neapolitan_textfield.setText("1");
			}
			else
			{
				neapolitan_textfield.setText(null);
				neapolitan_textfield.setEnabled(false);	
			}
			if(sicilian_pizza.isSelected())
			{
				
			   sicilian_pizza_textfield.setEnabled(true);  
			   sicilian_pizza_textfield.setText("1");
			}
			else
			{
				sicilian_pizza_textfield.setText(null);
				sicilian_pizza_textfield.setEnabled(false);	
			}
			if(pepsi.isSelected())
			{
				pepsi_textfield.setEnabled(true);
				pepsi_textfield.setText("1");
			}
			else
			{
				pepsi_textfield.setText(null);
				pepsi_textfield.setEnabled(false);
			}
			   if(e.getSource()==button1)
		         {
				   if(!chicago_style.isSelected() && !sicilian_pizza.isSelected() && !neapolitan.isSelected() && !margherita_pizza.isSelected() && !pepsi.isSelected())
				   {
					   bill_title.setText("  Please select any items!!!!");
					   
				   }
				   else {
				      bill_title.setText("BILL");
				      pay.setVisible(true);
				      if(chicago_style.isSelected()==true)
					   {
						   items.add("Chicago Style Pizza- Rs.499");
						   a=Integer.parseInt(amt1);
						   a=a*499;
					   }		
				
					   if(neapolitan.isSelected()==true)
					   {
						   items.add("Neapolitan Pizza- Rs.249");
						   b=Integer.parseInt(amt2);
						   b=b*249;
						   
					   }
						   
					   if(sicilian_pizza.isSelected()==true)
					   {
						  items.add("Sicilian Pizza - Rs.349");
						   c=Integer.parseInt(amt3);
						   c=c*349;
					   }
					   if(margherita_pizza.isSelected()==true)
					   {
						   items.add("margherita_pizza - Rs.399");
						   d=Integer.parseInt(amt4);
						   d=d*399;
					   }
					   if(pepsi.isSelected()==true)
					   {
						   items.add("Pepsi - Rs.99");
						   f=Integer.parseInt(amt5);
						   f=f*99;
					   }
					   total_values=a+b+c+d+f;
					   String result=String.valueOf(total_values);
					   total_valuess=result;
					   chicago_style_textfield.setText(amt1);
					   neapolitan_textfield.setText(amt2);
					   sicilian_pizza_textfield.setText(amt3);
					   margherita_pizza_textfield.setText(amt4);
					   pepsi_textfield.setText(amt5);
					   total_value.setText(result);
					   total_value.setVisible(true);
		               subtitle3.setVisible(true);
		               items.setVisible(true);
		               total.setVisible(true);
				   }
				   
		         }
			   if(e.getSource()==back)
				{
					Sjt_foodys sjt_foodys2=new Sjt_foodys();
					this.dispose();
				}
			   if(e.getSource()==home)
				{
					Home home4=new Home();
					this.dispose();
				}
			   if(e.getSource()==pay)
			   {
				   Payment payment1=new Payment(name_title,total_valuess);
				   this.dispose();
			   }
		
			}



		@Override
		public void mouseClicked(MouseEvent e) {
		}
		@Override
		public void mousePressed(MouseEvent e) {	
		}
		@Override
		public void mouseReleased(MouseEvent e) {
	    }
		@Override
		public void mouseEntered(MouseEvent e) {
	     if(e.getSource()==chicago_style)
	     {
	    	 leftlabel.setIcon(chicago_style_pic);
	     }
	     if(e.getSource()==pepsi)
	     {
	    	 leftlabel.setIcon(pepsi_pic);
	     }
	     if(e.getSource()==margherita_pizza)
	     {
	    	 leftlabel.setIcon(margherita_pizza_pic);
	     }
	     if(e.getSource()==sicilian_pizza)
	     {
	    	 leftlabel.setIcon(sicilian_pizza_pic);
	     }
	     if(e.getSource()==neapolitan)
	     {
	    	 leftlabel.setIcon(neapolitan_pizza_pic);
	     }
	     if(e.getSource()==this)
	     {
	    	 leftlabel.setIcon(dominos);
	     }
		}
		@Override
		public void mouseExited(MouseEvent e) {	
		}
	}