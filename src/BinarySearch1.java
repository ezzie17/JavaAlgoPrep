public class BinarySearch1 {
	public int binarySearch1 (int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public int[] search (int[][] matrix, int target) {
		if (matrix == null && matrix[0] == null) {
			int[] result = {-1,-1};
			return result;
		}
		int r = matrix.length;
		int c = matrix[0].length;
		int left = 0;
		int right = r * c - 1;
		while (left <= right) {
			int mid = left + (right - left) /2;
			int row = mid / c;
			int col = mid % c;
			if (matrix[row][col] == target) {
				int[] result = {row, col};
				return result;
			} else if (matrix[row][col] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		int[] result = {-1,-1};
		return result;
	}



	public static void main(String[] args) {
		int[] test1 = {1,2};
		int[][] test2 = {{1,3,4,6},{7,9,10,11},{14,17,19,20}};
		int[][] test3 = { {1, 2, 3}, {4, 5, 7}, {8, 9, 10} };
		BinarySearch1 p = new BinarySearch1();
		System.out.println(p.binarySearch1(test1, 2));
	}

}
