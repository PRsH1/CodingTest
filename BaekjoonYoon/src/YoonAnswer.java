import java.util.*;
public class YoonAnswer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yoon=0;
		Scanner input=new Scanner(System.in);
		yoon=input.nextInt();
		while(true) {
			if(yoon%4==0) {
				if(yoon%100==0) {
					if(yoon%400==0) {
						System.out.print(1);
						break;
					}
					else {
						System.out.print(0);
						break;
					}
				}
				System.out.print(1);
				break;
				
			}
			System.out.print(0);
			break;
			
		}
		

	}

}
