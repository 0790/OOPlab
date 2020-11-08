import java.util.Scanner ;

public class FToC {
	public static double fahrenheit;
	public static double celsius;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input Fahrenheit value" ) ;
		Scanner sc= new Scanner(System.in); 
		fahrenheit = sc.nextDouble() ;
		celsius = (fahrenheit - 32 )*5/9 ;
		System.out.print("Equivalent Celsius value " ) ;
		System.out.print(celsius) ; 
		
		

	}

}
