package org.abs;

import java.util.Scanner;

public class EmployeeChild  implements EmployeeRule {
	
	public  void empSalary() {
		System.out.println();
	}
	public void empName() {
		System.out.println("hii");
	}
	
		public static void main(String[] args) {
			Scanner get=new Scanner(System.in);
			System.out.println("Please enter your name");
			String empNames=get.nextLine();
			System.out.println(empNames);
			
			get.empSalary();
		}
		@Override
		public void empNoticePeriod() {
			
		
		
	}


}