package Helpers;

public class Player {
    /**
     * The name of the player.
     */
    private String name;
    protected int score;
    protected int turnsLeft;
    private static final int MAX_TURNS = 13;
    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.turnsLeft = MAX_TURNS;
    }

}
