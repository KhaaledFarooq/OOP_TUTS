public class EmployeeTester {
    public static void main (String[] args){
        Employee emp1 = new Employee("John",1000);
        Employee emp2 = new Employee("Ann",5550);
        System.out.println(emp1.getName()+" : "+emp1.getSalary());
        System.out.println(emp2.getName()+" : "+emp2.getSalary());
    }

}
