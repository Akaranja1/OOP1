package com.company;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Dear student, kindly enter your  scores: ");
		int Kcse_grade = input.nextInt();
		int questions_score = input.nextInt();
		int confidence_score = input.nextInt();

		if (Kcse_grade >= 65 && (questions_score >= 6 || confidence_score >= 5)) {
			System.out.println("You have successfully been admitted to the University!");
		} else {
			System.out.println("You have failed to qualify and hence been rejected");
		}
	}
}