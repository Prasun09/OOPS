package OOPS;
class Complex{
	int real;
	int img;
	Complex(){
		
	}
	Complex(int real,int img){
		this.real=real;
		this.img=img;
	}
	void display() {
		System.out.println(real+" + i"+img);
	}
	Complex add(Complex c1,Complex c2) {
		Complex temp=new Complex();
		temp.real=c1.real+c2.real;
		temp.img=c1.img+c2.img;
		return temp;
		
		
	}
	
}
public class q3 {

	public static void main(String[] args) {
		Complex c=new Complex(10,20);
		Complex c1=new Complex(20,30);
		Complex c3=new Complex();
		c3=c1.add(c1, c);
		
		c1.display();
		c.display(); 
		c3.display();
		
		
		
		
		
		
	}

}
