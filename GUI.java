package com.project;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Event;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;



public class GUI extends JFrame implements ActionListener, MouseListener, ItemListener
{


		  private JLabel label1;
		  private JLabel label2;
		  private JLabel label3;
		  private JLabel label4;
		  private JButton button1;
		  private JButton button2;
		  private Double aValue;
		  private Double sValue;
		  private Double cValue;
		  private Double hValue;
		  private Double nValue;
		  private Double result;
		  private Choice c1;
		  private Choice c2;
		  private Choice c3;
		  private Choice c4;
		  private String temp;
		  private String temp2;
		  private String temp3;
		  private String temp4;
		  private JTextField t1;
		  private JTextField t2;
		  private JTextField t3;
		  
		  		  	 
		  // Constructor
	  
		  public GUI (String title, Double aVal, Double sVal, Double hVal, Double nVal, Double cVal)
		  {
			   
			   super(title);
			
			  
			   setLayout(new BorderLayout());
			   
			   aValue = aVal;
			   sValue = sVal;
			   hValue = hVal;
			   nValue = nVal;
			   cValue = cVal;
			   label1  = new JLabel("Choose Tempature ");
			   label2 = new JLabel("Do you have tonsolits");
			   label3  = new JLabel("Do you have a sore throat ");
			   label4  = new JLabel("Do you have any aches ");
			   button1 = new JButton("Check");
			   button2 = new JButton("Enter Data");
			   Choice c1 = new Choice();
			   Choice c2 = new Choice();
			   Choice c3 = new Choice();
			   Choice c4 = new Choice();
			   t1 = new JTextField("hot normal or cool");
			   t1.setBounds(50, 100, 200, 30);
			   t2 = new JTextField("enter yes or no");
			   t2.setBounds(50, 100, 200, 30);
			   t3 = new JTextField("yes or no");
			   t3.setBounds(50, 100, 200, 30);


			   c1.setBounds(50, 100, 200, 30);
			   c2.setBounds(50, 100, 200, 30);
			   c3.setBounds(50, 100, 200, 30);
			   c4.setBounds(50, 100, 200, 30);
			   c1.add("hot");
			   c1.add("normal");
			   c1.add("cool");
			   c2.add("Yes");
			   c2.add("no");
			   c3.add("Yes");
			   c3.add("no");
			   c4.add("Yes");
			   c4.add("no");
			   button1.addActionListener(this);
			   button2.addActionListener(this);
			   c1.addItemListener(this);
			   c2.addItemListener(this);
			   c3.addItemListener(this);
			    
			   JPanel myPanel = new JPanel();
			   JPanel myPanel2 = new JPanel();
			   
			   myPanel.add(label1);  
			   myPanel.add(t1);
			   myPanel.add(label3); 
			   myPanel.add(t2);
			   myPanel.add(label4); 
			   myPanel.add(t3);
			   myPanel.add(button1);
			 
		
			   
			   
			   
			   add(myPanel, BorderLayout.NORTH);
			   add(myPanel2, BorderLayout.CENTER);

				
			   setLocation(100,100);

			    
			   setSize(900,600);
			   
			   // make the screen appear - without this, it doesn't!  
			   setVisible(true);
			   
			 
			 
				   
			  
		 }

		@Override
		public void actionPerformed(ActionEvent event)
		{
			temp = t1.getText();
			temp2 = t2.getText();
			temp3 = t3.getText();
			System.out.println(temp);
			if(event.getSource() == button1)
			{
				
				if(temp.equalsIgnoreCase("hot") )
				{
					result = hValue;
					if(temp2.equalsIgnoreCase("Yes") )
					{
						result = result * sValue;
						if(temp3.equalsIgnoreCase("Yes") )
						{
							result = result * aValue;
						}	
					}
					if(temp3.equalsIgnoreCase("Yes") )
					{
						result = result * aValue;
					}
				}
				if(temp.equalsIgnoreCase("cool") )
				{
					result = hValue;
					if(temp2.equalsIgnoreCase("Yes") )
					{
						result = result * sValue;
						if(temp3.equalsIgnoreCase("Yes") )
						{
							result = result * aValue;
						}	
					}
					if(temp3.equalsIgnoreCase("Yes") )
					{
						result = result * aValue;
					}
				}
				if(temp.equalsIgnoreCase("normal") )
				{
					result = hValue;
					if(temp2.equalsIgnoreCase("Yes") )
					{
						result = result * sValue;
						if(temp3.equalsIgnoreCase("Yes") )
						{
							result = result * aValue;
						}	
					}
					if(temp3.equalsIgnoreCase("Yes") )
					{
						result = result * aValue;
					}
				}
				JOptionPane.showMessageDialog(this, result);
			}
			if(event.getSource()== button2)
			{
				JOptionPane.showMessageDialog(this, "button2 clicked");
			}
			
			
		}
		


		@Override
		public void mouseClicked(MouseEvent event)
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent event)
		{
			
			
		}

		@Override
		public void mouseExited(MouseEvent event)
		{
			
		}

		@Override
		public void mousePressed(MouseEvent event)
		{
			
		}

		@Override
		public void mouseReleased(MouseEvent event) 
		{
			// TODO Auto-generated method stub
			
		}

		@Override
		public void itemStateChanged(ItemEvent arg0) {
			// TODO Auto-generated method stub
			
		}
}	
		
		  

			
