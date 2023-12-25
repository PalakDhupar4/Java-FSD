package TypeCast;
//Performing Implicit Type Casting

public class TypeCast {

	public static void main(String[] args) {
	// Create integer variable
		int n=20;
		System.out.println("The integer value is: "+n);
		
	//Convert into double type variable
		double  number = n;
		System.out.println("The double value is: " +number);

//Performing Explicit Type Casting 
		
		// create double variable
		double a=12.76;
		System.out.println("The double value is: " +a);
		
		// convert into integer type variable
		int b = (int)a;
		System.out.println("The integer value is: "+b);

	}

}
