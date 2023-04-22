
  
  class Employee  {
    int emp_id;
    int emp_salary;
    String name;
    int age;
  
    Employee(int id, String name, int age) {
      this.name=name;
      this.age=age;
      emp_id = id;
      
    }
  
    void printEmployeeDetails() {
      System.out.println("Employee ID     :  " + emp_id);
      System.out.println("Employee Name   :  " + name);
      System.out.println("Employee Age    :  " + age);
      System.out.println("Employee Salary :  " + emp_salary);
    }

    void get_salary(int i){
      emp_salary=i;
    }
  }
  
  public class Company {
    public static void main(String[] args) {
      Employee emp1 = new Employee(7, "AKS", 20);
      emp1.get_salary(500000);
      emp1.printEmployeeDetails();
    }
  }