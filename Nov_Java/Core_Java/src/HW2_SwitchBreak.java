
public class HW2_SwitchBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int temperature=70;
		
		switch(temperature){
		
		case 80:
			System.out.println("Today is a sunny day");
			break;
			
		case 70:
			System.out.println("Today is a cloudy day ");
			break;
			
		case 60:
			System.out.println("Today is a rainy day");
			break;
			
		case 90:
			System.out.println("Today's weather is too hot");
			
		case 65:
			System.out.println("Today's weather is moderate");
			break;
			
			
			default:
				System.out.println("Today's weather is unpredictable. Please try another temperature");
				break;
				
				
				
				
		}

	}

}
