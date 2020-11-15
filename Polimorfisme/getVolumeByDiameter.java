import java.util.Scanner;

class getVolumeByDiameter extends Bola{
	private double diameter;	
	
	void awal(){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan diameter bola = ");
		diameter = input.nextDouble();	
	}
	
	void getVolume(){
		volume = 1.0/6.0 * phi * diameter * diameter * diameter;
		System.out.println("Volume bola dengan diameter = " +volume + " cm3");
	}
}