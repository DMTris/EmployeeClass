/*
*  Project :  A03b - Employee Class
*  File    :  Employee.java
*  Name    :  Chris Langdale
*  Date    :  09/12/17(09/12/17)
*/
public class Employee
{
   //variable declarations
   private int empID;
   private String firstName;
   private String lastName;
   private double monthlySalary;
   
   //constructor
   public Employee (int id, String first, String last, double pay)
   {
      empID = id;
      firstName = first;
      lastName = last;
      monthlySalary = pay;
      
      //set empID to 0 if less than 0 when intialized
      if (empID < 0)
      {
         empID = 0;
      }
      
      //set monthlySalary to 0 if less than 0 when intialized
      if (monthlySalary < 0)
      {
         monthlySalary = 0;
      }
   }
   
   //set the employee id if greater than or equal to 1
   public void setEmpID(int newID)
   {
      if (newID >= 1)
      {
         empID = newID;
      }
      
      return;
   }
   
   //setting the first name of the employee
   public void setFirstName(String newFirst)
   {
      firstName = newFirst;
   }
   
   //setting the last name of the employee
   public void setLastName(String newLast)
   {
      lastName = newLast;
   }
   
   //setting the monthly salary of the employee if it is greater than or equal to 1
   public void setMonthlySalary(double newSalary)
   {
      if (newSalary >= 1.0)
      {
         monthlySalary = newSalary;
      }
      
      return;
   }
   
   //accessing the employee id
   public int getEmpID()
   {
      return empID;
   }
   
   //accessing the employee first name
   public String getFirstName()
   {
      return firstName;
   }
   
   //accessing the employee last name
   public String getLastName()
   {
      return lastName;
   }
   
   //accessing the employee monthly salary
   public double getMonthlySalary()
   {
      return monthlySalary;
   }
   
}  //end of Employee class