import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int arr[] = new int[54];
		for (int a = 0; a < arr.length; a++) {
			arr[a] = a + 1;
		}
		System.out.println(Arrays.toString(arr));
		
		binarySearch(arr,9);
		binarySearch(arr,10);
		binarySearch(arr,1);
		binarySearch(arr,53);
		binarySearch(arr,54);
		binarySearch(arr,27);
	}

	private static void binarySearch(int[] arr, int search) {
		int low=0;
		int high=arr.length-1;
		
		int count=0;
		while (low<=high) {
			count++;
			int midindex=(low+high)/2;
			int mid=arr[midindex];
			if(search==mid){
				System.out.println("查找次数="+count);
				System.out.println("索引位置midindex="+midindex);
				return ;
			}
			//因为 midindex这个位置 索引 ，不相等，所以。从这个索引前一个或者后一个出发继续找
			if(search<mid){
				high=midindex-1;
			}
			if(search>mid){
				low=midindex+1;
			}
		}
		
	}
}
