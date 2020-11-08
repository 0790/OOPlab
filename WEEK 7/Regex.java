import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regex {
	String s;
    Regex(String str)
    {
        s=str;
    }
    public void identify(String s){
        String red_date="^[0-3]?[0-9]/[0-3]?[0-9]/(?:[0-9]{2})?[0-9]{2}$";
        String reg_double="^[0-9]+\\.[0-9]+";
        String reg_int = "[+-]?[0-9]+";
        Pattern p = Pattern.compile(reg_int);
        Pattern p1= Pattern.compile(red_date);
        Pattern p2= Pattern.compile(reg_double);
        Matcher m1 = p.matcher(s);
        Matcher m2 = p1.matcher(s);
        Matcher m3 = p2.matcher(s);
        Boolean b1 = m1.matches() ;
        Boolean b2 = m2.matches() ;
        Boolean b3 = m3.matches() ;
        System.out.println(b1 + " "+ b2 + " " +  b3 ) ;
     if(b1 == true) {System.out.println("It is an integer") ;} 
     else if(b3==true) {System.out.println("It is a double") ;}
     else if(b2==true) {System.out.println("It is a date") ;}
     else  {System.out.println("It is a string") ;}

    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter: ") ;
        String str= sc.nextLine();
        Regex r= new Regex(str);
        r.identify(str);
 

	}

}
