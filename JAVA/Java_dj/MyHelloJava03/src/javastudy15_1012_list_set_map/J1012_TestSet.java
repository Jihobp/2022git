package javastudy15_1012_list_set_map;

import java.util.HashSet;
import java.util.Set;

public class J1012_TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> employees = new HashSet<Employee>();
		employees.add(new Employee("안서준", "001"));
		employees.add(new Employee("안서준", "001"));
		employees.add(new Employee("이현민", "002"));
		employees.add(new Employee("오세룡", "007"));
		for (Employee employee : employees) {
			System.out.println(employee.getName());
			System.out.println(employee.getSabeon());
		}
	}

}
