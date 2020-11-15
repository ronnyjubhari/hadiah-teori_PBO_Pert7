import java.util.Scanner;

public class Main_inherit{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
				
		System.out.print("Masukkan jari-jari bola = ");
		double jari2 = input.nextDouble();		
		
		volumeBola vball = new volumeBola();
		vball.setJari(jari2);		
		vball.getVolume();
	}
}