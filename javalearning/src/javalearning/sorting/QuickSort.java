package javalearning.sorting;

public class QuickSort {
	
	public static void main(String[] args) {
		int ar[]= {12,11,13,7,9};//12,1,13,7,9
		QuickSort quickSort= new QuickSort();
		quickSort.sorting(ar, 0, ar.length-1);
		for(int a:ar) {
			System.out.print(a+" ");
		}
		
	}
	
	public void sorting(int ar[],int begin,int end) {
		
		if(begin<end) {
			int pat=partition(ar,begin,end);
			sorting(ar, begin, pat-1);
			sorting(ar,pat+1,end);
		}
		
	}

	private int partition(int[] ar, int begin, int end) {
		int i=begin-1;
		int pivot=ar[end];
		for(int j=begin;j<end;j++) {
			
			if(ar[j]<pivot) {
				i++;
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;
			}
		}
		int temp=ar[i+1];
		ar[i+1]=pivot;
		ar[end]=temp;
		return i+1;
	}
}
