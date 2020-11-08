import java.util.Scanner;
public class MinMax {
	static String minWord = "", maxWord ="" ;
	static void Minmax(String s)
	{
		int l = s.length() ;
		int si = 0 , ei= 0 ; // starting and ending of some string
		int minl = l , minstart = 0 , maxl = 0 , maxstart = 0 ;
		while (ei <= l )
		{
			if(ei < l && s.charAt(ei)!= ' ' )
			{
				ei++ ; // word length 
			}
			else
			{
				int wordl = ei - si ; //length of current word
				//System.out.println("ELse: " + (ei-si) ) ;
				if (wordl < minl) {
					minstart = si ; minl = wordl ;}
				if(wordl > maxl ) {
					maxstart = si ;	maxl = wordl ;}
				ei++ ; si = ei ;
			}
		}
		minWord = s.substring(minstart , (minstart+minl)) ;
		maxWord = s.substring(maxstart , (maxstart+maxl) ) ;
		
	}
	public static void main(String[] args ) 
	{
		String a = new String() ;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in) ;
		a = sc.nextLine() ;
		Minmax(a) ;
		System.out.println("Shortest word: " +minWord+ "\nLongest word: "+ maxWord);
		
	}
}
