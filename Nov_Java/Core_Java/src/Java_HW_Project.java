import javax.swing.JOptionPane;

public class Java_HW_Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
 int food=1;
 
 String number;
 number=JOptionPane.showInputDialog("Please enter your foodItem no.");	

		switch(food){
		
		case 1:
			JOptionPane.showMessageDialog(null,"Drink"+" "+ "Price="+"$3");
			break;
			
		case 2:
			JOptionPane.showMessageDialog(null,"Small Pizza"+" "+"Price="+"$5");
			break;
			
		case 3:
			JOptionPane.showMessageDialog(null,"Chicken Sandwich"+" "+"Price="+"$6");
			break;
			
		case 4:
			JOptionPane.showMessageDialog(null,"Burger"+" "+"Price="+"$8");
			break;
			
		case 5:
			JOptionPane.showMessageDialog(null,"Large Pizza"+" "+"Price="+"$10");
			break;
			
		default:
			JOptionPane.showMessageDialog(null,"We don't have that food choice in our menu");
			break;
			
		
		
		
		}	
	}

}
