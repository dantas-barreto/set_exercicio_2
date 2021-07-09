package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.StudentEntry;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Set<StudentEntry> set = new HashSet<>();
		
		System.out.print("How many students for course A? ");
		int students = sc.nextInt();
				
		for (int i = 0; i < students; i++) {
			int userCode = sc.nextInt();
			set.add(new StudentEntry(userCode));
		}
		
		System.out.print("How many students for course B? ");
		students = sc.nextInt();
		
		for (int i = 0; i < students; i++) {
			int userCode = sc.nextInt();
			set.add(new StudentEntry(userCode));
		}
		
		System.out.print("How many students for course C? ");
		students = sc.nextInt();
		
		for (int i = 0; i < students; i++) {
			int userCode = sc.nextInt();
			set.add(new StudentEntry(userCode));
		}
		
		System.out.println("Total students: " + set.size());
	}

}
