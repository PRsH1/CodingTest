
import java.io.IOException;
import java.util.*;



public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner input=new Scanner(System.in);
	
		StringBuffer str=new  StringBuffer();
		
		count=input.nextInt();
		String order;
		
		LinkedList list=new LinkedList();
	

	
		for(int i=0; i<count; i++) {
			order=input.next();
			switch(order) {
			case "push":
				int push=input.nextInt();
				list.addFirstNode(push);
				break;
			case "top":
				str.append(list.top()).append("\n");
				break;
			case "pop":
				str.append(list.pop()).append("\n");
				break;
			case "size":
				str.append(list.size()).append("\n");
				break;
			case "empty":
				str.append(list.empty()).append("\n");
				break;
			}
			
	
		}
		System.out.println(str);
		

	}

}
