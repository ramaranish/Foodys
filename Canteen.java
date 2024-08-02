package vit_foodys_MS;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Canteen extends JFrame implements ActionListener,MouseListener{
	   JCheckBox idly;
	   JCheckBox dosa;
	   JCheckBox pulao;
	   JCheckBox fried_rice;
	   JCheckBox mushroom_65;
	   JCheckBox chicken_biryani;
	   JCheckBox chicken_fried_rice;
	   JCheckBox veg_biryani; 
	   JCheckBox curd_rice;
	   JCheckBox meals;
	   JLabel label5;
	   JButton button1; 
	   JButton back;
	   JButton pay;
	   JButton home;
	   JLabel title;
	   JLabel subtitle1;
	   JLabel subtitle2;
	   JLabel leftlabel;
	   JLabel bill_title;
	   JLabel total;
	   JLabel total_value;
	   JTextField chicken_biryani_textfield;
	   JTextField chicken_fried_rice_textfield;
	   JTextField veg_biryani_textfield;
	   JTextField curd_rice_textfield;
	   JTextField meals_textfield;
	   JTextField idly_textfield;
	   JTextField dosa_textfield;
	   JTextField pulao_textfield;
	   JTextField fried_rice_textfield;
	   JTextField mushroom_65_textfield;
	   Choice items;
	   JLabel subtitle3;
	   ImageIcon canteen;
	   ImageIcon fried_rice_pic;
	   ImageIcon pulao_pic;
	   ImageIcon idly_pic;
	   ImageIcon dosa_pizza_pic;
	   ImageIcon mushroom_65_pic;
	   ImageIcon chicken_biryani_pic;
	   ImageIcon chicken_fried_rice_pic;
	   ImageIcon veg_biryani_pic;
	   ImageIcon curd_rice_pic;
	   ImageIcon meals_pic;
	   String total_valuess;
		String name_title="Canteen";
		Canteen()
		{
			Image logo=Toolkit.getDefaultToolkit().getImage("logo.jpg");
			
			canteen=new ImageIcon("canteen.jpg");
			pulao_pic=new ImageIcon("pulao.jpg");
			idly_pic=new ImageIcon("itly_pic.jpg");
			dosa_pizza_pic=new ImageIcon("dosa.jpg");
			mushroom_65_pic=new ImageIcon("mushroom_pic.jpg");
			fried_rice_pic=new ImageIcon("fried_rice.jpg");
		    chicken_biryani_pic=new ImageIcon("chicken_biryani_pic.jpg");
			chicken_fried_rice_pic=new ImageIcon("chicken_fried_rice_pic.jpg");
			veg_biryani_pic=new ImageIcon("veg_rice_pic.jpg");
			curd_rice_pic=new ImageIcon("curd_rice_pic.jpg");
			meals_pic=new ImageIcon("meals_pic.jpg");
			
			title=new JLabel("CANTEEN");
			title.setBounds(380,0,300,40);
			title.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			title.setBackground(Color.orange);
			title.setForeground(Color.BLACK);
			title.setHorizontalAlignment(JLabel.CENTER);
			title.setVerticalAlignment(JLabel.CENTER);
			title.setOpaque(true);
			title.setFocusable(false);
			
		   
			subtitle1=new JLabel("Select the items");
			subtitle1.setBounds(400,40,150,20);
			subtitle1.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
			subtitle1.setBackground(Color.DARK_GRAY);
			subtitle1.setForeground(Color.green);
			subtitle1.setOpaque(true);
			subtitle1.setFocusable(false);
			
			subtitle2=new JLabel("  Enter NO. of quantity");
			subtitle2.setBounds(750,40,250,20);
			subtitle2.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
			subtitle2.setBackground(Color.DARK_GRAY);
			subtitle2.setForeground(Color.green);
			subtitle2.setOpaque(true);
			subtitle2.setFocusable(false);
			
			idly_textfield=new JTextField();
			dosa_textfield=new JTextField();
			pulao_textfield=new JTextField();
			fried_rice_textfield=new JTextField();
			mushroom_65_textfield=new JTextField();
			chicken_biryani_textfield=new JTextField();
			chicken_fried_rice_textfield=new JTextField();
			veg_biryani_textfield=new JTextField();
			curd_rice_textfield=new JTextField();
			meals_textfield=new JTextField();
			
			idly=new JCheckBox("2 Nos Idly - Rs.20");
			idly.setBounds(400,60,300,20);
			idly.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
			idly.setBackground(Color.yellow);
			idly.setForeground(Color.black);
			idly.setFocusable(false);
			idly.addActionListener(this);
			idly.addMouseListener(this);
			
			idly_textfield.setBounds(750,60,200,20);
			idly_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			idly_textfield.setBackground(Color.white);
			idly_textfield.setForeground(Color.red);
			idly_textfield.setOpaque(true);
			idly_textfield.setEnabled(false);

			dosa=new JCheckBox("Dosa - Rs.40");
			dosa.setBounds(400,90,300,20);
			dosa.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
			dosa.setBackground(Color.yellow);
			dosa.setForeground(Color.black);
			dosa.setFocusable(false);
			dosa.addActionListener(this);
			dosa.addMouseListener(this);
			
			dosa_textfield.setBounds(750,90,200,20);
			dosa_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			dosa_textfield.setBackground(Color.white);
			dosa_textfield.setForeground(Color.red);
			dosa_textfield.setOpaque(true);
			dosa_textfield.setEnabled(false);
			
			pulao=new JCheckBox("Pulao - Rs.60");
			pulao.setBounds(400,120,300,20);
			pulao.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
			pulao.setBackground(Color.yellow);
			pulao.setForeground(Color.black);
			pulao.setFocusable(false);
			pulao.addActionListener(this);
			pulao.addMouseListener(this);
			
			pulao_textfield.setBounds(750,120,200,20);
			pulao_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			pulao_textfield.setBackground(Color.white);
			pulao_textfield.setForeground(Color.red);
			pulao_textfield.setOpaque(true);
			pulao_textfield.setEnabled(false);
			
			fried_rice=new JCheckBox("Fried Rice - Rs.65");
			fried_rice.setBounds(400,150,300,20);
			fried_rice.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
			fried_rice.setBackground(Color.yellow);
			fried_rice.setForeground(Color.black);
			fried_rice.setFocusable(false);
			fried_rice.addActionListener(this);
			fried_rice.addMouseListener(this);
			
			fried_rice_textfield.setBounds(750,150,200,20);
			fried_rice_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			fried_rice_textfield.setBackground(Color.white);
			fried_rice_textfield.setForeground(Color.red);
			fried_rice_textfield.setOpaque(true);
			fried_rice_textfield.setEnabled(false);
			
			mushroom_65=new JCheckBox("Mushroom 65 - Rs.75");
			mushroom_65.setBounds(400,180,300,20);
			mushroom_65.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
			mushroom_65.setBackground(Color.yellow);
			mushroom_65.setForeground(Color.black);
			mushroom_65.setFocusable(false);
			mushroom_65.addActionListener(this);
			mushroom_65.addMouseListener(this);
			
			
			mushroom_65_textfield.setBounds(750,180,200,20);
			mushroom_65_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			mushroom_65_textfield.setBackground(Color.white);
			mushroom_65_textfield.setForeground(Color.red);
			mushroom_65_textfield.setOpaque(true);
			mushroom_65_textfield.setEnabled(false);


			chicken_biryani=new JCheckBox("Chicken Biryani - Rs.120");
			chicken_biryani.setBounds(400,210,300,20);
			chicken_biryani.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
			chicken_biryani.setBackground(Color.yellow);
			chicken_biryani.setForeground(Color.black);
			chicken_biryani.setFocusable(false);
			chicken_biryani.addActionListener(this);
			chicken_biryani.addMouseListener(this);
			
			chicken_biryani_textfield.setBounds(750,210,200,20);
			chicken_biryani_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			chicken_biryani_textfield.setBackground(Color.white);
			chicken_biryani_textfield.setForeground(Color.red);
			chicken_biryani_textfield.setOpaque(true);
			chicken_biryani_textfield.setEnabled(false);
			

			
			chicken_fried_rice=new JCheckBox("Chicken Fried Rice - Rs.90");
			chicken_fried_rice.setBounds(400,240,300,20);
			chicken_fried_rice.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
			chicken_fried_rice.setBackground(Color.yellow);
			chicken_fried_rice.setForeground(Color.black);
			chicken_fried_rice.setFocusable(false);
			chicken_fried_rice.addActionListener(this);
			chicken_fried_rice.addMouseListener(this);
			
			chicken_fried_rice_textfield.setBounds(750,240,200,20);
			chicken_fried_rice_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			chicken_fried_rice_textfield.setBackground(Color.white);
			chicken_fried_rice_textfield.setForeground(Color.red);
			chicken_fried_rice_textfield.setOpaque(true);
			chicken_fried_rice_textfield.setEnabled(false);
			
			
			veg_biryani=new JCheckBox("Vegetable Biryani - Rs.65"); 
			veg_biryani.setBounds(400,270,300,20);
			veg_biryani.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
			veg_biryani.setBackground(Color.yellow);
			veg_biryani.setForeground(Color.black);
			veg_biryani.setFocusable(false);
			veg_biryani.addActionListener(this);
			veg_biryani.addMouseListener(this);
			
			veg_biryani_textfield.setBounds(750,270,200,20);
			veg_biryani_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			veg_biryani_textfield.setBackground(Color.white);
			veg_biryani_textfield.setForeground(Color.red);
			veg_biryani_textfield.setOpaque(true);
			veg_biryani_textfield.setEnabled(false);
			
			curd_rice=new JCheckBox("Curd Rice - Rs.50");
			curd_rice.setBounds(400,300,300,20);
			curd_rice.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
			curd_rice.setBackground(Color.yellow);
			curd_rice.setForeground(Color.black);
			curd_rice.setFocusable(false);
			curd_rice.addActionListener(this);
			curd_rice.addMouseListener(this);
			
			curd_rice_textfield.setBounds(750,300,200,20);
			curd_rice_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			curd_rice_textfield.setBackground(Color.white);
			curd_rice_textfield.setForeground(Color.red);
			curd_rice_textfield.setOpaque(true);
			curd_rice_textfield.setEnabled(false);
			
			meals=new JCheckBox("Meals - Rs.70");
			meals.setBounds(400,330,300,20);
			meals.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,15));
			meals.setBackground(Color.yellow);
			meals.setForeground(Color.black);
			meals.setFocusable(false);
			meals.addActionListener(this);
			meals.addMouseListener(this);
			
			meals_textfield.setBounds(750,330,200,20);
			meals_textfield.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,20));
			meals_textfield.setBackground(Color.white);
			meals_textfield.setForeground(Color.red);
			meals_textfield.setOpaque(true);
			meals_textfield.setEnabled(false);
			
			leftlabel=new JLabel();
			leftlabel.setBounds(20,40,350,350);
			leftlabel.setIcon(canteen);
			
			label5=new JLabel("   ");
		    
			button1=new JButton(" SUBMIT");
			button1.setBounds(800, 360, 100, 35);
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
			bill_title.setBounds(400, 400,500,40);
			bill_title.setBackground(Color.DARK_GRAY);
			bill_title.setForeground(Color.white);
			bill_title.setOpaque(true);
			bill_title.setFont(new Font("TIMES NEW ROMAN",Font.PLAIN,25));
			
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
			this.add(idly);
			this.add(dosa);
			this.add(pulao);
			this.add(fried_rice);
			this.add(curd_rice);
			this.add(meals);
			this.add(chicken_biryani);
			this.add(chicken_fried_rice);
			this.add(veg_biryani);
			this.add(idly_textfield);
			this.add(pulao_textfield);
			this.add(dosa_textfield);
			this.add(fried_rice_textfield);
			this.add(mushroom_65_textfield);
			this.add(chicken_biryani_textfield);
			this.add(chicken_fried_rice_textfield);
			this.add(curd_rice_textfield);
			this.add(meals_textfield);
			this.add(veg_biryani_textfield);
			this.add(mushroom_65);
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
			this.setTitle("CANTEEN");
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
			
			String amt1=idly_textfield.getText();
			String amt2=dosa_textfield.getText();
			String amt3=pulao_textfield.getText();
			String amt4=fried_rice_textfield.getText();
			String amt5=mushroom_65_textfield.getText();
			String amt6=chicken_biryani_textfield.getText();
			String amt7=chicken_fried_rice_textfield.getText();
			String amt8=veg_biryani_textfield.getText();
			String amt9=curd_rice_textfield.getText();
			String amt10=meals_textfield.getText();
			   
			int total_values=0,a=0,b=0,c=0,d=0,f=0,g=0,h=0,i=0,j=0,k=0;
			
			if(idly.isSelected())
			{
				idly_textfield.setEnabled(true);
				idly_textfield.setText("1");
			}
			else
			{
				idly_textfield.setText(null);
				idly_textfield.setEnabled(false);	
			}
			if(fried_rice.isSelected())
			{
				fried_rice_textfield.setEnabled(true);	
				fried_rice_textfield.setText("1");
			}
			else
			{
				fried_rice_textfield.setText(null);
				fried_rice_textfield.setEnabled(false);	
			}
			if(dosa.isSelected())
			{
				dosa_textfield.setEnabled(true);
				dosa_textfield.setText("1");
			}
			else
			{
				dosa_textfield.setText(null);
				dosa_textfield.setEnabled(false);	
			}
			if(pulao.isSelected())
			{
				
			   pulao_textfield.setEnabled(true);  
			   pulao_textfield.setText("1");
			}
			else
			{
				pulao_textfield.setText(null);
				pulao_textfield.setEnabled(false);	
			}
			if(mushroom_65.isSelected())
			{
				mushroom_65_textfield.setEnabled(true);
				mushroom_65_textfield.setText("1");
			}
			else
			{
				mushroom_65_textfield.setText(null);
				mushroom_65_textfield.setEnabled(false);
			}
			if(meals.isSelected())
			{
				meals_textfield.setEnabled(true);
				meals_textfield.setText("1");
			}
			else
			{
				meals_textfield.setText(null);
				meals_textfield.setEnabled(false);
			}
			if(chicken_fried_rice.isSelected())
			{
				chicken_fried_rice_textfield.setEnabled(true);
				chicken_fried_rice_textfield.setText("1");
			}
			else
			{
				chicken_fried_rice_textfield.setText(null);
				chicken_fried_rice_textfield.setEnabled(false);
			}
			if(veg_biryani.isSelected())
			{
				veg_biryani_textfield.setEnabled(true);
				veg_biryani_textfield.setText("1");
			}
			else
			{
				veg_biryani_textfield.setText(null);
				veg_biryani_textfield.setEnabled(false);
			}
			if(curd_rice.isSelected())
			{
				curd_rice_textfield.setEnabled(true);
				curd_rice_textfield.setText("1");
			}
			else
			{
				curd_rice_textfield.setText(null);
				curd_rice_textfield.setEnabled(false);
			}
			if(chicken_biryani.isSelected())
			{
				chicken_biryani_textfield.setEnabled(true);
				chicken_biryani_textfield.setText("1");
			}
			else
			{
				chicken_biryani_textfield.setText(null);
				chicken_biryani_textfield.setEnabled(false);
			}
			if(e.getSource()==button1)
		    {
			  if(!idly.isSelected() && !pulao.isSelected() && !dosa.isSelected() && !fried_rice.isSelected() && !mushroom_65.isSelected() && !curd_rice.isSelected() && !chicken_fried_rice.isSelected() && !chicken_biryani.isSelected() && !veg_biryani.isSelected() && !meals.isSelected())
			  {
			   bill_title.setText("  Please select any items!!!!");
			   
			   }
			   else {
				      bill_title.setText("BILL");
				      pay.setVisible(true);
				      if(idly.isSelected()==true)
					   {
						   items.add("2 Nos Idly - Rs.20");
						   a=Integer.parseInt(amt1);
						   a=a*20;
					   }		
					   if(dosa.isSelected()==true)
					   {
						   items.add("Dosa - Rs.40");
						   b=Integer.parseInt(amt2);
						   b=b*40;	   
					   }  
					   if(pulao.isSelected()==true)
					   {
						  items.add("Pulao - Rs.60");
						   c=Integer.parseInt(amt3);
						   c=c*60;
					   }
					   if(fried_rice.isSelected()==true)
					   {
						   items.add("Fried Rice - Rs.65");
						   d=Integer.parseInt(amt4);
						   d=d*65;
					   }
					   if(mushroom_65.isSelected()==true)
					   {
						   items.add("Mushroom 65 - Rs.75");
						   f=Integer.parseInt(amt5);
						   f=f*75;
					   }
						if(chicken_biryani.isSelected()==true)
						{
							items.add("Chicken Biryani - Rs.120");
						    g=Integer.parseInt(amt6);
						    g=g*120;
						}
						if(chicken_fried_rice.isSelected()==true)
						{
							items.add("Chicken fried Rice - Rs.90");
						    h=Integer.parseInt(amt7);
						    h=h*90;
						}
						if(veg_biryani.isSelected()==true)
						{
							items.add("Vegetable Biryani - Rs.65");
						    i=Integer.parseInt(amt8);
						    i=i*65;
						}
						if(curd_rice.isSelected()==true)
						{
							items.add("Curd Rice - Rs.50");
						    j=Integer.parseInt(amt9);
						    j=j*50;
						}
						if(meals.isSelected()==true)
						{
							items.add("Meals - Rs.70");
						    k=Integer.parseInt(amt10);
						    k=k*70;
						}
					   total_values=a+b+c+d+f+g+h+i+j+k;
					   String result=String.valueOf(total_values);
					   total_valuess=result;
					   idly_textfield.setText(amt1);
					   dosa_textfield.setText(amt2);
					   pulao_textfield.setText(amt3);
					   fried_rice_textfield.setText(amt4);
					   mushroom_65_textfield.setText(amt5);
					   chicken_biryani_textfield.setText(amt6);
					   chicken_fried_rice_textfield.setText(amt7);
					   veg_biryani_textfield.setText(amt8);
					   curd_rice_textfield.setText(amt9);
					   meals_textfield.setText(amt10);
					   total_value.setText(result);
					   total_value.setVisible(true);
		               subtitle3.setVisible(true);
		               items.setVisible(true);
		               total.setVisible(true);
				   }
				   
		         }
			if(e.getSource()==back)
			{
				Sjt_foodys sjt_foodys3=new Sjt_foodys();
				this.dispose();
			}
			if(e.getSource()==home)
			{
				Home home5=new Home();
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
	     if(e.getSource()==idly)
	     {
	    	 leftlabel.setIcon(idly_pic);
	     }
	     if(e.getSource()==mushroom_65)
	     {
	    	 leftlabel.setIcon(mushroom_65_pic);
	     }
	     if(e.getSource()==fried_rice)
	     {
	    	 leftlabel.setIcon(fried_rice_pic);
	     }
	     if(e.getSource()==pulao)
	     {
	    	 leftlabel.setIcon(pulao_pic);
	     }
	     if(e.getSource()==dosa)
	     {
	    	 leftlabel.setIcon(dosa_pizza_pic);
	     }
	     if(e.getSource()==chicken_fried_rice)
	     {
	         leftlabel.setIcon(chicken_fried_rice_pic);	 
	     }
	     if(e.getSource()==chicken_biryani)
	     {
	    	 leftlabel.setIcon(chicken_biryani_pic);
	     }
	     if(e.getSource()==curd_rice)
	     {
	    	 leftlabel.setIcon(curd_rice_pic);
	     }
	     if(e.getSource()==meals)
	     {
	    	 leftlabel.setIcon(meals_pic);
	     }
	     if(e.getSource()==veg_biryani)
	     {
	    	 leftlabel.setIcon(veg_biryani_pic);
	     }
	     
	     if(e.getSource()==this)
		 {
		   	 leftlabel.setIcon(canteen);
		 }
	     
		}
		@Override
		public void mouseExited(MouseEvent e) {	
		}
	}