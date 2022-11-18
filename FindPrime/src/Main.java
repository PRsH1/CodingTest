import java.util.*;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tryCount;
		int primeCount=0;
		Scanner input=new Scanner(System.in);
		tryCount=input.nextInt();
		int[] primeArray=new int[tryCount];
		for(int i=0; i<primeArray.length; i++) {
			primeArray[i]=input.nextInt();
		}
		
		for(int i=0; i<tryCount; i++) {
			for(int j=2; j<=primeArray[i]; j++) {
				if(primeArray[i]==0 || primeArray[i]==1)
					break;
				else if(primeArray[i]==j) {
					primeCount++;
					break;
				}
				else if(primeArray[i]%j==0) {
					break;
				}

			}
		}
		System.out.print(primeCount);

	}

}
