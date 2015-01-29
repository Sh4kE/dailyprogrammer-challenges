package easy.challenge1;

import java.util.Scanner;

public class Challenge1 {
	
	private void start(){
		Scanner in = new Scanner(System.in);
		System.out.print("Your name: ");
		String name = in.next();
		System.out.print("Your age: ");
		int age = in.nextInt();
		System.out.print("Your reddit username: ");
		String reddit = in.next();
		System.out.println("your name is " + name + ", you are " + age + " years old, and your username is " + reddit);
	}

	public static void main(String args[]){
		new Challenge1().start();
	}
}
