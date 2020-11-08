import java.util.Scanner ;
import java.lang.Math;
interface GeometricObject{
	void Perimeter() ;
	void Area() ;
}
interface ResizableObject{
	void resize();
}
class Circle implements GeometricObject{
	public double r , p , a ; 
	public void Perimeter() 
	{
		p = 2 * Math.PI * r ;   
		
	}
	public void Area()
	{
		a = Math.PI*r* r ;
		
	}
}
class ResizableCircle extends Circle implements ResizableObject{
	public double percent   ;

	@Override
	public void resize() {
		// TODO Auto-generated method stub
		r = (1- percent/100.0 )*r ; 
		super.Perimeter(); super.Area();
		}
	
}
public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in) ;
		ResizableCircle R = new ResizableCircle() ;
		System.out.println("Enter radius and percentage:") ;
		R.r = sc.nextDouble() ;
		R.percent = sc.nextDouble() ;
		R.Area();
		R.Perimeter(); 
		System.out.println("Before" );
		System.out.println("Area: " + R.a );
		System.out.println("Perimeter: " + R.p );
		R.resize();
		System.out.println("\nAfter" );
		System.out.println("Area: " + R.a );
		System.out.println("Perimeter: " + R.p );
		

	}

}
