import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader1=new Scanner(System.in); 
		System.out.println("Please enter your n1");
		int n1=reader1.nextInt();
		
		Scanner reader2=new Scanner(System.in); 
		System.out.println("Please enter your n2");
		int n2=reader2.nextInt();
		
		Scanner reader3=new Scanner(System.in); 
		System.out.println("Please enter your n3");
		int n3=reader3.nextInt();
		
		if (n1>n2)
		if (n1>n3)
		System.out.println("Your highest number is " + n1);
		
		if (n2>n1)
		if (n2>n3)
		System.out.println("Your highest number is " + n2);
		
		if (n3>n1)
		if (n3>n2)
		System.out.println("Your highest number is "+ n3);
		
		
		
		
	}

}
