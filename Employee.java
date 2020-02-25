 // Employee.java
 // static variable used to maintain a count of the number of
 // Employee objects in memory.

 public class Employee
 {
  private String firstName;
  private String lastName;
  private static int count = 0; // number of Employees created

  // initialize Employee, add 1 to static count and
  // output String indicating that constructor was called
  public Employee( String first, String last )
  {
   firstName = first;
   lastName = last;

   ++count; // increment static count of employees
   System.out.printf( "Employee constructor: %s %s; count = %d\n",
           firstName, lastName, count );
  } // end Employee constructor

  // get first name
  public String getFirstName()
  {
     return firstName;
  } // end method getfirstName

  // get lastName
  public String getLastName()
  {
     return lastName;
  } // end method getlastName

  // static method to get static count value
  public static int getCount()
  {
     return count;
  } // end method getCount
 } // end class Employee


