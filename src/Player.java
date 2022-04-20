public class Player{
  
  private String name;
  private ArrayList<Card> hand;
  int handLimit = 7;
  
  //constructor for only name
  public Player(String name)
  {
    this.name = name;
    hand = new ArrayList<Card>();
  }
  
  //takes in a Card and
  //adds it to the end of the arraylist (unless max cards in hand is reached)
  public void addCard(Card c)
  {
    if(hand.size() == handLimit)
        System.out.println("Cannot add card! Hand is full\n");
    else
        hand.add(c);
  }
  
  //removes a card from the given index of the arraylist
  //returns the card that was removed
  public Card removeCard(int index)
  {
    return hand.remove(index);
  }
  
  //validMove will take in the top card of the discard deck and the index of the card that the player is trying to play
  //check if the card is valid and returns boolean (could do all operation here but it might be better to do in main or board controller
  public boolean validMove(Card cardInPlay, int indexOfPlayerCard)
  {
      Card cardInQuestion = hand.get(indexOfPlayerCard);
      switch(cardInPlay.getType())
      {
        case FACE:
        //TODO///////////////
        
        break;
        case SKIP: case REVERSE: case DRAW2: //only need to check color
          if(cardInQuestion.getColor().equals(cardInPLay.getColor()))
            return true;
          else
            return false;
        break;
        case WILD: case DRAW4: //dont need to check but can be split up if we want to do the operations here
          return true;
        break;
        default:
          return false; //card in question is not valid
      }
  }
  
  
  //canMove will take in the top card of the discard pile and check with all the players cards to see if that player
  //can actually play something (so the game doesn't brick up) if they can't play the a card will be added to deck or if
  //the hand is full a card will be discarded and the trun is skipped
  public boolean canMove(Card cardInPlay)
  {
  
  }
  









}
