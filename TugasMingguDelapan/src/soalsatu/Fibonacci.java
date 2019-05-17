package soalsatu;
import soalsatu.GanjilGenap;

public class Fibonacci implements Runnable {
	
	int angka;
	int angka1 = 0;
	int angka2 = 1;
	int fibonacci;
	
	@Override
	public void run() {

		while(fibonacci < GanjilGenap.angka) {
			fibonacci = angka1 + angka2;
			angka1 = angka2;
			angka2 = fibonacci;
		}

		if(GanjilGenap.angka == fibonacci) {
			System.out.println("Angka Fibonacci");
		}else{
			System.out.println("Bukan Angka Fibonacci");
		}
	}
}
