package application;

public class GameLoop {
    private Player currentTurn;
    private Player PLAYER, CPU1, CPU2, CPU3;
    private Deck drawPile;

    public Card cardInPlay;

    public GameLoop() {
        drawPile = new Deck(); 
        drawPile.fillDeck();

        PLAYER = new Player("PLUS ONE");
        CPU1 = new AI("CPU1", AI.Difficulty.EASY);
        CPU2 = new AI("CPU2", AI.Difficulty.EASY);
        CPU3 = new AI("CPU3", AI.Difficulty.EASY);
    }

    public void handCardsToPlayers() {
        // draw card from drawPile and hand to each player
    } 
}
