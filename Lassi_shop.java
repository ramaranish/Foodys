package vit_foodys_MS;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lassi_shop extends JFrame implements ActionListener,MouseListener{
   JCheckBox strawberry_juice;
   JCheckBox mojito_juice;
   JCheckBox limeca_juice;
   JCheckBox mango_juice;
   JCheckBox oreo_milk_shake;
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
   JTextField strawberry_juice_textfield;
   JTextField mojito_juice_textfield;
   JTextField limeca_juice_textfield;
   JTextField mango_juice_textfield;
   JTextField oreo_milk_shake_textfield;
   Choice items;
   JLabel subtitle3;
   ImageIcon lassi_shop;
   ImageIcon mango_juice_pic;
   ImageIcon limeca_juice_pic;
   ImageIcon strawberry_juice_pic;
   ImageIcon oreo_milkshake_pic;
   ImageIcon mojito_pic;
   String total_valuess;
	String name_title="Lassi Shop";
	Lassi_shop()
	{
		Image logo=Toolkit.getDefaultToolkit().getImage("logo.jpg");
		
		lassi_shop=new ImageIcon("lassi_shop.jpg");
		limeca_juice_pic=new ImageIcon("limeca_juice.jpg");
		strawberry_juice_pic=new ImageIcon("strawberry_juice.jpg");
		oreo_milkshake_pic=new ImageIcon("oreo_milkshake.jpg");
		mojito_pic=new ImageIcon("mojito.jpg");
		mango_juice_pic=new ImageIcon("mango_juice.jpg");
		 
		title=new JLabel("LASSI SHOP");
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
		
		strawberry_juice_textfield=new JTextField();
		mojito_juice_textfield=new JTextField();
		limeca_juice_textfield=new JTextField();
		mango_juice_textfield=new JTextField();
		oreo_milk_shake_textfield=new JTextField();
		
		strawberry_juice_textfield.setBounds(750,100,200,30);
		strawberry_juice_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		strawberry_juice_textfield.setBackground(Color.white);
		strawberry_juice_textfield.setForeground(Color.red);
		strawberry_juice_textfield.setOpaque(true);
		strawberry_juice_textfield.setEnabled(false);
		
		mojito_juice_textfield.setBounds(750,150,200,30);
		mojito_juice_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		mojito_juice_textfield.setBackground(Color.white);
		mojito_juice_textfield.setForeground(Color.red);
		mojito_juice_textfield.setOpaque(true);
		mojito_juice_textfield.setEnabled(false);
		
		limeca_juice_textfield.setBounds(750,200,200,30);
		limeca_juice_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		limeca_juice_textfield.setBackground(Color.white);
		limeca_juice_textfield.setForeground(Color.red);
		limeca_juice_textfield.setOpaque(true);
		limeca_juice_textfield.setEnabled(false);
		
		mango_juice_textfield.setBounds(750,250,200,30);
		mango_juice_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		mango_juice_textfield.setBackground(Color.white);
		mango_juice_textfield.setForeground(Color.red);
		mango_juice_textfield.setOpaque(true);
		mango_juice_textfield.setEnabled(false);
		
		oreo_milk_shake_textfield.setBounds(750,300,200,30);
		oreo_milk_shake_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		oreo_milk_shake_textfield.setBackground(Color.white);
		oreo_milk_shake_textfield.setForeground(Color.red);
		oreo_milk_shake_textfield.setOpaque(true);
		oreo_milk_shake_textfield.setEnabled(false);
		
		leftlabel=new JLabel();
		leftlabel.setBounds(20,100,350,350);
		leftlabel.setIcon(lassi_shop);
		
		strawberry_juice=new JCheckBox("Strawberry Juice - Rs.30");
		strawberry_juice.setBounds(400,100,300,30);
		strawberry_juice.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		strawberry_juice.setBackground(Color.yellow);
		strawberry_juice.setForeground(Color.black);
		strawberry_juice.setFocusable(false);
		strawberry_juice.addActionListener(this);
		strawberry_juice.addMouseListener(this);
		
		mojito_juice=new JCheckBox("Mojito Juice - Rs.40");
		mojito_juice.setBounds(400,150,300,30);
		mojito_juice.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		mojito_juice.setBackground(Color.yellow);
		mojito_juice.setForeground(Color.black);
		mojito_juice.setFocusable(false);
		mojito_juice.addActionListener(this);
		mojito_juice.addMouseListener(this);
		
		limeca_juice=new JCheckBox("Limeca Juice - Rs.25");
		limeca_juice.setBounds(400,200,300,30);
		limeca_juice.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		limeca_juice.setBackground(Color.yellow);
		limeca_juice.setForeground(Color.black);
		limeca_juice.setFocusable(false);
		limeca_juice.addActionListener(this);
		limeca_juice.addMouseListener(this);
		
		oreo_milk_shake=new JCheckBox("Oreo Milk Shake - Rs.35");
		oreo_milk_shake.setBounds(400,300,300,30);
		oreo_milk_shake.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		oreo_milk_shake.setBackground(Color.yellow);
		oreo_milk_shake.setForeground(Color.black);
		oreo_milk_shake.setFocusable(false);
		oreo_milk_shake.addActionListener(this);
		oreo_milk_shake.addMouseListener(this);
		
		mango_juice=new JCheckBox("Mango juice - Rs.30");
		mango_juice.setBounds(400,250,300,30);
		mango_juice.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		mango_juice.setBackground(Color.yellow);
		mango_juice.setForeground(Color.black);
		mango_juice.setFocusable(false);
		mango_juice.addActionListener(this);
		mango_juice.addMouseListener(this);
		
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
		this.add(strawberry_juice);
		this.add(mojito_juice);
		this.add(limeca_juice);
		this.add(mango_juice);
		this.add(strawberry_juice_textfield);
		this.add(limeca_juice_textfield);
		this.add(mojito_juice_textfield);
		this.add(mango_juice_textfield);
		this.add(oreo_milk_shake_textfield);
		this.add(oreo_milk_shake);
		this.add(button1);
		this.add(subtitle1);
		this.add(subtitle2);
		this.add(title);
		this.add(leftlabel);
		this.add(pay);
		this.add(home);
		this.add(total);
		this.add(back);
		this.add(total_value);
		this.add(subtitle3);
		this.add(bill_title);
		this.add(label5);
		this.pack();
		this.setIconImage(logo);
		this.setTitle("LASSI SHOP");
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
		
		String amt1=strawberry_juice_textfield.getText();
		String amt2=mojito_juice_textfield.getText();
		String amt3=limeca_juice_textfield.getText();
		String amt4=mango_juice_textfield.getText();
		String amt5=oreo_milk_shake_textfield.getText();
		
		int total_values=0,a=0,b=0,c=0,d=0,f=0;
		
		if(strawberry_juice.isSelected())
		{
			strawberry_juice_textfield.setEnabled(true);
			strawberry_juice_textfield.setText("1");
		}
		else
		{
			strawberry_juice_textfield.setText(null);
			strawberry_juice_textfield.setEnabled(false);	
		}
		if(mango_juice.isSelected())
		{
			mango_juice_textfield.setEnabled(true);	
			mango_juice_textfield.setText("1");
		}
		else
		{
			mango_juice_textfield.setText(null);
			mango_juice_textfield.setEnabled(false);	
		}
		if(mojito_juice.isSelected())
		{
			mojito_juice_textfield.setEnabled(true);
			mojito_juice_textfield.setText("1");
		}
		else
		{
			mojito_juice_textfield.setText(null);
			mojito_juice_textfield.setEnabled(false);	
		}
		if(limeca_juice.isSelected())
		{
			
		   limeca_juice_textfield.setEnabled(true);  
		   limeca_juice_textfield.setText("1");
		}
		else
		{
			limeca_juice_textfield.setText(null);
			limeca_juice_textfield.setEnabled(false);	
		}
		if(oreo_milk_shake.isSelected())
		{
			oreo_milk_shake_textfield.setEnabled(true);
			oreo_milk_shake_textfield.setText("1");
		}
		else
		{
			oreo_milk_shake_textfield.setText(null);
			oreo_milk_shake_textfield.setEnabled(false);
		}
		   if(e.getSource()==button1)
	         {
			   if(!strawberry_juice.isSelected() && !limeca_juice.isSelected() && !mojito_juice.isSelected() && !mango_juice.isSelected() && !oreo_milk_shake.isSelected())
			   {
				   bill_title.setText("  Please select any items!!!!");
				   
			   }
			   else {
			      bill_title.setText("BILL");
			      pay.setVisible(true);
			      if(strawberry_juice.isSelected()==true)
				   {
					   items.add("strawberry_juice - Rs.30");
					   a=Integer.parseInt(amt1);
					   a=a*30;
				   }
				   if(mojito_juice.isSelected()==true)
				   {
					   items.add("mojito_juice - Rs.40");
					   b=Integer.parseInt(amt2);
					   b=b*40;
					   
				   }
					   
				   if(limeca_juice.isSelected()==true)
				   {
					  items.add("limeca_juice - Rs.25");
					   c=Integer.parseInt(amt3);
					   c=c*25;
				   }
				   if(mango_juice.isSelected()==true)
				   {
					   items.add("mango_juice - Rs.30");
					   d=Integer.parseInt(amt4);
					   d=d*30;
				   }
				   if(oreo_milk_shake.isSelected()==true)
				   {
					   items.add("oreo_milk_shake - Rs.35");
					   f=Integer.parseInt(amt5);
					   f=f*35;
				   }
				   total_values=a+b+c+d+f;
				   String result=String.valueOf(total_values);
				   total_valuess=result;
				   strawberry_juice_textfield.setText(amt1);
				   mojito_juice_textfield.setText(amt2);
				   limeca_juice_textfield.setText(amt3);
				   mango_juice_textfield.setText(amt4);
				   oreo_milk_shake_textfield.setText(amt5);
				   total_value.setText(result);
				   total_value.setVisible(true);
	               subtitle3.setVisible(true);
	               items.setVisible(true);
	               total.setVisible(true);
			   }
			   
	         }
		   if(e.getSource()==back)
			{
				Sjt_foodys sjt_foodys1=new Sjt_foodys();
				this.dispose();
			}
		   if(e.getSource()==home)
			{
				Home home3=new Home();
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
     if(e.getSource()==strawberry_juice)
     {
    	 leftlabel.setIcon(strawberry_juice_pic);
     }
     if(e.getSource()==oreo_milk_shake)
     {
    	 leftlabel.setIcon(oreo_milkshake_pic);
     }
     if(e.getSource()==mango_juice)
     {
    	 leftlabel.setIcon(mango_juice_pic);
     }
     if(e.getSource()==limeca_juice)
     {
    	 leftlabel.setIcon(limeca_juice_pic);
     }
     if(e.getSource()==mojito_juice)
     {
    	 leftlabel.setIcon(mojito_pic);
     }
     if(e.getSource()==this)
     {
    	 leftlabel.setIcon(lassi_shop);
     }
	}
	@Override
	public void mouseExited(MouseEvent e) {	
	}
}