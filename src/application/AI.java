package application;
/*
extends player class to have a “name” and a deck
Can do something with looking at the given cards in deck(Card array), give them points for how valid of a card it could be and send to card with the most/highest points to the discard deck. Up for interpretation on how to give out points to a card.
methods:
assignPointsToDeck(Card[] deck, Card cardOnTopOfDiscardStack)-look at the 			top card of discard deck and compare it each card in Players deck and assign it 			points given how choice of a choice to play it is. 
use Player.removeCard(deck, cardIndex) to remove a card, put in on top of 			discard deck, and return new deck
TODO figure out how I make an AI difficulty and what to change about the AI’s decisions given what difficulty is applied

*/
class AI extends Player {
    
    public AI(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }
    void assignPointsToDeck(Card[] deck, Card cardOnTopOfDiscardStack) {

    }
    void removeCard(Card[] deck, int cardIndex) {

    }
}