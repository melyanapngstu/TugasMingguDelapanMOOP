package soaldua;

public class Demo {

	public Demo(){
		Prime prime = new Prime();
		Fibonacci fibonacci = new Fibonacci();
		
		prime.start();
		
		try {
			Thread.sleep(60000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		fibonacci.start();
	}
	
	public static void main(String[] args) {
		new Demo();
	}

}
