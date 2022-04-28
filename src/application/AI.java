package application;
/*
extends player class to have a "name" and a deck
Can do something with looking at the given cards in deck(Card array), give them points for how valid of a card it could be and send to card with the most/highest points to the discard deck. Up for interpretation on how to give out points to a card.
methods:
assignPointsToDeck(Card[] deck, Card cardOnTopOfDiscardStack)-look at the 			top card of discard deck and compare it each card in Players deck and assign it 			points given how choice of a choice to play it is. 
use Player.removeCard(deck, cardIndex) to remove a card, put in on top of 			discard deck, and return new deck
TODO figure out how I make an AI difficulty and what to change about the AI’s decisions given what difficulty is applied

*/
class AI extends Player {
    private int difficulty; // 0 - easiest, 3 - hardest
    
    public AI(String name, int difficulty) {
        super(name);
        this.difficulty = difficulty;
        //TODO Auto-generated constructor stub
    }
    
    public int getCardToPlay() {
        // use difficutly to detemine which card to play

        // 0 - Easy
        // Choose by first available card in hand that is valid

        // 1 - Medium
        // Attempt to play "higher-tier" cards first (i.e. +4, +2, Skips, etc)

        // 2 - Hard
        // IDEA: have AI "cheat" and attempt to play card that could hurt player most
        return -1;

    }

    
}