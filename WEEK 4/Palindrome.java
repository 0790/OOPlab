import java.lang.Math;
import java.util.Scanner ;
public class Palindrome {
	public static Boolean Palin(int n, int m)
	{
		if(m>1)
		{
			//System.out.println(" entered 1 ") ;
			if(n%10 == n/(int)Math.pow(10,m-1)) { 
				//System.out.println(" entered 2 ") ;
				Palin((n%(int)Math.pow(10, m-1))/10, m-2) ; }
			else return false ;
		}
		return true;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		System.out.print("Number: ") ;
		int num = sc.nextInt() ;
		int length = String.valueOf(num).length();
		//System.out.println(length) ;
		//System.out.println(num) ;
		Boolean a = Palin(num,length) ;
		if(a== true)System.out.println("\nNumber is a Palindrome") ;
		else System.out.println("\nNumber is not a Palindrome") ;
		

	}

}
