import java.util.Scanner; 

public class Revenue {
	int price ;
	int quant ;
	double rev ;
	double dis ; 
	public Revenue(int n , int m, double d )
	{
		this.price = n ;
		this.quant = m ;
		this.dis = d*m*n ;
		this.rev = n*m - this.dis ; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter unit price:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in); 
		int n = sc.nextInt() ;
		System.out.print("Enter quantity:");
		int m = sc.nextInt() ;
		int s = n*m ;
		System.out.printf("Revenue before discount: " + s );
		
		double d ;	
		
		if(m >=100 && m <= 120)d = 0.10 ;
		else d= 0.15 ;
		
		Revenue r = new Revenue(n,m, d) ;
		System.out.printf("\nDiscounted Amount " + d*100 + " : "+ r.dis );
		System.out.printf("\nThe revenue from the sale after discount :" + r.rev);
	}

}
