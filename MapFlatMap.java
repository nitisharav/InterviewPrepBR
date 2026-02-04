
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        //use this when you have unique keys
        Map<Integer, Employee> map= employees.stream().collect(Collectors.toMap(Employee::getId, e->e));
        //handeling duplicate keys, empployees having same id
       Map<Integer, Employee> map= employees.stream().collect(Collectors.toMap(Employee::getId, e->e, (e1, e2)-> e1)); 
       
       //custom map
       Map<Integer, Employee> map= employees.stream().collect(Collectors.toMap(Employee::getId, e->e, (e1, e2)-> e1, LinkedHashMap::new)); 
       
       //we have list of department, where each department have list employee-> use flatmap
       
       List<Employee> empList= departments.stream().flatMap(d->d.getEmployees().stream()).toList();
       
       List<Employee> empList= departments.stream().flatMap(d->d.getEmployees().stream()).toList();
    }
}
class Employee {
    private int id;
    private String name;
    private String dept;
}
class Department {
    List<Employee>
}
