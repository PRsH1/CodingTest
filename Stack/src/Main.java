import java.util.*;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int push;
		String order;
		
		LinkedList list=new LinkedList();
		Scanner input=new Scanner(System.in);
		count=input.nextInt();
		for(int i=0; i<count; i++) {
			order=input.next();
			if(order=="push") {
				push=input.nextInt();
			}
		}
		

	}

}
