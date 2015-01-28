package seng691z.assignment.question1;

public class FibonacciLookup {
	
	public FibonacciLookup(){}
	
	public String fibStart(long n){
		if(n<0){
			return "Error";
		}
		else{
			return Long.toString(recFib(n));
		}
	}
	
	public static long recFib(final long n)
	{
		if(n==0){
			return 0;
		}
		else if(n==1){
			return 1;
		}
		else
			return recFib(n-1) + recFib(n-2);
	}
}
