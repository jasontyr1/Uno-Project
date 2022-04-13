/*
Card class – this will represent a single card (I don’t think this has to be abstract but idk)
We can include the number or symbols in which the card is(numbers for numbers and 	possibly characters to signify +4 and reverse, etc. Or even use some enums. (REVERSE, PLUS_FOUR)) we will also need to store a color in the card
methods:
createCard()-create a card with a random number/modifier, and a color
maybe methods to take care of modifier cards(plusFourPlay(), reversePlay())
OR a single method to handle all plays either in this class or another: 				cardPlay(Card playedCard, Card cardOnTopOfDiscardStack)
This can return something if the play the player is trying to make is invalid

*/
class Card {

    enum Value {
            ZERO, ONE, TWO,
            THREE, FOUR, FIVE,
            SIX, SEVEN, EIGHT,
            NINE, PLUS_TWO, PLUS_FOUR,
            WILDCARD, SKIP, REVERSE
        };

    public Card(String color, String value);
}