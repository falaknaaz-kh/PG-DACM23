class Actor
{
	String name;
	int age;
	String debut_movie;
	
	void print_details()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(debut_movie);	
	}
	
	public static void main(String args[])
	{
		Actor ac = new Actor();
		ac.name = "Imran Khan";
		ac.age = 34;
		ac.debut_movie = "Luck";
		
		ac.print_details();
		
	}
}	