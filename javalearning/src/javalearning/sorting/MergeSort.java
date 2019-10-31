package javalearning.sorting;

public class MergeSort {

	public static void main(String[] args) {
			int []ar= {38,27,43,3,9,82,10};
			
	}
	
	public void mergesort(int []ar,int start,int end) {
		if(start<end) {
			int middle=(start+end)/2;
			mergesort(ar, start, middle);//
			mergesort(ar, middle+1, end);
			
			merge(ar,start,middle,end);
		}
	}

	private void merge(int[] ar, int start, int middle, int end) {
		
		
	}
	
}
