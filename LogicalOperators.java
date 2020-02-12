 // logioalOperators.java
 // Logical operators.

 public class LogicalOperators
 {
     public static void main( String[] args )
     {
         // create truth for && (conditional AND) operator
         System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                 "conditional AND (&&)", "false && false", ( false && false ),
                 "false && true", (false && true ),
                 "true && true", ( true && false ),
                 "true && true", (true && true ) );

         // create truth table for || (conditional OR) operator
         System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
                 "conditional OR (||)", "false || false", ( false && false ),
                 "false || true", ( false || true ),
                 "true || false", ( true || false),
                 "true || true", ( true || true) );

         // create truth table for & ( boolean logical AND oepretor
         System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: &b\n%s:",
                 "Boolean logical AND (&))", "false & false", ( false & false ),
                 "false & false", ( false & true ),
                 "true & false", ( true & false ),
                 "true & true", ( true & true ) );

         // create table for | (boolean logical inclusive OR operator
         System.out.printf("%s\n%s: %b\n%s: %b\n%s: %b\n%s:%b\n\n",
                 "Boolean logical inclusive OR (|)",
                "false | false", ( false | false ),
                 "false | true", ( false | true ),
                 "true | false", ( true | false ),
                 "true | true", ( true | true) );

         // create truth table for ^ (boolean logical exclusive OR) operator
         System.out.printf( "%s\n%s: %b\n%s: %b\n%S: %b\n%s: %b\n\n",
                 "Boolean logical exclusive OR (^)",
                 "false ^ false", ( false ^ false),
                 "false ^ true", ( false ^ true ),
                 "true ^ false", ( true ^ false ),
                 "true ^ true", ( true ^ true ) );

         // create truth table for ! (logical negation) operator
         System.out.printf( "%s\n%s: %b\n%S: %b\n", "logical NOT (!)",
                 "!false", ( !false ), "!true", ( !true ) );
     } // end main
 } // end class LogicalOPerators