package vit_foodys_MS;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Icecream_shop extends JFrame implements ActionListener,MouseListener {
   JCheckBox vennila;
   JCheckBox chocolate;
   JCheckBox butterscotch;
   JCheckBox strawberry;
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
   JTextField vennila_textfield;
   JTextField chocolate_textfield;
   JTextField butterscotch_textfield;
   JTextField strawberry_textfield;
  Choice items;
  JLabel subtitle3;
  ImageIcon icecream_pic;
  ImageIcon vennila_icecream;
  ImageIcon chocolate_icecream;
  ImageIcon butterscotch1;
  ImageIcon strawberry_icecream;
  
  String total_valuess;
	String name_title="Icecream Shop";
	Icecream_shop()
	{
		Image logo=Toolkit.getDefaultToolkit().getImage("logo.jpg");
		
		
		icecream_pic=new ImageIcon("amul_icecream.jpg");
		vennila_icecream=new ImageIcon("vennila.jpg");
		chocolate_icecream=new ImageIcon("chocolate_icecream.jpg");
		butterscotch1=new ImageIcon("butterscotch.jpg");
		strawberry_icecream=new ImageIcon("strawberry_icecream.jpg"); 
		
		title=new JLabel("AMUL ICECREAM SHOP");
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
		
		vennila_textfield=new JTextField();
		chocolate_textfield=new JTextField();
		butterscotch_textfield=new JTextField();
		strawberry_textfield=new JTextField();
		
		vennila_textfield.setBounds(750,100,200,40);
		vennila_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		vennila_textfield.setBackground(Color.white);
		vennila_textfield.setForeground(Color.red);
		vennila_textfield.setOpaque(true);
		vennila_textfield.setEnabled(false);
		
		chocolate_textfield.setBounds(750,150,200,40);
		chocolate_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		chocolate_textfield.setBackground(Color.white);
		chocolate_textfield.setForeground(Color.red);
		chocolate_textfield.setOpaque(true);
		chocolate_textfield.setEnabled(false);
		
		butterscotch_textfield.setBounds(750,200,200,40);
		butterscotch_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		butterscotch_textfield.setBackground(Color.white);
		butterscotch_textfield.setForeground(Color.red);
		butterscotch_textfield.setOpaque(true);
		butterscotch_textfield.setEnabled(false);
		
		strawberry_textfield.setBounds(750,250,200,40);
		strawberry_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
		strawberry_textfield.setBackground(Color.white);
		strawberry_textfield.setForeground(Color.red);
		strawberry_textfield.setOpaque(true);
		strawberry_textfield.setEnabled(false);
		
		
		leftlabel=new JLabel();
		leftlabel.setIcon(icecream_pic);
		leftlabel.setBounds(20,100,350,350);
		
		vennila=new JCheckBox("Vennila IceCream - Rs.50");
		vennila.setBounds(400,100,300,40);
		vennila.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		vennila.setBackground(Color.yellow);
		vennila.setForeground(Color.black);
		vennila.setFocusable(false);
		vennila.addActionListener(this);
		vennila.addMouseListener(this);
		
		chocolate=new JCheckBox("Chocolate IceCream - Rs.25");
		chocolate.setBounds(400,150,300,40);
		chocolate.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		chocolate.setBackground(Color.yellow);
		chocolate.setForeground(Color.black);
		chocolate.setFocusable(false);
		chocolate.addActionListener(this);
		chocolate.addMouseListener(this);
		
		butterscotch=new JCheckBox("ButterScotch - Rs.70");
		butterscotch.setBounds(400,200,300,40);
		butterscotch.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		butterscotch.setBackground(Color.yellow);
		butterscotch.setForeground(Color.black);
		butterscotch.setFocusable(false);
		butterscotch.addActionListener(this);
		butterscotch.addMouseListener(this);
		
		strawberry=new JCheckBox("strawberry IceCream - Rs.75");
		strawberry.setBounds(400,250,300,40);
		strawberry.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		strawberry.setBackground(Color.yellow);
		strawberry.setForeground(Color.black);
		strawberry.setFocusable(false);
		strawberry.addActionListener(this);
		strawberry.addMouseListener(this);
		
	    label5=new JLabel("   ");
	    
		button1=new JButton(" SUBMIT");
		button1.setBounds(780, 300, 150, 40);
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
		bill_title.setBounds(400, 350,500,50);
		bill_title.setBackground(Color.DARK_GRAY);
		bill_title.setForeground(Color.white);
		bill_title.setOpaque(true);
		bill_title.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
		
		subtitle3=new JLabel("YOU SELECTED ITEMS:");
		subtitle3.setBounds(400, 400, 400, 50);
		subtitle3.setBackground(Color.DARK_GRAY);
		subtitle3.setForeground(Color.green);
		subtitle3.setOpaque(true);
		subtitle3.setVisible(false);
		subtitle3.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
		
	    items=new Choice();
		items.setBounds(400, 450, 400, 100);
		items.setVisible(false);
		items.setFocusable(false);
		items.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
		   
		total=new JLabel("TOTAL AMOUNT");
		total.setBounds(400, 500, 400, 50);
		total.setBackground(Color.DARK_GRAY);
		total.setForeground(Color.green);
		total.setOpaque(true);
		total.setVisible(false);
		total.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
		
		total_value=new JLabel();
		total_value.setBounds(400, 540, 150, 50);
		total_value.setBackground(Color.white);
		total_value.setForeground(Color.BLACK);
		total_value.setOpaque(true);
		total_value.setVisible(false);
		total_value.setVerticalAlignment(JLabel.CENTER);
		total_value.setHorizontalAlignment(JLabel.CENTER);
		total_value.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
		
		pay=new JButton("PAY");
		pay.setBounds(600,540,100, 50);
		pay.setBackground(Color.red);
		pay.setForeground(Color.white);
		pay.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,30));
		pay.setVisible(false);
		pay.setFocusable(false);
		pay.setOpaque(true);
		pay.addActionListener(this);
		
		
		this.add(items);
		this.add(vennila);
		this.add(chocolate);
		this.add(butterscotch);
		this.add(strawberry);
		this.add(vennila_textfield);
		this.add(butterscotch_textfield);
		this.add(chocolate_textfield);
		this.add(strawberry_textfield);
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
		this.setTitle("ICECREAM SHOP");
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
		
		String amt1=vennila_textfield.getText();
		String amt2=chocolate_textfield.getText();
		String amt3=butterscotch_textfield.getText();
		String amt4=strawberry_textfield.getText();

		int total_values=0,a=0,b=0,c=0,d=0;
		
		
		if(vennila.isSelected())
		{
			vennila_textfield.setEnabled(true);
			vennila_textfield.setText("1");
		}
		else
		{
			vennila_textfield.setText(null);
			vennila_textfield.setEnabled(false);	
		}
		if(strawberry.isSelected())
		{
			strawberry_textfield.setEnabled(true);	
			strawberry_textfield.setText("1");
		}
		else
		{
			strawberry_textfield.setText(null);
			strawberry_textfield.setEnabled(false);	
		}
		if(chocolate.isSelected())
		{
			chocolate_textfield.setEnabled(true);
			chocolate_textfield.setText("1");
		}
		else
		{
			chocolate_textfield.setText(null);
			chocolate_textfield.setEnabled(false);	
		}
		if(butterscotch.isSelected())
		{
			
		   butterscotch_textfield.setEnabled(true);  
		   butterscotch_textfield.setText("1");
		}
		else
		{
			butterscotch_textfield.setText(null);
			butterscotch_textfield.setEnabled(false);	
		}
		   if(e.getSource()==button1)
	         {
			   if(!vennila.isSelected() && !butterscotch.isSelected() && !chocolate.isSelected() && !strawberry.isSelected())
			   {
				   bill_title.setText("  Please select any items!!!!");
				   
			   }
			   else {
			      bill_title.setText("BILL");
			      pay.setVisible(true);
			     
			      if(vennila.isSelected()==true)
				   {
					   items.add("Vennila IceCream - Rs.50");
					   a=Integer.parseInt(amt1);
					   a=a*50;
					  					   
				   }
				   if(chocolate.isSelected()==true)
				   {
					   items.add("Chocolate IceCream - Rs.25");
					   b=Integer.parseInt(amt2);
					   b=b*25;
					   
				   }
					   
				   if(butterscotch.isSelected()==true)
				   {
					  items.add("ButterScotch - Rs.70");
					   c=Integer.parseInt(amt3);
					   c=c*70;
				   }
				   if(strawberry.isSelected()==true)
				   {
					   items.add("strawberry IceCream - Rs.75");
					   d=Integer.parseInt(amt4);
					   d=d*70;
				   }
				   total_values=a+b+c+d;
				   String result=String.valueOf(total_values);
				   total_valuess=result;
				   vennila_textfield.setText(amt1);
				   chocolate_textfield.setText(amt2);
				   butterscotch_textfield.setText(amt3);
				   strawberry_textfield.setText(amt4);
				   total_value.setText(result);
				   total_value.setVisible(true);
	               subtitle3.setVisible(true);
	               items.setVisible(true);
	               total.setVisible(true);
			   }
			   
	         }
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
		if(e.getSource()==strawberry)
		{
			leftlabel.setIcon(strawberry_icecream);
		}
		if(e.getSource()==butterscotch)
		{
			leftlabel.setIcon(butterscotch1);
		}
		if(e.getSource()==vennila)
		{
			leftlabel.setIcon(vennila_icecream);
		}
		if(e.getSource()==chocolate)
		{
			leftlabel.setIcon(chocolate_icecream);
		}
		if(e.getSource()==this)
		{
			leftlabel.setIcon(icecream_pic);
		}
	}
	@Override
	public void mouseExited(MouseEvent e) {	
		
	}
}