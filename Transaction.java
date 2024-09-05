package BankManagement;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class Transaction extends JFrame implements ActionListener{
	
	JButton deposite,withdraw,fastcash,ministatement,pinchange, balanceenquiry, exit;
	String pinnumber;
	Transaction(String pinnumber)
	
	{
		this.pinnumber=pinnumber;
		setLayout(null);
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image =new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel text= new JLabel ("Please select your Transaction");
		text.setBounds(210,300,700,35);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		image.add(text);
		
	 deposite= new JButton("Deposite");
		deposite.setBounds(170,415,150,30);
		deposite.addActionListener(this);
		image.add(deposite);
		
		 withdraw= new JButton("cash withdraw");
		withdraw.setBounds(355,415,150,30);
		withdraw.addActionListener(this);
		image.add(withdraw);
		
       fastcash= new JButton(" Fast cash");
		 fastcash.setBounds(170,450,150,30);
		fastcash.addActionListener(this);
		image.add( fastcash);
		
		 ministatement= new JButton(" Mini Statement");
		ministatement.setBounds(355,450,150,30);
		ministatement.addActionListener(this);
		image.add( ministatement);
		
		
		 pinchange= new JButton(" Pin Change");
		pinchange.setBounds(170,485,150,30);
		pinchange.addActionListener(this);
		image.add( pinchange);
		

	 balanceenquiry= new JButton(" Balance Enquiry");
		 balanceenquiry.setBounds(355,485,150,30);
		balanceenquiry.addActionListener(this);
		image.add( balanceenquiry);
		
		 exit= new JButton(" Exit");
		 exit.setBounds(355,520,150,30);
		exit.addActionListener(this);
		image.add(  exit);
		
		
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		// TODO Auto-generated method stub
		if(ae.getSource()== exit)
		{
			System.exit(0);
		}else if(ae.getSource()== deposite)
		{
			setVisible(false);
			new Deposite(pinnumber).setVisible(true);
		}else if(ae.getSource()==withdraw)
		{
			setVisible(false);
			new Withdrawl(pinnumber).setVisible(true);
		}else if(ae.getSource()== fastcash)
		{
			setVisible(false);
			new Fastcash(pinnumber).setVisible(true);
		}else if(ae.getSource()== pinchange)
		{
			setVisible(false);
			new PinChange(pinnumber).setVisible(true);
		}else if(ae.getSource()== balanceenquiry)
		{
			setVisible(false);
			new BalanceEnquiry(pinnumber).setVisible(true);
		}else if(ae.getSource()== ministatement)
		{
			
			new Ministatement(pinnumber).setVisible(true);
			
		}
		
	}

	public static void main(String[] args) {
		new Transaction("");
		
	}


	
}
