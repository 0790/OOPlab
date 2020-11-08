import java.util.Scanner ;
class Hospital{
	public String hname ;
	public String hcity;	
	public Hospital()
	{
		hname = new String("Apollo Hospitals") ;
		hcity = new String("Hyderabad");	
		
		System.out.println(hname +" " +  hcity);
	}
		
}
class Inpatient extends Hospital{
	int sum ;
	public void Treatment() 
	{
		
		System.out.println("Appointment Fee is mandatory" ) ;
		System.out.println("1.Fever" ) ;
		System.out.println("2.Wounds");
		System.out.println("3.Emergency(ICU)" ) ;
		System.out.println("Select your option or options" );
		System.out.println("Enter treatment:" ) ;
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in) ;
		String s[] = sc.nextLine().split(" ") ;
		sum = 500 ;
		for(int i = 0 ; i < s.length ; i++) {
			int a = Integer.parseInt(s[i]) ;
			//System.out.println(a + " " ) ; 	
			
			switch(a) {
			case 1 : sum = sum + 1000 ; break ;
			case 2 : sum = sum + 2000 ; break ;
			case 3 : sum = sum + 5000 ; break ; 
			
			}
		}
		//System.out.println("Inside treatment: " + sum ) ;	
	}
}
class Outpatient extends Inpatient{
	public static String pname ;
	public static String pcity ;
	public static void details()
	{
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in) ; 
		System.out.println("Enter Name:"  ) ;
		pname = sc.nextLine() ;
		System.out.println("Enter city:" ) ;
		pcity = sc.nextLine() ;
		Inpatient i = new Inpatient() ;
		i.Treatment() ;
		System.out.println("Final Bill " ) ;
		System.out.println(i.hname +" " +  i.hcity );
		System.out.println(pname + " " + pcity );
		System.out.println("Total Cost:" + i.sum  ) ;
	}
}
public class Execute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outpatient.details(); 
	}}