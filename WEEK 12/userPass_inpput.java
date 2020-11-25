
import java.io.* ;
import java.util.*;
import java.util.regex.Pattern;
class userPass_input 
{
  public static void main(String args[]) throws IOException
  {
    File f = new File("output1.txt");
    if(!f.exists())
      f.createNewFile();
    BufferedWriter  fin = new BufferedWriter(new FileWriter(f, true));
    Scanner sc = new Scanner(System.in);
    String name, ph;
  
	do
	{
		System.out.print("Enter Name: ");
		name = sc.nextLine();
		if(!Pattern.matches("[A-Za-z]+", name))
			System.out.println("Please input valid name");
	}while(!Pattern.matches("[A-Za-z]+", name));
	do
	{
		System.out.print("Enter Phone no: ");
		ph = sc.nextLine();
		if(!Pattern.matches("[0-9]{10}", ph))
			System.out.println("Please input valid phone no.");
	}while(!Pattern.matches("[0-9]{10}", ph));
	fin.write(name + "-" + ph + "\n");
	System.out.println("Details entered in file") ;
    fin.close();
  }
}
