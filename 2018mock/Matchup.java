class Matchup {

    private char playerOne;
    private char playerTwo;

    /** Creates a new matchup for given symbols of player one and two.
     * Valid symbols are 'R','P' and 'S'.
     *
     * @param p1 Symbol chosen by player one
     * @param p2 Symbol chosen by player two
     * @throws IllegalArgumentException if a given symbol is invalid.
     */
    public Matchup(char p1, char p2) {
        playerOne = p1;
        playerTwo = p2;
    }

    /** Return the symbol selected by player one */
    public char getPlayerOne() { return playerOne; }
    /** Return the symbol selected by player two */
    public char getPlayerTwo() { return playerTwo; }

    public String toString() {
        return "" + playerOne + playerTwo;
    }
}
