class Gross
{
   public static void main(String args[])
   {
     double basic = 10000.8989009;
	 double TA = 5600.6778;
	 double DA = 0.14 * basic;	 
	 double petrol = 7000.3443553546;
	 double tax = (1.76 * DA) / 100;
	 
	 double gross_sal = basic + TA + DA + petrol - tax;
	 
	 System.out.println("Gross Salary = " +gross_sal);
   }
}	