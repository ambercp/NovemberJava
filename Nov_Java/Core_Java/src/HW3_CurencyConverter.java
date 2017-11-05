import java.util.Scanner;

public class HW3_CurencyConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader=new Scanner(System.in);
		System.out.println("Provide me your dollar amount");
		int n=reader.nextInt();
		
		
		System.out.println("Your Yen amount is "+ (n*112.17));
		
		
	}

}
