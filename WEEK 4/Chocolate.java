import java.util.Scanner ;
public class Chocolate {
	static int c = 0 ;
	public static int Choc(int n, int w) 
	{
		if( n  >= w || c >= w ) {
			c = c + n%w ;
			//System.out.print(c);
			return Choc(n/w , w) + n/w + c%w ; 
			
			
 		}
		return 0 ;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("Money : ") ;
		int m = sc.nextInt() ;
		System.out.print("Price : ") ;
		int p = sc.nextInt() ;
		System.out.print("Wrap : ") ;
		int w = sc.nextInt() ;
		int total = m/p + Choc(m/p , w) ;
		System.out.println("\nOutput: "+ total ) ; 
	}

}
