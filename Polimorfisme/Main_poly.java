public class Main_poly{
	public static void main(String args[]){
		
		Bola b;
		
		System.out.println("\nVolume Bola berdasarkan Jari-Jari");
		System.out.println("==============================");
		
		b = new getVolumeByJariJari();		
		b.awal();			
		b.getVolume();
		
		System.out.println("\n\nVolume Bola berdasarkan Diameter");
		System.out.println("==============================");
		
		b = new getVolumeByDiameter();
		b.awal();	
		b.getVolume();
	}
}