class volumeBola extends Bola{
	private final double phi = 3.14;
	private double volume;
		
	void getVolume(){
		volume = 4.0/3.0 * phi * jari2 * jari2 * jari2;
		System.out.println("\nVolume bola = " + volume + " cm3");
	}
}