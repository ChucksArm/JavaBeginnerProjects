package helloWorld;
import java.util.Scanner;

public class FibRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = 0;
		while (true) {
			double start = System.currentTimeMillis();
			double time_Taken = (System.currentTimeMillis()- start);
			System.out.println("#" + index +": " + fibonacci(index) + " Time taken ==>"+(System.currentTimeMillis()-start));
			// System.out.println();
			index++;
		}

	}
	public static long fibonacci(long i) {
		if (i == 0) return 0;
		if (i <= 2) return 1;
		
		long fibterm = fibonacci(i - 1) + fibonacci(i - 2);
		return fibterm;
	}

}
