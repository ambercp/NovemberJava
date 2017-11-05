import java.util.Scanner;

public class Try_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//try catch handles exception and error
		try{ // tries the specific code
		
		Scanner reader=new Scanner(System.in);
		System.out.println("Provide me your first integer");
		int n=reader.nextInt();
		System.out.println("Provide your second integer");
		int p=reader.nextInt();
		
		int sum=n+p;
		
		System.out.println("Your additional value is " + sum);

		}catch(Exception e) {//tries to catch every execution with "e"
			System.out.println("provide a number value");
		}
	}

}
