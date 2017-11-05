import java.util.Scanner;

public class HW3_InputDisplay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader=new Scanner(System.in); //scanner object with input argument
		System.out.println("What is your name?");
		String name=reader.next(); //provide your input and read your input

		
		Scanner reader1=new Scanner(System.in); //scanner object with input argument
		System.out.println("What is your age?");
		int age=reader1.nextInt();  //provide your input and read your input
		
		Scanner reader2=new Scanner(System.in); //scanner object with input argument
		System.out.println("What is your occupation?");
		String occupation=reader2.next();  //provide your input and read your input
		
		System.out.println("Your name is "+ name); //print what your input
		System.out.println("Your age is "+ age); //print what your input
		System.out.println("Your occupation is "+ occupation); //print what your input
		
		
		
		
		
	}

}
