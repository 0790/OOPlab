import java.util.Scanner ;
class Shape{
	public double area ;
	public void display()
	{
		System.out.println("Area of a " + this.getClass().getSimpleName() + " " + area ) ;
	}
}
class Circle extends Shape{
	double radius;
	public Circle(double r){
		this.radius = r ;
		super.area = Math.PI* radius*radius ;
	}
}
class Rectangle extends Shape{
	double length,breadth ;
	public Rectangle(double l , double  b) {
		this.length = l ; this.breadth= b ;
		super.area = length*breadth ; 
	}
}
class Triangle extends Shape{
	double base, height;
	public Triangle(double b, double h)
	{
		this.base = b ; this.height = h ;
		super.area = 0.5*base*height ;
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in) ;
		System.out.println("1. Circle \n2. Rectangle \n3.Triangle") ;
		
		System.out.println("Choose the number to which you want to calculate the area:");
		int a = sc.nextInt() ; double r , l , b ;
		
		switch(a)
		{
		case 1 : {
			System.out.println("Enter Radius:") ;
			r = sc.nextDouble() ;
			Circle c = new Circle(r) ;
			c.display(); 
			}break ;
			
		case 2 : {
			System.out.println("Enter Length:") ;
			l = sc.nextDouble() ;
			System.out.println("Enter Breadth:") ;
			b = sc.nextDouble() ;
			Rectangle  c = new Rectangle(l,b) ;
			c.display(); 
			}break ;
			
		case 3 : {
			System.out.println("Enter Base:") ;
			l = sc.nextDouble() ;
			System.out.println("Enter Heigth:") ;
			b = sc.nextDouble() ;
			Triangle  c = new Triangle(l,b) ;
			c.display(); 
			}break ;
		}
	}

}
