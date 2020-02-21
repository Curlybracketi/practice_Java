 // DeckofCards.java
 // DeckofCards class represents a deck of playing cards.
 import java.util.Random;

 public class DeckofCards
 {
     private Card[] deck; // array of Card objects
     private int currentCard; // index of next Card to be dealt (0-51)
     private static final int NUMBER_OF_CARDS = 52; // constants # of Cards
     // random number generator
     private static final Random randomNumbers = new Random();

     // contructor fills decks of Cards
     public DeckofCards()
     {
         String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
                 "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
         String[] suits = {"Hearts", "Diamonds", "Club", "Spaces"};

         deck = new Card[ NUMBER_OF_CARDS ]; // create array of card objects
         currentCard = 0; // set currentCard so first card dealt is deck[ 0 ]

         // populate deck with card objecks
         for ( int count = 0; count < deck.length; count++ )
             deck[count] =
                     new Card(faces[count % 13], suits[count / 13] );
     } // end DeckofCards contructor

     // shuffle deck of Cards with one pass algorithm
     public void shuffle()
     {
         // after shuffling, dealing  should start at deck[ 0 ] again
         currentCard = 0; // reinitialized currentCard

         // for each Card, pick another random Card (0-51) and swap them
         for (int first = 0; first < deck.length; first++)
         {
             // select a random number between 0 and 51
             int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

             // swap current Card with randomly selected Card
             Card temp = deck[first];
             deck[ first ] = deck[second];
             deck[ second ] = temp;
         } // end for
     } // end method shuffle

     // deal method Card
     public Card dealCard()
     {
         // determine whether Cards remain to be dealt
         if ( currentCard < deck.length )
        return deck[ currentCard ++ ]; // return current card in array
         else
             return null; // return null to indicate that all cards were dealt
     } // end method dealCard
 } // end class DeckofCards