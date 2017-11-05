import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//4. Write a Java program that reads a floating-point number and prints "zero" 
//if the number is zero. Otherwise, print "positive" or "negative". 
//Add "small" if the absolute value of the number is less than 1, or "large"
//if it exceeds 1,000,000. 
		
Scanner reader=new Scanner(System.in); 
System.out.println("Please enter your number");
int n=reader.nextInt();	

if (n>0){   
			
if (Math.abs(n)<1) {System.out.println("Your number is positive & Small");}
else if (Math.abs(n)>1000000) {System.out.println("Your number is Large & Positive");}
else {System.out.println("Your number is Positive");  }
		}
else if 
	(n==0){System.out.println("Your number is Zero");
}
else  {
	{System.out.println("Your number is negative");}
		
       }
	 }
  }
	        


