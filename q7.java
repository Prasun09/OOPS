package OOPS;
abstract class Shape{
	abstract void area();
}
	class circle extends Shape{
		int r;
		circle(int r)
		{
			this.r=r;
		} 
	void area()
	{
		System.out.println("Area of circle :"+3.14*r*r);
	}
		
	}
	class Triangle extends Shape
	{
		int b;
		int h;
		Triangle(int h,int b)
		{
			this.h=h;
			this.b=b;
		}
		void area()
		{
			System.out.println("Area of Triangle: "+0.5*b*h);
		}
		
	}
	class Square extends Shape
	{
		int s;
		Square(int s)
		{
			this.s=s;
		}
		void area()
		{
			System.out.println("Area of Sqaure: "+s*s);
			
		}
	}
	
	
	
	
	

public class q7 {

	public static void main(String[] args) {
		Shape s=new circle(10);
		s.area();
		s=new Triangle(10,10);
		s.area();
		s=new Square(10);
		s.area();
	
	
	}

}
