import java.util.Scanner;

/**
 * Created by seankang on 1/20/15.
 */
public class Main {



	// c++ int main ()
	public static void main(String [] args)
	{
		// c++ cout
		System.out.println("Enter measurement in inches");
		Scanner s = new Scanner(System.in);    // Java version of cin
		Integer inches =  s.nextInt();

		System.out.println("You entered "+ inches);  // cout << "you entered" << inches;

		Double feet = inches.intValue() /12.0;

		System.out.println("Your measurement in feet is  "+ feet);  // cout << "you entered" << inches;


	}
}
