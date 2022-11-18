import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len;
		Scanner input=new Scanner(System.in);
		len=input.nextInt();
		int []common=new int[len];
		for(int i=0; i<common.length; i++) {
			common[i]=input.nextInt();
		}
		System.out.print(sol(common));
		

	}
	public static int sol(int []common) {
		int answer;
		if(common.length<3) {
			return 0;
		}
		else if((common[2]-common[1])==(common[1]-common[0])) 
			answer=common[common.length-1]+(common[1]-common[0]);
		else {
			answer=common[common.length-1]*2;
		}
	
		return answer;
	}

}
