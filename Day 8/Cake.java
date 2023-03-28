class Cake
{
	String name;
	int layers;
	String add_fruits;
	
	Cake(int ly)
	{
		name = "Black Forest Cake";
		layers = ly;
		add_fruits = "Strawberry";
	}
	
	void print_details()
	{
		System.out.println(name);
		System.out.println(layers);
		System.out.println(add_fruits);	
	}
	
	static void pp()
	{
		System.out.println("Ho");
	}
	
	public static void main(String args[])
	{
		Cake ck = new Cake(10);

		ck.print_details();
		pp();
	}
}	