package org.sahil.Threads;

import java.util.Collections;
import java.util.Scanner;

public class HNYClient 
{
	public static void main(String[] args) {
	HappyNewYear d1 = new HappyNewYear();
	Scanner sc  = new Scanner(System.in);
	System.out.println("Your Name Please ?");
	String name = sc.nextLine();
	DisplayThread t1  =new DisplayThread(d1, name);
	t1.start();
	sc.close();
 }
}