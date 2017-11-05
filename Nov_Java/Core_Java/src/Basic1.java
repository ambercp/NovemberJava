
import javax.swing.JOptionPane;
import java.util.Random;

public class Basic1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String number;
		number=JOptionPane.showInputDialog("choose a number: ");
		int convernum= Integer.parseInt(number);

		Random rand= new Random();
		int n=rand.nextInt(5);
		
		JOptionPane.showMessageDialog(null, "This is my message","This is my input box",n);
		System.out.println("Your random number is: "+n);
		System.out.println("You guessed: "+convernum);
		
		if(convernum==n){
			System.out.println("You guessed it correct");
			
		}else{
			System.out.println("You guessed it incorrect");
			
		}
		}  }
