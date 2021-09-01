package ch2;

import java.util.Scanner;

public class FibonacciUsingLoop {

	public static void main(String[] args) {
		// For some reason my code starts failing at 49.  However I now know how to do this stupid FivBSequence in Java
		long x = 1, repeatnum=94,y;
		double start = System.currentTimeMillis();
		System.out.println("Lets see when this code breaks? "
				+ "At what number does it start outputting negative numbers");
		for(x=1;x<repeatnum;++x)
		{
		
		long n1=0, n2=1, n3, i, count=x;
		//System.out.print("Please enter the limit for series");
		//Scanner scanner = new Scanner(System.in);
		//count = scanner.nextInt();
		System.out.println(" " + n1 + "\n" + " "+n2);
		for(i=0;i<count;++i) 
		//loop will start at 2 becuase the first two number are already known and a given
		{
			n3 = n1 + n2;
			System.out.println(" "+n3);
			n1 = n2;
			n2 = n3;
			
			
		}
		System.out.println("Time taken ==>"+(System.currentTimeMillis()-start));}
System.out.println("Time taken ==>"+(System.currentTimeMillis()-start));
	PrintWriter out = new PRintWriter(output.txt);
}
 
}
