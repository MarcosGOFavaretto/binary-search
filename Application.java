import java.util.stream.IntStream;

class Application {

	public static void main(String[] args) {

		int[] myListOfInts = IntStream.rangeClosed(0, 1000000).toArray();
		int goal = Integer.valueOf(args[0]);

		long initialTime = System.currentTimeMillis();
		System.out.println(recursiveSearch(myListOfInts, goal));
		long executionRecursive = System.currentTimeMillis() - initialTime;
		System.out.println("Recursive: " + executionRecursive);

		initialTime = System.currentTimeMillis();
		System.out.println(binarySearch(myListOfInts, goal));
		long executionBinary = System.currentTimeMillis() - initialTime;
		System.out.println("Binary: " + executionBinary);

	}

	/**
	 * 1 3 4 6 8 12 13
	 * 
	 * @param source
	 * @param goal
	 * @return
	 */
	private static int binarySearch(int[] source, int goal) {

		int low = 0;
		int high = source.length - 1;

		while (low <= high) {

			int middleIndex = (low + high) / 2;
			int middleTerm = source[middleIndex];

			if (middleTerm == goal) {
				return middleIndex;
			} else if (middleTerm > goal) {
				high = middleIndex - 1;
			} else {
				low = middleIndex + 1;
			}

		}

		return -1;
	}

	private static int recursiveSearch(int[] source, int goal) {

		for (int i = 0; i < source.length; i++) {
			if (source[i] == goal) {
				return i;
			}
		}

		return -1;
	}
}
