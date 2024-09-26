package Assignment3;

public class Assignment3 {

	

	public static void main(String[] args) {
		
		boolean admin =true;
		boolean validId = false;
		boolean validCard = false;
		
		if(validCard==true && validId ==true || admin==true)
		{
			System.out.println("Access Granted");
		}
		else
		{
			System.out.println("Access Denined");
		}
	}
}
