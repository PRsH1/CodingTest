import java.util.*;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int total;
		
		Scanner scan=new Scanner(System.in);
		a=scan.nextInt();
		b=scan.nextInt();
		if(a<b) {
			total=gcd(b,a);
			System.out.println(total);
			System.out.print(lcm(a,b,total));
		}
		else {
			total=gcd(a,b);
			System.out.println(total);
			System.out.print(lcm(a,b,total));
		}
			
		
		

	}
	public static int gcd(int num1,int num2) {
		int result;
		if(num1%num2==0) {
			return num2;
		}
		else {
			result=num1%num2;
			return gcd(num2,result);
		}
		
	}
	public static int lcm(int num1,int num2,int gcd) {
		return num1*num2/gcd;
	}

}
