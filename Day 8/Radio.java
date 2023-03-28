class Radio
{
	String name;
	int station;
	String place;
	
	void print_details()
	{
		System.out.println(name);
		System.out.println(station);
		System.out.println(place);	
	}
	
	public static void main(String args[])
	{
		Radio rd = new Radio();
		rd.name = "FM";
		rd.station = 98;
		rd.place = "Kolkata";
		
		rd.print_details();
	}
}	