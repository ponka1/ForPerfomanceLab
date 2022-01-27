package me.umar.task1;

public class Main {
	//task 1
	
	public static void main (String[] args) {
		int n = Integer.parseInt(args[0]);
		int m = Integer.parseInt(args[1]);
		Cycler cyc = new Cycler(n, m);
		
		do {
			cyc.getStep();
		}while(!cyc.isOnTheStart());
		System.out.println(cyc.getResult());
	}
}
