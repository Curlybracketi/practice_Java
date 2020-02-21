 // Card.java
 // Card class represent a playing card.

 public class Card
 {
     private String face; // face of card ( "Ace", "Deuce",...)
     private String suit; // suit of card ("Heart", "Diamonds",...)

     // two-argument contructor initializes card's face suit
     public Card( String cardFace, String cardSuit )
     {
         face = cardFace; // initialize face of card
         suit = cardSuit; // initialize suit of card
     } // end two-argument Card constructor

     // return String representation of Card
     public String toString()
     {
         return face + " of " + suit;
     } // end method toString
 } // end class Card