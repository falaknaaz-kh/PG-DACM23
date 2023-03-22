class MaxMin
{
	
	public static void main(String args[])
	{
	int a, b, c;
	a = 12;
	b = 3;
	c = 11;
	
	int max, min;
	
	max = ((a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c));
	System.out.println("Maximun numnber is " + max);
	
	min = (a < b) ? (a < c ? a : c) : (b < c ? b : c);
	System.out.println("Minimun numnber is " + min);
	}
}	