package soaldua;

public class Fibonacci extends Thread {

	int angka1 = 0;
	int angka2 = 1;
	int fibonacci;
	
	@Override
	public void run() {
		
		for(int i = 1; i <= 20; i++)
		{
			fibonacci = angka1 + angka2;
			angka1 = angka2;
			angka2 = fibonacci;
			
			System.out.println("Fibonacci " + i + " = " + fibonacci);
		}

	}
	
}