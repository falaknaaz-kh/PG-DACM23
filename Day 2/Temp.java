class Temp
{
	public static void main(String args[])
	{
		double cel = 37;
		double far = 87;
		
		double cel_to_far = (cel * 1.8) + 32;
		System.out.println(cel + " Celsius in Fahrenheit is " + cel_to_far);
		
		double far_to_cel = (far - 32) / 1.8;
		System.out.println(far + " Fahrenheit in Celsius is " + far_to_cel);
	}
}	