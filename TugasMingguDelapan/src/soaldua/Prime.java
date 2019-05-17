package soaldua;

public class Prime extends Thread {

	int jumlah;
	
	@Override
	public void run() {

		for(int i = 1; i <= 31; i++)
		{
			for(int j = 2; j < i; j++)
			{
				if(i%j == 0)
				{
					jumlah = 0;
					break;
				} else {
					jumlah = 1;
				}
			}
			if(jumlah == 1)
			{	
				System.out.println("Prime " + i);
			}
		}
	}
	
}
