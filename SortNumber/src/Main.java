import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int count;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		count=Integer.parseInt(br.readLine());
		int []number=new int[count];
		int []temp=new int[count];
		
		for(int i=0; i<number.length; i++) {
			number[i]=Integer.parseInt(br.readLine());
			
		}
		mergeSort(number,temp,0,number.length-1);
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
			
				
		}
		
	}
	public static void mergeSort(int arr[],int []temp,int start, int end ) {
		
		if(start<end) {
			int mid=(start+end)/2;
			mergeSort(arr,temp,start,mid);
			mergeSort(arr,temp,mid+1,end);
			merge(arr,temp,start,mid,end);
		}
	
		
	}
	public static void merge(int []arr,int[] temp, int start,int mid,int end) {
		for(int i=start; i<=end; i++) {
			temp[i]=arr[i];
		}
		int part1=start;
		int part2=mid+1;
		int index=start;
		while(part1<=mid && part2<=end) {
			if(temp[part1]<=temp[part2]) {
				arr[index]=temp[part1];
				part1++;
			}
			else {
				arr[index]=temp[part2];
				part2++;
			}
			index++;
			for(int i=0; i<=mid-part1; i++) {
				arr[index+i]=temp[part1+i];
			}
		}
	}

}
