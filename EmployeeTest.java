/*
*  Project :  A03b - Employee Class
*  File    :  EmployeeTest.java
*  Name    :  Chris Langdale
*  Date    :  09/12/17(09/12/17)
*/
public class EmployeeTest
{
   public static void main (String[] args)
   {
      /*
      *  creating new Employee's with the parameters of:
      *  int empID
      *  String firstName
      *  String lastName
      *  double monthlySalary
      */
      
      Employee emp1 = new Employee(1, "Bill", "Hubris", 20000.00);
      
      Employee emp2 = new Employee(2, "Jack", "Black", 15000.00);
      
      //displaying employee yearly salary by multiplying the monthlySalary by 12
      System.out.printf("emp1's yearly salary: $%.2f.%n", (emp1.getMonthlySalary() * 12));
      
      System.out.printf("emp2's yearly salary: $%.2f.%n", (emp2.getMonthlySalary() * 12));
      
      //giving the employee a 10% raise by multiplying the monthlySalary by 1.1
      emp1.setMonthlySalary(emp1.getMonthlySalary() * 1.1);
      
      emp2.setMonthlySalary(emp2.getMonthlySalary() * 1.1);
      
      //displaying the employee salary after a raise by multiplying the new monthlySalary by 12
      System.out.printf("emp1's new yearly salary: $%.2f.%n", (emp1.getMonthlySalary() * 12));
      
      System.out.printf("emp2's new yearly salary: $%.2f.%n", (emp2.getMonthlySalary() * 12));
       
   }  //end of main()
   
}  //end of EmployeeTest class