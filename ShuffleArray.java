import java.util.Arrays;

public class ShuffleArray {
	public static void main(String[] args) {
		int arr[] = new int[54];
		for (int a = 0; a < arr.length; a++) {
			arr[a] = a + 1;
			double b = Math.random() * 54 + 1;
			System.out.println(b);
			System.out.println(new Double(b).intValue());
		}
		System.out.println(Arrays.toString(arr));

		// 打乱
		shuffle(arr);
	}

	private static void shuffle(int[] arr) {
		for (int i = arr.length - 1; i >= 0; i--) {
			// 第i个和第i个之前的随机交换
			int j = 0;
			if (i == 0) {
				j = new Double(Math.random() * arr.length).intValue();
			} else {
				j = new Double(Math.random() * i + 1).intValue();
			}
			swap(arr, i, j);
		}
		System.out.println(Arrays.toString(arr));
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = 0;
		temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;

	}
}
