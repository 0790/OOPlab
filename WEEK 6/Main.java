import java.util.Scanner ;
interface movableObject{
	void moveUp() ;
	void moveDown() ;
	void moveLeft() ;
	void moveRight() ;
}
class movablePoint implements movableObject{
	int x, dx, y, dy ;
	public movablePoint(int x, int y, int dx, int dy)
	{
		
		this.x = x ;
		this.y = y ;
		this.dx = dx ;
		this.dy = dy ; 
		
	}

	@Override
	public void moveUp() {
		// TODO Auto-generated method stub
		this.y = this.y+this.dy ;
 	}

	@Override
	public void moveDown() {
		// TODO Auto-generated method stub
		
		this.y = this.y - this.dy ;
	}

	@Override
	public void moveLeft() {
		// TODO Auto-generated method stub
		this.x = this.x - this.dx ;
	}

	@Override
	public void moveRight() {
		// TODO Auto-generated method stub
		this.x = this.x+ this.dx ;
	}

	
}
class movableRectangle extends movablePoint{
	int x1,x2,y1,y2,dx,dy ;
	movablePoint bottomLeft ;
	movablePoint topRight;
	
	public movableRectangle()
	{
		super(0,0,0,0) ;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in) ; 
		System.out.println("Enter 6 coordinates") ;
		x1 = sc.nextInt() ;
		x2 = sc.nextInt() ;		
		y1 = sc.nextInt() ;
		y2 = sc.nextInt() ;
		dx = sc.nextInt() ;
		dy = sc.nextInt() ; 
		//System.out.println("Assigned" + x1+x2+y1+y2) ; 
		bottomLeft = new movablePoint(x1,y1,dx,dy) ;  
		topRight= new movablePoint(x2,y2,dx,dy) ;
		
	}
	

		
		public void moveUp() {
			
			bottomLeft.moveUp();
			topRight.moveUp( ) ;
			y1 = bottomLeft.y ;
			y2 = topRight.y ;
			
			
			
		}
		public void moveDown() {
			bottomLeft.moveDown();
			topRight.moveDown() ;
			y1 = bottomLeft.y ;
			y2 = topRight.y ;
			
		}
		public void moveLeft() {
			bottomLeft.moveLeft();
			topRight.moveLeft( ) ;
			x1 = bottomLeft.x ;
			x2 = topRight.x ;
			
		}
		
		public void moveRight() {
			bottomLeft.moveRight();
			topRight.moveRight() ;
			x1 = bottomLeft.x ;
			x2 = topRight.x ;
			
		}
	
	
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		movableRectangle r = new movableRectangle() ;
		r.moveUp();		
		System.out.println("\nmoveUp\n" + r.y1 + "\n" + r.y2 ) ;
		r.moveLeft() ;
		System.out.println("\nmoveLeft\n" + r.x1 + "\n" + r.x2 ) ;
		r.moveDown() ;
		System.out.println("\nmoveDown\n" + r.y1 + "\n" + r.y2 ) ;
		r.moveRight() ; 
		System.out.println("\nmoveRight\n" + r.x1 + "\n" + r.x2 ) ;
	}

}
