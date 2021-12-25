package com.csi.basicprogram;

public class HashCodeExample {
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee(121,"pratibha");
		Employee e2 = new Employee(121,"pratibha");
		
		System.out.println("employee name "+e1.empName);
		System.out.println("emplyee id "+e1.regNo);
		int a= e1.hashCode();
		int b = e2.hashCode();
		System.out.println("hashcode of emp1 "+a);
		System.out.println("hashcode of emp2 "+b);
		System.out.println("comparing object e1 and e2 "+e1.equals(e2));
		
	}
	

}
