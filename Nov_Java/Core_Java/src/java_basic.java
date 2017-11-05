import java.util.Random;
public class java_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    /*Want to generate number between 1 to 20 and
     * then i want to make a loop to guess that random number
     * and i want to see how many guesses it takes to find the random number. */
	
	Random rand=new Random();//declear random
	
	int randomnumber=rand.nextInt(20)+1;//Gives me random numbers 1 to 20
	System.out.println(randomnumber);//display our guess or the random number java gives us.
	
	int count=1;
	while(count<randomnumber) {
		
	System.out.println("This is how many guesses it took: "+count);
	count++;
	}
	
	
	
	
	}
}
		
		
	


