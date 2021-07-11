public class BinarySearch1 {
	public int binarySearch (int[]a, int target) {
		int left = 0;
		int right = a.length - 1;

		while (left <= right ) { // one element array can enter loop
			int mid = left + (right - left)/2;
			if (a[mid] == target) {
				return mid;
			} else if (a[mid] < target) {
				left = mid + 1; //avoid dead loop
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		int[] test1 = {1,2};
		int[][] test2 = {{1,3,4,6},{7,9,10,11},{14,17,19,20}};
		int[][] test3 = { {1, 2, 3}, {4, 5, 7}, {8, 9, 10} };
		BinarySearch1 p = new BinarySearch1();

        System.out.println(p.binarySearch(test1,4));
//		System.out.println(p.ifFind(test2,11));
//		System.out.println(Arrays.toString(p.search(test3, 6))); // print arrays this way
//		System.out.println(p.binarySearch2(new int[]{1,2,3,8,9},0,4,9));
//		System.out.println(p.closest(new int[]{1,2,3},2));
//		System.out.println(p.firstOccur(new int[]{1,2,2,2,3}, 2));
//		System.out.println(p.firstOccur(new int[]{2,2,2,2,2,2,8,13,13}, 2));
//		System.out.println(p.lastOccur(new int[]{2,2,2,2,2,2,8,13,13}, 2));
//		System.out.println(Arrays.toString(p.kClosest(new int[]{1,4,6,8}, 3, 3)));
//		System.out.println(Arrays.toString(p.kClosest(new int[]{1,2,3}, 2, 3)));
//		System.out.println(Arrays.toString(p.kClosest(new int[]{0,0,1,2,3,3,4,7,7,8}, 3, 3)));
//		System.out.println(p.smallestElementLargerThanTarget(new int[]{2,10,13,15,19,20,27,29,30,34,44,45,49,51,55,60,64}, 1));
//		System.out.println(p.search([1],2)); // 到底怎么pass in dictionary??

	}

}
