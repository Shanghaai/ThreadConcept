package InterviewConcept;

public class ABC extends Thread
{

	public void x1(int x,int y)
	{
		System.out.println("x value : "+x+"y value: "+y);
	}
	@Override
	public void run() {
	
		System.out.println("ye dekh..it wont execute the X1 method");
	
	}

	public static void main(String[] args) {
		ABC a1 = new ABC();
		ABC a2 = new ABC();
		
		Thread t1 = new Thread(a1);
		Thread t2 = new Thread(a2);
		
		t1.start();
		t2.start();
		
		
	}


}

