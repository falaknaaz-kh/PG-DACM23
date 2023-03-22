class Compound
{
	public static void main(String args[])
	{
		double P = 50000000L;
		System.out.println(P);
		double yrs = 5.0;
		double rate = 1.0 + (10.75 / 100.0);
		
		double A = P * (Math.pow(rate, yrs));
		System.out.println(" A = " + A);
		double CI = A - P;
	
		System.out.println(" CI = " + CI);
	}
}	