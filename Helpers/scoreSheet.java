package Helpers;

public class scoreSheet {
    private Player[] players;
    private int numPlayers;
    private int currentPlayer;
    private int numTurns;
    private static final int MAX_PLAYERS = 4;
    private static final int MAX_TURNS = 13;

    public scoreSheet() {
        this.players = new Player[MAX_PLAYERS];
        this.numPlayers = 0;
        this.currentPlayer = 0;
        this.numTurns = 0;
    }

    public void addPlayer(Player player) {
        if (this.numPlayers < MAX_PLAYERS) {
            this.players[this.numPlayers] = player;
            this.numPlayers++;
        }
    }

    public void nextTurn() {
        this.currentPlayer++;
        if (this.currentPlayer >= this.numPlayers) {
            this.currentPlayer = 0;
            this.numTurns++;
        }
    }

    public boolean isGameOver() {
        return this.numTurns >= MAX_TURNS;
    }

    public Player getCurrentPlayer() {
        return this.players[this.currentPlayer];
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < this.numPlayers; i++) {
            result += this.players[i] + " ";
        }
        return result;
    }
}

