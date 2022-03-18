import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Caluclator implements ActionListener {
	JFrame jf;
	JButton sevenbutton;
	JButton eightbutton;
	JButton ninebutton;
	JButton fourbutton;
	JButton fivebutton;
	JButton sixbutton;
	JButton onebutton;
	JButton twobutton;
	JButton threebutton;
	JButton dotbutton;
	JButton zerobutton;
	JButton equalbutton;
	JButton minusbutton;
	JButton mulbutton;
	JButton divbutton;
	JButton addbutton;
	JButton clearbutton;
	JLabel displayLable;
	boolean isOperatedClicked=false;
String oldvalue;
	public Caluclator()  {
		jf=new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300,150);

		displayLable=new JLabel();
		displayLable.setBounds(30, 40, 540, 40);
		displayLable.setBackground(Color.gray);
		displayLable.setOpaque(true);
		displayLable.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLable.setForeground(Color.white);
		jf.add(displayLable);

		sevenbutton=new JButton("7");
		sevenbutton.setBounds(30, 130, 80, 80);
		sevenbutton.setFont(new Font("Arial",Font.PLAIN,40));
		sevenbutton.addActionListener(this);
		jf.add(sevenbutton);

		eightbutton=new JButton("8");
		eightbutton.setBounds(130, 130, 80, 80);
		eightbutton.setFont(new Font("Arial",Font.PLAIN,40));
		eightbutton.addActionListener(this);
		jf.add(eightbutton);

		ninebutton=new JButton("9");
		ninebutton.setBounds(230, 130, 80, 80);
		ninebutton.setFont(new Font("Arial",Font.PLAIN,40));
		ninebutton.addActionListener(this);
		jf.add(ninebutton);

		fourbutton=new JButton("4");
		fourbutton.setBounds(30, 230, 80, 80);
		fourbutton.setFont(new Font("Arial",Font.PLAIN,40));
		fourbutton.addActionListener(this);
		jf.add(fourbutton);

		fivebutton=new JButton("5");
		fivebutton.setBounds(130, 230, 80, 80);
		fivebutton.setFont(new Font("Arial",Font.PLAIN,40));
		fivebutton.addActionListener(this);
		jf.add(fivebutton);

		sixbutton=new JButton("6");
		sixbutton.setBounds(230, 230, 80, 80);
		sixbutton.setFont(new Font("Arial",Font.PLAIN,40));
		sixbutton.addActionListener(this);
		jf.add(sixbutton);

		onebutton=new JButton("1");
		onebutton.setBounds(30, 330, 80, 80);
		onebutton.setFont(new Font("Arial",Font.PLAIN,40));
		onebutton.addActionListener(this);
		jf.add(onebutton);

		twobutton=new JButton("2");
		twobutton.setBounds(130, 330, 80, 80);
		twobutton.setFont(new Font("Arial",Font.PLAIN,40));
		twobutton.addActionListener(this);
		jf.add(twobutton);

		threebutton=new JButton("3");
		threebutton.setBounds(230, 330, 80, 80);
		threebutton.setFont(new Font("Arial",Font.PLAIN,40));
		threebutton.addActionListener(this);
		jf.add(threebutton);

		dotbutton=new JButton(".");
		dotbutton.setBounds(30, 430, 80, 80);
		dotbutton.setFont(new Font("Arial",Font.PLAIN,40));
		dotbutton.addActionListener(this);
		jf.add(dotbutton);

		zerobutton=new JButton("0");
		zerobutton.setBounds(130, 430, 80, 80);
		zerobutton.setFont(new Font("Arial",Font.PLAIN,40));
		zerobutton.addActionListener(this);
		jf.add(zerobutton);

		equalbutton=new JButton("=");
		equalbutton.setBounds(230, 430, 80, 80);
		equalbutton.setFont(new Font("Arial",Font.PLAIN,40));
		equalbutton.addActionListener(this);
		jf.add(equalbutton);

		minusbutton=new JButton("-");
		minusbutton.setBounds(330, 130, 80, 80);
		minusbutton.setFont(new Font("Arial",Font.PLAIN,40));
		minusbutton.addActionListener(this);
		jf.add(minusbutton);

		mulbutton=new JButton("*");
		mulbutton.setBounds(330, 230, 80, 80);
		mulbutton.setFont(new Font("Arial",Font.PLAIN,40));
		mulbutton.addActionListener(this);
		jf.add(mulbutton);

		divbutton=new JButton("/");
		divbutton.setBounds(330, 330, 80, 80);
		divbutton.setFont(new Font("Arial",Font.PLAIN,40));
		divbutton.addActionListener(this);
		jf.add(divbutton);

		addbutton=new JButton("+");
		addbutton.setBounds(330, 430, 80, 80);
		addbutton.setFont(new Font("Arial",Font.PLAIN,40));
		addbutton.addActionListener(this);
		jf.add(addbutton);
		
		clearbutton=new JButton("ac");
		clearbutton.setBounds(430, 130, 80, 80);
		clearbutton.setFont(new Font("Arial",Font.PLAIN,40));
		clearbutton.addActionListener(this);
		jf.add(clearbutton);

		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args)  {
		Caluclator c=new Caluclator();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//jf.getContentPane().setBackground(Color.BLUE);
		if(e.getSource()==sevenbutton) {
			if (isOperatedClicked) {
				displayLable.setText("7");
				isOperatedClicked=false;
			}else {
			displayLable.setText(displayLable.getText()+"7");
		}}else if(e.getSource()==eightbutton){
			if (isOperatedClicked) {
				displayLable.setText("8");
				isOperatedClicked=false;
			}else {
			displayLable.setText(displayLable.getText()+"8");
		}}else if(e.getSource()==ninebutton){
			displayLable.setText(displayLable.getText()+"9");	
		}else if(e.getSource()==fourbutton){
			displayLable.setText(displayLable.getText()+"4");
		}else if(e.getSource()==fivebutton){
			displayLable.setText(displayLable.getText()+"5");
		}else if(e.getSource()==sixbutton){
			displayLable.setText(displayLable.getText()+"6");
		}else if(e.getSource()==onebutton){
			displayLable.setText(displayLable.getText()+"1");
		}else if(e.getSource()==twobutton){
			displayLable.setText(displayLable.getText()+"2");
		}else if(e.getSource()==threebutton){
			displayLable.setText(displayLable.getText()+"3");
		}else if(e.getSource()==dotbutton){
			displayLable.setText(displayLable.getText()+".");
		}else if(e.getSource()==zerobutton){
			displayLable.setText(displayLable.getText()+"0");
		}else if(e.getSource()==equalbutton){
			String newValue=displayLable.getText();
			float oldValuef=Float.parseFloat(oldvalue);
			float newValuef=Float.parseFloat(newValue);
			float result=oldValuef+newValuef;
			displayLable.setText(result+"");
		}else if(e.getSource()==minusbutton){
			
		}else if(e.getSource()==mulbutton){
			
		}else if(e.getSource()==divbutton){
			
		}else if(e.getSource()==addbutton){
			isOperatedClicked=true;
			oldvalue=displayLable.getText();			
		}else if(e.getSource()==clearbutton){
			displayLable.setText(" ");
			}
	}
}
