package OOPS;
class Product{
	private int pid;
	private double price;
	private static double tot_amout=0;
	public Product(int n,double p) {
		pid=n;
		price=p;
		tot_amout+=price;
	}
	public void display() {
		System.out.println(pid+" "+price);
	}
	public static double gettotalamount(){
		return tot_amout;
	}

}
public class q2 {

	public static void main(String[] args) {
		Product p=new Product(5,10);
		Product p1=new Product(2,4);
		Product p2=new Product(1,20);
		Product p3=new Product(4,25);
		Product p4=new Product(7,15);
		//System.out.println(tot_amout);
		
		p.display();
		p1.display();
		p2.display();
		p3.display();
		p4.display();
		System.out.println(Product.gettotalamount());
		
	}

}
