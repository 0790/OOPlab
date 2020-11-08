import java.util.Scanner ;
public class Shop {
	int ItemCode ;
	String ItemName;
	int ItemCost ;
	int ItemCount ;
	Shop()
	{
		ItemCode = 1 ;
		ItemName = "APPLE" ;
		ItemCost = 10 ;
		ItemCount = 20 ;
	}
	void display()
	{
		System.out.print("ItemCode  ItemName  ItemCost  ItemCount" ) ;
		System.out.print("\n");
		System.out.printf(ItemCode+ "     " + ItemName+ "     " + ItemCost+"     " + ItemCount) ;
	}
	void display1( int m )
	{
		System.out.print("ItemCode  ItemName  ItemCount  Cost" ) ;
		System.out.print("\n");
		System.out.printf(ItemCode+ "     " + ItemName +"     " + m +"     " + ItemCost*m) ;
	}
	void output(int n , int m )
	{
		if(m > ItemCount)System.out.printf("SORRY ONLY " + ItemCount + " ITEMS AVAILABLE" + "\n") ;	
		else
		{
			System.out.printf("COST OF THE ORDER IS " +m*ItemCost+ "\nORDER DETAILS \n");
			display1(m) ;
			ItemCount = ItemCount - m ;
			System.out.print("\nCURRENT AVAILABILTY\n");
			display() ;
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shop s = new Shop();
		s.display()  ;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in) ;
		int n , m ;
		System.out.print("\nINPUT:");
		n = sc.nextInt();
		m = sc.nextInt() ;
		System.out.print("EXPECTED OUTPUT:");
		s.output(n ,m ) ;
		
	}

}
