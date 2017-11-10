
/* Collections Framework in Java has been implemented here.
 * Employee objects are inserted in TreeSet
 * Order is display according to ascending order of salaries.
 * Comparator class has been made in which comparison is done with names,
 * if names are same then comparison is done with designation.
 * Program is implemented as follows : 
 */

import java.util.*;

class Employee //Employee Class
{
     
    private String name,designation;
    private int salary;
     
    public Employee(String n,String desi, int s) //parameterized constructor of class
    {
    	//initializing variables
        this.name = n;
        this.designation=desi;
        this.salary = s;
    }
    
    //Getters and Setters for the variables
     
    public String getName() 
    {
        return name;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
     public String getDesignation() 
     {
        return designation;
    }
    public void setDesignation(String des) 
    {
        this.designation = des;
    }
    public int getSalary() 
    {
        return salary;
    }
    public void setSalary(int salary) 
    {
        this.salary = salary;
    }
    public String toString() //Printing the details of Employee
    {
        return "Name: "+this.name+"\tDesignation: "+this.designation+"\tSalary: "+this.salary;
    }
}
 
public class CollectionsEmp 
{


	public static void main(String[] args) 
	{
        //TreeSet for storing employee object
		
        TreeSet<Employee> salemp = new TreeSet<Employee>(new MySalaryComp());
        
        //Adding Employees with their name ,designation and salary
        
        salemp.add(new Employee("Soham","Developer",35000));
        salemp.add(new Employee("Malhar","Hacker",20070));
        salemp.add(new Employee("Gautam","Developer",35000));
        salemp.add(new Employee("Soham","Analytics",20070));
        salemp.add(new Employee("Aneesh","Assistant",24020));
        salemp.add(new Employee("Adway","Programmer",6000));
        
        for(Employee e:salemp) // printing the employee details in sorted manner
        {
            System.out.println(e); //displaying

        }

}
}
 
// MySalaryComp class which implements Comparator interface

class MySalaryComp implements Comparator<Employee>{
 
    @Override
    public int compare(Employee e1, Employee e2) 
    {
    	if(e1.getSalary() == e2.getSalary())//if salary is same then comparison is done with name
    	{
    		if (e1.getName() == e2.getName()) //if name is same then comparison is done with Designation
    		{
    			return e1.getDesignation().compareTo(e2.getDesignation()); //comparing designation
    		}
    		else
    		{
    			return e1.getName().compareTo(e2.getName()); //comparison of name
    		}
    	}
    	else if(e1.getSalary() > e2.getSalary()) // comparison of salary
        {
            return 1;
        } 
    	else 
        {
            return -1;
        }
    }
}
 
