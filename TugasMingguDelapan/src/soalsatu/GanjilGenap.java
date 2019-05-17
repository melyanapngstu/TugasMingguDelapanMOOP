package soalsatu;
import java.util.Scanner;

public class GanjilGenap implements Runnable {
		
	Scanner scan = new Scanner(System.in);
	
	static int angka;
	
	@Override
	public void run() {
		
		System.out.print("Masukan angka: ");
		angka = scan.nextInt(); scan.nextLine();

		if(angka%2 == 0) {
			System.out.println("Angka Genap");
		}else{
			System.out.println("Angka Ganjil");
		}
		
	}
	
}
