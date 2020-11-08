import java.util.Scanner; 

public class BMI {
	double w ;
	double h ;
	double bmi ;
	public BMI(double w , double h )
	{
		this.w = w ;
		this.h = h ;
		this.bmi = w/(h*h) ;
		
	}
	void check() 
	{
		if(this.bmi < 15) System.out.print("Starvation") ;
		else if(this.bmi <17.5)System.out.print("Anorexic") ;
		else if(this.bmi <18.5)System.out.print("Underweight") ;
		else if(this.bmi <25)System.out.print("Ideal") ;
		else if(this.bmi <30)System.out.print("Overweight") ;
		else if(this.bmi <40)System.out.print("Obese") ;
		else System.out.print("Morbidly Obese") ;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		System.out.print("Weight: ") ;
		double weight = sc.nextDouble() ;
		System.out.print("Height: ") ;
		double height = sc.nextDouble() ;
		BMI b= new BMI(weight,height) ; 
		b.check() ;
		

	}

}
