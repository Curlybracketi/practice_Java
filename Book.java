 // Book.java
 // Declaring an enum type with constructor and exolicit instance fields
 // and accessors for these fields

 public enum Book
 {
     // declare constants of enum type
     JHTP( "Java How to Program", "2012" ),
     CHTP( "C How to Program", "2007" ),
     IW3HTP( "Internet & World Wide Web How to Program", "2008" ),
     CPPHTP( "C++ How to Program", "2012" ),
     VBHTP( "Visual Basic 2010 How to Program", "2011" ),
     CSHARPHTP( "VIsual C# 2010 How to Program", "2011" );

     // instance fields
     private final String title; // book title
     private final String copyrightYear; // copyright year

     // enum constructor
     Book( String bookTitle, String year )
     {
         title = bookTitle;
         copyrightYear = year;
     } // end enum constructor

     // accessor for field title
     public String getTitle()
     {
         return title;
     } // end enum getTitle

     // accessor for field copyrightYear
     public String getCopyrightYear()
     {
         return copyrightYear;
     } // end method getcopyrightYear
 } // end enum Book