package soalsatu;

public class Demo {

	public Demo(){
		Thread ganjilgenap = new Thread(new GanjilGenap());
		Thread fibonacci = new Thread(new Fibonacci());
		
		ganjilgenap.start();
		
		try {
			Thread.sleep(30000);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		fibonacci.start();
	}
	
	public static void main(String[] args) {
		new Demo();
	}

}
