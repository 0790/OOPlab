import java.util.Scanner ;

public class Constructor {
	int sum;
	int i; 
	Constructor(int n)
	{	
		if(n%2== 0) i = 2  ;
		else i = 1 ;
		for(; i <=n ; i+= 2)
		{sum = sum + i ; } 
	}
	Constructor(int n, int m)
	{	
		if(n%2== 0) i = 2  ;
		else i = 1 ;
		for(; i <=n ; i+= 2)
		{sum = sum + m*i ; } 
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Input the number" ) ;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt() ;
		 int m = sc.nextInt() ;
		if (m==0) 
		{
			Constructor a = new Constructor(n) ;
			System.out.print(a.sum ) ;
		}
		else
		{
			Constructor a = new Constructor(n,m) ;
			System.out.print(a.sum ) ;
		}
	}

}
