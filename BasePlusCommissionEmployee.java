 // BasePlusCommissionEmployee.java
 // BasePlusCommissionEmployee class represents an employee who receives
 // a base salary in addition to commission.

 public class BasePlusCommissionEmployee
 {
     private  String firstName;
     private String lastName;
     private String socialSecurityNumber;
     private double grossSales; // gross weekly sales
     private double commissionRate; // commission percentage
     private double baseSalary; // base salary per week

     // six-argument constructor
     public BasePlusCommissionEmployee( String first, String last,
                                        String ssn, double sales, double rate, double salary )
     {
         // implicit call to object contructor occurs here
         firstName = first;
         lastName = last;
         socialSecurityNumber = ssn;
         setGrossSales( sales ); // validate and store gross sales
         setCommissionRate( rate ); // validate and store commission rate
         setBaseSalary( salary ); // validate and store base salary
     } // end six-argument BasePlusCommissionEmployee Constructor

     // set first name
     public void setFirstName( String first )
     {
         firstName = first; // should validate
     } // end method setFirstName

     // return first name
     public String getFirstName()
     {
         return firstName;
     } // end method getFirstName

     // set last name
     public void setLastName( String last )
     {
         lastName = last; // should validate
     } // end method setLastName

     // return last name
     public String getLastName()
     {
         return lastName;
     } // end method getLastName

     // set social security number
     public void setSocialSecurityNumber( String ssn )
     {
         socialSecurityNumber = ssn; // should valiadte
     } // end method setSocialSecurityNumber

     // return social security number
     public String getSocialSecurityNumber()
     {
         return socialSecurityNumber;
     } // end method getSocialSecurityNumber

      // set gross sales amount
         public void setGrossSales( double sales )
         {
             if ( sales >= 0.0 )
                 grossSales = sales;
             else
                 throw new IllegalArgumentException(
                         "Gross sales must be >= 0.0" );
         } // end method setGrossSales

     // return gross sales amount
     public double getGrossSales()
     {
         return grossSales;
     } // end method getGrossSales

     // set commission rate
     public void setCommissionRate( double rate )
 {
     if ( rate > 0.0 && rate < 1.0 )
         commissionRate = rate;
     else
         throw new IllegalArgumentException(
                 "Commission rate must be > 0.0 and < 1.0" );
 } // end method setCommssionRate

     // return commmission rate
     public  void getCommissionRate()
     {
         return commissionRate;
     } // end method getCommissionRate

     // set base Salary
     public void setBaseSalary( double salary )
     {
         if ( salary >= 0.0 )
             baseSalary = salary;
         else
             throw new IllegalArgumentException(
                     "base salary must be >= 0.0" );
     } // end method setBaseSalary

     // return base salary
     public double getBaseSalary()
     {
         return baseSalary;
     } // end method getBaseSalary

     // calculate earnings
     public double earnings()
     {
         return baseSalary + ( commissionRate * grossSales );
     } // end method earnings

     // return String representation of BasePlusCommissionEmployee
     @Override // indicates that this method overrides a superclass method
     public String toString()
     {
         return  String.format(
                 "%S: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",
                 "base-salaried commission employee", firstName, lastName,
                 "Social security number", socialSecurityNumber,
                 "gross sales", grossSales, "commssion rate", commissionRate,
                 "base salary", baseSalary );
     } // end method toString
 } // end class BasePlusCommissionEmployee