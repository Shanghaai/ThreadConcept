package org.sahil.ThreadsScenerios;

public class Consumer extends Thread
{
	Producer pro;
	
	public Consumer(Producer p)
	{
		this.pro=p;
	}
	
	@Override
	public void run() {
		synchronized (pro.sb) {
			
			try {
				pro.sb.wait();
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			System.out.println("consumer starts cosuming the food");
			System.out.println(pro.sb);
			}
		}
}
