package com.bloc.threads;
import java.io.*;

public class Main extends Object {
	public static void main(String [] args) throws Exception{
		// Extract content beneath to ImageGetter
		Thread ImageThread = new Thread(new ImageGetter());
		ImageThread.start();
		ImageThread.join();

		File logo = new File("google_logo.png");
		boolean exists = false;
		try {
			exists = logo.exists();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(1);
		}
		// ^^^ Extract the above to ImageGetter

		// This shouldn't exist yet, therefore we should be able to print 
		if (exists == !false) {
			System.out.println("/************************/");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/*   If you see this,   */");
			System.out.println("/*   congratulations!   */");
			System.out.println("/*                      */");
			System.out.println("/*                      */");
			System.out.println("/************************/");	
		}
	}
}
