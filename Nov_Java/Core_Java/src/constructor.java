//constructor is an instance method that usually has the same name as class, 
//and its used for assigning a new default value
//constructor should be always non static.

public class constructor {

	int age;      //variable without values
	int salary;   //default values are 0,0,0,null
	int house;
	String name;
	
	constructor(){
		
	int age=20;     //in this constructor method we are giving new default values and printing the values
	int salary=1000;
	int house=2;
	String name="john";
	
	System.out.println(age);
	System.out.println(salary);
	System.out.println(house);
	System.out.println(name);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	constructor x=new constructor();  //we are executing the constructor method with this object
	
	}

}
