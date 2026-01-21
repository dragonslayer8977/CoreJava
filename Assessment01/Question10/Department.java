package Question10;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Department {
    static void main() {
        List<Employee> employeesList = new ArrayList<>();
        employeesList.add(new Employee("mahesh", "IT"));
        employeesList.add(new Employee("ganesh", "IT"));
        employeesList.add(new Employee("manoj", "IT"));
        employeesList.add(new Employee("venkat sir", "HR"));
        employeesList.add(new Employee("madhav sir", "campus recruiter"));

        Map<String, List<Employee>> byDept = employeesList.stream().collect(Collectors.groupingBy(Employee::getDept));
        for(Map.Entry<String, List<Employee>> e : byDept.entrySet()) {
            System.out.print(e.getKey() + " = ");
            e.getValue().forEach(ele -> System.out.print(ele.getName() + ", "));
            System.out.println();
        }

//        output:
//                campus recruiter = madhav sir,
//                HR = venkat sir,
//                IT = mahesh, ganesh, manoj,

    }
}
