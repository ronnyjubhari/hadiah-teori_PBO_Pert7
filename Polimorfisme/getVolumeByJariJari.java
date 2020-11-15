import java.util.Scanner;

class getVolumeByJariJari extends Bola{
	private double jari2;
		 	
	void awal(){
		Scanner input = new Scanner(System.in);
		System.out.print("Masukkan jari-jari bola = ");
		jari2 = input.nextDouble();	
	}
	
	void getVolume(){
		volume = 4.0/3.0 * phi * jari2 * jari2 * jari2;
		System.out.println("Volume bola dengan Jari-Jari = " +volume + " cm3");
	}
}