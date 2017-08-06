package corejava;
import java.util.Scanner;

public class Highest {

	public static void main(String[] args) {
		int x,y,z;
		System.out.println("Enter three numbers:");
	    Scanner sc=new Scanner(System.in);
	    x=sc.nextInt();
	    y=sc.nextInt();
	    z=sc.nextInt();
	    if(x>y && x>z)
	    	System.out.println("Highest among 3 given numbers is:"+x);
	    else if(y>x && y>z)
	    	System.out.println("Highest among 3 given numbers is:"+y);
	    else if(z>x && z>y)
	    	System.out.println("Highest among 3 given numbers is:"+z);
	    else
	    	System.out.println("Invalid numbers");
	    
	    
		

	}

}
