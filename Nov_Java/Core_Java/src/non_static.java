
public class non_static {

	//to call a non static function we have to make an object, and an object is an instance of a class
	//if static is not mentioned in a function, it becomes non static
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	non_static x=new non_static();  //object=instance of a class  
	x.car();
	x.flower();
	x.school();
    x.bike();
	}

	
	
	public void car(){       //non static function. Non static functions can be called everywhere easily.
		
	System.out.println("Toyota");
	}
	
	
	public void flower(){
		
    System.out.println("rose");
	}
	
	public void school(){
	System.out.println("high school");
	
	}
	public void bike(){
	System.out.println("Honda");
	}
	}

