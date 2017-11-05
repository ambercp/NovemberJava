
public class CW1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int me=20;
int sis=30;

System.out.println("My age is "+ me);
System.out.println("My sister's age is "+sis);
System.out.println("The total of me & sis age is "+(me+sis));


int temp= me; //SWAP
me= sis;
sis= temp;
System.out.println("My age is :" + me);
System.out.println("sis age is :"+ sis);
		
		
int age=sis; //After SWAP 'sis' age is 'me' which is 20

if (age>21)
{System.out.println("You can drink");}		

if (age==21)
{System.out.println("You can have 2 drink only");}

if (age<21)
{System.out.println("You cannot drink");}

			
	}

}
