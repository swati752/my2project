package moon;

import java.util.Scanner;

public class ifelsescsnner {
	public static void main(String[]args) {
		String gender;
		int age;
		System.out.println("enter your age");
		Scanner sc=new Scanner(System.in);
		age=sc.nextInt();
		
		System.out.println("enter your gender");
		gender=sc.next();
		if (age>21 && gender.equalsIgnoreCase("f")) {
			System.out.println("yes she is eligibe");
		}
		else {
			System.out.println("not eligible");
		}
		
	}

}
