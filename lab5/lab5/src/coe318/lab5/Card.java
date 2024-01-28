package coe318.lab5;

public class Card implements Comparable {
  //Symbolic constants

  public static final int CLUB = 0;
  public static final int DIAMOND = 1;
  public static final int HEART = 2;
  public static final int SPADE = 3;
  public int rankVal;
  public int suitVal; 
  public boolean isFaceUp;

  /**
   * Construct a card of the given rank, suit and whether it is faceup or
   * facedown. The rank is an integer from 2 to 14. Numbered cards (2 to 10)
   * have a rank equal to their number. Jack, Queen, King and Ace have the ranks
   * 11, 12, 13, and 14 respectively. The suit is an integer from 0 to 3 for
   * Clubs, Diamonds, Hearts and Spades respectively.
   *
   * @param rank
   * @param suit
   * @param faceUp
   */
  public Card(int rank, int suit, boolean faceUp) {
    //FIX THIS
     rankVal = rank; 
     suitVal = suit; 
     isFaceUp = faceUp; 
  }

  /**
   * @return the faceUp
   */
  public boolean isFaceUp() {
    return isFaceUp; //FIX THIS
  }

  /**
   * @param faceUp the faceUp to set
   */
  public void setFaceUp(boolean faceUp) {
    isFaceUp = faceUp;
  }

  /**
   * @return the rank
   */
  public int getRank() {
    return rankVal; //FIX THIS
  }

  /**
   * @return the suit
   */
  public int getSuit() {
    return suitVal;//FIX THIS
  }

  @Override
  public boolean equals(Object ob) {
    if (!(ob instanceof Card)) {
      return false;
    }
    Card c = (Card) ob;
    if(this.getRank() != c.getRank() && this.getSuit() != c.getSuit()) return false;
    return true; //FIX THIS
  }

  @Override
  public int hashCode() {//DO NOT MODIFY
    int hash = 7;
    hash = 31 * hash + this.getRank();
    hash = 31 * hash + this.getSuit();
    return hash;
  }

  @Override
  public int compareTo(Object obj) {//DO NOT MODIFY
    return compareTo((Card) obj);
  }

  public int compareTo(Card c) {
        int diffRank = rankVal - c.rankVal;
        if (diffRank < 0) {
            return -1;
        }
        else if (diffRank > 0) {
            return 1;
        }
        else if (diffRank == 0) {
            int diffSuit = suitVal - c.suitVal;
            if (diffSuit < 0) {
                return -1;
            }
            else if (diffSuit > 0) {
                return 1;
            } 
        }
        return 0;
    //FIX THIS
  }

  /**
   * Return the rank as a String. For example, the 3 of Hearts produces the
   * String "3". The King of Diamonds produces the String "King".
   *
   * @return the rank String
   */
  public String getRankString() {
      String[] ranks =  {"0", "0", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    return ranks[rankVal];//FIX THIS
  }

  /**
   * Return the suit as a String: "Clubs", "Diamonds", "Hearts" or "Spades".
   *
   * @return the suit String
   */
  public String getSuitString() {
    String[] suits =  {"Club", "Diamond", "Heart", "Spade"};
    return suits[suitVal]; //FIX THIS
  }

  /**
   * Return "?" if the card is facedown; otherwise, the rank and suit of the
   * card.
   *
   * @return the String representation
   */
  @Override
  public String toString() {

    return getRankString() + " " + getSuitString(); //FIX THIS
  }

  public static void main(String[] args) {
    //Create 5 of clubs
    Card club5 = new Card(5, 0, true);
    System.out.println("club5: " + club5);
    Card spadeAce = new Card(14, SPADE, true);
    System.out.println("spadeAce: " + spadeAce);
    System.out.println("club5 compareTo spadeAce: "
            + club5.compareTo(spadeAce));
    System.out.println("club5 compareTo club5: "
            + club5.compareTo(club5));
    System.out.println("club5 equals spadeAce: "
            + club5.equals(spadeAce));
    System.out.println("club5 equals club5: "
            + club5.equals(club5));
  }
}