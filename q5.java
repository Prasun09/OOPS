
package OOPS;
import java.util.Scanner;
class product1
{
	int pid;
	double price;
	static double tot_price=0;
	 product1(int pid,double price)
	 {
		 this.pid=pid;
		 this.price=price;
		 tot_price+=price;
	 }
	 double getdata() 
	 {
		return tot_price; 
	 }
	 void  display() {
		 System.out.println(pid+" "+price);
	 }
}



public class q5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of items: ");
		int n=sc.nextInt();
		product1 []ar=new product1[n];
		System.out.println("Enter details: ");
		for(int i=0;i<ar.length;i++)
		{
			int a=sc.nextInt();
			int b=sc.nextInt();
			ar[i]=new product1(a,b);
		}
		for(int i=0;i<ar.length;i++)
		{
			ar[i].display();
		}
	System.out.println("Total amount: "+ar[0].getdata() );
	}

}

