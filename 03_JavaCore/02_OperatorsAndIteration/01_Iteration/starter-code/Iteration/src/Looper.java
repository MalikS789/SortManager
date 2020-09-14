public class Looper {
	public void forLoopPrinter(int end) {
		for (int i = 0; i <= end; i++) {
			System.out.println(i);
		}
	}

	public void whileLoopPrinter(int end) {
		int start = 0;
		while (start <= end) {
			System.out.println(start);
			start++;
		}
	}

	public void doWhileLoopPrinter(int end) {
		int start = 0;
		do {
			System.out.println(start);
			start++;
		} while (start <= end);
	}
	
	public void enhacnedLoop(int[] numberList) {
		for (int number:numberList) {
			System.out.println(number);
		}
	}
}
