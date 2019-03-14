public class SubArraySum {

	public static void main(String args[]) {
		SubArraySum ts = new SubArraySum();
		int[] a = { 1, -2, 3, -4, 7, 8, 9, -1, 3, -9 };
		// int[] a={1,-1,3,7,8,9,-1,3,-9};
		// int[] a = { 11, 1, -11, -7, -8, 1, -1, 9, 1, -1, 1 };
		System.out.println(ts.findGreatestSumOfSubArray(a));
		System.out.println(ts.findGreatestSumOfSubArray2(a));
	}

	public int findGreatestSumOfSubArray(int[] array) {

		if (array == null || (array.length == 1 && array[0] <= 0))
			return 0;

		int cur = array[0];
		int sum = array[0];

		int l = 0, u = 0;
		for (int i = 1; i < array.length; i++) {
			// 如果小于0 的话，设置为0，直接从第i个开始算。如果不小于0 累加上，因为 肯定是正数，加上总和会变大。
			if (cur < 0) {
				cur = 0;
			}
			cur = cur + array[i];
			// 如果加上的数比总和大，此时需要判断，头尾需不要移动。
			if (sum < cur) {
				// 比之前总数大，但是小于了当前数，说明，左边的位置该移动了。
				if (cur <= array[i]) {
					l = i;
				}
				// 如果加上当前数，比之前总数大，需要替换最大值，
				sum = cur;
				u = i;
			}
		}
		System.out.println("l=" + l + "-------u=" + u);
		return sum;
	}

	public int findGreatestSumOfSubArray2(int[] nums) {
		if (nums == null) {
			return 0;
		}
		if (nums.length == 1) {
			return nums[0];
		}
		int cur = nums[0];
		int sum = nums[0];
		int l = 0, u = 0;
		for (int i = 1; i < nums.length; i++) {

			cur = max(cur + nums[i], nums[i]);
			// 头尾该移动了，最大数需要变。
			if (sum < cur) {
				// 头移动
				if (cur <= nums[i]) {
					l = i;
				}
				sum = cur;
				//尾巴移动
				u = i;
			}
		}
		System.out.println("l=" + l + "-------u=" + u);
		return sum;

	}

	public static int max(int a, int b) {
		return (a >= b) ? a : b;
	}
}
