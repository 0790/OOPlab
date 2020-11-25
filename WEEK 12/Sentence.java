import java.io.File;
import java.util.*;

public class Sentence {
	static String[] SENTENCE; 

	   public static void main(String []args) throws Exception{

	       Scanner sentence = new Scanner(new File("input1.txt"));
	       ArrayList<String> sentenceList = new ArrayList<String>();
	       String longestword= "" ;
	       String shortestword ="" ;
	       ArrayList<String> longestwords = new ArrayList<String>();
	       ArrayList<String> shortestwords = new ArrayList<String>();
	       while (sentence.hasNextLine())
	       {
	           sentenceList.add(sentence.nextLine());
	       }

	       sentence.close();

	       String[] sentenceArray = sentenceList.toArray(new String[sentenceList.size()]);

	       for (int r=0;r<sentenceArray.length;r++)
	       {
	           SENTENCE = sentenceArray[r].split("(?<=[.!?])*");
	           shortestword="" ; longestword ="" ;
	           String x ="" ,s ;
	           int  minl = SENTENCE.length  , maxl =0 , p ;  
	           char ch ;
	           for (int i=0;i<SENTENCE.length;i++)
	           {
	        	 // s = SENTENCE[i] ;
	        	   for(int k = 0 ; k < SENTENCE[i].length() ; k++ )
	        	   { ch=SENTENCE[i].charAt(k); //extracting characters of the string one at a time
			               if(ch!=' ')
			               {
			                   x=x+ch; //adding characters to form word if character is not space
			               }
			               else
			               {
			                   p=x.length();
			    
			                   if(p<minl) //checking for minimum length
			                   {
			                       minl=p;
			                       shortestword=x;
			                   }
			    
			                   if(p>maxl) //checking for maximum length
			                   {
			                       maxl=p;
			                       longestword=x;
			                   }
			                   x=""; //emptying the temporary variable to store next word
			               }
			              
			        	   
	           }
	        	   
	        	   
	           }
	           shortestwords.add(shortestword) ;
        	   longestwords.add(longestword) ;

	       }
	       System.out.printf("Shortest words: \n");
	       Iterator<String> iterator = shortestwords.iterator();
	       while(iterator.hasNext())
	       {
	    	   System.out.printf(iterator.next()) ;
	    	   System.out.printf("\n") ;
	       }
	       System.out.printf("Longest words: \n" );
	       iterator = longestwords.iterator() ;
	       while(iterator.hasNext())
	       {
	    	   System.out.printf(iterator.next()) ;
	    	   System.out.printf("\n") ;
	       }
	   }
}
