
public class LinkedList {
	private Node head;
	private class Node{
		Node link;
		int temp;
		Node(int temp){
			this.temp=temp;
		}
	}
	public void addFirstNode(int number) {
		Node d=new Node(number);
		d.link=head;
		head=d;
	}
	public int top() {
		if(head==null) {
			return -1;
		}
		else
			return head.temp;
	}
	public int size() {
		Node count=head;
		int number = 0;
		if(count==null)
			return 0;
		while(count!=null) {
			count=count.link;
			number+=1;
		}
		return number;
	}
	public int empty() {
		if(head==null) {
			return 1;
		}
		else 
			return 0;
	}
	public int pop() {
		int temp=0;
		if(head==null)
			return -1;
		
		temp=head.temp;
		Node pop=head;
		head=pop.link;
		return temp;
	}


}
