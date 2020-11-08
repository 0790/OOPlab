import java.util.Scanner; 

public class InchToMeters {
	public static double inch;
	public static double meters;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input a value for inch: " ) ;
		Scanner sc= new Scanner(System.in); 
		inch = sc.nextDouble() ;
		meters = inch/39.37 ;
		System.out.print(inch) ; 
		System.out.print(" inch is " ) ;
		System.out.print(String.format("%.1f" ,meters) ); 
		System.out.print(" meters") ; 
		

	}

}
