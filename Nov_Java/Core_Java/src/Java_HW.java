import javax.swing.JOptionPane;

import java.util.Random;


public class Java_HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String number;
	number=JOptionPane.showInputDialog("Input a number");
	int convernum=Integer.parseInt(number);
	
   Random rand=new Random();
   int n=rand.nextInt(10);
	
JOptionPane.showMessageDialog(null,"My Random Number is "+n+" "+ "and My input number is "+convernum);
	
	if (convernum==n)
		{System.out.println("We are all good");}
		
    else{System.out.println("We are not good");}   
		
		
		
	}

}
