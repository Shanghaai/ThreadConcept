package org.sahil.Threads;
import java.io.*;
public class ThreadTerminateMain
{
	public static void main(String[] args) throws IOException
	{
		ThreadTerminate s1 = new ThreadTerminate();
		Thread t1  = new Thread(s1);
		t1.start();

		System.in.read();
		s1.stop = true;
	}
}

 




